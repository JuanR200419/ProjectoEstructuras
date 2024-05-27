/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Docente;

import excepciones.NoseEncuentraDetalleException;
import excepciones.YacalificadoException;
import modelado.Curso;
import modelado.Detalle;
import modelado.Estudiante;
import modelado.Nota;

/**
 *
 * @author Juan Manuel
 */
public class controladorCalificarNotas {

    Nota nota;

    public controladorCalificarNotas(Nota nota) {
        this.nota=nota;
    }
     public void calificar(Detalle detalle) throws YacalificadoException{
     this.nota.calificar(detalle); 
     Serializador.Serializador.getSeri().escribirCurso();
     }
     
     public Estudiante buscarEstudianteCalificado(Estudiante estudi) {
     return this.nota.buscarEstudianteCalificado(estudi);

     }
     
     public Detalle buscarDetalle(Estudiante estudi) {
     return this.nota.buscarDetalle(estudi);
     }
     
     public void eliminarDetalle(Estudiante estudi) throws NoseEncuentraDetalleException {
     this.nota.eliminarDetalle(estudi);
     Serializador.Serializador.getSeri().escribirCurso();    
     }
     
      public void editarDetalle(Detalle detalle) throws NoseEncuentraDetalleException {
      this.nota.editarDetalle(detalle);
      Serializador.Serializador.getSeri().escribirCurso();  
      }
}















//    public void calificar(Detalle detalle) throws YacalificadoException{
//        Estudiante estudi = buscarEstudianteCalificado(detalle.getEstudinate());
//        if (estudi == null) {
//            detalle.setCalificado(true);
//            curso.getListaNotas().get(0).getListaDetalles().add(detalle); 
//            System.out.println("Se califico");
//            Serializador.Serializador.getSeri().escribirCurso();
//        }else{
//            throw new YacalificadoException();
//        }
//       
//    }
//
//    public Estudiante buscarEstudianteCalificado(Estudiante estudi) {
//        for (int i = 0; i < curso.getListaNotas().size(); i++) {
//            for (int j = 0; j < curso.getListaNotas().get(i).getListaDetalles().size(); j++) {
//                if (curso.getListaNotas().get(i).getListaDetalles().get(j).getEstudinate().getId().equals(estudi.getId())) {
//                    return curso.getListaNotas().get(i).getListaDetalles().get(j).getEstudinate();
//                }
//            }
//        }
//        return null;
//    }

//      for (int i = 0; i < curso.getListaNotas().size(); i++) {
//            for (int j = 0; j < curso.getListaNotas().get(i).getListaDetalles().size(); j++) {
//
//            }
//        }



