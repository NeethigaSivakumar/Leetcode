package com.example.Array;

import java.util.Arrays;

public class TaskScheduler {
    public static void main(String[] args) {
        leastInterval(new char[]{'A','A','A','B','B','B'},2);

    }

    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Arrays.sort(freq);
        int maxFreq = freq[25] - 1;
        int idleSlots = maxFreq * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(freq[i], maxFreq);
        }

        return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;
    }
}
