/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import modelado.Enums.Materia;
import modelado.Enums.Dias;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Curso implements Serializable {

    Docente docente;
    Lista<Estudiante> listaEstudiantes;
    String periodo;
    Lista<Horario> horariosEstablecidos;
    Materia materia;
    String codigoDeCurso;
    String jornada;

    public Curso( Materia materia,Docente docente, String periodo,  String codigoDeCurso, String jornada) {
        this.docente = docente;
        this.listaEstudiantes = new Lista<>();
        this.periodo = periodo;
        this.horariosEstablecidos = new Lista<>();
        this.materia = materia;
        this.codigoDeCurso = codigoDeCurso;
        this.jornada = jornada;

    }

    @Override
    public String toString() {
        return  this.materia.toString() +"-Docente: "+this.docente.getNombre()+"-Codigo: " +this.codigoDeCurso; 
    }
// validaciones Para el dia 

    public void guardarHorario(Horario horario) {
        Horario res = validarDiaUnic(horario.getDia());
        if (res == null) {
            this.horariosEstablecidos.add(horario);
        }
    }

    public void eliminarHorario(Dias dia) {
        Horario res = validarDiaUnic(dia);
        if (res != null) {
            this.horariosEstablecidos.remove(res);
        }
    }

    public void actualizarHorario(Horario horario) {
        Horario validar = validarDiaUnic(horario.getDia());
        if (validar != null) {
            validar.setDia(horario.getDia());
            validar.setHoraEntrada(horario.getHoraEntrada());
            validar.setHoraSalida(horario.getHoraSalida());

        }
    }

    public Horario validarDiaUnic(Dias dia) {
        for (int i = 0; i < this.horariosEstablecidos.size(); i++) {
            if (horariosEstablecidos.get(i).getDia().equals(dia)) {
                return horariosEstablecidos.get(i);
            }
        }
        return null;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void registrarEstudiante(Estudiante estudiante) {
        Estudiante estudi = buscarEstudiante(estudiante.getId());
        if (estudi != null) {
            System.out.println("exception de ya esta registrado este estudiante");

        }
        if (estudi == null) {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                listaEstudiantes.add(estudiante);
                JOptionPane.showMessageDialog(null, "Se registro el estudiante");
            }
        }

    }

    public void quitarCursoEstudiante(String codigo) {
        Estudiante estudi = buscarEstudiante(codigo);
        if (estudi == null) {
            System.out.println("exception de estudiante no esta en este curso o no existe");
        }
        if (estudi != null) {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                if (listaEstudiantes.get(i).getId().equals(codigo)) {
                    listaEstudiantes.remove(estudi);
                }
            }
        }
    }

    public Estudiante buscarEstudiante(String codigo) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId().equals(codigo)) {
                return listaEstudiantes.get(i);
            }
        }
        return null;
    }

    public String getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(String codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }


    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Lista<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(Lista<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Lista<Horario> getHorariosEstablecidos() {
        return horariosEstablecidos;
    }

    public void setHorariosEstablecidos(Lista<Horario> horariosEstablecidos) {
        this.horariosEstablecidos = horariosEstablecidos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
