/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;
import java.util.ArrayList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Laboratorio implements Serializable {
    Lista<Reserva> listaReservas;
    Lista<Curso> listaCursos;
    Mantenimiento mantenimiento;
    public static final String DISPONIBLE = "Disponible";
    public static final String OCUPADO = "Ocupado";
    String estado ;
    Puesto[][] puestos;
    public Laboratorio() {
    this.estado = DISPONIBLE;
    this.listaCursos = new Lista<>();
    this.listaReservas = new Lista<>();
    this.mantenimiento = null;
    // esto esta mal las columnas de los cursos tienen que ser equivalentes a la cantidad de estudiantes 
    this.puestos= new Puesto[listaCursos.get(0).getListaEstudiantes().size()][listaCursos.get(0).getListaEstudiantes().size()];
    }

    public Lista<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Lista<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public Lista<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(Lista<Curso> listaCursos) {
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
