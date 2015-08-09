/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

/**
 *
 * @author alberto
 */
public class Vendidos {
    String nombre;
    String Director;
    String año;
    String genero;
    String fecha;
    

    public Vendidos( String nombre, String Director, String año, String genero,String fecha) {
        
        this.nombre = nombre;
        this.Director = Director;
        this.año = año;
        this.fecha=fecha;
        this.genero=genero;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Vendidos(){
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
