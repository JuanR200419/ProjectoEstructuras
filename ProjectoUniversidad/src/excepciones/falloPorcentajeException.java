/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class falloPorcentajeException extends Exception {

    public falloPorcentajeException() {
       super("Las tres notas deben dar un 100%");
    }
    
}
