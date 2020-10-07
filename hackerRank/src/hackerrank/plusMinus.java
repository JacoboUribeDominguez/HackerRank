
package hackerrank;

import java.util.Scanner;

public class plusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int array[] = new int [size];
        double nAccumPositive = 0;
        double nAccumNegative = 0;
        double nAccumZeros = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            nAccumPositive += (array[i]>0)?1:0;
            nAccumNegative += (array[i]<0)?1:0;
            nAccumZeros += (array[i]==0)?1:0;
        }
        nAccumPositive /= size;
        nAccumNegative /= size;
        nAccumZeros /= size;
        
        String sAccumPositive = String.format("%.6f", nAccumPositive);
        String sAccumNegative = String.format("%.6f", nAccumNegative);
        String sAccumZeros = String.format("%.6f", nAccumZeros);
                
        System.out.println(sAccumPositive);
        System.out.println(sAccumNegative);
        System.out.println(sAccumZeros);
    }
}
