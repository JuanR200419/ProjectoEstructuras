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
     public static final String DISPONIBLE = "En mantenimiento ";
    public static final String OCUPADO = "Fuera de mantenimiento";
    private String estado;
    Laboratorio laboratorio;
    LocalDate fechaMantenimientoInicial;
    LocalDate fechaMantenimientoFinal;
    String descripcion;
    public Mantenimiento(Laboratorio laboratorio, LocalDate fechaMantenimientoInicial, LocalDate fechaMantenimientoFinal,String descripcion) {
        this.laboratorio = laboratorio;
        this.fechaMantenimientoInicial = fechaMantenimientoInicial;
        this.fechaMantenimientoFinal = fechaMantenimientoFinal;
        this.estado = DISPONIBLE;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaMantenimientoInicial() {
        return fechaMantenimientoInicial;
    }

    public void setFechaMantenimientoInicial(LocalDate fechaMantenimientoInicial) {
        this.fechaMantenimientoInicial = fechaMantenimientoInicial;
    }

    public LocalDate getFechaMantenimientoFinal() {
        return fechaMantenimientoFinal;
    }

    public void setFechaMantenimientoFinal(LocalDate fechaMantenimientoFinal) {
        this.fechaMantenimientoFinal = fechaMantenimientoFinal;
    }

    
    
}
