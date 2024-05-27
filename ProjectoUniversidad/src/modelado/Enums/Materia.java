/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelado.Enums;

/**
 *
 * @author Juan Manuel
 */
public enum Materia {
    
    CURSOS("Cursos"),
    MATEMATICAS("Matematicas"),
    FISICA("Fisica"),
    QUIMICA("Quimica"),
    BIOLOGIA("Biologia"),
    PROGRAMACION("Programacion"),
    ECONOMIA("Economia"),
    ADMINISTRACION("Administracion"),
    DERECHO("Derecho"),
    HISTORIA("Historia"),
    LITERATURA("Literatura"),
    INGLES("Ingles"),
    ESTADISTICA("Estadistica"),
    ETICA("Etica"),
    PSICOLOGIA("Psicologia"),
    SOCIOLOGIA("Matematicas");
    
    private String valor;
    Materia(String valor){
    this.valor = valor;
    }

    @Override
    public String toString() {
        return valor; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
