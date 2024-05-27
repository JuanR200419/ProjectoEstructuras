/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.AdminLab;

import com.toedter.calendar.JTextFieldDateEditor;
import controladores.Laboratorio.controladorReserva;
import excepciones.EstudianteReservaActivaException;
import excepciones.horarioYaEstablecidoReserva;
import excepciones.noSeEncontraronReservasException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Persona;
import modelado.Puesto;
import modelado.Reserva;
import util.IList;
import vistas.Laboratorio.PuestosLaboratorio;

/**
 *
 * @author Juan Manuel
 */
public class ventanaReservarEstudiante extends javax.swing.JFrame {
Laboratorio laboratorio;
controladorReserva control;
Puesto puesto;
Persona persona;
    public ventanaReservarEstudiante(Laboratorio laboratorio,Puesto puesto,Persona persona) {
        initComponents();
        this.persona = persona;
        this.puesto = puesto;
        this.control = new controladorReserva(puesto);
        this.laboratorio = laboratorio;
        llenarComboEstudiantes();
        llenarCombo();
        cambiarCalendario();
    }

    
      private void cambiarCalendario() {
        Calendar calActual = Calendar.getInstance(); // Obtiene la fecha y hora actual
        calActual.add(Calendar.DAY_OF_MONTH, 1); // Incrementa la fecha actual en un día para que sea posterior a la fecha actual
        dateFecha.setMinSelectableDate(calActual.getTime()); // Configura la fecha mínima como la fecha actual incrementada en un día
        dateFecha.setMaxSelectableDate(null); // No hay límite en la fecha máxima, permite cualquier fecha en el futuro
        dateFecha.setDate(calActual.getTime()); // Configura la fecha seleccionada por defecto como la fecha actual incrementada en un día
        JTextFieldDateEditor editor4 = (JTextFieldDateEditor) dateFecha.getDateEditor();
        editor4.setEditable(false); // Hace que el campo de texto del editor de fecha no sea editable
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        cbMinutoIni = new javax.swing.JComboBox<>();
        cbHoraIni = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCancelarReserva = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbEstudiante = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setText("ESTUDIANTE :");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setText("FECHA:");

        cbMinutoIni.setBackground(new java.awt.Color(71, 100, 104));
        cbMinutoIni.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbMinutoIni.setForeground(new java.awt.Color(255, 255, 255));
        cbMinutoIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHoraIni.setBackground(new java.awt.Color(71, 100, 104));
        cbHoraIni.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbHoraIni.setForeground(new java.awt.Color(255, 255, 255));
        cbHoraIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setText("HORA:");

        btnCancelarReserva.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnCancelarReserva.setText("CANCELAR RESERVA");
        btnCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservaActionPerformed(evt);
            }
        });

        btnReservar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnReservar.setText("RESERVAR");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("RESERVAR PUESTO ");

        cbEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        cbEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbEstudiante.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cbMinutoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnReservar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarReserva))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(cbHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMinutoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservar)
                    .addComponent(btnCancelarReserva))
                .addGap(34, 34, 34))
        );

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarComboEstudiantes(){
          cbEstudiante.removeAllItems();
        IList<Persona> lista = control.getListaPersonas();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Estudiante) {
                cbEstudiante.addItem((Estudiante) lista.get(i));
            }
        }
    }
        private void llenarCombo() {
        cbHoraIni.removeAllItems();
        for (int i = 0; i <= 23; i++) {
            String a = String.valueOf(i);
            cbHoraIni.addItem(a);
        }
        cbMinutoIni.removeAllItems();
        for (int i = 0; i <= 59; i++) {
            String a = String.valueOf(i);
            cbMinutoIni.addItem(a);
        }

    }
    
    
    private void btnCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservaActionPerformed

        try {
            Estudiante estudiante = (Estudiante) cbEstudiante.getSelectedItem();
            control.borrarReserva(estudiante.getId());
            JOptionPane.showMessageDialog(null, "Se cancelo la reserva");
        } catch (noSeEncontraronReservasException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnCancelarReservaActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        Estudiante estudiante = (Estudiante) cbEstudiante.getSelectedItem();
        Estudiante estudi = control.buscarEstudiante(estudiante.getId());
        System.out.println(estudi.getNombre());
        int horaEntrada = Integer.parseInt(cbHoraIni.getSelectedItem().toString());
        int minutoEntrada = Integer.parseInt(cbMinutoIni.getSelectedItem().toString());
        LocalTime entrada = LocalTime.of(horaEntrada, minutoEntrada);
        LocalTime salida = LocalTime.of(horaEntrada, minutoEntrada);
        salida = salida.plusHours(1);
        System.out.println(entrada.toString());
        System.out.println(salida.toString());
        Date fechaE = dateFecha.getDate();

        LocalDate fecha = fechaE.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        System.out.println(fecha.toString());
        Reserva reserva = new Reserva(estudi, fecha, entrada, salida);

        try {
            control.guardarReserva(reserva);
            JOptionPane.showMessageDialog(null, "Se reservo");
        } catch (EstudianteReservaActivaException | horarioYaEstablecidoReserva ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PuestosLaboratorio lab = new PuestosLaboratorio(laboratorio, persona);
       lab.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<Estudiante> cbEstudiante;
    private javax.swing.JComboBox<String> cbHoraIni;
    private javax.swing.JComboBox<String> cbMinutoIni;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
