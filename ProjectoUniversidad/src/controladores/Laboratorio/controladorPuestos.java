/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Laboratorio;

import java.time.LocalDate;
import java.time.LocalTime;
import modelado.Laboratorio;
import modelado.Puesto;
import modelado.Reserva;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class controladorPuestos {

    Laboratorio lab;
    int cantidad;
    Puesto[][] puestos;
    public controladorPuestos(Laboratorio laboratorio) {
        this.lab = laboratorio;
        this.cantidad = laboratorio.getTotal();
        this.puestos = laboratorio.getPuestos();

    }

    public Puesto obtenerPuesto(int fila, int columna) {
        return puestos[fila][columna];
    }

    public Laboratorio getLab() {
        return lab;
    }

    public void setLab(Laboratorio lab) {
        this.lab = lab;
    }

    public int getCatidad() {
        return cantidad;
    }

    public void setCatidad(int catidad) {
        this.cantidad = catidad;
    }




}
