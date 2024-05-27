/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Juan Manuel
 */
public class NodoPila<T>  {
     T dato;
    NodoPila<T> nodoSig;

    public NodoPila(T dato) {
        this.dato = dato;
        this.nodoSig = null;
    }
    
}
