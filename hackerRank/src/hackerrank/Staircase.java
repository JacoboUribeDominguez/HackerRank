
package hackerrank;

import java.util.Scanner;
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int spaces = size-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size-spaces; j++) {
                System.out.print("#");
            }
            System.out.println("");
            spaces--;
        }
    }
}
