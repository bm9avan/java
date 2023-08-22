package com.methods;

import java.util.ArrayList;

public class SubSetDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3};
        ArrayList<ArrayList<Integer>> ans = fun(arr);
        System.out.println(ans+" "+ ans.size());
    }

    private static ArrayList<ArrayList<Integer>> fun(int[] arr) {
        ArrayList<Integer> subSet= new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(subSet);
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            int n = list.size();
            if(i!=0 && arr[i]==arr[i-1]){
                System.out.println("in the in"+n+" "+s);
//                s=n-s; //while setting for second duplicate this does not work properly
            }else {
                s=0;
            }
            for (int j = s; j < n; j++) {
                ArrayList<Integer> temp= new ArrayList<>(list.get(j));
                temp.add(arr[i]);
                System.out.println(temp);
                list.add(temp);
                s=n;
            }
        }
        return list;
    }
}
