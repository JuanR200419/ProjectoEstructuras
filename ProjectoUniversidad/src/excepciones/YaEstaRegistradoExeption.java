/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class YaEstaRegistradoExeption extends Exception {

    public YaEstaRegistradoExeption() {
    super("Ya esta registrado el estudiante en este curso");
    }
    
}
