/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.AdminLab;

import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Notificacion;
import modelado.Puesto;

/**
 *
 * @author Juan Manuel
 */
public class ControladorEditarPuestos {

    Laboratorio lab;

    public ControladorEditarPuestos(Laboratorio laboratorio) {
        this.lab = laboratorio;

    }

    public void borrarReservasMantenimiento() {
                for (int k = 0; k < lab.getPuestos().length; k++) {
                    for (int l = 0; l < lab.getPuestos()[k].length; l++) {
                        Puesto puesto = lab.getPuestos()[k][l];
                        for (int m = 0; m < puesto.getListaReserva().size(); m++) {
                            Estudiante estudi = puesto.getListaReserva().get(m).getEstudiante();
                            Notificacion noti = new Notificacion("Su reserva se ha cancelado por cambio de puestos totales en el laboratorio Numero " + lab.getNumeroLab(), "Administrador de laboratorio ");
                            estudi.getListaNotificaciones().add(noti);
                            Serializador.Serializador.getSeri().escribirPersonal();
                            puesto.getListaReserva().remove(m);
                            Serializador.Serializador.getSeri().escribirLaboratorio();
                            System.out.println("entro  al borrar Mantenimientos de editar puestos");
                        }
                    }
                }

            }
        

    

    public void modificarPuestos(int puestos) {
        if (puestos >= 1) {
            if (puestos <= 20) {
                borrarReservasMantenimiento();
                lab.crearPuestos(puestos);
               
            } else {
                System.out.println("los puestos tienen que ser menores excepcion");
            }
        } else {
            System.out.println("los puestos tienen que ser mayores excepcion");
        }
    }

}
