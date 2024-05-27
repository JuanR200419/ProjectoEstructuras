/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import excepciones.NoSeEncuentraCursoException;
import excepciones.cursoYaExisteException;
import excepciones.yaEstaCreadoCursoException;
import java.time.LocalDate;
import modelado.Accion;
import modelado.Curso;
import modelado.Estudiante;
import modelado.Persona;
import util.IList;
import util.IStack;
import util.Pila;

/**
 *
 * @author Juan Manuel
 */
public class ControladorCurso {

    IList<Persona> listaPersonas;
    IList<Curso> listaCursos;
    IStack<Accion> pila1;
    IStack<Accion> pila2;

    public ControladorCurso() {
        this.listaCursos = Serializador.Serializador.getSeri().getCursos();
        this.listaPersonas = Serializador.Serializador.getSeri().getPersonas();
        this.pila1 = new Pila<>();
        this.pila2 = new Pila<>();
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

    public String validarPeriodoAnio() {
        LocalDate fechaActual = LocalDate.now();
        int mesActual = fechaActual.getMonthValue();
        String primerPeriodo = "2024-1";
        String segundoPeriodo = "2024-2";
        if(mesActual<=6){
            return primerPeriodo;
        }else{
        return segundoPeriodo;
        }
    }

    public void agregarCurso(Curso curso) throws cursoYaExisteException, yaEstaCreadoCursoException {

        Curso aux = buscarCurso(curso.getCodigoDeCurso());
        if (aux == null) {
            boolean res = validarUnicoCurso(curso);
            if (res) {
                listaCursos.add(curso);
                pila1.push(new Accion("Guardar", curso));
                Serializador.Serializador.getSeri().escribirCurso();
            } else {
                throw new yaEstaCreadoCursoException();
            }
        } else {
            throw new cursoYaExisteException();
        }
    }

    public void eliminarCurso(String id) throws cursoYaExisteException {
        Curso aux = buscarCurso(id);
        if (aux != null) {
            listaCursos.remove(aux);
            pila2.push(new Accion("Eliminar", aux));
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            throw new cursoYaExisteException();
        }

    }

    public void ActualizarCurso(Curso curso) throws NoSeEncuentraCursoException {
        Curso aux = buscarCurso(curso.getCodigoDeCurso());
        if (aux != null) {
            aux.setDocente(curso.getDocente());
            aux.setHorariosEstablecidos(curso.getHorariosEstablecidos());
            aux.setMateria(curso.getMateria());
            Serializador.Serializador.getSeri().escribirCurso();
        } else {
            throw new NoSeEncuentraCursoException();
        }
    }

    public boolean validarUnicoCurso(Curso curso) {
        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getDocente().getId().equals(curso.getDocente().getId())) {
                if (listaCursos.get(i).getJornada().equals(curso.getJornada())) {
                    if (listaCursos.get(i).getPeriodo().equals(curso.getPeriodo())) {
                        if (listaCursos.get(i).getPrograma().equals(curso.getPrograma())) {
                            if (listaCursos.get(i).getMateria().equals(curso.getMateria())) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return true;
    }

    public void dehacer() throws cursoYaExisteException, yaEstaCreadoCursoException {
        Accion accion = pila1.pop();
        Curso aux = (Curso) accion.getObjeto();
        if (accion.getAccion().equals("Guardar")) {
            eliminarCurso(aux.getCodigoDeCurso());
            System.out.println("se elimino");
        } else if (accion.getAccion().equals("Eliminar")) {
            agregarCurso(aux);
            System.out.println("se guardo");
        } else {
            pila2.push(accion);
        }
    }

    public void rehacer() throws cursoYaExisteException, yaEstaCreadoCursoException {
        Accion accion = pila2.pop();
        Curso aux = (Curso) accion.getObjeto();
        if (accion.getAccion().equals("Guardar")) {
            eliminarCurso(aux.getCodigoDeCurso());
            System.out.println("se Guardo");
        } else if (accion.getAccion().equals("Eliminar")) {
            agregarCurso(aux);
            System.out.println("se elimino");
        } else {
            pila1.push(accion);
        }
    }

}
