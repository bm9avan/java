package com.methods;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n = in.nextInt();
        double answer =ans(n);
        System.out.printf("%.3f",answer);
    }

    private static double ans(int n) {
        int start=0;
        int end=n;
        int m;
        double answer = 0;
        while (end>=start){
            m= start+(end-start)/2;
            if(m*m==n){
                return m;
            }
            if (m*m>n){
                end=m-1;
            }else {
                start=m+1;
                answer=m;
            }
        }
        double p =0.1;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 10; j++) {
                if(answer*answer==n){
                    return answer;
                }
                if(answer*answer>n){
                    answer-=p;
                    continue;
                }
                answer+=p;
            }
            p/=10;


/*    // kunals idea getting correct last digit
        while (answer*answer<n){
            answer+=p;
        }
            answer-=p;
            p/=10;

 */
        }
        return answer;
        }
}
