package com.example.String;

public class RotateString {

    //Time O(n2) Space O(1)
    public static boolean rotateString1(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                String start = s.substring(i, s.length());
                String last = s.substring(0, i);
                if ((start + last).equals(goal)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Time O(n) Space O(1)
    public static boolean rotateString2(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String res = s + s;
        if (res.contains(goal)) {
            return true;
        }
        return false;
    }
}
