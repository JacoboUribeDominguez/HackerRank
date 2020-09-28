
package hackerrank;

import java.util.*;
public class HackerRank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        double [] puntajes = new double[n];
        double miPuntaje = sc.nextDouble();
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            puntajes[i] = sc.nextDouble();
            sum += puntajes[i];
        }

        double promedio = sum / n;
        double resta = miPuntaje - promedio;
        String cadenaNumero= (String.format("%.2f", resta))+"";
        cadenaNumero = cadenaNumero.replace(",", ".");
        
        if (miPuntaje >= promedio) {
            System.out.println("SI "+ cadenaNumero);
        }else{
            System.out.println("NO");
        }
    }
}
