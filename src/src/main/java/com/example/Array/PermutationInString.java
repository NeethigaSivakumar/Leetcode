package com.example.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    //array
    public static boolean checkInclusion1(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) {
                matches++;
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) {
                return true;
            }

            int index = s2.charAt(r) - 'a';
            s2Count[index]++;
            if (s1Count[index] == s2Count[index]) {
                matches++;
            } else if (s1Count[index] + 1 == s2Count[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            s2Count[index]--;
            if (s1Count[index] == s2Count[index]) {
                matches++;
            } else if (s1Count[index] - 1 == s2Count[index]) {
                matches--;
            }
            l++;
        }
        return matches == 26;
    }

    //sort
    public static boolean checkInclusion2(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        String sortedS1 = new String(ch1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String g = s2.substring(i, sortedS1.length() + i);
            char[] ch2 = g.toCharArray();
            Arrays.sort(ch2);
            String sortedS2 = new String(ch2);
            if (sortedS1.equals(sortedS2)) {
                return true;
            }
        }
        return false;
    }

    //HashMap
    public static boolean checkInclusion3(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (s1Map.equals(s2Map)) {
            return true;
        }
        int start = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
            char startValue = s2.charAt(start);
            s2Map.put(startValue, s2Map.get(startValue) - 1);
            if (s2Map.get(startValue) == 0) {
                s2Map.remove(startValue);
            }
            start++;
            if (s1Map.equals(s2Map)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkInclusion4(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1Arr=new int[26];
        int[] s2Arr=new int[26];
        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            s2Arr[s2.charAt(i)-'a']++;
            if(i>=s1.length()){
                s2Arr[s2.charAt(i - s1.length()) - 'a']--;
            }
            if(Arrays.equals(s1Arr,s2Arr)){
                return true;
            }
        }
        return false;



    }

    public static void main(String[] args) {
        checkInclusion4("ab","eidbaooo");
    }


}
