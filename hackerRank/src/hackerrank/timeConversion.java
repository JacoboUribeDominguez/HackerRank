
package hackerrank;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String sTime = sc.nextLine();
        int nLenght = sTime.length();
        String sCharTime = sTime.charAt(nLenght-2)+"";
        String sHour = sTime.charAt(0)+""+sTime.charAt(1);
        int nHour;
        if (!sHour.equals("12")) {
            if (sCharTime.equals("A")) {
                for (int i = 0; i < sTime.length()-2; i++) {
                    System.out.print(sTime.charAt(i));
                }
            }else{
                nHour = Integer.parseInt(sHour) + 12;
                System.out.print(nHour);
                for (int i = 2; i < sTime.length()-2; i++) {
                    System.out.print(sTime.charAt(i));
                }
            }
        }else{
            if (sCharTime.equals("A")) {
                System.out.print("00");
                for (int i = 2; i < sTime.length()-2; i++) {
                    System.out.print(sTime.charAt(i));
                }
            }else{
                for (int i = 0; i < sTime.length()-2; i++) {
                    System.out.print(sTime.charAt(i));
                }
            }
        }
    }
}
