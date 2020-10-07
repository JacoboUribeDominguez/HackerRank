package hackerrank;
import java.util.*;

/*
5
3
4
1
5
8
6
4
2
*/

public class FormingAMagicSquare {
    
    /*******************************************************************
     * 
     * CHECKING
     */
    
    /**
     * FIRST DIAGONAL
     */
    
    /**
     * CHECKING ROW
     */
    
    static int checkRow_S(int r, int [][] matrix){
        int sum = 0;
        for (int c = 0; c < 3; c++) {
            sum+= matrix[r][c];
        }
        return sum;
    }
    /**
     * CHECKING COLUMN
     */
    
    static int checkCol_S(int c, int [][] matrix){
        int sum = 0;
        for (int r = 0; r < 3; r++) {
            sum+= matrix[r][c];
        }
        return sum;
    }
    /**
     * CHECKING DIAG
     */
    
    static int checkDiag_SF(int [][] matrix){
        int sum = 0;
        for (int rc = 0; rc < 3; rc++) {
            sum+= matrix[rc][rc];
        }
        return sum;
    }
    
    /**
     * SECOND DIAGONAL
     */
    /**
     * CHECKING DIAG
     */
    
    static int checkDiag_SS(int [][] matrix){
        int sum = 0;
        int r = 2;
        for (int c = 0; c < 3; c++) {
            sum+= matrix[r][c];
            r--;
        }
        return sum;
    }
    /*******************************************************************
     * 
     * VOID MAIN 
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int [3][3];
        
        //filling matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int max = 15;
        int sum;
        
        int sumRow;
        int sumCol;
        int sumDiag;
        int sumDiag2;
        int accum = 0;
        
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (r != c && Math.abs(c-r) != 2) {
                    //not diagnoal
                    sumRow = checkRow_S(r, matrix);
                    sumCol = checkCol_S(c, matrix);
                    if (sumRow == sumCol) {
                        if (sumRow > 15) {
                            matrix[r][c] -= Math.abs(sumRow-max);
                            accum+=Math.abs(sumRow-max);
                        }else{
                            matrix[r][c] += Math.abs(max-sumRow);
                            accum+=Math.abs(max-sumRow);
                        }
                    }else if(sumRow > 15 || sumCol < 15){
                        matrix[r][c] -= Math.abs(sumRow-max);
                        accum+=Math.abs(sumRow-max);
                    }
                }else{
                    //diagonal
                    if (r == c ) {
                        if (r == 1) {
                            //center
                            sumDiag = checkDiag_SF(matrix);
                            sumDiag2 = checkDiag_SS(matrix);
                            if (sumDiag == sumDiag2) {
                                if (sumDiag > 15) {
                                    matrix[r][c] -= Math.abs(sumDiag-max);
                                    accum+=Math.abs(sumDiag-max);
                                }else{
                                    matrix[r][c] += Math.abs(max-sumDiag);
                                    accum+=Math.abs(max-sumDiag);
                                }
                            }
                        }else{
                            //first diagonal
                            sumRow = checkRow_S(r, matrix);
                            sumCol = checkCol_S(c, matrix);
                            sumDiag = checkDiag_SF(matrix);
                            if (sumRow == sumCol && sumRow == sumDiag) {
                                if (sumRow > 15) {
                                    matrix[r][c] -= Math.abs(sumRow-max);
                                    accum+=Math.abs(sumRow-max);
                                }else{
                                    matrix[r][c] += Math.abs(max-sumRow);
                                    accum+=Math.abs(max-sumRow);
                                }
                            }
                        }
                    }else{
                        //second diagonal
                        sumRow = checkRow_S(r, matrix);
                        sumCol = checkCol_S(c, matrix);
                        sumDiag = checkDiag_SS(matrix);
                        if (sumRow == sumCol && sumRow == sumDiag) {
                            if (sumRow > 15) {
                                matrix[r][c] -= (sumRow-max);
                                accum+=(Math.abs(sumRow-max));
                            }else{
                                matrix[r][c] += Math.abs(max-sumRow);
                                accum+=Math.abs(max-sumRow);
                            }
                        }
                    }
                }
            }
        }
        //----------------------------------------------------------------------
        boolean salirse = false;
        while(salirse == false){
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (r != c && Math.abs(c-r) != 2) {
                        if (r == c ) {
                            if (r == 1) {
                                
                            }else{
                                
                            }
                        }else{
                            
                        }
                    }else{
                        
                    }
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
