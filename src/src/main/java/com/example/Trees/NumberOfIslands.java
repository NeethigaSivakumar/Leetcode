package com.example.Trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int islands = 0;
        Set<String> visited = new HashSet<>();
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited.contains(i + "," + j)) {
                    islands++;
                    bfs(grid, rows, cols, visited, directions, i, j);
                }
            }
        }
        return islands;
    }

    public static void bfs(char[][] grid, int rows, int cols, Set<String> visited, int[][] directions, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        visited.add(i + "," + j);
        q.offer(new int[] { i, j });
        while (!q.isEmpty()) {
            int[] polled = q.poll();
            int rowIndex = polled[0];
            int colIndex = polled[1];
            for (int[] k : directions) {
                int r = k[0] + rowIndex;
                int c = k[1] + colIndex;
                if ((r >= 0 && r < rows) && (c >= 0 && c < cols) && grid[r][c] == '1' && !visited.contains(r + "," + c)) {
                    q.offer(new int[] { r, c });
                    visited.add(r + "," + c);
                }
            }
        }
    }

    static int rows, cols, islands = 0;

    public static int numIslands1(char[][] grid) {
        int islands = 0, rows = grid.length, cols = grid[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    dfs1(grid, row, col,rows,cols);
                }
            }
        }
        return islands;
    }

    public static void dfs1(char[][] grid, int row, int col, int rows, int cols) {
        grid[row][col] = '*';
        if (row > 0 && grid[row - 1][col] == '1') {
            dfs1(grid, row - 1, col,rows,cols);
        } else if (row + 1 < rows && grid[row + 1][col] == '1') {
            dfs1(grid, row + 1, col,rows,cols);
        } else if (col > 0 && grid[row][col - 1] == '1') {
            dfs1(grid, row, col - 1,rows,cols);
        } else if (col + 1 < cols && grid[row][col + 1] == '1') {
            dfs1(grid, row, col + 1,rows,cols);
        }
    }

    public static void main(String[] args) {
        numIslands1(new char[][]{{'1','1','1'},
                {'0','1','0'},
                {'0','1','0'}});
    }
}