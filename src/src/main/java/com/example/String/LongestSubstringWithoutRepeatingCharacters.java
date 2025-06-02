package com.example.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    //Time O(N) Space O(n)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int start=0,maxLen=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}
