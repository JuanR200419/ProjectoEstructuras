/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import modelado.Curso;
import modelado.Estudiante;

/**
 *
 * @author Juan Manuel
 */
public class ControladorAsginarEstudiante {

    Curso curso;

    public ControladorAsginarEstudiante(Curso curso) {
        this.curso = curso;
    }
   
    public Estudiante buscarEstudiante(String codigo) {
        return curso.buscarEstudiante(codigo);
    }

    public void asignarEstudiante(Estudiante estudiante) {
        curso.asignarEstudiante(estudiante);
        Serializador.Serializador.getSeri().escribirCurso();
    }

     public void quitarCursoEstudiante(String codigo) {
     curso.quitarCursoEstudiante(codigo);
      Serializador.Serializador.getSeri().escribirCurso();
     }
    
  //        public void inscribirCursoEstudiante(String codigoCurso, Estudiante estudi) {
//        Curso cursoIncripcion = buscarCurso(codigoCurso);
//        if (cursoIncripcion == null) {
//            System.out.println("Exception de no se encuentra el curso a incribir");
//        }
//        if (cursoIncripcion != null) {
//            cursoIncripcion.registrarEstudiante(estudi);
//        }
//    }
    
}
