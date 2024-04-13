/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import javax.swing.JOptionPane;
import modelado.Estudiante;
import modelado.Persona;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorEstudiante {
     IList<Persona> listaPersonas;

    public ControladorEstudiante() {
          this.listaPersonas = Serializador.Serializador.getSeri().getPersonas();
    }
         public Persona buscarPersonal(String id) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getId().equals(id)) {
                return listaPersonas.get(i);
            }
        }
        return null;
    }
         
           public void agregarEstudiante(Estudiante estu) {
        Persona aux = buscarPersonal(estu.getId());
        if (aux == null) {
            listaPersonas.add(estu);
            JOptionPane.showMessageDialog(null, "Se agrego el estudiante ");
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("Ya existe este admin");
        }
    }

               public IList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    public void eliminarEstudiante(String id) {
        Persona aux = buscarPersonal(id);
        if (aux != null) {
            listaPersonas.remove(aux);
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No existe este admin");
        }

    }

    public void ActualizarEstudiante(Estudiante estudiante) {
        Persona aux = buscarPersonal(estudiante.getId());
        if (aux != null) {
            aux.setNombre(estudiante.getNombre());
            aux.setNommbreUsuario(estudiante.getNommbreUsuario());
            aux.setFechaNacimiento(estudiante.getFechaNacimiento());
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No se  actualizo puede actualizar si no existe");
        }

    }
         
}
