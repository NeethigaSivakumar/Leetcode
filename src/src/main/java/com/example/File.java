//package com.example;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class File {
//    public boolean compareFiles(File f1, File f2) throws IOException {
//        BufferedReader b1=new BufferedReader(new FileReader(f1));
//        BufferedReader b2=new BufferedReader(new FileReader(f2));
//        String s1,s2;
//        while((s1=b1.readLine())!=null && (s2=b2.readLine())!=null){
//            if(!s1.equals(s2)){
//                return false;
//            }
//        }
//        return b1.readLine()==null && b2.readLine()==null;
//    }
//
//}
