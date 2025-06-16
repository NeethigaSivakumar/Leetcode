package com.example.DynamicProgramming;

public class UniquePath {
    public int uniquePaths(int n, int m) {
        int[][] res=new int[n][m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 || j==m-1){
                    res[i][j]=1;
                }
                else{
                    res[i][j]=res[i+1][j]+res[i][j+1];
                }
            }
        }
        return res[0][0];
    }

    public static void main(String[] args) {
        UniquePath u=new UniquePath();
        u.uniquePaths(7,3);
    }
}
