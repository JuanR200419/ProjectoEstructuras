/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

/**
 *
 * @author Juan Manuel
 */
public interface IStack<T> {
    public boolean isEmpty();
    public void push(T dato );
    public T pop();
    public  T peek();
    
}
