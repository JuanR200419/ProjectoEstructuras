/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Juan Manuel
 */
public class AdminGeneral extends Persona implements Serializable{
    
    private static final AdminGeneral admin = new AdminGeneral("admin","admin", LocalDate.MIN, "admin", "admin", "adminGeneral");

    public static AdminGeneral getAdmin() {
        return admin;
    }
  
    
    public AdminGeneral(String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, String contrasena, String rol) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena, rol);
    }
    
}
