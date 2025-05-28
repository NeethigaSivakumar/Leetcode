package com.example.String;

import java.util.HashSet;
import java.util.Set;

public class reverseVowelsOfAString {
    public static String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        StringBuilder sb=new StringBuilder(s);
        int start=0,end=sb.length()-1;
        while(start<end){
            while(!set.contains(sb.charAt(start)-'a')){
                start++;
            }
            while(!set.contains(sb.charAt(end)-'a')){
                end--;
            }
            char temp=sb.charAt(start);
            sb.insert(start,sb.charAt(end));
            sb.insert(end,temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        reverseVowels("IceCreAm");
    }
}
