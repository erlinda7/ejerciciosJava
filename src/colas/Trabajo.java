/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author chamb
 * Makigas
 */
public class Trabajo {
    private String titulo;
    private String autor;
    private boolean impreso;

    public Trabajo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.impreso = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isImpreso() {
        return impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }
    
    
    
}

