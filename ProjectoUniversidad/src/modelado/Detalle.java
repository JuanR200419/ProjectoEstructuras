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
public class Detalle  implements Serializable{
    Estudiante estudinate;
    double valor;
    boolean calificado;

    public Detalle(Estudiante estudinate, double valor) {
        this.estudinate = estudinate;
        this.valor = valor;
        this.calificado = false;
    }

    public Estudiante getEstudinate() {
        return estudinate;
    }

    public void setEstudinate(Estudiante estudinate) {
        this.estudinate = estudinate;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isCalificado() {
        return calificado;
    }

    public void setCalificado(boolean calificado) {
        this.calificado = calificado;
    }
    
}
