/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import modelado.Enums.Materia;
import modelado.Enums.Dias;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Curso implements Serializable {

    String nombre;
    Docente docente;
    Lista<Estudiante> listaEstudiantes;
    LocalDate periodo;
    Lista<Horario> horariosEstablecidos;
    Materia materia;
    String codigoDeCurso;

    public Curso(String nombre, Docente docente, LocalDate periodo, Materia materia, String codigoDeCurso) {
        this.nombre = nombre;
        this.docente = docente;
        this.listaEstudiantes = new Lista<>();
        this.periodo = periodo;
        this.horariosEstablecidos = new Lista<>();
        this.materia = materia;
        this.codigoDeCurso = codigoDeCurso;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
