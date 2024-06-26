/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.InternalFramesGestionAdministraTivo;

import com.toedter.calendar.JTextFieldDateEditor;
import controladores.administrativo.ControladorAdminLab;
import excepciones.UsuarioExistenteException;
import excepciones.UsuarioNoEncontradoException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.AdminLaboratorio;
import modelado.Contrasena;
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
        cambiarCalendario();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbladminLab = new javax.swing.JTable();
        btnInsertarAdmin = new javax.swing.JButton();
        btnBuscarAdmin = new javax.swing.JButton();
        btnBorrarAdmin = new javax.swing.JButton();
        btnActualizarAdmin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1012, 578));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminLab.setBackground(new java.awt.Color(0, 39, 44));
        AdminLab.setForeground(new java.awt.Color(0, 0, 0));
        AdminLab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AdminLab.add(dateAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 136, -1));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE  DE  USUARIO:");
        AdminLab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA TEMPORAL:");
        AdminLab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE :");
        AdminLab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 100, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDENTIFICACION:");
        AdminLab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 130, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha De Nacimiento:");
        AdminLab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        txtUsuarioAdminLab.setBackground(new java.awt.Color(71, 100, 104));
        txtUsuarioAdminLab.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtUsuarioAdminLab.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioAdminLab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioAdminLabFocusLost(evt);
            }
        });
        txtUsuarioAdminLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioAdminLabKeyTyped(evt);
            }
        });
        AdminLab.add(txtUsuarioAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 123, -1));

        txtContraAdminLab.setBackground(new java.awt.Color(71, 100, 104));
        txtContraAdminLab.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtContraAdminLab.setForeground(new java.awt.Color(255, 255, 255));
        txtContraAdminLab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraAdminLabFocusLost(evt);
            }
        });
        AdminLab.add(txtContraAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 123, -1));

        txtNombreAdminLab.setBackground(new java.awt.Color(71, 100, 104));
        txtNombreAdminLab.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtNombreAdminLab.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreAdminLab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreAdminLabFocusLost(evt);
            }
        });
        txtNombreAdminLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAdminLabKeyTyped(evt);
            }
        });
        AdminLab.add(txtNombreAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 123, -1));

        txtIdentificacionAdminLab.setBackground(new java.awt.Color(71, 100, 104));
        txtIdentificacionAdminLab.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtIdentificacionAdminLab.setForeground(new java.awt.Color(255, 255, 255));
        txtIdentificacionAdminLab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificacionAdminLabFocusLost(evt);
            }
        });
        txtIdentificacionAdminLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionAdminLabKeyTyped(evt);
            }
        });
        AdminLab.add(txtIdentificacionAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 123, -1));

        tbladminLab.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        tbladminLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "identificacion", "Nombre de Usuario", "Contraseña", "edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbladminLab);

        AdminLab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 690, 117));

        btnInsertarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnInsertarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnInsertarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarAdmin.setText("INSERTAR");
        btnInsertarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAdminActionPerformed(evt);
            }
        });
        AdminLab.add(btnInsertarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        btnBuscarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnBuscarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdmin.setText("BUSCAR");
        btnBuscarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdminActionPerformed(evt);
            }
        });
        AdminLab.add(btnBuscarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        btnBorrarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnBorrarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarAdmin.setText("BORRAR");
        btnBorrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAdminActionPerformed(evt);
            }
        });
        AdminLab.add(btnBorrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        btnActualizarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnActualizarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnActualizarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAdmin.setText("ACTUALIZAR");
        btnActualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminActionPerformed(evt);
            }
        });
        AdminLab.add(btnActualizarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMINISTRADOR DE LABORATORIO");
        AdminLab.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adminLab.png"))); // NOI18N
        AdminLab.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 250, 230));

        getContentPane().add(AdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean camposVacios() {
        if (txtIdentificacionAdminLab.getText().isEmpty()
                || txtNombreAdminLab.getText().isEmpty()
                || txtContraAdminLab.getText().isEmpty()
                || txtUsuarioAdminLab.getText().isEmpty()
                || dateAdminLab.getDate() == null) {

            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;

    }

    private void limpiarCampos() {
        txtIdentificacionAdminLab.setText("");
        txtNombreAdminLab.setText("");
        txtContraAdminLab.setText("");
        txtUsuarioAdminLab.setText("");
        dateAdminLab.setDate(null);
    }
    
       private void cambiarCalendario() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2008); // Configura el año máximo como 2008
        cal2.set(Calendar.YEAR, 1934); // Configura el año mínimo como 1934
        dateAdminLab.setMinSelectableDate(cal2.getTime());
        dateAdminLab.setMaxSelectableDate(cal1.getTime());
        dateAdminLab.setDate(cal1.getTime());
        JTextFieldDateEditor editor4 = (JTextFieldDateEditor) dateAdminLab.getDateEditor();
        editor4.setEditable(false);
    }
    
    private void btnInsertarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAdminActionPerformed
        if(camposVacios()){
        return;
        }
        String nombre = txtNombreAdminLab.getText();
        String id = txtIdentificacionAdminLab.getText();
        Date fecha = dateAdminLab.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String nombreUsuario = txtUsuarioAdminLab.getText();
        String contrasena = String.valueOf(txtContraAdminLab.getPassword());
        Contrasena contrasenaOfi = new Contrasena(contrasena);
        AdminLaboratorio admin = new AdminLaboratorio(nombre, id, fechaNacimiento, nombreUsuario, contrasenaOfi, "AdminLab");
        try {
            control.agregarAdmin(admin);
        } catch (UsuarioExistenteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        actualizarTablaAdmin();
        limpiarCampos();
    }//GEN-LAST:event_btnInsertarAdminActionPerformed

    private void btnBuscarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdminActionPerformed
        if (txtIdentificacionAdminLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder buscar el Administrador de Laboratorio");
        }

        try {
            String id = txtIdentificacionAdminLab.getText();
            Persona persona = control.buscarPersonal(id);
            Date fecha = java.sql.Date.valueOf(persona.getFechaNacimiento());
            dateAdminLab.setDate(fecha);
            txtNombreAdminLab.setText(persona.getNombre());
            txtContraAdminLab.setText(persona.getContrasena().getIdenContrasena());
            txtUsuarioAdminLab.setText(persona.getNommbreUsuario());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el admin");
        }

    }//GEN-LAST:event_btnBuscarAdminActionPerformed

    private void btnBorrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAdminActionPerformed
         if (txtIdentificacionAdminLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder eliminar el Administrador de Laboratorio");
        }
        String id = txtIdentificacionAdminLab.getText();
        try {
            control.eliminarAdmin(id);
        } catch (UsuarioNoEncontradoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        actualizarTablaAdmin();
        limpiarCampos();
    }//GEN-LAST:event_btnBorrarAdminActionPerformed

    private void btnActualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminActionPerformed
          if(camposVacios()){
        return;
        }
        String nombre = txtNombreAdminLab.getText();
        String id = txtIdentificacionAdminLab.getText();
        Date fecha = dateAdminLab.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String nombreUsuario = txtUsuarioAdminLab.getText();
        String contrasena = String.valueOf(txtContraAdminLab.getPassword());
        Contrasena contrasenaOfi = new Contrasena(contrasena);
        AdminLaboratorio admin = new AdminLaboratorio(nombre, id, fechaNacimiento, nombreUsuario, contrasenaOfi, "AdminLab");
        try {
            control.ActualizarAdmin(admin);
        } catch (UsuarioNoEncontradoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        actualizarTablaAdmin();
        limpiarCampos();
    }//GEN-LAST:event_btnActualizarAdminActionPerformed

    private void txtUsuarioAdminLabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioAdminLabFocusLost
        if (txtUsuarioAdminLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtUsuarioAdminLabFocusLost

    private void txtContraAdminLabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraAdminLabFocusLost
        if (txtContraAdminLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtContraAdminLabFocusLost

    private void txtNombreAdminLabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreAdminLabFocusLost
        if (txtNombreAdminLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreAdminLabFocusLost

    private void txtIdentificacionAdminLabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificacionAdminLabFocusLost
        if (txtIdentificacionAdminLab.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdentificacionAdminLabFocusLost

    private void txtUsuarioAdminLabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioAdminLabKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtUsuarioAdminLabKeyTyped

    private void txtNombreAdminLabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAdminLabKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtNombreAdminLabKeyTyped

    private void txtIdentificacionAdminLabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionAdminLabKeyTyped
        char num = evt.getKeyChar();
        if (num < '0' || num > '9')
            evt.consume();
    }//GEN-LAST:event_txtIdentificacionAdminLabKeyTyped

    private void actualizarTablaAdmin() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tbladminLab.getModel();
        modeloTabla.setRowCount(0);
        AdminLaboratorio admin;
        for (int i = 0; i < control.getListaPersonas().size(); i++) {
            if (control.getListaPersonas().get(i) instanceof AdminLaboratorio) {
                admin = (AdminLaboratorio) control.getListaPersonas().get(i);
                String edad = control.calcularEdad(admin);
                String[] rowData = {
                    admin.getNombre(),
                    admin.getId(),
                    admin.getNommbreUsuario(),
                    admin.getContrasena().getIdenContrasena(),
                    edad
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbladminLab;
    private javax.swing.JPasswordField txtContraAdminLab;
    private javax.swing.JTextField txtIdentificacionAdminLab;
    private javax.swing.JTextField txtNombreAdminLab;
    private javax.swing.JTextField txtUsuarioAdminLab;
    // End of variables declaration//GEN-END:variables
}
