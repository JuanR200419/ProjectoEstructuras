/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelado.AdminGeneral;
import modelado.AdminLaboratorio;
import modelado.Administrativo;
import modelado.Curso;
import modelado.Docente;
import modelado.Estudiante;
import modelado.Persona;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class ControladorAdminLab {

    IList<Persona> listaPersonas;
    IList<Curso> listaCursos;

    public ControladorAdminLab() {
        this.listaPersonas = Serializador.Serializador.getSeri().getPersonas();

    }

    public IList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public Persona buscarPersonal(String id) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getId().equals(id)) {
                return listaPersonas.get(i);
            }
        }
        return null;
    }



//----------------------------------------------------    
    public void agregarAdmin(AdminLaboratorio admin) {
        Persona aux = buscarPersonal(admin.getId());
        if (aux == null) {
            listaPersonas.add(admin);
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("Ya existe este admin");
        }
    }

    public void eliminarAdmin(String id) {
        Persona aux = buscarPersonal(id);
        if (aux != null && aux instanceof AdminLaboratorio) {
            listaPersonas.remove(aux);
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No existe este admin");
        }

    }

    public void ActualizarAdmin(AdminLaboratorio admin) {
        Persona aux = buscarPersonal(admin.getId());
        if (aux != null && aux instanceof AdminLaboratorio) {
            aux.setNombre(admin.getNombre());
            aux.setNommbreUsuario(admin.getNommbreUsuario());
            aux.setFechaNacimiento(admin.getFechaNacimiento());
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No se  actualizo este admin");
        }

    }

 
  
// METODOS DEL CURSO 

  
}
