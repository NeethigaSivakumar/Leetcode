package com.example.Array;

public class AddOneToNumber {

    public int[] addOneToNumber(int[] arr){
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        for(int i:arr){
            if(i!=0){
                flag=true;
            }
            if(flag){
                sb.append(i);
            }
        }
        String res= String.valueOf(Integer.valueOf(String.valueOf(sb))+1);
        int[] r = res.chars()
                .map(c -> c - '0')
                .toArray();
        return r;
    }

    public static void main(String[] args) {
        AddOneToNumber a=new AddOneToNumber();
        int[] res=a.addOneToNumber(new int[]{0, 2, 9});
        for(int i:res) {
            System.out.println(i);
        }
    }
}
