/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.Laboratorio;

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
import modelado.AdminLaboratorio;
import modelado.Estudiante;
import modelado.Laboratorio;
import modelado.Persona;
import modelado.Puesto;
import modelado.Reserva;
public class VentanaReserva extends javax.swing.JFrame {

    controladorReserva control;
    Puesto puesto;
    Laboratorio laboratorio;
    Persona persona;
    AdminLaboratorio admin;
    Estudiante estudiante;
    public VentanaReserva(Puesto pueso, Laboratorio laboratorio, Persona persona) {
        initComponents();
        cambiarCalendario();
        this.puesto = pueso;
        System.out.println(puesto.getEstado());
        this.laboratorio = laboratorio;
        this.persona = persona;
        identificarPersona();
        this.control = new controladorReserva(puesto);
        control.cambiarEstadoOcupado();
        control.eliminarReservasTerminadas();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        cbMinutoIni = new javax.swing.JComboBox<>();
        cbHoraIni = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCancelarReserva = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        txtEstudiante = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

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

        txtEstudiante.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("RESERVAR PUESTO ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(btnCancelarReserva)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
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

        jButton1.setText("Atras");
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
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 
    
    
    
    
    private void cambiarCalendario() {
        Calendar calActual = Calendar.getInstance(); // Obtiene la fecha y hora actual
        calActual.add(Calendar.DAY_OF_MONTH, 1); // Incrementa la fecha actual en un día para que sea posterior a la fecha actual
        dateFecha.setMinSelectableDate(calActual.getTime()); // Configura la fecha mínima como la fecha actual incrementada en un día
        dateFecha.setMaxSelectableDate(null); // No hay límite en la fecha máxima, permite cualquier fecha en el futuro
        dateFecha.setDate(calActual.getTime()); // Configura la fecha seleccionada por defecto como la fecha actual incrementada en un día
        JTextFieldDateEditor editor4 = (JTextFieldDateEditor) dateFecha.getDateEditor();
        editor4.setEditable(false); // Hace que el campo de texto del editor de fecha no sea editable
    }

    private void identificarPersona() {
        if (persona instanceof Estudiante) {
           this.estudiante = (Estudiante) persona;
           txtEstudiante.setText(estudiante.toString());
        }

    }


    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
    Estudiante estudi = control.buscarEstudiante(estudiante.getId());
        System.out.println(estudi.getNombre());
        int horaEntrada = Integer.parseInt(cbHoraIni.getSelectedItem().toString());
        int minutoEntrada = Integer.parseInt(cbMinutoIni.getSelectedItem().toString());
        LocalTime entrada = LocalTime.of(horaEntrada, minutoEntrada);
        LocalTime salida = LocalTime.of(horaEntrada, minutoEntrada);
        salida = salida.plusHours(1);
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
            control.borrarReserva(estudiante.getId());
            JOptionPane.showMessageDialog(null, "Se cancelo la reserva");
        } catch (noSeEncontraronReservasException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnCancelarReservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PuestosLaboratorio pue = new PuestosLaboratorio(laboratorio, persona);
        control.eliminarReservasTerminadas();
        control.cambiarEstadoOcupado();
        pue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cbHoraIni;
    private javax.swing.JComboBox<String> cbMinutoIni;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel txtEstudiante;
    // End of variables declaration//GEN-END:variables
}
