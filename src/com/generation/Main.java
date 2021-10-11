package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo es válido */

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos grados tiene el primer angulo?");
        int a1 = sc.nextInt();
        System.out.println("¿Cuantos grados tiene el segundo angulo?");
        int a2 = sc.nextInt();
        System.out.println("¿Cuantos grados tiene el segundo angulo?");
        int a3 = sc.nextInt();

        int suma = a1 + a2 + a3;

        if (suma == 180){
            System.out.println("El triángulo es valido");
        } else {
            System.out.println("El triángulo NO es valido porque sus angulos interiores no suman 180°");
        }
        sc.close();
    }
}
