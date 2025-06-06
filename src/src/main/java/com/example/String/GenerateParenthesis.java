package com.example.String;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs(0, 0, "", res, n);
        return res;
    }

    public void dfs(int open, int close, String s, List<String> res, int n) {
        if (open == close && open + close == n * 2) {
            res.add(s);
            s = "";
        }
        if (open < n) {
            dfs(open + 1, close, s+"(", res, n);
        }
        if (close < open) {
            dfs(open, close + 1, s+")", res, n);
        }
    }
}