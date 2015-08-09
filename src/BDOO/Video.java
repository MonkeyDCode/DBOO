package BDOO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto
 */
public class Video {
    
    String cantidad;
    String nombre;
    String director;
    String año;
    String genero;

    public Video( String nombre, String director, String año, String genero,String cantidad) {
        
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.genero = genero;
        this.cantidad= cantidad;
    }
    
    public Video()
    {
        super();
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public Video(String nombre)
    {
        super();
        this.nombre=nombre;
    }
    
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
