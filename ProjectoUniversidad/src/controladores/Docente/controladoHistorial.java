/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Docente;

import java.time.LocalDate;
import modelado.Curso;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class controladoHistorial {
    IList<Curso> listaCursos;
    public controladoHistorial() {
        this.listaCursos = Serializador.Serializador.getSeri().getCursos();
    }
        public String validarPeriodoAnio() {
        LocalDate fechaActual = LocalDate.now();
        int mesActual = fechaActual.getMonthValue();
        String primerPeriodo = "2024-1";
        String segundoPeriodo = "2024-2";
        if(mesActual<=6){
            return primerPeriodo;
        }else{
        return segundoPeriodo;
        }
    }

    public IList<Curso> getListaCursos() {
        return listaCursos;
    }
        
        
}
