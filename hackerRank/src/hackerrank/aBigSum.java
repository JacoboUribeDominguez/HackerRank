
package hackerrank;

import java.util.Scanner;

public class aBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long sum = 0;
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            sum+= sc.nextLong();
        }
        System.out.println(sum);
    }
}
