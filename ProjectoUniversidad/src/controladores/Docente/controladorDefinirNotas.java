/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Docente;

import excepciones.ExcesoNotasException;
import excepciones.NotaExistenteException;
import excepciones.completarPorcentajeException;
import excepciones.falloPorcentajeException;
import excepciones.porcentajeElevadoException;
import modelado.Curso;
import modelado.Docente;
import modelado.Nota;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class controladorDefinirNotas {

    Curso curso;
    Docente docente;

    public controladorDefinirNotas(Curso curso, Docente docente) {
        this.curso = curso;
        this.docente = docente;
    }

    public boolean definirNota(Nota nota) throws porcentajeElevadoException, ExcesoNotasException, NotaExistenteException,completarPorcentajeException {
        Nota aux = buscarNota(nota.getDescripcion(), nota.getPorcentaje());
        if (curso.getListaNotas().size() < 3) {
            if (curso.getListaNotas().size() < 2) {
                if (aux == null) {
                    if (verificarPorcentaje(nota.getPorcentaje())) {
                        curso.getListaNotas().add(nota);
                        Serializador.Serializador.getSeri().escribirCurso();
                        return true;
                    }
                } else {
                    throw new ExcesoNotasException();
                }
            } else {
                if (validarPorcentajeCien(nota.getPorcentaje())) {
                    curso.getListaNotas().add(nota);
                    Serializador.Serializador.getSeri().escribirCurso();
                    return true;
                } else {
                    throw new completarPorcentajeException();
                }
            }
        } else {
            throw new ExcesoNotasException();
        }
        return false;

    }

    private boolean validarPorcentajeCien(double valor) {
        double total = 0;
        for (int i = 0; i < curso.getListaNotas().size(); i++) {
            total += curso.getListaNotas().get(i).getPorcentaje();
        }
        total += valor;
        if (total == 100) {
            return true;
        }
        return false;
    }

    private boolean verificarPorcentaje(double porcentaje) throws porcentajeElevadoException {
        double total = 0;
        for (int i = 0; i < curso.getListaNotas().size(); i++) {
            total += curso.getListaNotas().get(i).getPorcentaje();
        }
        total += porcentaje;
        if (total <= 100) {
            return true;
        } else {
            throw new porcentajeElevadoException();
        }
    }

    public Nota buscarNota(String descri, Double porcentaje) {
        for (int i = 0; i < curso.getListaNotas().size(); i++) {
            if (curso.getListaNotas().get(i).getDescripcion().equals(descri)
                    && curso.getListaNotas().get(i).getPorcentaje() == (porcentaje)) {
                return curso.getListaNotas().get(i);
            }
        }
        return null;
    }

    public void borrarNota(String descri, Double porcentaje) {
        Nota aux = buscarNota(descri, porcentaje);
        if (aux != null) {
            curso.getListaNotas().remove(aux);
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            System.out.println("No se encontro la nota");
        }
    }

    public void editarNota(String descri, Double porcentaje) {
        Nota aux = buscarNota(descri, porcentaje);
        if (aux != null) {
            aux.setDescripcion(descri);
            aux.setPorcentaje(porcentaje);
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            System.out.println("No se encontro la nota");
        }

    }

}
