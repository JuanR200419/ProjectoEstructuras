/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasPrincipales;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import controladores.administrativo.ControladorRegistroAdministrativo;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.AdminLaboratorio;
import modelado.Administrativo;
import modelado.Contrasena;
import modelado.Persona;

/**
 *
 * @author Juan Manuel
 */
public class RegistroAdministrativo extends javax.swing.JFrame {

    ControladorRegistroAdministrativo control;

    public RegistroAdministrativo() {
        initComponents();
        cambiarCalendario();
        this.control = new ControladorRegistroAdministrativo();
        actualizarTablaAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuarioAdmin = new javax.swing.JTextField();
        txtContraAdmin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        txtIdentificacionAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateAdmin = new com.toedter.calendar.JDateChooser();
        btnInsertarAdmin = new javax.swing.JButton();
        btnBorrarAdmin = new javax.swing.JButton();
        btnBuscarAdmin = new javax.swing.JButton();
        btnActualizarAdmin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 39, 44));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(0, 39, 44));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE  DE  USUARIO:");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        txtUsuarioAdmin.setBackground(new java.awt.Color(71, 100, 104));
        txtUsuarioAdmin.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtUsuarioAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioAdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioAdminFocusLost(evt);
            }
        });
        txtUsuarioAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioAdminKeyTyped(evt);
            }
        });
        Panel.add(txtUsuarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 110, -1));

        txtContraAdmin.setBackground(new java.awt.Color(71, 100, 104));
        txtContraAdmin.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtContraAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtContraAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraAdminFocusLost(evt);
            }
        });
        Panel.add(txtContraAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 110, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA :");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE :");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        txtNombreAdmin.setBackground(new java.awt.Color(71, 100, 104));
        txtNombreAdmin.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtNombreAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreAdminFocusLost(evt);
            }
        });
        txtNombreAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAdminKeyTyped(evt);
            }
        });
        Panel.add(txtNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 110, -1));

        txtIdentificacionAdmin.setBackground(new java.awt.Color(71, 100, 104));
        txtIdentificacionAdmin.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtIdentificacionAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtIdentificacionAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificacionAdminFocusLost(evt);
            }
        });
        txtIdentificacionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionAdminActionPerformed(evt);
            }
        });
        txtIdentificacionAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionAdminKeyTyped(evt);
            }
        });
        Panel.add(txtIdentificacionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDENTIFICACION");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha De Nacimiento");
        Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        dateAdmin.setBackground(new java.awt.Color(71, 100, 104));
        dateAdmin.setForeground(new java.awt.Color(71, 100, 104));
        Panel.add(dateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 120, -1));

        btnInsertarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnInsertarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnInsertarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarAdmin.setText("INSERTAR");
        btnInsertarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAdminActionPerformed(evt);
            }
        });
        Panel.add(btnInsertarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        btnBorrarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnBorrarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarAdmin.setText("BORRAR");
        btnBorrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAdminActionPerformed(evt);
            }
        });
        Panel.add(btnBorrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        btnBuscarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnBuscarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdmin.setText("BUSCAR");
        btnBuscarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdminActionPerformed(evt);
            }
        });
        Panel.add(btnBuscarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        btnActualizarAdmin.setBackground(new java.awt.Color(71, 100, 104));
        btnActualizarAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnActualizarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAdmin.setText("ACTUALIZAR");
        btnActualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminActionPerformed(evt);
            }
        });
        Panel.add(btnActualizarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrativo.png"))); // NOI18N
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 60, 90));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel6.setText("REGISTRO DEL ADMINISTRATIVO");
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 300, -1));

        jButton1.setBackground(new java.awt.Color(71, 100, 104));
        jButton1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tblAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblAdmin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        tblAdmin.setForeground(new java.awt.Color(0, 0, 0));
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Identificacion", "Nombre de Usuario ", "Contraseña", "Edad"
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
        tblAdmin.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblAdmin);
        if (tblAdmin.getColumnModel().getColumnCount() > 0) {
            tblAdmin.getColumnModel().getColumn(0).setResizable(false);
            tblAdmin.getColumnModel().getColumn(1).setResizable(false);
            tblAdmin.getColumnModel().getColumn(2).setResizable(false);
            tblAdmin.getColumnModel().getColumn(3).setResizable(false);
            tblAdmin.getColumnModel().getColumn(4).setResizable(false);
        }

        Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 588, 100));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarCalendario() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2008); // Configura el año máximo como 2008
        cal2.set(Calendar.YEAR, 1934); // Configura el año mínimo como 1934
        dateAdmin.setMinSelectableDate(cal2.getTime());
        dateAdmin.setMaxSelectableDate(cal1.getTime());
        dateAdmin.setDate(cal1.getTime());
        JTextFieldDateEditor editor4 = (JTextFieldDateEditor) dateAdmin.getDateEditor();
        editor4.setEditable(false);
    }


    private void btnInsertarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAdminActionPerformed
        if (camposVacios()) {
            return;
        }
        String nombre = txtNombreAdmin.getText();
        String id = txtIdentificacionAdmin.getText();
        Date fecha = dateAdmin.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String nombreUsuario = txtUsuarioAdmin.getText();
        String contrasena = String.valueOf(txtContraAdmin.getPassword());
        Contrasena contrasenaOfi = new Contrasena(contrasena);
        Administrativo admin = new Administrativo(nombre, id, fechaNacimiento, nombreUsuario, contrasenaOfi, "administrativo");
        control.agregarAdmin(admin);
        actualizarTablaAdmin();
        limpiar();
    }//GEN-LAST:event_btnInsertarAdminActionPerformed

    private boolean camposVacios() {
        if (txtNombreAdmin.getText().isEmpty() || txtIdentificacionAdmin.getText().isEmpty() || txtUsuarioAdmin.getText().isEmpty() || txtContraAdmin.getPassword().length == 0 || dateAdmin.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;

    }

    private void limpiar() {
        txtIdentificacionAdmin.setText("");
        txtNombreAdmin.setText("");
        txtContraAdmin.setText("");
        txtUsuarioAdmin.setText("");
        LocalDate fechaActual = LocalDate.now();
        dateAdmin.setDate(java.sql.Date.valueOf(fechaActual));
    }
    private void btnBorrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAdminActionPerformed
        if (txtIdentificacionAdmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder borrar el usuario");
        }
        String id = txtIdentificacionAdmin.getText();
        control.eliminarAdmin(id);
        actualizarTablaAdmin();
        limpiar();
    }//GEN-LAST:event_btnBorrarAdminActionPerformed
    private void actualizarTablaAdmin() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAdmin.getModel();
        modeloTabla.setRowCount(0);
        Administrativo admin;
        for (int i = 0; i < control.getListaPersonas().size(); i++) {
            if (control.getListaPersonas().get(i).getRol().equals("administrativo")) {
                admin = (Administrativo) control.getListaPersonas().get(i);
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
        tblAdmin.setModel(modeloTabla);
        tblAdmin.revalidate();
    }
    private void btnBuscarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdminActionPerformed
        if (txtIdentificacionAdmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder buscar el Administrador de Laboratorio");
        }

        try {
            String id = txtIdentificacionAdmin.getText();
            Persona persona = control.buscarPersonal(id);
            Date fecha = java.sql.Date.valueOf(persona.getFechaNacimiento());
            dateAdmin.setDate(fecha);
            txtNombreAdmin.setText(persona.getNombre());
            txtContraAdmin.setText(persona.getContrasena().getIdenContrasena());
            txtUsuarioAdmin.setText(persona.getNommbreUsuario());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el admin");
        }

    }//GEN-LAST:event_btnBuscarAdminActionPerformed

    private void btnActualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminActionPerformed
        if (camposVacios()) {
            return;
        }
        String nombre = txtNombreAdmin.getText();
        String id = txtIdentificacionAdmin.getText();
        Date fecha = dateAdmin.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        String nombreUsuario = txtUsuarioAdmin.getText();
        String contrasena = String.valueOf(txtContraAdmin.getPassword());
        Contrasena contrasenaOfi = new Contrasena(contrasena);
        Administrativo admin = new Administrativo(nombre, id, fechaNacimiento, nombreUsuario, contrasenaOfi, "administrativo");
        control.ActualizarAdmin(admin);
        actualizarTablaAdmin();
        limpiar();
    }//GEN-LAST:event_btnActualizarAdminActionPerformed

    private void txtIdentificacionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdentificacionAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionAdminKeyTyped
        char num = evt.getKeyChar();
        if (num < '0' || num > '9')
            evt.consume();
    }//GEN-LAST:event_txtIdentificacionAdminKeyTyped

    private void txtUsuarioAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioAdminKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtUsuarioAdminKeyTyped

    private void txtNombreAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAdminKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtNombreAdminKeyTyped

    private void txtUsuarioAdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioAdminFocusGained

    }//GEN-LAST:event_txtUsuarioAdminFocusGained

    private void txtUsuarioAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioAdminFocusLost
        if (txtUsuarioAdmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtUsuarioAdminFocusLost

    private void txtContraAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraAdminFocusLost
        if (txtContraAdmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtContraAdminFocusLost

    private void txtNombreAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreAdminFocusLost
        if (txtNombreAdmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreAdminFocusLost

    private void txtIdentificacionAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificacionAdminFocusLost
        if (txtIdentificacionAdmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdentificacionAdminFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAdministrativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnActualizarAdmin;
    private javax.swing.JButton btnBorrarAdmin;
    private javax.swing.JButton btnBuscarAdmin;
    private javax.swing.JButton btnInsertarAdmin;
    private com.toedter.calendar.JDateChooser dateAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JPasswordField txtContraAdmin;
    private javax.swing.JTextField txtIdentificacionAdmin;
    private javax.swing.JTextField txtNombreAdmin;
    private javax.swing.JTextField txtUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
