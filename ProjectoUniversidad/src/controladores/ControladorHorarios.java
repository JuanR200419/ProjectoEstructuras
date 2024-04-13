/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelado.Curso;
import modelado.Enums.Dias;
import modelado.Horario;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorHorarios {

    IList<Curso> listaCursos;
    Curso curso;

    public ControladorHorarios(Curso curso) {
        this.listaCursos = Serializador.Serializador.getSeri().getCursos();
        this.curso = curso;
    }


    public void guardarHorario(Horario horario) {
        curso.guardarHorario(horario);
        Serializador.Serializador.getSeri().escribirCurso();
    }

    public void eliminarHorario(Dias dia) {
        curso.eliminarHorario(dia);
           Serializador.Serializador.getSeri().escribirCurso();
    }

    public void actualizarHorario(Horario horario) {
        curso.actualizarHorario(horario);
           Serializador.Serializador.getSeri().escribirCurso();
    }

    public Horario validarDiaUnic(Dias dia) {
       return  curso.validarDiaUnic(dia);
    }
}
