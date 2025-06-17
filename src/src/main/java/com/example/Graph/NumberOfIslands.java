package com.example.Graph;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int row=grid.length,col=grid[0].length,islands=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    exploreGrid(row,col,grid,i,j);
                }
            }
        }
        return islands;
    }
    public void exploreGrid(int row,int col,char[][] grid,int i,int j) {
        grid[i][j]='*';
        if(i>0 && grid[i-1][j]=='1'){
            exploreGrid(row,col,grid,i-1,j);
        }
        if(j>0 && grid[i][j-1]=='1'){
            exploreGrid(row,col,grid,i,j-1);
        }
        if(i+1<row && grid[i+1][j]=='1'){
            exploreGrid(row,col,grid,i+1,j);
        }
        if(j+1<col && grid[i][j+1]=='1'){
            exploreGrid(row,col,grid,i,j+1);
        }
    }
}
