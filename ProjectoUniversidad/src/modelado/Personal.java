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
public class Personal  extends Usuario implements Serializable{
    
   private String nombre;
   private String id;
   private LocalDate fechaNacimiento;

    public Personal(String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, String contrasena) {
        super(nommbreUsuario, contrasena);
        this.nombre = nombre;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   
   
}
