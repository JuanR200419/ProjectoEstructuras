/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.Laboratorio;

import controladores.AdminLab.controladorMantenimiento;
import controladores.Laboratorio.controlLaboratorioInicial;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelado.AdminLaboratorio;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Mantenimiento;
import modelado.Persona;
import vistas.AdminLab.AdminLabInicio;
import vistas.Estudiante.InicioEstudiante;

/**
 *
 * @author Juan Manuel
 */
public class LobbyLaboratorio extends javax.swing.JFrame implements ActionListener {

    JButton[][] botones;
    controlLaboratorioInicial control;
    Estudiante estudiante;
    AdminLaboratorio adminLab;
    Persona persona;
    controladorMantenimiento controlMan;

    public LobbyLaboratorio(Persona persona) {
        initComponents();
        this.setLocationRelativeTo(this);
        botones = new JButton[3][5];
        this.control = new controlLaboratorioInicial();
        this.controlMan = new controladorMantenimiento();
        this.persona = persona;
        controlMan.validarEstadoTodosLaboratorios();
        controlMan.eliminarTodosLosMantenimientos();
        controlMan.borrarReservasMantenimiento();
        control.cambiarEstado();
        control.eliminarReservasTerminadas();
        cargarBotones();
        validarPosiciones();
    }

    private void AtrasValidado(Persona persona) {
        if (persona instanceof AdminLaboratorio) {
            this.adminLab = (AdminLaboratorio) persona;
            AdminLabInicio admin = new AdminLabInicio(adminLab);
            admin.setVisible(true);
            this.dispose();
        } else {
            this.estudiante = (Estudiante) persona;
            InicioEstudiante estudi = new InicioEstudiante(estudiante);
            estudi.setVisible(true);
            this.dispose();
        }
    }

    private void cargarBotones() {
        int ancho = 70;
        int alto = 70;
        // Espacio vertical entre botones
        int texto = 411;
        int texto2 = 401;
        int separacionY = 5;
        int separacionX = 5;
        for (int i = botones.length - 1; i >= 0; i--) {
            for (int j = botones[i].length - 1; j >= 0; j--) {
                botones[i][j] = new JButton();
                // Calcular las coordenadas X e Y para el botón actual
                int posX = j * (ancho + separacionX + 15);
                int posY = i * (alto + separacionY + 15);
                // Establecer la posición y el tamaño del botón
                botones[i][j].setBounds(posX, posY, ancho, alto);
                // Verificar si es necesario modificar el botón
                if (i != 1 || j <= 0) {
                    if (i == 0) {
                        // Configurar el texto del botón
                        botones[i][j].setText(String.valueOf(texto2));
                        botones[i][j].setForeground(Color.BLACK);
                        // Agregar un ActionListener al botón
                        botones[i][j].addActionListener(this);
                        // Agregar el botón al panel principal
                        PanelPrincipal.add(botones[i][j]);
                        texto2++;
                    } else {
                        botones[i][j].setText(String.valueOf(texto));
                        botones[i][j].setForeground(Color.BLACK);
                        // Agregar un ActionListener al botón
                        botones[i][j].addActionListener(this);
                        // Agregar el botón al panel principal
                        PanelPrincipal.add(botones[i][j]);
                        texto--;

                    }
                }

            }
        }
    }

    public void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Laboratorio lab = control.obtenerLaboratorio(i, j);
                if (lab.getEstado().equals(Laboratorio.DISPONIBLE)) {
                    botones[i][j].setBackground(Color.WHITE);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));

                } else if (lab.getEstado().equals(Laboratorio.MANTENIMIENTO)) {
                    botones[i][j].setBackground(Color.DARK_GRAY);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (ae.getSource().equals(botones[i][j])) {
                    Laboratorio lab = control.obtenerLaboratorio(i, j);
                    if (lab.getEstado().equals(Laboratorio.DISPONIBLE)) {
                        System.out.println(lab.getNumeroLab());
                        controlMan.validarEstadoTodosLaboratorios();
                        PuestosLaboratorio pon = new PuestosLaboratorio(lab, persona);
                        pon.setVisible(true);
                        pon.setLocationRelativeTo(this);
                        this.dispose();
                    } else if (lab.getEstado().equals(Laboratorio.MANTENIMIENTO)) {
                        Mantenimiento man = controlMan.buscarMantenimiento(lab, LocalDate.now());
                        JOptionPane.showMessageDialog(null, "El laboratorio esta en mantenimiento "
                                + man.getDescripcion()
                        );
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimerPanel = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrimerPanel.setBackground(new java.awt.Color(0, 39, 44));

        PanelPrincipal.setBackground(new java.awt.Color(0, 51, 51));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LABORATORIOS ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lab2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lab1.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrimerPanelLayout = new javax.swing.GroupLayout(PrimerPanel);
        PrimerPanel.setLayout(PrimerPanelLayout);
        PrimerPanelLayout.setHorizontalGroup(
            PrimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimerPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(PrimerPanelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PrimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrimerPanelLayout.createSequentialGroup()
                    .addContainerGap(649, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );
        PrimerPanelLayout.setVerticalGroup(
            PrimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrimerPanelLayout.createSequentialGroup()
                .addGroup(PrimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrimerPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrimerPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PrimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrimerPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrimerPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(PrimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PrimerPanelLayout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AtrasValidado(persona);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PrimerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
