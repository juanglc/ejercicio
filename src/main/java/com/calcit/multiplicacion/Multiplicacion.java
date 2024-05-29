package com.calcit.multiplicacion;

import java.util.Scanner;

public class Multiplicacion
{
    static Scanner sc = new Scanner(System.in);
    public static double mult()
    {
        double resul = 0;
        System.out.println("¿Cuántos numeros desea multiplicar?");
        int n = sc.nextInt();
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
                resul *= num;
            }
        }
        return resul;
    }
}
