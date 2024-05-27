/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Laboratorio;

import java.time.LocalDate;
import java.time.LocalTime;
import modelado.Laboratorio;
import modelado.Puesto;
import modelado.Reserva;
import util.IList;
import util.Lista;

public class controlLaboratorioInicial {

    Laboratorio[][] laboratorios;

    public controlLaboratorioInicial() {
        this.laboratorios = Serializador.Serializador.getSeri().getLaboratorios();
        initLaboratorio();
        initNumAulaLaboratorio();
    }

    private void initLaboratorio() {
        for (int i = laboratorios.length - 1; i >= 0; i--) {
            for (int j = laboratorios[i].length - 1; j >= 0; j--) {
                if (laboratorios[i][j] == null) {
                    laboratorios[i][j] = new Laboratorio();
                }
            }
        }
    }

    private void initNumAulaLaboratorio() {
            int texto = 411;
        int texto2 = 401;
        for (int i = laboratorios.length - 1; i >= 0; i--) {
            for (int j = laboratorios[i].length - 1; j >= 0; j--) {
                if (i != 1 || j <= 0) {
                    if (i == 0) {
                        laboratorios[i][j].setNumeroLab(String.valueOf(texto2));
                        texto2++;
                    } else {
                        laboratorios[i][j].setNumeroLab(String.valueOf(texto));
                        texto--;
                    }
                }
            }
        }
    }

    public Laboratorio obtenerLaboratorio(int fila, int columna) {
        return laboratorios[fila][columna];
    }

    public void cambiarEstado() {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                for (int k = 0; k < laboratorios[i][j].getPuestos().length; k++) {
                    for (int l = 0; l < laboratorios[i][j].getPuestos()[k].length; l++) {
                        Puesto puesto = laboratorios[i][j].getPuestos()[k][l];
                        for (int m = 0; m < laboratorios[i][j].getPuestos()[k][l].getListaReserva().size(); m++) {
                            Reserva reserva = laboratorios[i][j].getPuestos()[k][l].getListaReserva().get(m);
                            if (reserva.getFecha().equals(LocalDate.now())) {
                                if (validarOcupado(reserva)) {
                                    puesto.setEstado(Puesto.OCUPADO);
                                }
                            }
                        }
                    }

                }
            }
        }

    }

    public void eliminarReservasTerminadas() {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                Puesto[][] puestoLab = laboratorios[i][j].getPuestos();
                for (int k = 0; k < puestoLab.length; k++) {
                    for (int l = 0; l < puestoLab[k].length; l++) {
                        IList reservas = puestoLab[k][l].getListaReserva();
                        for (int m = 0; m < reservas.size(); m++) {
                            Reserva reserva = (Reserva) reservas.get(m);
                            if (reserva.getFecha().isBefore(LocalDate.now())
                                    || (reserva.getFecha().equals(LocalDate.now()))
                                    && reserva.getHoraFinal().isBefore(LocalTime.now())) {
                                System.out.println(LocalTime.now());
                                System.out.println("feccha antes: " + reserva.getFecha().isBefore(LocalDate.now()));
                                System.out.println("Hora final " + reserva.getHoraFinal());
                                System.out.println("Se elimino la reserva pasada");
                                puestoLab[k][l].setEstado(Puesto.DISPONIBLE);
                                reservas.remove(reserva);
                            }
                        }
                    }
                }
            }
        }
        Serializador.Serializador.getSeri().escribirLaboratorio();
    }

    public void asignarNumAula() {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {

            }
        }

    }

    private boolean validarOcupado(Reserva reserva) {
        return reserva.getHoraInicio().isBefore(LocalTime.now()) && reserva.getHoraFinal().isAfter(LocalTime.now());

    }

}
