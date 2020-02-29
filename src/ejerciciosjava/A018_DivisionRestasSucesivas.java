/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 * Hacer un programa que realice una division con hasta 6 digitos de precision
 * decimal sin utilizar el operador / Es decir, la division debe realizarse
 * mediante restas sucesivas. Ejm: dividendo 153 divisor 7 Salida:21,857142
 * REstricciones: los datos de entrada seran numeros enteros positivos
 */
public class A018_DivisionRestasSucesivas {

    public void division(int dividendo, int divisor) {
        
        Scanner sc = new Scanner(System.in);
        int cont = 0, digito, decimales;
        while (dividendo > divisor) {
            dividendo -= divisor;
            cont++;
        }
        if (dividendo != 0) {
            do {
                System.out.println("Ingrese digitos para precision decimal entre [1-6]");
                digito = sc.nextInt();
            } while (digito <= 0 || digito >= 7);

            decimales = calcularDecimales(dividendo, divisor, digito);
            System.out.println( cont + "," + decimales);
        } else {
            System.out.println(cont);
        }
    }

    private int calcularDecimales(int dividendo, int divisor, int decimal) {
        int cont = 0;
        dividendo = dividendo * (int) (Math.pow(10, decimal));
        while (dividendo > divisor) {
            dividendo -= divisor;
            cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A018_DivisionRestasSucesivas div = new A018_DivisionRestasSucesivas();
        int dividendo, divisor;
        double res;
        do {
            System.out.println("Ingrese el dividendo mayor a 0");
            dividendo = sc.nextInt();
        } while (dividendo <= 0);

        do {
            System.out.println("Ingrese el divisor mayor a 0");
            divisor = sc.nextInt();
        } while (divisor <= 0);

        div.division(dividendo, divisor);
    }
}
