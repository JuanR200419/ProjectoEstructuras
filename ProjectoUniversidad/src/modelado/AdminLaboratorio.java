/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */

public class AdminLaboratorio extends Personal  implements Serializable{

    public AdminLaboratorio(String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, String contrasena) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena);
    }

   
}
