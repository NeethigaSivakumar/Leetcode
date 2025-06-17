package com.example.Graph;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public void pacificAtlantic(int[][] heights) {

        List<int[]> result = new ArrayList<>();
//        if (heights == null || heights.length == 0) {
//            return result;
//            }

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0, heights[i][0]);      // Left edge
            dfs(heights, atlantic, i, n - 1, heights[i][n - 1]); // Right edge
        }

        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j, heights[0][j]);      // Top edge
            dfs(heights, atlantic, m - 1, j, heights[m - 1][j]); // Bottom edge
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(new int[]{i, j});
                }
            }
        }
       // return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int i, int j, int prevHeight) {
        int m = heights.length, n = heights[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n) return;     // Out of bounds
        if (visited[i][j]) return;                          // Already visited
        if (heights[i][j] < prevHeight) return;             // Can't flow uphill

        visited[i][j] = true;

        dfs(heights, visited, i + 1, j, heights[i][j]);  // down
        dfs(heights, visited, i - 1, j, heights[i][j]);  // up
        dfs(heights, visited, i, j + 1, heights[i][j]);  // right
        dfs(heights, visited, i, j - 1, heights[i][j]);  // left
    }

    public static void main(String[] args) {
        PacificAtlanticWaterFlow p=new PacificAtlanticWaterFlow();
        p.pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}});
    }

}
