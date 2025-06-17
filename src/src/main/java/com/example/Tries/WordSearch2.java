package com.example.Tries;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {


        private TrieNodeWord root;
        public WordSearch2(){
            root=new TrieNodeWord();
        }

        public void insert(String word) {
            TrieNodeWord node=root;
            for(char c:word.toCharArray()){
                int index=c-'a';
                if(node.children[index]==null){
                    node.children[index]=new TrieNodeWord();
                }
                node=node.children[index];
            }
            node.word=word;
        }

        public List<String> findWords(char[][] board, String[] words) {
            List<String> res=new ArrayList<>();
            for(String word:words){
                insert(word);
            }
            int m=board.length;
            int n=board[0].length;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    dfs(i,j,board,root,m,n,res);
                }
            }
            return res;
        }

        public void dfs(int i,int j,char[][] board,TrieNodeWord root,int m,int n,List<String> res){
            if(i<0 || i>=m || j<0 || j>=n || root==null){
                return;
            }
            char c=board[i][j];
            if(c=='*' || root.children[c-'a']==null){
                return;
            }
            root=root.children[c-'a'];
            if(root.word!=null){
                res.add(root.word);
                root.word=null;
            }
            board[i][j]='*';
            dfs(i+1,j,board,root,m,n,res);
            dfs(i-1,j,board,root,m,n,res);
            dfs(i,j+1,board,root,m,n,res);
            dfs(i,j-1,board,root,m,n,res);
            board[i][j]=c;
        }
}
