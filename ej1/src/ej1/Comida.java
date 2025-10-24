/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author DABS66
 */
public class Comida {
    
    private String nombre;
    private int lipidos;
    private int carbs;

    public Comida(String nombre, int lipidos, int carbs) {
        this.nombre = nombre;
        this.lipidos = lipidos;
        this.carbs = carbs;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLipidos() {
        return lipidos;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLipidos(int lipidos) {
        this.lipidos = lipidos;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    @Override
    public boolean equals(Object c){
        return this.nombre.equals(((Comida)c).nombre);
    }
    
    @Override
    public String toString() {
        return "comida{" + "nombre=" + nombre + ", lipidos=" + lipidos + ", carbs=" + carbs + '}';
    }
    
    
}
