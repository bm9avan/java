package com.Q;

public class Q36 {
    public static void main(String[] args) {
        char[][] board=   {{'8','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku( board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int a1,a2,a3,a4,a5,a6,a7,a8,a9;
        a1=a2=a3=a4=a5=a6=a7=a8=a9=0;
        for(int i=0;i<9;i++){
            a1=a2=a3=a4=a5=a6=a7=a8=a9=0;
            for(int j=0;j<9;j++){
                char value= board[j][i];
                switch(value){
                    case '1':a1++;
                        break;
                    case '2':a2++;
                        break;
                    case '3':a3++;
                        break;
                    case '4':a4++;
                        break;
                    case '5':a5++;
                        break;
                    case '6':a6++;
                        break;
                    case '7':a7++;
                        break;
                    case '8':a8++;
                        break;
                    case '9':a9++;
                        break;
                }
            }
            if(a1>1||a2>1||a3>1||a4>1||a5>1||a6>1||a7>1||a8>1||a9>1){
                return false;
            }
        }
        return true;
    }
}



