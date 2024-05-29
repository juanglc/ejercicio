package com.calcit.division;

import java.util.Scanner;

public class Division
{
    static Scanner sc = new Scanner(System.in);
    public static double div()
    {
        double resul = 0;
        System.out.println("Ingrese la cantidad de números que quiere dividir (en orden de división)");
        System.out.println("Ejemplo: Quiero dividir 10 entre 2; entonces pondré: 10, y después 2");
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
                resul /= num;
            }
        }
        return resul;
    }
}
