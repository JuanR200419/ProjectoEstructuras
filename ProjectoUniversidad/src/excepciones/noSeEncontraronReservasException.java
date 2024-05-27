/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Manuel
 */
public class noSeEncontraronReservasException extends Exception {

    public noSeEncontraronReservasException() {
        super("No se encontro ninguna reserva activa");
    }

}
