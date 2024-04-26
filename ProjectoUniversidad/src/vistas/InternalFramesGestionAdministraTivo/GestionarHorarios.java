/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.InternalFramesGestionAdministraTivo;

import controladores.administrativo.ControladorCurso;
import controladores.administrativo.ControladorHorarios;
import excepciones.horaNoValidaException;
import excepciones.unicoDiaException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.Curso;
import modelado.Docente;
import modelado.Enums.Dias;
import modelado.Enums.Materia;
import modelado.Horario;
import modelado.Persona;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class GestionarHorarios extends javax.swing.JInternalFrame {

    ControladorHorarios controlHorarios;
    ControladorCurso controlCurso;
    Curso curso;

    public GestionarHorarios() {
        initComponents();
        this.controlCurso = new ControladorCurso();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbHoraIni = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cbMinutoIni = new javax.swing.JComboBox<>();
        cbMinutoFinal = new javax.swing.JComboBox<>();
        cbHoraFinal = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCursos = new javax.swing.JComboBox<>();
        cbDias = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 39, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbHoraIni.setBackground(new java.awt.Color(71, 100, 104));
        cbHoraIni.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbHoraIni.setForeground(new java.awt.Color(255, 255, 255));
        cbHoraIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbHoraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel26.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HORARIO DE INICIO DE CLASE: ");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cbMinutoIni.setBackground(new java.awt.Color(71, 100, 104));
        cbMinutoIni.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbMinutoIni.setForeground(new java.awt.Color(255, 255, 255));
        cbMinutoIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbMinutoIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        cbMinutoFinal.setBackground(new java.awt.Color(71, 100, 104));
        cbMinutoFinal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbMinutoFinal.setForeground(new java.awt.Color(255, 255, 255));
        cbMinutoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbMinutoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        cbHoraFinal.setBackground(new java.awt.Color(71, 100, 104));
        cbHoraFinal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbHoraFinal.setForeground(new java.awt.Color(255, 255, 255));
        cbHoraFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel27.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("HORARIO DE FINAL DE CLASE :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CURSOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 60, -1));

        cbCursos.setBackground(new java.awt.Color(71, 100, 104));
        cbCursos.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbCursos.setForeground(new java.awt.Color(255, 255, 255));
        cbCursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursosItemStateChanged(evt);
            }
        });
        cbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCursosActionPerformed(evt);
            }
        });
        jPanel1.add(cbCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 290, -1));

        cbDias.setBackground(new java.awt.Color(71, 100, 104));
        cbDias.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbDias.setForeground(new java.awt.Color(255, 255, 255));
        cbDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiasActionPerformed(evt);
            }
        });
        jPanel1.add(cbDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel28.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("DIA DEL CURSO:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(71, 100, 104));
        btnAgregar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        btnBorrar.setBackground(new java.awt.Color(71, 100, 104));
        btnBorrar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(71, 100, 104));
        btnActualizar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(71, 100, 104));
        btnBuscar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        tblHorarios.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Curso", "Dia", "HoraEntrada", "HoraSalida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHorarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 760, 260));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DE HORARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 150, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void llenarCombo() {
        cbDias.removeAllItems();
        for (Dias value : Dias.values()) {
            cbDias.addItem(value);
        }
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
        cbHoraFinal.removeAllItems();
        for (int i = 0; i <= 23; i++) {
            String a = String.valueOf(i);
            cbHoraFinal.addItem(a);
        }
        cbMinutoFinal.removeAllItems();
        for (int i = 0; i <= 59; i++) {
            String a = String.valueOf(i);
            cbMinutoFinal.addItem(a);
        }
        for (int i = 0; i < controlCurso.getListaCursos().size(); i++) {
            cbCursos.addItem(controlCurso.getListaCursos().get(i));
        }
    }

    private void cbDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiasActionPerformed

    }//GEN-LAST:event_cbDiasActionPerformed
    private void actualizarTablaAdmin(Curso curso) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblHorarios.getModel();
        modeloTabla.setRowCount(0);

        for (int i = 0; i < curso.getHorariosEstablecidos().size(); i++) {
            Horario horario = curso.getHorariosEstablecidos().get(i);
            String[] rowData = {
                curso.getMateria().toString(),
                horario.getDia().toString(),
                horario.getHoraEntrada().toString(),
                horario.getHoraSalida().toString(),};
            modeloTabla.addRow(rowData);
        }
        tblHorarios.setModel(modeloTabla);
        tblHorarios.revalidate();
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //METODOS PARA EL HORARIO NO CONFIRMADOS
        Dias dia = (Dias) cbDias.getSelectedItem();
        // Hora de entrada
        int horaEntrada = Integer.parseInt(cbHoraIni.getSelectedItem().toString());
        int minutoEntrada = Integer.parseInt(cbMinutoIni.getSelectedItem().toString());
        LocalTime entrada = LocalTime.of(horaEntrada, minutoEntrada);
        // Hora de salida
        int horaSalida = Integer.parseInt(cbHoraFinal.getSelectedItem().toString());
        int minutoSalida = Integer.parseInt(cbMinutoFinal.getSelectedItem().toString());
        LocalTime salida = LocalTime.of(horaSalida, minutoSalida);
        Horario horario = new Horario(dia, entrada, salida);
        try {
            controlHorarios.guardarHorario(horario);
        } catch (horaNoValidaException | unicoDiaException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        actualizarTablaAdmin(this.curso);


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCursosActionPerformed

    }//GEN-LAST:event_cbCursosActionPerformed

    private void cbCursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursosItemStateChanged
        this.curso = (Curso) cbCursos.getSelectedItem();
        this.controlHorarios = new ControladorHorarios(curso);
        actualizarTablaAdmin(curso);
    }//GEN-LAST:event_cbCursosItemStateChanged

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        Dias dia = (Dias) cbDias.getSelectedItem();
        controlHorarios.eliminarHorario(dia);
        actualizarTablaAdmin(curso);


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //METODOS PARA EL HORARIO NO CONFIRMADOS
        Dias dia = (Dias) cbDias.getSelectedItem();
        // Hora de entrada
        int horaEntrada = Integer.parseInt(cbHoraIni.getSelectedItem().toString());
        int minutoEntrada = Integer.parseInt(cbMinutoIni.getSelectedItem().toString());
        LocalTime entrada = LocalTime.of(horaEntrada, minutoEntrada);
        // Hora de salida
        int horaSalida = Integer.parseInt(cbHoraFinal.getSelectedItem().toString());
        int minutoSalida = Integer.parseInt(cbMinutoFinal.getSelectedItem().toString());
        LocalTime salida = LocalTime.of(horaSalida, minutoSalida);
        Horario horario = new Horario(dia, entrada, salida);
        controlHorarios.actualizarHorario(horario);
        actualizarTablaAdmin(curso);


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Dias dia = (Dias) cbDias.getSelectedItem();
        Horario hora = controlHorarios.validarDiaUnic(dia);
        if (hora != null) {
            int horaIni = hora.getHoraEntrada().getHour();
            int minutoIni = hora.getHoraEntrada().getMinute();
            int horaFinal = hora.getHoraSalida().getHour();
            int minutoFinal = hora.getHoraSalida().getMinute();
            cbHoraIni.setSelectedItem(String.valueOf(horaIni));
            cbMinutoIni.setSelectedItem(String.valueOf(minutoIni));
            cbHoraFinal.setSelectedItem(String.valueOf(horaFinal));
            cbMinutoFinal.setSelectedItem(String.valueOf(minutoFinal));
        } else {
            JOptionPane.showMessageDialog(null, "No esta registra ese horario en este curso");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Curso> cbCursos;
    private javax.swing.JComboBox cbDias;
    private javax.swing.JComboBox<String> cbHoraFinal;
    private javax.swing.JComboBox<String> cbHoraIni;
    private javax.swing.JComboBox<String> cbMinutoFinal;
    private javax.swing.JComboBox<String> cbMinutoIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHorarios;
    // End of variables declaration//GEN-END:variables
}
