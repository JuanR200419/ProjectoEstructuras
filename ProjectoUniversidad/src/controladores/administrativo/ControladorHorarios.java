
package controladores.administrativo;

import excepciones.horaNoValidaException;
import excepciones.noSepuedeCambiarHorarioCursoException;
import excepciones.unicoDiaException;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import modelado.Curso;
import modelado.Docente;
import modelado.Enums.Dias;
import modelado.Estudiante;
import modelado.Horario;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorHorarios {

    IList<Curso> cursos;
    Curso curso;

    public ControladorHorarios(Curso curso) {
        this.cursos = Serializador.Serializador.getSeri().getCursos();
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

    public void actualizarHorario(Horario horario) throws noSepuedeCambiarHorarioCursoException {
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursos.get(i).getHorariosEstablecidos().size(); j++) {
                for (int k = 0; k < cursos.get(j).getListaEstudiantes().size(); k++) {
                    boolean validaDocente = validaHorasEntradaDocente(cursos.get(i), horario);
                    boolean validEstudiante = validarEstudianteTodosCursos(cursos.get(i).getListaEstudiantes().get(k).getId(), cursos.get(i));
                    if (validaDocente == false || validEstudiante == false) {
                        throw new noSepuedeCambiarHorarioCursoException();
                    }
                }

            }
        }
        curso.actualizarHorario(horario);
        Serializador.Serializador.getSeri().escribirCurso();
    }

    public Horario validarDiaUnic(Dias dia) {
        return curso.validarDiaUnic(dia);
    }

    private boolean validarDocenteEnMismoDia(Docente docente, Horario horario) {
        boolean aux = true;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getId().equals(docente.getId())) {
                aux = validaHorasEntradaDocente(cursos.get(i), horario);
                if (!aux) {
                    return aux;
                }
            }
        }

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
                    return false; // Hay superposición de horarios
                }
            }
        }
        return true; // No hay superposición de horarios
    }

    private boolean horariosSeSuperponen(Horario horario1, Horario horario2) {
        return horario1.getHoraEntrada().isBefore(horario2.getHoraSalida())
                && horario1.getHoraSalida().isAfter(horario2.getHoraEntrada());
    }

    //me sirve el buscar para validar el estudiante
    //me sirve el buscar para validar el estudiante
    private boolean validarEstudianteTodosCursos(String id, Curso cursoEntrada) {
        for (int i = 0; i < cursos.size(); i++) {
            Estudiante estudi = cursos.get(i).buscarEstudiante(id);
            if (estudi != null) {
                for (int j = 0; j < cursos.get(i).getHorariosEstablecidos().size(); j++) {
                    if (!cursos.get(i).getCodigoDeCurso().equals(cursoEntrada.getCodigoDeCurso())){
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
