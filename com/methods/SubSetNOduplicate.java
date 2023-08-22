package com.methods;

import java.util.ArrayList;

public class SubSetNOduplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<ArrayList> ans = fun(arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList> fun(int[] arr){
//        if(arr.length == 0){
//        }
        ArrayList list = new ArrayList<ArrayList>();
        list.add(new ArrayList<Integer>());
        System.out.println("bigin "+list);
        for (int i = 0; i < arr.length; i++) {
            /*
            ArrayList temp = (ArrayList) list.clone();
//            ArrayList temp = new ArrayList<ArrayList>();
            for (int j = 0; j < list.size(); j++) {
//                temp.get(j);
                //shallow copy vs deep copy
                ArrayList newtemp = (ArrayList) temp.get(j);
                newtemp.add(arr[i]);
//                temp.add(newtemp);
            }
            System.out.println(list);
            list.addAll(temp);
            System.out.println(list);
             */
            int n=list.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> temp = new ArrayList((ArrayList)list.get(j));
//                ArrayList<Integer> temp2= (ArrayList<Integer>) temp.clone();
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }
}
