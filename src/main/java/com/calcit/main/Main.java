package com.calcit.main;

import com.calcit.division.Division;
import com.calcit.multiplicacion.Multiplicacion;
import com.calcit.resta.Resta;
import com.calcit.suma.Suma;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void menu()
    {
        System.out.println("Ingresa el número de la operación que deseas realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opc = sc.nextInt();
        sc.nextLine();
        switch (opc)
        {
            case 1:
                double resultado = Suma.sum();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                double resultado2 = Resta.res();
                System.out.println("El resultado de la resta es: " + resultado2);
                break;
            case 3:
                double resultado3 = Multiplicacion.mult();
                System.out.println("El resultado de la multiplicación es: " + resultado3);
                break;
            case 4:
                double resultado4 = Division.div();
                System.out.println("El resultado de la división es: " + resultado4);
                break;
        }
    }

    public static void despedida()
    {
        System.out.println("Gracias por usar la calculadora");
    }

    public static void main(String[] args)
    {
        menu();
        despedida();
    }
}