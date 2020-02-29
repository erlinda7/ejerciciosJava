/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
Se desea hallar la suma de manera independiente de los numeros pares e impares 
comprendidos entre el 1 y el 100
 */
public class A001_ContarParesImpares {
    
    public void sumaParesImpares(){
        int sumaPares=0, sumaImpares=0;
        
        for (int i = 1; i <= 100; i++) {
            if((i%2)==0){
                sumaPares+=i;
            }else{
                sumaImpares+=i;
            }
        }
        System.out.println("La suma pares entre 1 y 100 es: "+ sumaPares);
        System.out.println("La suma impares entre 1 y 100 es: "+ sumaImpares);
    }
    public static void main(String[] args) {
     A001_ContarParesImpares a001_ContarParesImpares= new A001_ContarParesImpares();
     a001_ContarParesImpares.sumaParesImpares();
    }
}
