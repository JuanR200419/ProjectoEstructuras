/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import excepciones.EstudianteNoExisteException;
import excepciones.SecruzaHorarioException;
import excepciones.YaEstaRegistradoExeption;
import modelado.Curso;
import modelado.Estudiante;
import modelado.Horario;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorAsginarEstudiante {

    IList<Curso> cursos;
    Curso curso;

    public ControladorAsginarEstudiante(Curso curso) {
        this.curso = curso;
        this.cursos = Serializador.Serializador.getSeri().getCursos();
    }

    public Estudiante buscarEstudiante(String codigo) {
        return curso.buscarEstudiante(codigo);
    }

    public void asignarEstudiante(Estudiante estudiante) throws YaEstaRegistradoExeption, SecruzaHorarioException {
        boolean validacion = validarEstudianteTodosCursos(estudiante.getId(), curso);
        if (validacion) {
            curso.asignarEstudiante(estudiante);
            Serializador.Serializador.getSeri().escribirCurso();

        } else {
            throw new SecruzaHorarioException();
        }
    }

    public void quitarCursoEstudiante(String codigo) throws EstudianteNoExisteException {
        curso.quitarCursoEstudiante(codigo);
        Serializador.Serializador.getSeri().escribirCurso();
    }

//    
    private boolean horariosSeSuperponen(Horario horarioEstablecido, Horario horarioEntrada) {
        if (horarioEstablecido.getHoraEntrada().isBefore(horarioEntrada.getHoraSalida())
                && horarioEstablecido.getHoraSalida().isAfter(horarioEntrada.getHoraEntrada())) {
            return true;
        }
        return false;
    }

    //me sirve el buscar para validar el estudiante
    private boolean validarEstudianteTodosCursos(String id, Curso cursoEntrada) {
        for (int i = 0; i < cursos.size(); i++) {
            Estudiante estudi = cursos.get(i).buscarEstudiante(id);
            if (estudi != null) {
                for (int j = 0; j < cursos.get(i).getHorariosEstablecidos().size(); j++) {
                    if (!cursos.get(i).getCodigoDeCurso().equals(cursoEntrada.getCodigoDeCurso())) {
                        Horario horarioEstablecido = cursos.get(i).getHorariosEstablecidos().get(j);
                        for (int k = 0; k < cursoEntrada.getHorariosEstablecidos().size(); k++) {
                            Horario horarioEntrada = cursoEntrada.getHorariosEstablecidos().get(k);
                            if (horarioEstablecido.getDia() == horarioEntrada.getDia()) {
                                if (horariosSeSuperponen(horarioEstablecido, horarioEntrada)) {
                                    return false;
                                }
                            }
                        }
                    }
                }

            }
        }
        return true;
    }
}
