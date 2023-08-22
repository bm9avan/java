package com.Q;

import java.util.Arrays;

public class Q832 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipAndInvertImage(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
        public static int[][] flipAndInvertImage(int[][] image) {
            for(int i=0; i<image.length; i++){
                for(int j=0; j<(image[i].length+1)/2; j++){
                    if(image[i][j] == image[i][image.length-1-j]){
                        System.out.println(i+" "+j);
                        // if(image[j] != image[image.length-1-j]){
                        // image[j]=image[image.length-1-j];
                        // image[image.length-1-j]= (image[j]^1);
                        image[i][image.length-1-j]= (image[i][j]^1);
                        image[i][j]= (image[i][image.length-1-j]);
                    }
                }
            }
            return image;
        }
}
