package com.example.Array;

class wordSearch {
    public static boolean exist(char[][] board, String word) {
        int r=board.length,c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(word.charAt(0)==board[i][j]){
                     if(dfs(board,i,j,word,0,r,c)){
                        return true;
                     }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board,int i,int j, String word,int ind,int r,int c) {
        if(word.length()==ind){
            return true;
        }
         if (i < 0 || i >= r || j < 0 || j >= c || board[i][j] != word.charAt(ind)) {
            return false;
        }
        char temp = board[i][j];  
        board[i][j] = '*';        
        boolean found = dfs(board, i + 1, j, word, ind + 1, r, c) ||
                        dfs(board, i - 1, j, word, ind + 1, r, c) ||
                        dfs(board, i, j + 1, word, ind + 1, r, c) ||
                        dfs(board, i, j - 1, word, ind + 1, r, c);
        board[i][j] = temp; 
        return found;
    }

    public static void main(String[] args) {
        exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
    }
}