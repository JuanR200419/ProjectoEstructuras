/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class NotaExistenteException extends Exception {

    public NotaExistenteException() {
    super("Ya existe una nota con esta descripcion");
    }
    
    
}
