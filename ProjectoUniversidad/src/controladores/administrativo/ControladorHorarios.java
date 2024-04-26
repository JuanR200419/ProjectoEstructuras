/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import excepciones.horaNoValidaException;
import excepciones.unicoDiaException;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import modelado.Curso;
import modelado.Docente;
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

    public void guardarHorario(Horario horario) throws horaNoValidaException, unicoDiaException {
        boolean res = validarDocenteEnMismoDia(curso.getDocente(), horario);
        if (res == true) {
            curso.guardarHorario(horario);
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            JOptionPane.showMessageDialog(null, "el docente esta ocupado en ese horario");
        }
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
        return curso.validarDiaUnic(dia);
    }

    private boolean validarDocenteEnMismoDia(Docente docente, Horario horario) {
        boolean aux = true;
        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getDocente().getId().equals(docente.getId()) ) {
                aux = validaHorasEntradaDocente(listaCursos.get(i), horario);
                if(!aux){
                   return aux; 
                }
            }
        }
        System.out.println("se valido la entraca como : " + aux);
        return aux;
    }

    // befores = antes -----------------  after = despues
    private boolean validaHorasEntradaDocente(Curso curso, Horario horario) {
        for (int i = 0; i < curso.getHorariosEstablecidos().size(); i++) {
            Horario horarioEstablecido = curso.getHorariosEstablecidos().get(i);
            if (horario.getDia().equals(horarioEstablecido.getDia())) {
                if ((horario.getHoraEntrada().isBefore(horarioEstablecido.getHoraSalida())
                        && horario.getHoraSalida().isAfter(horarioEstablecido.getHoraEntrada()))
                        || (horario.getHoraSalida().equals(horarioEstablecido.getHoraSalida())
                        || horario.getHoraEntrada().equals(horarioEstablecido.getHoraEntrada()))) {
                    System.out.println("Se validó la superposición");
                    return false; // Hay superposición de horarios
                }
            }
        }
        System.out.println("No se validó la superposición");
        return true; // No hay superposición de horarios
    }

}
//  if ((horario.getHoraEntrada().isBefore(horarioEstablecido.getHoraSalida())
//                            && horario.getHoraSalida().isAfter(horarioEstablecido.getHoraEntrada()))
//                            || (horario.getHoraSalida().equals(horarioEstablecido.getHoraEntrada())
//                            || horario.getHoraEntrada().equals(horarioEstablecido.getHoraSalida()))) {
//                        return false; // Hay superposición de horarios
//                    }
