/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Juan Manuel
 */
public class Persona  extends Usuario implements Serializable{
    
   private String nombre;
   private String id;
   private LocalDate fechaNacimiento;

    public Persona(String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, Contrasena contrasena, String rol) {
        super(nommbreUsuario, contrasena, rol);
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
