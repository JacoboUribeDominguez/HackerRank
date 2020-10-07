
package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int aMatrix[][] = new int [size][size];
        int nDiagonal1 = 0, nDiagonal2=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                aMatrix[i][j] = sc.nextInt();
                nDiagonal1 += (i == j) ? aMatrix[i][j] : 0;
            }
        }
        
        int j = size-1;
        for (int i = 0; i < size; i++) {
            nDiagonal2 += aMatrix[i][j];
            j--;
        }
        
        System.out.println(Math.abs(nDiagonal1-nDiagonal2));
    }
}
