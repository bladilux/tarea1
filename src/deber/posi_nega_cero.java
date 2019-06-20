/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class posi_nega_cero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, negativos = 0, positivos = 0, ceros = 0;
        for (int i = 0; i < 5; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese un numero");
            num = entrada.nextInt();
            if (num < 0) {
                negativos++;
            }
            if (num > 0) {
                positivos++;
            }
            if (num == 0) {
                ceros++;
            }

        }
        System.out.println("negativos " + negativos + "  positivos " + positivos + "  ceros " + ceros);

    }

}
