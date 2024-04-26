/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.InternalFramesGestionAdministraTivo;

import com.toedter.calendar.JTextFieldDateEditor;
import controladores.administrativo.ControladorAdminLab;
import controladores.administrativo.ControladorDocente;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.Contrasena;
import modelado.Docente;
import modelado.Persona;

/**
 *
 * @author Juan Manuel
 */
public class GestionDocente extends javax.swing.JInternalFrame {

    ControladorDocente control;
    public GestionDocente() {
        initComponents();
           this.control = new ControladorDocente();
           actualizarTablaDocente();
             JTextFieldDateEditor editor3 = (JTextFieldDateEditor) dateDocente.getDateEditor();
        editor3.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Docente = new javax.swing.JPanel();
        dateDocente = new com.toedter.calendar.JDateChooser();
        txtIdentificacionDocente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnInsertarDocente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarDocente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnBorrarDocente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnActualizarDocente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtUsuarioDocente = new javax.swing.JTextField();
        txtContraDocente = new javax.swing.JPasswordField();
        txtNombreDocente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDocente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Docente.setBackground(new java.awt.Color(0, 39, 44));
        Docente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Docente.add(dateDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 136, -1));

        txtIdentificacionDocente.setBackground(new java.awt.Color(71, 100, 104));
        txtIdentificacionDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtIdentificacionDocente.setForeground(new java.awt.Color(255, 255, 255));
        Docente.add(txtIdentificacionDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 123, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE  DE  USUARIO:");
        Docente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 190, -1));

        btnInsertarDocente.setBackground(new java.awt.Color(71, 100, 104));
        btnInsertarDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnInsertarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarDocente.setText("INSERTAR");
        btnInsertarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarDocenteActionPerformed(evt);
            }
        });
        Docente.add(btnInsertarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTRASEÑA TEMPORAL:");
        Docente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 200, -1));

        btnBuscarDocente.setBackground(new java.awt.Color(71, 100, 104));
        btnBuscarDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDocente.setText("BUSCAR");
        btnBuscarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocenteActionPerformed(evt);
            }
        });
        Docente.add(btnBuscarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMBRE :");
        Docente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, -1));

        btnBorrarDocente.setBackground(new java.awt.Color(71, 100, 104));
        btnBorrarDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarDocente.setText("BORRAR");
        btnBorrarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDocenteActionPerformed(evt);
            }
        });
        Docente.add(btnBorrarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IDENTIFICACION");
        Docente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 130, -1));

        btnActualizarDocente.setBackground(new java.awt.Color(71, 100, 104));
        btnActualizarDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnActualizarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDocente.setText("ACTUALIZAR");
        btnActualizarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDocenteActionPerformed(evt);
            }
        });
        Docente.add(btnActualizarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha De Nacimiento");
        Docente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        txtUsuarioDocente.setBackground(new java.awt.Color(71, 100, 104));
        txtUsuarioDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtUsuarioDocente.setForeground(new java.awt.Color(255, 255, 255));
        Docente.add(txtUsuarioDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 123, -1));

        txtContraDocente.setBackground(new java.awt.Color(71, 100, 104));
        txtContraDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtContraDocente.setForeground(new java.awt.Color(255, 255, 255));
        Docente.add(txtContraDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 123, -1));

        txtNombreDocente.setBackground(new java.awt.Color(71, 100, 104));
        txtNombreDocente.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtNombreDocente.setForeground(new java.awt.Color(255, 255, 255));
        Docente.add(txtNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 123, -1));

        tblDocente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDocente);

        Docente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 650, 170));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE DOCENTE");
        Docente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        Docente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 290, 240));

        getContentPane().add(Docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -5, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarDocenteActionPerformed
        String nombreUser = txtUsuarioDocente.getText();
        String contrasena = String.valueOf(txtContraDocente.getPassword());
        String nombre = txtNombreDocente.getText();
        String id = txtIdentificacionDocente.getText();
        // para agarrar el dia por medio de DATE
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date fecha = dateDocente.getDate();
        System.out.println(sdf.format(dateDocente.getDate()));
        Contrasena contrasenaOfi =new Contrasena(contrasena);
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        Docente docente = new Docente(nombre, id, fechaNacimiento, nombreUser, contrasenaOfi,"Docente");
        control.agregarDocente(docente);
        actualizarTablaDocente();
    }//GEN-LAST:event_btnInsertarDocenteActionPerformed
      private void actualizarTablaDocente() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblDocente.getModel();
        modeloTabla.setRowCount(0);
        Docente docente;
        for (int i = 0; i < control.getListaPersonas().size(); i++) {
            if (control.getListaPersonas().get(i) instanceof Docente) {
                docente = (Docente) control.getListaPersonas().get(i);
                String[] rowData = {
                    docente.getNombre(),
                    docente.getId(),
                    docente.getNommbreUsuario(),
                    docente.getContrasena().getIdenContrasena()
                };
                modeloTabla.addRow(rowData);
            }

        }
        tblDocente.setModel(modeloTabla);
        tblDocente.revalidate();
    }
    private void btnBuscarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocenteActionPerformed

        try {
            String id = txtIdentificacionDocente.getText();
            Persona persona = control.buscarPersonal(id);
            Date fecha = java.sql.Date.valueOf(persona.getFechaNacimiento());
            dateDocente.setDate(fecha);
            txtNombreDocente.setText(persona.getNombre());
            txtContraDocente.setText(persona.getContrasena().getIdenContrasena());
            txtUsuarioDocente.setText(persona.getNommbreUsuario());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el Docente");
        }
    }//GEN-LAST:event_btnBuscarDocenteActionPerformed

    private void btnBorrarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDocenteActionPerformed
        if (txtIdentificacionDocente.equals("")) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder borrar el usuario");
        }
        String id = txtIdentificacionDocente.getText();
        control.eliminarDocente(id);
        actualizarTablaDocente();
    }//GEN-LAST:event_btnBorrarDocenteActionPerformed

    private void btnActualizarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDocenteActionPerformed
        String nombreUser = txtUsuarioDocente.getText();
        String contrasena = String.valueOf(txtContraDocente.getPassword());
        String nombre = txtNombreDocente.getText();
        String id = txtIdentificacionDocente.getText();
        Date fecha = dateDocente.getDate();
        Contrasena contrasenaOfi =new Contrasena(contrasena);
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        Docente docente = new Docente(nombre, id, fechaNacimiento, nombreUser, contrasenaOfi,"Docente");
        control.ActualizarDocente(docente);
        actualizarTablaDocente();
    }//GEN-LAST:event_btnActualizarDocenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Docente;
    private javax.swing.JButton btnActualizarDocente;
    private javax.swing.JButton btnBorrarDocente;
    private javax.swing.JButton btnBuscarDocente;
    private javax.swing.JButton btnInsertarDocente;
    private com.toedter.calendar.JDateChooser dateDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDocente;
    private javax.swing.JPasswordField txtContraDocente;
    private javax.swing.JTextField txtIdentificacionDocente;
    private javax.swing.JTextField txtNombreDocente;
    private javax.swing.JTextField txtUsuarioDocente;
    // End of variables declaration//GEN-END:variables
}
