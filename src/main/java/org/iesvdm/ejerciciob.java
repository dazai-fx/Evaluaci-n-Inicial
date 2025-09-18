package org.iesvdm;

import java.util.Scanner;

public class ejerciciob {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base imponible: ");

        double baseImponible = sc.nextDouble();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");

        String tipoIva = sc.next();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");

        String codigoPromocional = sc.next();

        System.out.println("Base imponible:     " + baseImponible);

        double totalIva; // variable para almacenar el total con IVA para aplicar descuentos

        if(tipoIva.equalsIgnoreCase("reducido")){
            System.out.println("IVA (10%):         " + (baseImponible * 0.10));
            totalIva=Math.round((baseImponible * 1.10) * 100.0) / 100.0;
            System.out.println("Precio con IVA:     " + totalIva);
        }else if(tipoIva.equalsIgnoreCase("superreducido")){
            System.out.println("IVA (4%):          " + (baseImponible * 0.04));
            totalIva=Math.round((baseImponible * 1.04) * 100.0) / 100.0;
            System.out.println("Precio con IVA:     " + totalIva);
        }else{
            System.out.println("IVA (21%):         " + (baseImponible * 0.21));
            totalIva=Math.round((baseImponible * 1.21) * 100.0) / 100.0;
            System.out.println("Precio con IVA:     " + totalIva);
        }
        
        if(codigoPromocional.equalsIgnoreCase("mitad")){
            System.out.println("Cód. promo. (mitad): -" + (totalIva * 0.5));
            System.out.println("TOTAL:              " + (totalIva - (totalIva * 0.5)));
        }else if(codigoPromocional.equalsIgnoreCase("meno5")){
            System.out.println("Cód. promo. (5€):  -5.00");
            System.out.println("TOTAL:              " + (totalIva - 5));
        }else if(codigoPromocional.equalsIgnoreCase("5porc")){
            System.out.println("Cód. promo. (5%):  -" + (totalIva * 0.05));
            System.out.println("TOTAL:              " + (totalIva - (totalIva * 0.05)));
        }else{
            System.out.println("Cód. promo. (nopro): -0.00");
            System.out.println("TOTAL:              " + totalIva);
        }

        sc.close();  

    }
}
