/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

/**
 *
 * @author Juan Manuel
 */
public interface IList {
    /**
     * creando los metodos para listas enlazadas
     * @param dato 
     */
    public void add(String dato);
    public String get(int index);
    public void add(String dato,int index);
    public void remove(int index);
    public void remove(String dato);
    public int size();
    public boolean isEmpty();
}
