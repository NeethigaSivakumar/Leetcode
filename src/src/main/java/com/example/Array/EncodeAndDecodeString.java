package com.example.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeString {
    public static String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length()+"#"+s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int ind=0;
        while(ind<str.length()){
            String length="";
            while(str.charAt(ind)!='#'){
                length+=str.charAt(ind);
                ind++;
            }
            int startIndex=ind+length.length(),l=Integer.valueOf(length);
            res.add(str.substring(startIndex,startIndex+l));
            ind=startIndex+l;
        }
        return res;
    }
    public static void main(String[] args) {
        String encode=encode(new ArrayList<>(Arrays.asList("we","say",":","yes","!@#$%^&*()")));
        List<String> decode=decode(encode);

    }
}
