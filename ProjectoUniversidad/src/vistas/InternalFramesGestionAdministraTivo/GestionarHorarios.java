/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.InternalFramesGestionAdministraTivo;

import controladores.ControladorCurso;
import controladores.ControladorHorarios;
import java.time.LocalDate;
import java.time.LocalTime;
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
        this.controlCurso= new ControladorCurso();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GESTION DE HORARIOS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbHoraIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbHoraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel26.setText("HORARIO DE INICIO DE CLASE ");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        cbMinutoIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbMinutoIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        cbMinutoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbMinutoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        cbHoraFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel27.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel27.setText("HORARIO DE FINAL DE CLASE ");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setText("Cursos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 60, -1));

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
        jPanel1.add(cbCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 290, -1));

        cbDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiasActionPerformed(evt);
            }
        });
        jPanel1.add(cbDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel28.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel28.setText("DIA DEL CURSO");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 216, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 216, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 257, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 257, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        controlHorarios.guardarHorario(horario);
//        boolean resp = validarNoUsarElPrimero();
//        if (resp) {
            controlHorarios.guardarHorario(horario);
            actualizarTablaAdmin(this.curso);
//        } else {
//            JOptionPane.showMessageDialog(null, "No puedes Seleccionar Cursos como un curso");
//        }


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
            Horario horario = controlHorarios.validarDiaUnic(dia);
//            boolean resp = validarNoUsarElPrimero();
//            if (resp) {
                controlHorarios.guardarHorario(horario);
                actualizarTablaAdmin(curso);
//            } else {
//                JOptionPane.showMessageDialog(null, "No puedes Seleccionar Cursos como un curso");
//            }


    }//GEN-LAST:event_btnBorrarActionPerformed
//    private boolean validarNoUsarElPrimero() {
//        try {
//            if (cbCursos.getSelectedIndex() == 0) {
//                return false;
//            } else {
//                return true;
//            }
//        } catch (NullPointerException e) {
//            return false;
//        }
//    }

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
//        boolean resp = validarNoUsarElPrimero();
//        if (resp) {
            controlHorarios.guardarHorario(horario);
            actualizarTablaAdmin(curso);
//        } else {
//            JOptionPane.showMessageDialog(null, "No puedes Seleccionar Cursos como un curso");
//        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       Dias dia =(Dias) cbDias.getSelectedItem();
        Horario hora = controlHorarios.validarDiaUnic(dia);
        if(hora!=null){
        int horaIni = hora.getHoraEntrada().getHour();
        int minutoIni = hora.getHoraEntrada().getMinute();
        int horaFinal = hora.getHoraSalida().getHour();
        int minutoFinal = hora.getHoraSalida().getMinute();
        cbHoraIni.setSelectedItem(String.valueOf(horaIni));
        cbMinutoIni.setSelectedItem(String.valueOf(minutoIni));
        cbHoraFinal.setSelectedItem(String.valueOf(horaFinal));
        cbMinutoFinal.setSelectedItem(String.valueOf(minutoFinal));
        }else{
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHorarios;
    // End of variables declaration//GEN-END:variables
}
