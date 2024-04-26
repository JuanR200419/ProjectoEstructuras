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
public class Usuario  implements Serializable{
    private String nommbreUsuario;
    private Contrasena contrasena;
    String rol;

    public Usuario(String nommbreUsuario, Contrasena contrasena, String rol) {
        this.nommbreUsuario = nommbreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }


  

    public String getNommbreUsuario() {
        return nommbreUsuario;
    }

    public void setNommbreUsuario(String nommbreUsuario) {
        this.nommbreUsuario = nommbreUsuario;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }

    public void setContrasena(Contrasena contrasena) {
        this.contrasena = contrasena;
    }



    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
