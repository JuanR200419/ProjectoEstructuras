/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class UsuarioExistenteException extends Exception {

    public UsuarioExistenteException() {
    super("Este usuario ya existe en el sistema");
    }
    
}
