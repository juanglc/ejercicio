package com.calcit.resta;

import java.util.Scanner;

public class Resta
{
    static Scanner sc = new Scanner(System.in);
    public static double res()
    {
        double resul = 0;
        System.out.println("¿Cuántos numeros desea restar?");
        double n = sc.nextDouble();
        for (int i = 1; i <= n; i++)
        {
            System.out.println("Ingrese el número " + i);
            double num = sc.nextDouble();
            if (i == 1)
            {
                resul = num;
            }
            else
            {
                resul -= num;
            }
        }
        return resul;
    }
}
