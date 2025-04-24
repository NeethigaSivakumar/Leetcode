package com.example.Array;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<end){
            char a=s.charAt(start);
            char b=s.charAt(end);
            if(isValid(a) && isValid(b)){
                if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                    return false;
                }
                start++;
                end--;
            }
            else if(!isValid(a)){
                start++;
            }
            else{
                end--;
            }
        }
        return true;
    }

    public static boolean isValid(char ch) {
        return ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'));
    }
    public static void main(String[] args) {
        isPalindrome("0P");

    }
}
