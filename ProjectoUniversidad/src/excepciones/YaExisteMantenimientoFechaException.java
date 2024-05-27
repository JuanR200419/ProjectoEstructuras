/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class YaExisteMantenimientoFechaException extends Exception{

    public YaExisteMantenimientoFechaException() {
    super("Ya exsite un mantenimiento para esa fecha ");
    }
    
}
