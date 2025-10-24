/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.ArrayList;
/**
 *
 * @author DABS66
 */
public class Ej1 {
    
    // gonzalo escogio chocolate
    //quedan 3 items en la mesa
    
    public static void play(ArrayList<Humano> personas, Mesa mesa){
        for(Humano h : personas){
            ArrayList<ItemDeComida> comidasDisponibles = mesa.getListaComida();
            ArrayList<Comida> gustosPersona = h.getGustos();
            boolean encontrado = false;
            for(Comida gusto : gustosPersona){
                for(ItemDeComida item : comidasDisponibles){
                    if(item.getComida().equals(gusto)){
                        System.out.println(h.getNombre()+" escogio "+item.getComida().getNombre());
                        encontrado = true;
                        break;
                    }
                }
                if(encontrado){
                    break;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comida chocolate = new Comida("chocolate", 5, 20);
        Comida manzana = new Comida("manzana", 3, 15);
        Comida pera = new Comida("pera", 2, 10);
        
        ItemDeComida chocolate_item = new ItemDeComida(chocolate, 200);
        ItemDeComida mm = new ItemDeComida(chocolate, 100);
        ItemDeComida manzana_item = new ItemDeComida(manzana, 200);
        ItemDeComida pera_item = new ItemDeComida(pera,200);
        
        ArrayList<Comida> gustosDiego = new ArrayList<Comida>(); 
        gustosDiego.add(pera);
        gustosDiego.add(chocolate);
        
        ArrayList<Comida> gustosGonzalo = new ArrayList<Comida>(); 
        gustosGonzalo.add(manzana);
        gustosGonzalo.add(chocolate);
        
        Humano diego = new Humano ("Diego",gustosDiego);
        Humano gonzalo = new Humano("Gonzalo", gustosGonzalo);
        
        ArrayList<ItemDeComida> itemsDeComida = new ArrayList<ItemDeComida>();
        itemsDeComida.add(chocolate_item);
        itemsDeComida.add(mm);
        itemsDeComida.add(manzana_item);
        itemsDeComida.add(pera_item);
                
        Mesa mesa = new Mesa(itemsDeComida);
        
        ArrayList<Humano> humanos = new ArrayList<Humano>();
        humanos.add(diego);
        humanos.add(gonzalo);
        
        play(humanos, mesa);
    }
    
}
