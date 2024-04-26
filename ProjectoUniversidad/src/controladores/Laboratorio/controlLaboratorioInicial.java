/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.Laboratorio;

import modelado.Laboratorio;




public class controlLaboratorioInicial {
    Laboratorio[][]laboratorios;

    public controlLaboratorioInicial() {
        this.laboratorios = Serializador.Serializador.getSeri().getLaboratorios();
        initLaboratorio();
    }
        
        private void initLaboratorio() {
        for (int i = laboratorios.length - 1; i >= 0; i--) {
            for (int j = laboratorios[i].length - 1; j >= 0; j--) {
                if (laboratorios[i][j] == null ) {
                    laboratorios[i][j] = new Laboratorio();
                }
            }
        }
    }
       public Laboratorio obtenerLocal(int fila, int columna) {
        return laboratorios[fila][columna];
    }   
        
}
