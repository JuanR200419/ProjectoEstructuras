/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.time.LocalDate;

/**
 *
 * @author Juan Manuel
 */
public class Reserva {
    Estudiante estudiante;
    LocalDate fecha;
    LocalDate horaInicio;
    LocalDate horaFinal;

    public Reserva(Estudiante estudiante, LocalDate fecha, LocalDate horaInicio, LocalDate horaFinal) {
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalDate horaFinal) {
        this.horaFinal = horaFinal;
    }
    
}
