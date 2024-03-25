/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class Laboratorio {
    ArrayList<Reserva> listaReservas;
    ArrayList<Curso> listaCursos;
    Mantenimiento mantenimiento;
    public static final String DISPONIBLE = "Disponible ";
    public static final String OCUPADO = "Ocupado";
    String estado ;

    public Laboratorio() {
    this.estado = DISPONIBLE;
    this.listaCursos = new ArrayList<>();
    this.listaReservas = new ArrayList<>();
    this.mantenimiento = null;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
