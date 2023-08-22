package com.recurtion.level2;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
//        subsetFun("",new int[]{1,2,3});
        System.out.println(returnSubSet("","abc",new ArrayList()));
    }

    private static void subsetFun(String ans,int[] arr) {
        if(arr.length == 0){
            System.out.println(ans);
            return;
        }
//        System.arraycopy(oldArray, (int)oldArrayStartIndex, newArray, 0, 5);
//        https://www.educative.io/answers/how-to-resize-an-array-in-java
        int[] newarr= new int[arr.length -1];
        System.arraycopy(arr,1,newarr, 0, newarr.length);
        subsetFun(ans, newarr);
        subsetFun(ans+arr[0], newarr);
    }

    public static ArrayList<String> returnSubSet(String p , String up, ArrayList<String> list) {
        if(up.length()==0){
            list.add(p);
            return list;
        }
        returnSubSet(p+up.charAt(0) , up.substring(1), list);
        returnSubSet(p , up.substring(1), list);
        return list;
    }
}
