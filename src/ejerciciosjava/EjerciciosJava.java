/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * @author chamb
 */
public class EjerciciosJava {

  public static void main (String[] args) throws java.lang.Exception
  {
     java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
     String s;
     while (!(s=r.readLine()).startsWith("42"))
         System.out.println(s);
  }

    
}
