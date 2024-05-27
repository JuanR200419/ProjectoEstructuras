/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;

/**
 *
 * @author Juan Manuel
 */
public class Notificacion implements Serializable{
String mensaje;
String mensajero;

    public Notificacion(String mensaje, String mensajero) {
        this.mensaje = mensaje;
        this.mensajero = mensajero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensajero() {
        return mensajero;
    }

    public void setMensajero(String mensajero) {
        this.mensajero = mensajero;
    }
    
    
}
