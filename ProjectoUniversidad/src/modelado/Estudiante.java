/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import modelado.Enums.Programa;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Estudiante extends Persona implements Serializable {

    private IList<Curso> cursosMatriculados;
    private IList<Curso> cursosAnteriores;
    private IList<Double> listaNotas;
    private Programa programa;

    public Estudiante( String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, String contrasena,Programa programa, String rol) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena, rol);
        this.cursosMatriculados = new Lista<>();
        this.cursosAnteriores = new Lista<>();
        this.listaNotas = new Lista<>();
        this.programa = programa;
    }

    

     
    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public IList<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void setCursosMatriculados(IList<Curso> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    public IList<Curso> getCursosAnteriores() {
        return cursosAnteriores;
    }

    public void setCursosAnteriores(IList<Curso> cursosAnteriores) {
        this.cursosAnteriores = cursosAnteriores;
    }

    public IList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(IList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }


}
