/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class EstudianteNoExisteException extends Exception {

    public EstudianteNoExisteException() {
    super("Este Estudiante no existe");
    }
    
}
