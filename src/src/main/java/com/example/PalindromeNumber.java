package com.example;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse=0,copy=x;
        while(x>0){
            int rem=x%10;
            reverse=(reverse*10)+rem;
            x/=10;
        }
        if(reverse==copy){
            return true;
        }
        return false;
    }
}