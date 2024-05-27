/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import modelado.Enums.Programa;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Estudiante extends Persona implements Serializable {

    private IList<Double> listaNotas;
    private Programa programa;
    private IList<Notificacion>listaNotificaciones;
    public Estudiante( Programa programa, String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, Contrasena contrasena, String rol) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena, rol);
        this.listaNotas = new Lista<>();
        this.listaNotificaciones = new Lista<>();
        this.programa = programa;
    }

    public IList<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " Codigo " + this.getId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }


    public IList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(IList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

}
