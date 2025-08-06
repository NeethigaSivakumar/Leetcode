package com.example.Array;

//Problem Description
//There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
//
//Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
//For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
//
//
//Problem Constraints
//1 <= A <= 2 * 105
//        1 <= L <= R <= A
//1 <= P <= 103
//        0 <= len(B) <= 105
//
//
//Input Format
//The first argument is a single integer A.
//The second argument is a 2D integer array B.
//
//
//        Output Format
//Return an array(0 based indexing) that stores the total number of coins in each beggars pot.
//
//
//Example Input
//Input 1:-
//A = 5
//B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
//
//
//Example Output
//Output 1:-
//        10 55 45 25 25
//
//
//Example Explanation
//Explanation 1:-
//First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
//Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
//Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]
public class ContinuousSubQuery {

    public int[] continousSubQuery(int n,int[][] arr){
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int[] c=arr[i];
            for(int j=c[0]-1;j<c[1];j++){
                res[j]+=c[2];
            }
        }
        return res;
    }

    //optimized
    public int[] continuousSumQueryOptimized(int n, int[][] arr) {
        // Difference array to store the changes
        int[] diff = new int[n + 1];

        // Step 1: Process queries and update the difference array
        // Time complexity: O(arr.length)
        for (int i = 0; i < arr.length; i++) {
            int[] c = arr[i];
            int L = c[0]; // 1-based index
            int R = c[1]; // 1-based index
            int P = c[2];

            // Add P at the start of the range (0-based index L-1)
            diff[L - 1] += P;

            // Subtract P just after the end of the range (0-based index R)
            if (R < n) {
                diff[R] -= P;
            }
        }

        // Step 2: Compute the prefix sums to get the final amounts
        // Time complexity: O(n)
        int[] finalAmounts = new int[n];
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += diff[i];
            finalAmounts[i] = currentSum;
        }

        return finalAmounts;
    }
}


