package com.example.String;

class IndexOfFirstInOccurrenceInString {

    //Time O(n*m) Space O(m)
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }else if(needle.length()==haystack.length() && needle.equals(haystack)){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            String cur=haystack.substring(i,i+needle.length());
            if(cur.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}