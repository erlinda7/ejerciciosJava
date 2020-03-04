/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
La cola en la cola del supermercado
FIFO First In First Out
Primero que entra, primero que sale
 */
public class Cola {
    public static void main(String[] args) {
        Queue<Integer> cola= new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            cola.offer(i);
        }
        cola.remove();//remueve el primero 0
        System.out.println(cola.peek()); //muestra el primero
    }
}
