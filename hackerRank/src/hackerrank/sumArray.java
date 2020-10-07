
package hackerrank;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int array[] = new int [size];
        int accum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            accum+=array[i];
        }
        System.out.println(accum);
    }
}
