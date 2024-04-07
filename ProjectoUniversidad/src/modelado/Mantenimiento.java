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
public class Mantenimiento implements Serializable {
     public static final String DISPONIBLE = "Disponible ";
    public static final String OCUPADO = "Ocupado";
    private String estado;
    LocalDate fechaMantenimiento;

    public Mantenimiento()  {
        this.estado = DISPONIBLE;
        this.fechaMantenimiento = null;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(LocalDate fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }
    
    
}
