/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author facun
 */
public class Caballo extends Animal{

    private int velocidad;

    public Caballo(int velocidad,String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.velocidad = velocidad;

    }

    
    

   
}
