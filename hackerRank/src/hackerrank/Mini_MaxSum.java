
package hackerrank;

import java.util.Scanner;
public class Mini_MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long aNumbers [] = new long [5];
        long aNumbersD [] = new long[5];
        long aNumbersA [] = new long[5];
        
        for (int i = 0; i < 5; i++) {
            aNumbers[i] = sc.nextLong();
            aNumbersD[i] = aNumbers[i];
            aNumbersA[i] = aNumbers[i];
        }
        
        boolean salirse = false;
        long temp;
        while(!salirse){
            salirse = true;
            for (int i = 1; i < 5; i++) {
                if (aNumbersA[i] < aNumbersA[i-1]) {
                    temp = aNumbersA[i];
                    aNumbersA[i] = aNumbersA[i-1];
                    aNumbersA[i-1] = temp;
                    salirse = false;
                }
            }
        }
        salirse = false;
        while(!salirse){
            salirse = true;
            for (int i = 1; i < 5; i++) {
                if (aNumbersD[i] > aNumbersD[i-1]) {
                    temp = aNumbersD[i];
                    aNumbersD[i] = aNumbersD[i-1];
                    aNumbersD[i-1] = temp;
                    salirse = false;
                }
            }
        }
        System.out.println((aNumbersA[0]+aNumbersA[1]+aNumbersA[2]+aNumbersA[3])+" "+(aNumbersD[0]+aNumbersD[1]+aNumbersD[2]+aNumbersD[3]));
    }
}
