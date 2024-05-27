/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.Laboratorio;

import controladores.Laboratorio.controladorPuestos;
import controladores.Laboratorio.controladorReserva;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import modelado.AdminLaboratorio;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Mantenimiento;
import modelado.Persona;
import modelado.Puesto;
import vistas.AdminLab.VentanaMantenimiento;
import vistas.AdminLab.VentanaModificarPuesto;
import vistas.AdminLab.ventanaReservarEstudiante;

/**
 *
 * @author Juan Manuel
 */
public class PuestosLaboratorio extends javax.swing.JFrame implements ActionListener {

    controladorReserva controlReser;
    controladorPuestos control;
    JButton[][] botones;
    Laboratorio laboratorio;
    Persona persona;

    public PuestosLaboratorio(Laboratorio laboratorio, Persona persona) {
        initComponents();
        this.botones = new JButton[4][4];
        this.setLocationRelativeTo(null);
        this.laboratorio = laboratorio;
        this.control = new controladorPuestos(laboratorio);
        this.persona = persona;
        validarUsuario();
        cargarBotones();
        validarPosiciones();
    }

    private void validarUsuario() {
        if (persona instanceof Estudiante) {
            panelMan.setVisible(false);
        } else {
            panelMan.setVisible(true);
        }
    }

    public void cargarBotones() {
        int cantidadPuestos = control.getCatidad();
        int filas = cantidadPuestos / 4;
        JButton[][] matrizPuestos;
        if (cantidadPuestos % 4 != 0) {
            matrizPuestos = new JButton[filas + 1][];
            for (int i = 0; i < filas; i++) {
                matrizPuestos[i] = new JButton[4];
            }
            int puestosFaltantes = cantidadPuestos % 4;
            matrizPuestos[matrizPuestos.length - 1] = new JButton[puestosFaltantes];
        } else {
            matrizPuestos = new JButton[filas][4];
        }
        this.botones = matrizPuestos;
        cargarPuestos();
    }

    public void cargarPuestos() {
        int ancho = 80;
        int alto = 75;
        int separado = 30;
        int contador = 1;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setBounds(j * ancho + separado, i * alto + separado, ancho, alto);
                botones[i][j].setBackground(Color.WHITE);
                botones[i][j].addActionListener(this);
                botones[i][j].setText(String.valueOf(contador));
                panel.add(botones[i][j]);
                contador += 1;
            }
        }
        int anchoPanel = (botones[0].length) * ancho + separado + 40;
        int altoPanel = (botones.length) * ancho + separado + 40;
        panel.setPreferredSize(new Dimension(anchoPanel, altoPanel));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelMan = new javax.swing.JPanel();
        btnMantenimiento = new javax.swing.JButton();
        btnModificarPuestos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("PUESTOS ");

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMantenimiento.setText("COLOCAR EN MANTENIMIENTO");
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });

        btnModificarPuestos.setText("MODIFICAR PUESTOS");
        btnModificarPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPuestosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelManLayout = new javax.swing.GroupLayout(panelMan);
        panelMan.setLayout(panelManLayout);
        panelManLayout.setHorizontalGroup(
            panelManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnModificarPuestos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnMantenimiento)
                .addGap(18, 18, 18))
        );
        panelManLayout.setVerticalGroup(
            panelManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMantenimiento)
                    .addComponent(btnModificarPuestos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addGap(0, 295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(panelMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LobbyLaboratorio lab = new LobbyLaboratorio(persona);
        lab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        VentanaMantenimiento ven = new VentanaMantenimiento(laboratorio,persona);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnModificarPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPuestosActionPerformed
        VentanaModificarPuesto ven = new VentanaModificarPuesto(laboratorio,persona);
         ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarPuestosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnModificarPuestos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (ae.getSource().equals(botones[i][j])) {
                    Puesto puesto = control.obtenerPuesto(i, j);
                    if (puesto.getEstado().equals(Laboratorio.DISPONIBLE)) {
                        this.controlReser = new controladorReserva(puesto);
                        controlReser.cambiarEstadoOcupado();
                        controlReser.eliminarReservasTerminadas();
                        if (persona instanceof Estudiante) {
                            VentanaReserva pon = new VentanaReserva(puesto, laboratorio, persona);
                            pon.setVisible(true);
                            pon.setLocationRelativeTo(this);
                            this.dispose();
                        } else if (persona instanceof AdminLaboratorio) {
                            ventanaReservarEstudiante pon = new ventanaReservarEstudiante(laboratorio,puesto,persona);
                            pon.setVisible(true);
                            pon.setLocationRelativeTo(this);
                            this.dispose();
                        }

                    }
                }
            }
        }
    }

    public void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Puesto puesto = control.obtenerPuesto(i, j);
                if (puesto.getEstado().equals(Puesto.DISPONIBLE)) {
                    botones[i][j].setBackground(Color.WHITE);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));

                } else if (puesto.getEstado().equals(Puesto.OCUPADO)) {
                    botones[i][j].setBackground(Color.RED);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));
                }
            }
        }
    }

}
