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
public class Mesa {
    
    private ArrayList<ItemDeComida> listaComida;

    public Mesa(ArrayList<ItemDeComida> listaComida) {
        this.listaComida = listaComida;
    }

    public ArrayList<ItemDeComida> getListaComida() {
        return listaComida;
    }

    public void setListaComida(ArrayList<ItemDeComida> listaComida) {
        this.listaComida = listaComida;
    }

    @Override
    public String toString() {
        return "Mesa{" + "listaComida=" + listaComida + '}';
    }
   
    
    
}
