/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class noTieneHorarioException extends Exception{

    public noTieneHorarioException() {
    super("este curso no tiene horarios asignados");
    }
    
}
