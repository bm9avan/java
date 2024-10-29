//package com.test;
//
//public class Naveen {
//    public static void main(String[] args) {
//        System.out.println(fn(5, 7723, new int[]{9302,1001,2,56,6}));
//    }
//
//    public static int fn(int n, int v, int[] s){
//        int ans=0;
//        int[] varr=new int[10];
//        int len=Integer.toString(v).length();
//        for(int i=0; i<len;i++){
//            int t=v%10;
//            varr[t]=1;
//            v=v/10;
//        }
//        for(int i=0; i<n;i++){
//            int ts=s[i];
//            int tslen=Integer.toString(ts).length();
//            int sum=0;
//            int vFound=-1;
//            for(int j=0; j<tslen;j++){
//                int t=ts%10;
//                sum+=t;
//                if(varr[t]==1){
//                    vFound=1;
//                    break;
//                }
//                ts=ts/10;
//            }
//            int min=-1;
//            for(int k=0; k<10; k++){
//                if(varr[k]==1){
//                    min=k;
//                    break;
//                }
//            }
//            if(min!=-1 && vFound==-1 && sum>min){
//                ans++;
//            }
//        }
//        return ans;
//    }
//}
package com.test;

public class Naveen {
    public static void main(String[] args) {
        System.out.println(fn(3, 7777, new int[]{909,3347,1211}));
    }
    public static int fn(int n, int v, int[] s) {
        int ans = 0;
        boolean[] varr = new boolean[10];
        while (v > 0) {
            int t = v % 10;
            varr[t] = true;
            v /= 10;
        }
        int minV = -1;
        for (int i = 0; i < 10; i++) {
            if (varr[i]) {
                minV = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            int ts = s[i];
            int sum = 0;
            boolean foundInV = false;
            while (ts > 0) {
                int t = ts % 10;
                sum += t;
                if (varr[t]) {
                    foundInV = true;
                    break;
                }
                ts /= 10;
            }
            if (!foundInV && sum > minV) {
                ans++;
            }
        }
        return ans;
    }
}
