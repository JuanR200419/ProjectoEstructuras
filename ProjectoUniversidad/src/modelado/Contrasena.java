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
public class Contrasena implements Serializable{
    String idenContrasena;
       public static final String TEMPORAL = "Temporal";
     public static final String NOTEMPORAL = "NoTemporal";
     String estado;

    public Contrasena(String idenContrasena) {
        this.idenContrasena = idenContrasena;
        this.estado = TEMPORAL;
    }

    public String getIdenContrasena() {
        return idenContrasena;
    }

    public void setIdenContrasena(String idenContrasena) {
        this.idenContrasena = idenContrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
     
}
