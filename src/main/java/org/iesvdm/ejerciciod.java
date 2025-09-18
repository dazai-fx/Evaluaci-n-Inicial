package org.iesvdm;

import java.util.Scanner;

public class ejerciciod {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");

        int num = sc.nextInt();

        System.out.println("Introduce la posición del digito que quieras: ");

        int posicion = sc.nextInt();

        String numString = Integer.toString(num);

        if(posicion > numString.length() || posicion <=0){
            System.out.println("No existe el dígito en esa posición");
        }else{
            char digito = numString.charAt(posicion - 1);
            int digitoInt = Character.getNumericValue(digito);
            System.out.println("El dígito en la posición " + posicion + " es: " + digitoInt);
        }
        sc.close();


    }
}
