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
public class Puesto implements Serializable{

    Estudiante estudiante;
    public static final String DISPONIBLE = "Disponible";
    public static final String OCUPADO = "Ocupado";
    String estado;
    int numPuesto;
    public Puesto() {
    this.estado = DISPONIBLE;
    this.estudiante = null;
    this.numPuesto = 1;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }
    
    
    
}
