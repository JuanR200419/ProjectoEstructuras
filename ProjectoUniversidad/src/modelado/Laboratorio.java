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

    String numeroLab;
    Lista<Curso> listaCursos;
    public static final String DISPONIBLE = "Disponible";
    public static final String OCUPADO = "Ocupado";
            public static final String MANTENIMIENTO = "Mantenimiento";
    String estado;
    int total;
    Puesto[][] puestos;
    public Laboratorio() {
        this.estado = DISPONIBLE;
        this.listaCursos = new Lista<>();
        this.puestos = new Puesto[4][4];
        this.total = 10;
        this.numeroLab=null;
        initPuestos();
    }
    
     public void crearPuestos(int cantidadTotal) {
        int fila = cantidadTotal / 4;
        Puesto[][] nuevos;
        if (cantidadTotal % 4 != 0) {
            nuevos = new Puesto[fila + 1][];
            for (int i = 0; i < fila; i++) {
                nuevos[i] = new Puesto[4];
            }
            int puestosFaltantes = cantidadTotal % 4;
            nuevos[nuevos.length - 1] = new Puesto[puestosFaltantes];
        } else {
            nuevos = new Puesto[fila][4];
        }
        this.total = cantidadTotal;
        this.puestos = nuevos;
        initPuestos();
        Serializador.Serializador.getSeri().escribirLaboratorio();
    }

    public String getNumeroLab() {
        return numeroLab;
    }

    public void setNumeroLab(String numeroLab) {
        this.numeroLab = numeroLab;
    }
     

    public void initPuestos() {
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[i].length; j++) {
                puestos[i][j] = new Puesto();
            }
        }
    }
    
    
    
    public Puesto[][] getPuestos() {
        return puestos;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public Lista<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(Lista<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
