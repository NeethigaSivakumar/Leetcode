package com.example.Stack;

import java.util.Stack;

//empty array
//array starts with negative number

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i:asteroids){
            if(!stack.isEmpty()){
                if((stack.peek()>=0 && i<0) || (stack.peek()<0 && i>=0) || stack.peek()==i){
                    if(Math.abs(stack.peek())<Math.abs(i)){
                        stack.pop();
                    }
                }
                else{
                    stack.push(i);
                }
            }
            else{
                stack.push(i);
            }
        }
        int[] res=new int[stack.size()];
        int ind=0;
        for(int i=res.length-1;i>=0;i--){
            res[ind++]=stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        AsteroidCollision a=new AsteroidCollision();
        a.asteroidCollision(new int[]{5,10,-5});
    }
}
