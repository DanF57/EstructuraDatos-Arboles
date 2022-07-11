/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadabinaria;

/**
 *
 * @author Daniel
 */
public class Nodo {
    Persona cliente;
    Nodo sig;
    public Nodo(int id, String nom){
        this.cliente = new Persona(id, nom);
        this.sig = null;

    }
    
}
