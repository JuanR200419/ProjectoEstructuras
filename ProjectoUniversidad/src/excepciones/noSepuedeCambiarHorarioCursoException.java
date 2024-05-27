/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class noSepuedeCambiarHorarioCursoException extends Exception {

    public noSepuedeCambiarHorarioCursoException() {
    super("No se puede cambiar el horario ya que no coincide con el horario de estudiantes o docentes");
    }
    
}
