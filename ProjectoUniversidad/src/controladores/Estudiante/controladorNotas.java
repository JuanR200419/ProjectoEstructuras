/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Estudiante;

import modelado.Curso;
import modelado.Detalle;
import modelado.Estudiante;
import modelado.Nota;

/**
 *
 * @author Juan Manuel
 */
public class controladorNotas {

    Curso curso;
    Estudiante estudiante;

    public controladorNotas(Curso curso, Estudiante estudiante) {
        this.curso = curso;
        this.estudiante = estudiante;
    }

    public String calcularPorcentajeTotal(Curso curso, Estudiante estudiante) {
        double total =0;
        for (int i = 0; i < curso.getListaNotas().size(); i++) {
            for (int j = 0; j < curso.getListaNotas().get(i).getListaDetalles().size(); j++) {
                Nota nota = curso.getListaNotas().get(i);
                Detalle detalle = curso.getListaNotas().get(i).getListaDetalles().get(j);
                if (detalle.getEstudinate().getId().equals(estudiante.getId())) {
                    total+= detalle.getValor()*nota.getPorcentaje();
                }
            }
        }
        return String.valueOf(total/100);
    }

}
