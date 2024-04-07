/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import modelado.Enums.Programa;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class Estudiante extends Personas implements Serializable {
   private  ArrayList<Curso> cursosMatriculados;
   private  ArrayList<Curso> cursosAnteriores;
   private ArrayList<Double>listaNotas;
   private Programa programa;
    public Estudiante( String nombre, String id, LocalDate fechaNacimiento, String nommbreUsuario, String contrasena,Programa programa) {
        super(nombre, id, fechaNacimiento, nommbreUsuario, contrasena);
        this.cursosMatriculados = new ArrayList<>();
        this.cursosAnteriores = new ArrayList<>();
        this.listaNotas = new ArrayList<>();
        this.programa= programa;
    }

    public ArrayList<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void setCursosMatriculados(ArrayList<Curso> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public ArrayList<Curso> getCursosAnteriores() {
        return cursosAnteriores;
    }

    public void setCursosAnteriores(ArrayList<Curso> cursosAnteriores) {
        this.cursosAnteriores = cursosAnteriores;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
    
}
