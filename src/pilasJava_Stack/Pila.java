/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasJava_Stack;

import java.util.Stack;

/**
pila de platos
LIFO Last In First Out
ultimo en entrar, primero en salir

 */
public class Pila {
    public static void main(String[] args) {
        Stack<Integer>  pila= new Stack<>();
        
        for (int i = 0; i < 10; i++) {
            pila.push(i);
        }
        pila.pop(); //elimina el ultimo
        System.out.println(pila.peek());
    }
}
