/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class Curso {
    String nombre;
    Docente docente;
    ArrayList<Estudiante>listaEstudiantes;
    LocalDate horario;
    String materia;
    String codigoDeCurso;

    public Curso(String nombre, Docente docente, LocalDate horario, String materia, String codigoDeCurso) {
        this.nombre = nombre;
        this.docente = docente;
        this.listaEstudiantes = new ArrayList<>();
        this.horario = horario;
        this.materia = materia;
        this.codigoDeCurso = codigoDeCurso;
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

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public LocalDate getHorario() {
        return horario;
    }

    public void setHorario(LocalDate horario) {
        this.horario = horario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
