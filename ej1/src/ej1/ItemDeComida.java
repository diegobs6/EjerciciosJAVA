/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author DABS66
 */
public class ItemDeComida {
    private Comida comida;
    private double gramos;

    public ItemDeComida(Comida comida, double gramos) {
        this.comida = comida;
        this.gramos = gramos;
    }

    public Comida getComida() {
        return comida;
    }

    public double getGramos() {
        return gramos;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    @Override
    public String toString() {
        return "itemDeComida{" + "comida=" + comida + ", gramos=" + gramos + '}';
    }
    
    
}
