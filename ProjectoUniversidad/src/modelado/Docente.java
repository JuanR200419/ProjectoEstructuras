/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.time.LocalDate;
import java.util.ArrayList;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Docente extends Personal {
    ArrayList <Curso>listaCursos ;

    public Docente(String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, String contrasena) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena);
        this.listaCursos = new ArrayList();
    }

    public ArrayList getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList listaCursos) {
        this.listaCursos = listaCursos;
    }
   
      @Override
    public String toString(){
        return this.getNombre() +" "+this.getId();
    }
    
}
