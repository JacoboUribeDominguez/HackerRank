
package hackerrank;

import java.util.Scanner;

public class compareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sA [] = new int [3];
        int sB [] = new int [3];
        int nAccumA=0, nAccumB=0;
        for (int i = 0; i < 3; i++) {
            sA[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            sB[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            nAccumA += (sA[i]>sB[i]) ? 1:0;
            nAccumB += (sB[i]>sA[i]) ? 1:0;
        }
        System.out.println(nAccumA + " "+nAccumB);
    }
}
