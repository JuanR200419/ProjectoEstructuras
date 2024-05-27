/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Estudiante;

import javax.swing.JOptionPane;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Puesto;
import modelado.Reserva;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class controladorReservasActivas {

    Laboratorio[][] lab;
    Estudiante estudiante;

    public controladorReservasActivas(Estudiante estudiante) {
        this.lab = Serializador.Serializador.getSeri().getLaboratorios();
        this.estudiante = estudiante;
    }

    public Lista<Reserva> buscarReservaActiva() {
        Lista<Reserva> listaReservaEstudiante = new Lista<>();
        if (lab[0][0] != null) {
            for (int i = 0; i < lab.length; i++) {
                for (int j = 0; j < lab[i].length; j++) {
                    for (int k = 0; k < lab[i][j].getPuestos().length; k++) {
                        for (int l = 0; l < lab[i][j].getPuestos()[k].length; l++) {
                            for (int m = 0; m < lab[i][j].getPuestos()[k][l].getListaReserva().size(); m++) {
                                if (lab[i][j].getPuestos()[k][l].getListaReserva().get(m).getEstudiante().getId().equals(estudiante.getId())) {
                                    listaReservaEstudiante.add(lab[i][j].getPuestos()[k][l].getListaReserva().get(m));
                                }
                            }
                        }
                    }
                }
            }

            return listaReservaEstudiante;

        }else{
            System.out.println("Colocar excepcion de reservas no disponibles");
            JOptionPane.showConfirmDialog(null,"No hay reservas");
        }
        return null;
    }

}
