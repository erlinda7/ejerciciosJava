/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasJava_Stack;

/**
 *
 * @author chamb
 */
public class Alumno {
    private String nombre;
    private String universidad;
    
    public Alumno(){
        this.nombre="";
        this.universidad="";
    }

    public Alumno(String nombre, String universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
   
}
