package com.example.Graph;

import java.util.*;

public class WordChainChecker {

    public static boolean canFormChain(List<String> words) {
        // Build count of in-degrees and out-degrees for each character
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, Integer> outDegree = new HashMap<>();
        
        for (String word : words) {
            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);
            
            outDegree.put(start, outDegree.getOrDefault(start, 0) + 1);
            inDegree.put(end, inDegree.getOrDefault(end, 0) + 1);
        }
        
        int startNodes = 0, endNodes = 0;
        
        for (char c : outDegree.keySet()) {
            int out = outDegree.getOrDefault(c, 0);
            int in = inDegree.getOrDefault(c, 0);
            
            if (out - in == 1) {
                startNodes++;
            } else if (in - out == 1) {
                endNodes++;
            } else if (in != out) {
                return false;
            }
        }
        
        return (startNodes == 0 && endNodes == 0) || (startNodes == 1 && endNodes == 1);
    }

    public static void main(String[] args) {
        List<String> words1 = Arrays.asList("cat", "igloo", "taxi");
      //  List<String> words2 = Arrays.asList("cat", "snow", "wind", "taxi");
        
        System.out.println(canFormChain(words1)); // true
       // System.out.println(canFormChain(words2)); // false
    }
}
