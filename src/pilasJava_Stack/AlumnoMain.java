/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasJava_Stack;

import java.util.Stack;

/**
 *
 * @author chamb
 */
public class AlumnoMain {
    public static void main(String[] args) {
        Stack<Alumno> pila=new Stack<>();
        
        Alumno a=new Alumno("Ariel", "Fidelitas");
        Alumno b= new Alumno("Juan", "Quispe");
        Alumno c= new Alumno("Delia","Riva");
        
        pila.push(a);
        pila.push(b);
        pila.push(c);
        
        pila.pop();
        System.out.println(pila.peek().getNombre());
    }
}
