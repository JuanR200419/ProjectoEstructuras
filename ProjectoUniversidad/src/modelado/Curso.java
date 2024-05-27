    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import excepciones.EstudianteNoExisteException;
import excepciones.SecruzaHorarioException;
import excepciones.YaEstaRegistradoExeption;
import excepciones.horaNoValidaException;
import excepciones.unicoDiaException;
import modelado.Enums.Materia;
import modelado.Enums.Dias;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelado.Enums.Programa;
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
    Lista<Nota>listaNotas;
    private Programa programa;
    public Curso(Programa programa,Materia materia, Docente docente, String periodo, String codigoDeCurso, String jornada) {
        this.docente = docente;
        this.listaEstudiantes = new Lista<>();
        this.periodo = periodo;
        this.horariosEstablecidos = new Lista<>();
        this.materia = materia;
        this.codigoDeCurso = codigoDeCurso;
        this.jornada = jornada;
        this.listaNotas = new Lista<>();
        this.programa = programa;
    }

    public Lista<Nota> getListaNotas() {
        return listaNotas;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public void setListaNotas(Lista<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return this.materia.toString() + "-Docente: " + this.docente.getNombre() + " Programa: "+this.programa.toString() + " -Codigo: " + this.codigoDeCurso;
    }
// validaciones Para el dia 

    public void guardarHorario(Horario horario) throws horaNoValidaException, unicoDiaException {
        boolean horaValidada = validarHoraCorrecta(horario.getHoraEntrada(), horario.getHoraSalida());
        if (horaValidada) {
            Horario res = validarDiaUnic(horario.getDia());
            if (res == null) {
                this.horariosEstablecidos.add(horario);
            } else {
                throw new unicoDiaException();
            }
        } else {
            throw new horaNoValidaException();
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

    public boolean validarHoraCorrecta(LocalTime horaEntrada, LocalTime horaSalida) {
        if (horaEntrada.isBefore(horaSalida)) {
            return true;
        }
        return false;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Estudiante buscarEstudiante(String codigo) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId().equals(codigo)) {
                return listaEstudiantes.get(i);
            }
        }
        return null;
    }
// METODOS DE ASIGNACION DE ESTUDIANTE

    public void asignarEstudiante(Estudiante estudiante) throws YaEstaRegistradoExeption{
        Estudiante estudi = buscarEstudiante(estudiante.getId());
            if (estudi == null) {
                listaEstudiantes.add(estudiante);

            } else {
                throw new YaEstaRegistradoExeption();
            }
        } 

    public void quitarCursoEstudiante(String codigo) throws EstudianteNoExisteException {
        Estudiante estudi = buscarEstudiante(codigo);
        if (estudi == null) {
            throw new EstudianteNoExisteException();
        }
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId().equals(codigo)) {
                listaEstudiantes.remove(estudi);
            }
        }
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
