/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import java.util.ArrayList;
/**
 *
 * @author DABS66
 */
public abstract class seres_vivos {
    
    private String nombre;
    private ArrayList<Comida> gustos;

    public seres_vivos(String nombre, ArrayList<Comida> gustos) {
        this.nombre = nombre;
        this.gustos = gustos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList getGustos() {
        return gustos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGustos(ArrayList gustos) {
        this.gustos = gustos;
    }

    @Override
    public String toString() {
        return "seres_vivos{" + "nombre=" + nombre + ", gustos=" + gustos + '}';
    }
    
    
    
}
