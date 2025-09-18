package org.iesvdm;

import java.util.Scanner;

public class ejercicioc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumeros = 0;

        int numIntroducido=1;

        while(numIntroducido>0) {
            System.out.println("Introduce número: (si es negativo se termina)");
            numIntroducido=sc.nextInt();
            if(numIntroducido>0)
                totalNumeros++;
       } 

        sc.close();

        System.out.println("Has introducido " + totalNumeros);

    }
}
