/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import excepciones.NoseEncuentraDetalleException;
import excepciones.YacalificadoException;
import java.io.Serializable;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Nota implements Serializable {

    String descripcion;
    double porcentaje;
    Lista<Detalle> listaDetalles;

    public Nota(String descripcion, double porcentaje) {
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
        this.listaDetalles = new Lista<>();
    }

    public void calificar(Detalle detalle) throws YacalificadoException {
        Estudiante estudi = buscarEstudianteCalificado(detalle.getEstudinate());
        if (estudi == null) {
            detalle.setCalificado(true);
            this.listaDetalles.add(detalle);
        } else {
            throw new YacalificadoException();
        }

    }

    public Estudiante buscarEstudianteCalificado(Estudiante estudi) {
        for (int i = 0; i < listaDetalles.size(); i++) {
            if (listaDetalles.get(i).getEstudinate().getId().equals(estudi.getId()) && listaDetalles.get(i).isCalificado() == true) {
                return listaDetalles.get(i).getEstudinate();
            }
        }

        return null;
    }

    public Detalle buscarDetalle(Estudiante estudi) {
        for (int i = 0; i < listaDetalles.size(); i++) {
            if (listaDetalles.get(i).getEstudinate().getId().equals(estudi.getId())) {
                return listaDetalles.get(i);
            }
        }
        return null;
    }

    public void eliminarDetalle(Estudiante estudi) throws NoseEncuentraDetalleException {
        Detalle deta = buscarDetalle(estudi);
        if (deta != null) {
            listaDetalles.remove(deta);

        } else {
            throw new NoseEncuentraDetalleException();
        }
    }

    public void editarDetalle(Detalle detalle) throws NoseEncuentraDetalleException {
        Detalle deta = buscarDetalle(detalle.getEstudinate());
        if (deta != null) {
            deta.setValor(detalle.getValor());
            deta.setEstudinate(detalle.getEstudinate());
        }else {
            throw new NoseEncuentraDetalleException();
        }
    }

    @Override
    public String toString() {
        return "Nota-- Porcentaje:" + String.valueOf(this.porcentaje) + " Descripcion " + this.descripcion; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Lista<Detalle> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(Lista<Detalle> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

}
