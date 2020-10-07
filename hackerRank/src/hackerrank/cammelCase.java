
package hackerrank;

import java.util.Scanner;

public class cammelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String string = sc.nextLine();
        String alphabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int cont = 1;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < alphabeto.length(); j++) {
                if (string.charAt(i)== alphabeto.charAt(j)) {
                    System.out.println(string.charAt(i));
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
}
