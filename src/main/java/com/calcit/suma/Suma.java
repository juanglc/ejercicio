package com.calcit.suma;

import java.util.Scanner;

public class Suma
{
    static Scanner sc = new Scanner(System.in);
    public static double sum()
    {
        double resul = 0;
        System.out.println("¿Cuántos numeros desea sumar?");
        double n = sc.nextDouble();
        for (int i = 1; i <= n; i++)
        {
            System.out.println("Ingrese el número " + i);
            double num = sc.nextDouble();
            resul += num;
        }
        return resul;
    }
}
