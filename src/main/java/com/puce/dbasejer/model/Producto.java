package com.puce.dbasejer.model;

import jakarta.persistence.*;
//primero el modelo

@Entity
public class Producto {

    @Id
    private int id;
    private String nombre;
    private float precio;
    
    //constructor
    public Producto(int id, String nombre, float precio) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //vacio constructor
    public Producto() {
        super();

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
