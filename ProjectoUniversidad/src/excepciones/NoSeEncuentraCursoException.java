/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class NoSeEncuentraCursoException extends Exception {

    public NoSeEncuentraCursoException() {
    super("No se ha Encontrado Un Curso con este codigo");
    }
    
}
