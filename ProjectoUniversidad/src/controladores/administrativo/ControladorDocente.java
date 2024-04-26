/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import modelado.Docente;
import modelado.Persona;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorDocente {
 IList<Persona> listaPersonas;
    public ControladorDocente() {
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
    
        
                public IList<Persona> getListaPersonas() {
            return listaPersonas;
        }
       public void agregarDocente(Docente docente) {
        Persona aux = buscarPersonal(docente.getId());
        if (aux == null) {
            listaPersonas.add(docente);
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("Ya existe este admin");
        }
    }
          public void eliminarDocente(String id) {
        Persona aux = buscarPersonal(id);
        if (aux != null && aux instanceof Docente) {
            listaPersonas.remove(aux);
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No existe este admin");
        }
        
          }
          
          public void ActualizarDocente(Docente docente) {
        Persona aux = buscarPersonal(docente.getId());
        if (aux != null && aux instanceof Docente) {
            aux.setNombre(docente.getNombre());
            aux.setNommbreUsuario(docente.getNommbreUsuario());
            aux.setFechaNacimiento(docente.getFechaNacimiento());
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No se  actualizo este admin");
        }

    } 
          
}
