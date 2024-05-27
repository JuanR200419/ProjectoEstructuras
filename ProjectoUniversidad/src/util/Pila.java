/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Juan Manuel
 */
public class Pila<T> implements IStack<T> {

    private NodoPila<T> primero;

    public Pila() {
        this.primero = null;
    }

    @Override
    public boolean isEmpty() {
        if (this.primero == null) {
            return true;
        }
        return false;
    }

    @Override
    public void push(T dato) {
       NodoPila<T> nuevo = new NodoPila<>(dato);
        if (isEmpty()) {
            this.primero = nuevo;
        } else {
            nuevo.nodoSig = primero;
            primero = nuevo; 
            
        }
    
    }

    @Override
    public T pop() {
     T dato= this.primero.dato; 
     this.primero = primero.nodoSig;
     return dato;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.primero.dato;
    }

}
