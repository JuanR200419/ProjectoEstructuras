/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Juan Manuel
 */
public class Lista implements IList {

    private int size;
    private Nodo primero;

    public Lista() {
        this.primero = null;
        this.size = 0;
    }

    @Override
    public void add(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            this.primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.nodoSig != null) {
                aux = aux.nodoSig;
            }
            aux.nodoSig = nuevo;
        }
        size++;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                return primero.dato;
            } else {
                Nodo aux = primero;
                int cont = 0;
                while (cont < index) {
                    aux = aux.nodoSig;
                    cont++;
                }
                return aux.dato;
            }
        }
    }

    @Override
    public void add(String dato, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                primero.dato = dato;
            } else {
                Nodo aux = primero;
                int cont = 0;
                while (cont < index) {
                    aux = aux.nodoSig;
                    cont++;
                }
                aux.dato = dato;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (index == 0) {
                primero = primero.nodoSig;
                size--;
            } else {
                Nodo ant = null;
                Nodo aux = primero;
                int cont = 0;
                while (cont < index) {
                    ant = aux;
                    aux = aux.nodoSig;
                    cont++;
                }
                ant.nodoSig = aux.nodoSig;
            }
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void remove(String dato) {
        if (primero.dato.equals(dato)) {
            primero = primero.nodoSig;
        } else {
            Nodo ant = null;
            Nodo aux = primero;
            int cont = 0;
            while (!aux.dato.equals(dato) && cont < size) {
                ant = aux;
                aux = primero.nodoSig;
                cont++;
            }
            ant.nodoSig = aux.nodoSig;
        }
     size--;
    }
}
