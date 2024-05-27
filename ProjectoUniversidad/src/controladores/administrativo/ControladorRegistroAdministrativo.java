/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import java.time.LocalDate;
import java.time.Period;
import modelado.AdminLaboratorio;
import modelado.Administrativo;
import modelado.Persona;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class ControladorRegistroAdministrativo {
 IList<Persona> listaPersonas;
    public ControladorRegistroAdministrativo() {
        this.listaPersonas = Serializador.Serializador.getSeri().getPersonas();
    
    }
    
        public String calcularEdad(Administrativo estu){
     Persona aux = buscarPersonal(estu.getId());
     LocalDate fechaNacimiento = aux.getFechaNacimiento();
     LocalDate fechaActual = LocalDate.now();
     return String.valueOf(Period.between(fechaNacimiento, fechaActual).getYears());
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
    
        public void agregarAdmin(Administrativo admin) {
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
        if (aux != null && aux instanceof Administrativo) {
            listaPersonas.remove(aux);
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No existe este admin");
        }

    }

    public void ActualizarAdmin(Administrativo admin) {
        Persona aux = buscarPersonal(admin.getId());
        if (aux != null && aux instanceof Administrativo) {
            aux.setNombre(admin.getNombre());
            aux.setNommbreUsuario(admin.getNommbreUsuario());
            aux.setFechaNacimiento(admin.getFechaNacimiento());
            aux.setContrasena(admin.getContrasena());
            Serializador.Serializador.getSeri().escribirPersonal();
        } else {
            System.out.println("No se  actualizo este admin");
        }

    }
}
