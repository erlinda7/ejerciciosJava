/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 * Su programa es utilizar el enfoque de fuerza bruta para encontrar la
 * Respuesta a la vida, el universo y todo. Más precisamente ... reescriba
 * números pequeños de entrada a salida. Deje de procesar la entrada después de
 * leer el número 42. Todos los números en la entrada son enteros de uno o dos
 * dígitos.
 */
public class A001_SentidoVida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        int valor = 0;
        do {
            valor = sc.nextInt();
            if (valor != 42) {
                cadena += valor + ",";
            }
        } while (valor != 42);

        String[] arreglo = cadena.split(",");

        System.out.println("");
        for (String i : arreglo) {
            System.out.println(i);
        }
    }
}
