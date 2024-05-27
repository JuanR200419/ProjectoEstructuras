    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Docente extends Persona implements Serializable {

    IList<Curso> listaCursos;

    public Docente(String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, Contrasena contrasena, String rol) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena, rol);
        this.listaCursos = new Lista<>();
    }
    
   
    
    
    public IList<Curso> getListaCursos() {
        return listaCursos;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " Codigo: " + this.getId();
    }

}
