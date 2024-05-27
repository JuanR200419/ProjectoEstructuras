/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import excepciones.horarioYaEstablecidoReserva;
import excepciones.noSeEncontraronReservasException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import util.Lista;

public class Puesto implements Serializable {

    public static final String DISPONIBLE = "Disponible";
    public static final String OCUPADO = "Ocupado";

    String estado;
    int numPuesto;
    Lista<Reserva> listaReserva;

    public Puesto() {
        this.listaReserva = new Lista<>();
        this.estado = DISPONIBLE;
        this.numPuesto = 1;
    }

    public Lista<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void guardarReserva(Reserva reserva) throws horarioYaEstablecidoReserva {
        Reserva reser = buscarReserva(reserva.getEstudiante().getId());
        if (reser == null) {
            if (validarHorarioOcupadoReserva(reserva)) {
                listaReserva.add(reserva);
                System.out.println("Se guardo");
            } else {
                throw new horarioYaEstablecidoReserva();
            }
        }

    }

    public Reserva buscarReserva(String estudiante) {
        for (int i = 0; i < listaReserva.size(); i++) {
            if (listaReserva.get(i).getEstudiante().getId().equals(estudiante)) {
                return listaReserva.get(i);
            }
        }
        return null;
    }

    public void borrarReserva(String codigo) throws noSeEncontraronReservasException {
        Reserva reser = buscarReserva(codigo);
        if (reser != null) {
            listaReserva.remove(reser);
            System.out.println("Se elimino");
        } else {
            throw new noSeEncontraronReservasException();
        }
    }

    public void EditarReserva(String codigo) {
        Reserva reser = buscarReserva(codigo);
        if (reser != null) {
            reser.setEstudiante(reser.getEstudiante());
            reser.setFecha(reser.getFecha());
            System.out.println("Se edito");

        }
    }

    public void cambiarEstado() {
        for (int i = 0; i < listaReserva.size(); i++) {
            if (listaReserva.get(i).getFecha().equals(LocalDate.now())) {
                if (validarOcupado(listaReserva.get(i))) {
                    this.estado = Puesto.OCUPADO;
                    return;
                }
            }
        }

    }

    private boolean validarHorarioOcupadoReserva(Reserva horario) {
        for (int i = 0; i < listaReserva.size(); i++) {
            Reserva horarioEstablecido = listaReserva.get(i);
            if (horarioEstablecido.getFecha().equals(horario.getFecha())) {
                if ((horario.getHoraInicio().isBefore(horarioEstablecido.getHoraFinal())
                        && horario.getHoraFinal().isAfter(horarioEstablecido.getHoraInicio()))
                        || (horario.getHoraFinal().equals(horarioEstablecido.getHoraFinal())
                        || horario.getHoraInicio().equals(horarioEstablecido.getHoraInicio()))) {
                    return false; // Hay superposición de horarios
                }
            }
        }
        return true;
    }

    private boolean validarOcupado(Reserva reserva) {
        return reserva.getHoraInicio().isBefore(LocalTime.now()) && reserva.getHoraFinal().isAfter(LocalTime.now());
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

}
