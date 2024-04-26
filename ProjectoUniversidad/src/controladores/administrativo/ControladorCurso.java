/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import modelado.Curso;
import modelado.Estudiante;
import modelado.Persona;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorCurso {

    IList<Persona> listaPersonas;
    IList<Curso> listaCursos;

    public ControladorCurso() {
        this.listaCursos = Serializador.Serializador.getSeri().getCursos();
        this.listaPersonas = Serializador.Serializador.getSeri().getPersonas();
    }

    public IList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public IList<Curso> getListaCursos() {
        return listaCursos;
    }

    public Curso buscarCurso(String codigoCurso) {
        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoDeCurso().equals(codigoCurso)) {
                return listaCursos.get(i);
            }
        }
        return null;
    }

    public void agregarCurso(Curso curso) {
        Curso aux = buscarCurso(curso.getCodigoDeCurso());
        if (aux == null) {
            listaCursos.add(curso);
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            System.out.println("Ya existe un curso con ese codigo");
        }
    }

    public void eliminarCurso(String id) {
        Curso aux = buscarCurso(id);
        if (aux != null) {
            listaCursos.remove(aux);
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            System.out.println("No existe este admin");
        }

    }

    public void ActualizarCurso(Curso curso) {
        Curso aux = buscarCurso(curso.getCodigoDeCurso());
        if (aux != null) {
            aux.setDocente(curso.getDocente());
            aux.setHorariosEstablecidos(curso.getHorariosEstablecidos());
            aux.setMateria(curso.getMateria());
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            System.out.println("No se  actualizo este admin");
        }
    }



}
