package com.example.Array;

import java.util.ArrayList;
import java.util.List;

//only integer
//if input is empty
public class FlattenArrayIntoOne {
    List<Integer> res=new ArrayList<>();
    //TimeO(n) Space O(n+D)depth of nested list
    public void flattenArray(List<Object> list){
        for(Object i:list) {
            if (i instanceof Integer) {
                res.add((Integer) i);
            } else if (i instanceof List<?>) {
                flattenArray((List<Object>) i);
            }
        }
    }
}
