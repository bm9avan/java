package com.recurtion.level2;

public class Validate {
    public static void main(String[] args) {
//        solve(0,0,fillN());
        String[][] in= {
                {"7",".",".",".",".",".",".",".","5"},
                {"5",".","9","3",".",".",".","2","."},
                {".",".",".",".",".","7","3","9","."},
                {".",".","3","2","5","8","1","4","."},
                {"6",".","5","1","7","3",".",".","2"},
                {"1","8","2",".","9",".",".","3","7"},
                {"8",".","4",".",".",".",".","7","."},
                {"2",".","7",".",".","5","4","6","1"},
                {"3","1",".","7",".","4",".","5","."}

        };
        System.out.println(isValidSudoku(in));
    }

    public static boolean isValidSudoku(String[][] board) {
            int a1,a2,a3,a4,a5,a6,a7,a8,a9;
            a1=a2=a3=a4=a5=a6=a7=a8=a9=0;
            int b1,b2,b3,b4,b5,b6,b7,b8,b9;
            b1=b2=b3=b4=b5=b6=b7=b8=b9=0;
            int c1,c2,c3,c4,c5,c6,c7,c8,c9;
            c1=c2=c3=c4=c5=c6=c7=c8=c9=0;
            for(int i=0;i<9;i++){
                a1=a2=a3=a4=a5=a6=a7=a8=a9=0;
                b1=b2=b3=b4=b5=b6=b7=b8=b9=0;
                c1=c2=c3=c4=c5=c6=c7=c8=c9=0;
                for(int j=0;j<9;j++){
                    String value1= board[i][j];
                    String value2= board[j][i];
                    String value3= board[(i/3)*3+j/3][(i%3)*3+j%3];
                    switch(value1){
                        case "1":a1++;
                            break;
                        case "2":a2++;
                            break;
                        case "3":a3++;
                            break;
                        case "4":a4++;
                            break;
                        case "5":a5++;
                            break;
                        case "6":a6++;
                            break;
                        case "7":a7++;
                            break;
                        case "8":a8++;
                            break;
                        case "9":a9++;
                            break;
                    }
                    switch(value2){
                        case "1":b1++;
                            break;
                        case "2":b2++;
                            break;
                        case "3":b3++;
                            break;
                        case "4":b4++;
                            break;
                        case "5":b5++;
                            break;
                        case "6":b6++;
                            break;
                        case "7":b7++;
                            break;
                        case "8":b8++;
                            break;
                        case "9":b9++;
                            break;
                    }
                    switch(value3){
                        case "1":c1++;
                            break;
                        case "2":c2++;
                            break;
                        case "3":c3++;
                            break;
                        case "4":c4++;
                            break;
                        case "5":c5++;
                            break;
                        case "6":c6++;
                            break;
                        case "7":c7++;
                            break;
                        case "8":c8++;
                            break;
                        case "9":c9++;
                            break;
                    }
                }
                if((a1>1||a2>1||a3>1||a4>1||a5>1||a6>1||a7>1||a8>1||a9>1)||(b1>1||b2>1||b3>1||b4>1||b5>1||b6>1||b7>1||b8>1||b9>1)||(c1>1||c2>1||c3>1||c4>1||c5>1||c6>1||c7>1||c8>1||c9>1)){
                    return false;
                }
            }
            return true;
        }
    }