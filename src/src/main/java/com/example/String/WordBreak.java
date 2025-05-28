package com.example.String;

import java.lang.reflect.Array;
import java.util.*;

class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);  // for O(1) lookup
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // base case: empty string

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dp[j] && wordSet.contains(sub)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        wordBreak("leetcode", Arrays.asList("leet","code"));
    }
}
