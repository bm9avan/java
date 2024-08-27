package com.Q;

import java.util.Arrays;

public class Q885 {
    public static void main(String[] args) {
        int[][] a = spiralMatrixIII(5,6,1,4);
//        System.out.print("[");
        for(int i=0; i<5*6; i++){
            System.out.println(Arrays.toString(a[i])+",");
        }
    }
        public static int[][] spiralMatrixIII(int r, int c, int x, int y) {
            int[][] a= new int[r*c][2];
            int index = 0;
            int m = 0;
            a[index++] = new int[]{x,y};
                int loop= Math.max( Math.max(r-x, x+1), Math.max(c-y, y+1));
            for(int i=1; i<= loop; i++){
                for(int j=1; j<= 4; j++){
                    if(j%2!=0) m++;
                    switch (j){
                        case 1: for(int k=1; k<=m; k++){ //move right
                            y+=1;
                            if(y<c && x<r && y>=0 && x>=0) a[index++]= new int[] {x,y};
                        }
                        break;
                        case 2: for(int k=1; k<=m; k++){ //move down
                            x+=1;
                            if(y<c && x<r && y>=0 && x>=0) a[index++]= new int[] {x,y};
                        }
                            break;
                        case 3: for(int k=1; k<=m; k++){ //move left
                            y-=1;
                            if(y<c && x<r && y>=0 && x>=0) a[index++]= new int[] {x,y};
                        }
                            break;
                        case 4: for(int k=1; k<=m; k++){ //move up
                            x-=1;
                            if(y<c && x<r && y>=0 && x>=0) a[index++]= new int[] {x,y};
                        }
                    }
                }
            }
            return a;
            // int maxx= Math.max(r-x, x+1);
            // int maxy= Math.max(c-y, y+1);
            //  for(int i=0; i< maxx; i++){
            //      for(int j=0; j< maxy; j++){

            //      }
            //  }
        }
    
}
