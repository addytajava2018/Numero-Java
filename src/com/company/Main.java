package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // para mostrar el system ctrl+j escribir sout

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        String valor = sc.nextLine();//ingresa como string
        int a = Integer.parseInt(valor);
        Numero n = new Numero(a);
        System.out.println(n.esPrimo());
        /*if (n.esPar())
            System.out.println("El numero " + a + " es par.");
        else
            System.out.println("El numero " + a + " es impar.");
    */
    }
}
