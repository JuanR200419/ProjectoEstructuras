/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class EstudianteReservaActivaException extends Exception{

    public EstudianteReservaActivaException() {
    super("El estudiante ya tiene una reserva activa");
    }
    
}
