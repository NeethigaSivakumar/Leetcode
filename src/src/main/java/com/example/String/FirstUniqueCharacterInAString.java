package com.example.String;

public class FirstUniqueCharacterInAString {

        public static int firstUniqChar(String s) {
            int[] res=new int[26];
            for(char i:s.toCharArray()){
                res[i-'a']++;
            }
            for(int i=0;i<s.length();i++){
                if(res[s.charAt(i)-'a']==1){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
}

