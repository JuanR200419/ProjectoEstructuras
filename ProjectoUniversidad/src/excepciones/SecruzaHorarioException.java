/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class SecruzaHorarioException extends Exception  {

    public SecruzaHorarioException() {
        super("No se puede registrar el curso porque se cruzan los horarios");
    }
    
}
