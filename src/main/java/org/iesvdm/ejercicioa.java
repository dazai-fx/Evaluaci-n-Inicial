package org.iesvdm;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer control: ");
        double nota1 = sc.nextDouble();

        System.out.println("Introduce la nota del segundo control: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media <5){
            
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            sc.nextLine(); 
            String recuperacion = sc.nextLine();
            
            if(recuperacion.equalsIgnoreCase("apto")){
                media = 5;
            }

        }

        System.out.println("Tu nota en programación es: " + media);
        sc.close();

    }
}
