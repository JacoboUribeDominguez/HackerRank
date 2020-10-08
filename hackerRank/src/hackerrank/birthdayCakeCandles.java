
package hackerrank;

import java.util.Scanner;

public class birthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int aCandlesHeights [] = new int [size];
        boolean salirse = false;
        int temp;
        
        for (int i = 0; i < size; i++) {
            aCandlesHeights[i] = sc.nextInt();
        }
        
        int max = -9999;
        for (int i = 0; i < size; i++) {
            if (aCandlesHeights[i] > max) {
                max = aCandlesHeights[i];
            }
        }
        
        int cont = 0;
        for (int i = 0; i < size; i++) {
            if (aCandlesHeights[i] == max) {
                cont++;
            }
        }
        
        System.out.println(cont);
    }
}
