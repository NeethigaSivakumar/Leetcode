package com.example.Array;

import java.util.ArrayList;

public class MatrixScalarProduct {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(A.get(i).get(j) * B);
            }
            result.add(row);
        }

        return result;
    }
}
