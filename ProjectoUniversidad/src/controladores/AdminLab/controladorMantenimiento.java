
package controladores.AdminLab;

import excepciones.YaExisteMantenimientoFechaException;
import java.time.LocalDate;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Mantenimiento;
import modelado.Notificacion;
import modelado.Puesto;
import util.IList;

public class controladorMantenimiento {

    Laboratorio[][] laboratorios;
    IList<Mantenimiento> listaMantenimiento;

    public controladorMantenimiento() {
        this.laboratorios = Serializador.Serializador.getSeri().getLaboratorios();
        this.listaMantenimiento = Serializador.Serializador.getSeri().getMantenimientos();
    }

    public IList<Mantenimiento> getListaMantenimiento() {
        return listaMantenimiento;
    }

    public void borrarReservasMantenimiento() {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                Laboratorio lab = laboratorios[i][j];
                if (lab.getEstado().equals(Laboratorio.MANTENIMIENTO)) {
                    for (int k = 0; k < lab.getPuestos().length; k++) {
                        for (int l = 0; l < lab.getPuestos()[k].length; l++) {
                            Puesto puesto = lab.getPuestos()[k][l];
                            for (int m = 0; m < puesto.getListaReserva().size(); m++) {
                                Estudiante estudi = puesto.getListaReserva().get(m).getEstudiante();
                                Notificacion noti = new Notificacion("Su reserva se ha cancelado por mantenimiento en el laboratorio Numero "+lab.getNumeroLab(), "Administrador de laboratorio ");
                                estudi.getListaNotificaciones().add(noti);
                                Serializador.Serializador.getSeri().escribirPersonal();
                                puesto.getListaReserva().remove(m);
                                Serializador.Serializador.getSeri().escribirLaboratorio();
                            }
                        }
                    }
                }
            }
        }

    }

    public void validarEstadoTodosLaboratorios() {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                Laboratorio lab = laboratorios[i][j];
                for (int k = 0; k < listaMantenimiento.size(); k++) {
                    if (listaMantenimiento.get(k).getLaboratorio().equals(lab)) {
                        if (validarFechaMantenimiento(listaMantenimiento.get(k))) {
                            lab.setEstado(Laboratorio.DISPONIBLE);
                            System.out.println("quitamos man");
                        } else {
                            System.out.println("entra en man");
                            lab.setEstado(Laboratorio.MANTENIMIENTO);
                        }

                    }
                }
            }
        }
    }

    public void eliminarTodosLosMantenimientos() {
        for (int i = 0; i < listaMantenimiento.size(); i++) {
            Mantenimiento mantenimiento = listaMantenimiento.get(i);
            if (validarEliminacionMan(mantenimiento)) {
                listaMantenimiento.remove(mantenimiento);
                Serializador.Serializador.getSeri().escribirMantenimiento();
            }
        }
    }

    public boolean validarEliminacionMan(Mantenimiento mantenimiento) {
        LocalDate fechaMantenimientoFinal = mantenimiento.getFechaMantenimientoFinal();
        LocalDate fechaMantenimientoInicio = mantenimiento.getFechaMantenimientoInicial();
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.equals(fechaMantenimientoInicio)) {
            System.out.println("Fecha inicio igual que la fecha actual: " + fechaMantenimientoInicio);
            return false;
        }
        if (fechaActual.equals(fechaMantenimientoFinal) || fechaActual.isAfter(fechaMantenimientoFinal)) {
            System.out.println("Fecha final antes de la actual: " + fechaMantenimientoFinal);
            return true;
        } else {
            System.out.println("Ninguna condición se cumplió, fecha actual: " + fechaActual);
            return false;
        }
    }

    public boolean validarFechaMantenimiento(Mantenimiento mantenimiento) {
        LocalDate fechaMantenimientoFinal = mantenimiento.getFechaMantenimientoFinal();
        LocalDate fechaMantenimientoInicio = mantenimiento.getFechaMantenimientoInicial();
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.equals(fechaMantenimientoInicio)) {
            return false;
        }
        if (   fechaActual.equals(fechaMantenimientoFinal) || fechaActual.isBefore(fechaMantenimientoInicio) || fechaActual.isAfter(fechaMantenimientoFinal)) {
            return true;
        } else {
            System.out.println("entra al solo false");
            return false;
        }
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) throws YaExisteMantenimientoFechaException {
        Mantenimiento man = buscarMantenimiento(mantenimiento.getLaboratorio(), mantenimiento.getFechaMantenimientoInicial());
        if (man == null) {
            listaMantenimiento.add(mantenimiento);
            Serializador.Serializador.getSeri().escribirMantenimiento();
        } else {
            throw new YaExisteMantenimientoFechaException();
        }
    }

    public void eliminarMantenimientos(Laboratorio lab, LocalDate fechaInicial) {
        Mantenimiento man = buscarMantenimiento(lab, fechaInicial);
        listaMantenimiento.remove(man);
        Serializador.Serializador.getSeri().escribirMantenimiento();

    }

    public Mantenimiento buscarMantenimiento(Laboratorio lab, LocalDate fechaInicial) {
        for (int i = 0; i < listaMantenimiento.size(); i++) {
            if (listaMantenimiento.get(i).getLaboratorio().getNumeroLab().equals(lab.getNumeroLab())
                    && listaMantenimiento.get(i).getFechaMantenimientoInicial().equals(fechaInicial)) {
                return listaMantenimiento.get(i);
            }
        }
        return null;
    }

}
