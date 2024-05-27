package controladores.Laboratorio;

import excepciones.EstudianteReservaActivaException;
import excepciones.horarioYaEstablecidoReserva;
import excepciones.noSeEncontraronReservasException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Persona;
import modelado.Puesto;
import modelado.Reserva;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class controladorReserva {

    Puesto puesto;
    Laboratorio[][] laboratorios;
    IList<Persona> listaPersonas;

        public controladorReserva(Puesto puesto) {
        this.puesto = puesto;
        this.laboratorios = Serializador.Serializador.getSeri().getLaboratorios();
        this.listaPersonas = Serializador.Serializador.getSeri().getPersonas();
    }

    public Estudiante buscarEstudiante(String codigo) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getId().equals(codigo)) {
                return (Estudiante) listaPersonas.get(i);

            }
        }
        return null;
    }

    public void guardarReserva(Reserva reserva) throws EstudianteReservaActivaException, horarioYaEstablecidoReserva {
        if (buscarReservaActiva(reserva.getEstudiante())) {
            this.puesto.guardarReserva(reserva);
            Serializador.Serializador.getSeri().escribirLaboratorio();
        }
    }

    public Reserva buscarReserva(String estudiante) {
        return this.puesto.buscarReserva(estudiante);
    }

    public void borrarReserva(String codigo) throws noSeEncontraronReservasException {
        this.puesto.borrarReserva(codigo);
        this.puesto.setEstado(Puesto.DISPONIBLE);
        Serializador.Serializador.getSeri().escribirLaboratorio();
    }

    // busca en todos los laboratorios y todos los puesto si esta registrado un estudiante 
    public boolean buscarReservaActiva(Estudiante estudiante) throws EstudianteReservaActivaException {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                for (int k = 0; k < laboratorios[i][j].getPuestos().length; k++) {
                    for (int l = 0; l < laboratorios[i][j].getPuestos()[k].length; l++) {
                        for (int m = 0; m < laboratorios[i][j].getPuestos()[k][l].getListaReserva().size(); m++) {
                            if (laboratorios[i][j].getPuestos()[k][l].getListaReserva().get(m).getEstudiante().getId().equals(estudiante.getId())) {
                                throw new EstudianteReservaActivaException();
                            }
                        }
                    }
                }
            }
        }
        return true;
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
                                System.out.println("feccha antes: "+reserva.getFecha().isBefore(LocalDate.now()));
                                System.out.println("Hora final "+reserva.getHoraFinal());
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

    public void cambiarEstadoOcupado() {
        puesto.cambiarEstado();
        Serializador.Serializador.getSeri().escribirLaboratorio();
    }    

    public IList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
}
