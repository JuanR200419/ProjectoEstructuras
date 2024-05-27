/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class horaNoValidaException  extends Exception{

    public horaNoValidaException() {
    super("la hora de salida esta antes que la de entrada");
    }
    
}
