/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.InternalFramesGestionAdministraTivo;

import com.toedter.calendar.JTextFieldDateEditor;
import controladores.ControladorAdminLab;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.AdminLaboratorio;
import modelado.Docente;
import modelado.Persona;

/**
 *
 * @author Juan Manuel
 */
public class GestionAdminLab extends javax.swing.JInternalFrame {
 ControladorAdminLab control;
    
    public GestionAdminLab() {
        initComponents();
          this.control = new ControladorAdminLab();
        actualizarTablaAdmin();
          JTextFieldDateEditor editor = (JTextFieldDateEditor) dateAdminLab.getDateEditor();
        editor.setEditable(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLab = new javax.swing.JPanel();
        dateAdminLab = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioAdminLab = new javax.swing.JTextField();
        txtContraAdminLab = new javax.swing.JPasswordField();
        txtNombreAdminLab = new javax.swing.JTextField();
        txtIdentificacionAdminLab = new javax.swing.JTextField();
        btnInsertarAdmin = new javax.swing.JButton();
        btnBuscarAdmin = new javax.swing.JButton();
        btnBorrarAdmin = new javax.swing.JButton();
        btnActualizarAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbladminLab = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1012, 578));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminLab.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE  DE  USUARIO:");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRASEÑA TEMPORAL:");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE :");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("IDENTIFICACION");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha De Nacimiento");

        txtUsuarioAdminLab.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        txtUsuarioAdminLab.setForeground(new java.awt.Color(0, 0, 0));

        txtContraAdminLab.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        txtContraAdminLab.setForeground(new java.awt.Color(0, 0, 0));

        txtNombreAdminLab.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        txtNombreAdminLab.setForeground(new java.awt.Color(0, 0, 0));

        txtIdentificacionAdminLab.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        txtIdentificacionAdminLab.setForeground(new java.awt.Color(0, 0, 0));

        btnInsertarAdmin.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnInsertarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnInsertarAdmin.setText("INSERTAR");
        btnInsertarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAdminActionPerformed(evt);
            }
        });

        btnBuscarAdmin.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnBuscarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarAdmin.setText("BUSCAR");
        btnBuscarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdminActionPerformed(evt);
            }
        });

        btnBorrarAdmin.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnBorrarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarAdmin.setText("BORRAR");
        btnBorrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAdminActionPerformed(evt);
            }
        });

        btnActualizarAdmin.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnActualizarAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarAdmin.setText("ACTUALIZAR");
        btnActualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminActionPerformed(evt);
            }
        });

        tbladminLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "identificacion", "Nombre de Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbladminLab);

        javax.swing.GroupLayout AdminLabLayout = new javax.swing.GroupLayout(AdminLab);
        AdminLab.setLayout(AdminLabLayout);
        AdminLabLayout.setHorizontalGroup(
            AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLabLayout.createSequentialGroup()
                .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLabLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateAdminLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AdminLabLayout.createSequentialGroup()
                                .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuarioAdminLab)
                                    .addComponent(txtContraAdminLab, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtNombreAdminLab)
                                    .addComponent(txtIdentificacionAdminLab)))))
                    .addGroup(AdminLabLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnInsertarAdmin)
                                .addComponent(btnBuscarAdmin)))
                        .addGap(25, 25, 25)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarAdmin)
                            .addGroup(AdminLabLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnBorrarAdmin)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        AdminLabLayout.setVerticalGroup(
            AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLabLayout.createSequentialGroup()
                .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLabLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuarioAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtContraAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdentificacionAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dateAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertarAdmin)
                            .addComponent(btnBorrarAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AdminLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizarAdmin)
                            .addComponent(btnBuscarAdmin)))
                    .addGroup(AdminLabLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(AdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    

    private void btnInsertarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAdminActionPerformed

        String nombre = txtNombreAdminLab.getText();
        String id = txtIdentificacionAdminLab.getText();
        Date fecha = dateAdminLab.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String nombreUsuario = txtUsuarioAdminLab.getText();
        String contrasena = String.valueOf(txtContraAdminLab.getPassword());
        System.out.println(fechaNacimiento);
        AdminLaboratorio admin = new AdminLaboratorio(nombre, id, fechaNacimiento, nombreUsuario, contrasena,"AdminLab");
        control.agregarAdmin(admin);
        actualizarTablaAdmin();
    }//GEN-LAST:event_btnInsertarAdminActionPerformed

    private void btnBuscarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdminActionPerformed
        if (txtIdentificacionAdminLab.equals("")) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder buscar el Administrador de Laboratorio");
        }

        try {
            String id = txtIdentificacionAdminLab.getText();
            Persona persona = control.buscarPersonal(id);
            Date fecha = java.sql.Date.valueOf(persona.getFechaNacimiento());
            dateAdminLab.setDate(fecha);
            txtNombreAdminLab.setText(persona.getNombre());
            txtContraAdminLab.setText(persona.getContrasena());
            txtUsuarioAdminLab.setText(persona.getNommbreUsuario());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el admin");
        }

    }//GEN-LAST:event_btnBuscarAdminActionPerformed

    private void btnBorrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAdminActionPerformed
        if (txtIdentificacionAdminLab.equals("")) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder borrar el usuario");
        }
        String id = txtIdentificacionAdminLab.getText();
        control.eliminarAdmin(id);
        actualizarTablaAdmin();
    }//GEN-LAST:event_btnBorrarAdminActionPerformed

    private void btnActualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminActionPerformed
        String nombre = txtNombreAdminLab.getText();
        String id = txtIdentificacionAdminLab.getText();
        Date fecha = dateAdminLab.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String nombreUsuario = txtUsuarioAdminLab.getText();
        String contrasena = String.valueOf(txtContraAdminLab.getPassword());
        System.out.println(fechaNacimiento);
        AdminLaboratorio admin = new AdminLaboratorio(nombre, id, fechaNacimiento, nombreUsuario, contrasena,"AdminLab");
        control.ActualizarAdmin(admin);
        actualizarTablaAdmin();
    }//GEN-LAST:event_btnActualizarAdminActionPerformed

       private void actualizarTablaAdmin() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tbladminLab.getModel();
        modeloTabla.setRowCount(0);
        AdminLaboratorio admin;
        for (int i = 0; i < control.getListaPersonas().size(); i++) {
            if (control.getListaPersonas().get(i) instanceof AdminLaboratorio) {
                admin = (AdminLaboratorio) control.getListaPersonas().get(i);
                String[] rowData = {
                    admin.getNombre(),
                    admin.getId(),
                    admin.getNommbreUsuario(),
                    admin.getContrasena()
                };
                modeloTabla.addRow(rowData);
            }

        }
        tbladminLab.setModel(modeloTabla);
        tbladminLab.revalidate();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminLab;
    private javax.swing.JButton btnActualizarAdmin;
    private javax.swing.JButton btnBorrarAdmin;
    private javax.swing.JButton btnBuscarAdmin;
    private javax.swing.JButton btnInsertarAdmin;
    private com.toedter.calendar.JDateChooser dateAdminLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbladminLab;
    private javax.swing.JPasswordField txtContraAdminLab;
    private javax.swing.JTextField txtIdentificacionAdminLab;
    private javax.swing.JTextField txtNombreAdminLab;
    private javax.swing.JTextField txtUsuarioAdminLab;
    // End of variables declaration//GEN-END:variables
}
