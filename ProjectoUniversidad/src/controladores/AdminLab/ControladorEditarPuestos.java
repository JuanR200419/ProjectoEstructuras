/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.AdminLab;

import modelado.Laboratorio;

/**
 *
 * @author Juan Manuel
 */
public class ControladorEditarPuestos {

    Laboratorio laboratorio;

    public ControladorEditarPuestos(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void modificarPuestos(int puestos) {
        if (puestos >= 1) {
            if (puestos <= 20) {
                laboratorio.crearPuestos(puestos);
            } else {
                  System.out.println("los puestos tienen que ser menores excepcion");
            }
        } else {
            System.out.println("los puestos tienen que ser mayores excepcion");
        }
    }

}
