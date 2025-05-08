package com.example.Array;

public class SearchIn2DMatrix2 {

        public static boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
            int m = matrix.length, n = matrix[0].length;
            int row = 0, col = n - 1;
            while (row < m && col >= 0) {
                int current = matrix[row][col];
                if (current == target) return true;
                else if (current > target) col--;
                else row++;
            }
            return false;
        }

    public static void main(String[] args) {
        searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},9);
    }

}
