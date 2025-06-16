package com.example.String;

public class PalindromeSubstring {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(palindrome(s,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean palindrome(String s,int start,int end){
        String s1=s.substring(start,end+1);
        StringBuilder sb=new StringBuilder(s1);
        while(start<end){
            char temp=sb.charAt(start);
            sb.insert(start,sb.charAt(end));
            sb.insert(end,temp);
            start++;
            end--;
        }
        return sb.toString().equals(s1);
    }
}
