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
        String encode=encode1(new ArrayList<>(Arrays.asList("we","say",":","yes","!@#$%^&*()")));
        List<String> decode=decode1(encode);

    }


    public static String encode1(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String i : list) {
            sb.append(i.length()).append("#").append(i);
        }
        return sb.toString();
    }

    public static List<String> decode1(String s) {
        List<String> res=new ArrayList<>();
        int start=0,i=0;
        while(i<s.length()){
            if(s.charAt(i)=='#'){
                int length= Integer.parseInt(s.substring(start,i));
                String t=s.substring(i+1,i+length+1);
                res.add(t);
                start=i+length+1;
                i=start+1;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
