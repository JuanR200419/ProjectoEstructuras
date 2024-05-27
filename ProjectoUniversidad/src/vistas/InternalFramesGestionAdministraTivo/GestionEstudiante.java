package vistas.InternalFramesGestionAdministraTivo;

import com.toedter.calendar.JTextFieldDateEditor;
import controladores.administrativo.ControladorAdminLab;
import controladores.administrativo.ControladorEstudiante;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.Contrasena;
import modelado.Enums.Programa;
import modelado.Estudiante;
import modelado.Persona;

/**
 *
 * @author Juan Manuel
 */
public class GestionEstudiante extends javax.swing.JInternalFrame {

    ControladorEstudiante control;

    public GestionEstudiante() {
        initComponents();
        this.control = new ControladorEstudiante();
        actualizarTablaEstudiante();
        JTextFieldDateEditor editor4 = (JTextFieldDateEditor) dateEstudiante.getDateEditor();
        editor4.setEditable(false);
        llenarCombo();
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

        Estudiante = new javax.swing.JPanel();
        dateEstudiante = new com.toedter.calendar.JDateChooser();
        txtIdentificacionEstudiante = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnInsertarEstudiante = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnBuscarEstudiante = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnBorrarEstudiante = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnActualizarEstudiante = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtUsuarioEstudiante = new javax.swing.JTextField();
        txtContraEstudiante = new javax.swing.JPasswordField();
        txtNombreEstudiante = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cbProgramas = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Estudiante.setBackground(new java.awt.Color(0, 39, 44));
        Estudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Estudiante.add(dateEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 136, -1));

        txtIdentificacionEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        txtIdentificacionEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtIdentificacionEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        txtIdentificacionEstudiante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificacionEstudianteFocusLost(evt);
            }
        });
        txtIdentificacionEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionEstudianteKeyTyped(evt);
            }
        });
        Estudiante.add(txtIdentificacionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 203, 199, -1));

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NOMBRE  DE  USUARIO:");
        Estudiante.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 170, -1));

        btnInsertarEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        btnInsertarEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnInsertarEstudiante.setText("INSERTAR");
        btnInsertarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEstudianteActionPerformed(evt);
            }
        });
        Estudiante.add(btnInsertarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CONTRASEÑA TEMPORAL:");
        Estudiante.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, -1));

        btnBuscarEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        btnBuscarEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscarEstudiante.setText("BUSCAR");
        btnBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudianteActionPerformed(evt);
            }
        });
        Estudiante.add(btnBuscarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NOMBRE :");
        Estudiante.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, -1));

        btnBorrarEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        btnBorrarEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrarEstudiante.setText("BORRAR");
        btnBorrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEstudianteActionPerformed(evt);
            }
        });
        Estudiante.add(btnBorrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("IDENTIFICACION:");
        Estudiante.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 206, 130, -1));

        btnActualizarEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        btnActualizarEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnActualizarEstudiante.setText("ACTUALIZAR");
        btnActualizarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstudianteActionPerformed(evt);
            }
        });
        Estudiante.add(btnActualizarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha De Nacimiento:");
        Estudiante.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txtUsuarioEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        txtUsuarioEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtUsuarioEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioEstudiante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioEstudianteFocusLost(evt);
            }
        });
        txtUsuarioEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioEstudianteKeyTyped(evt);
            }
        });
        Estudiante.add(txtUsuarioEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 61, 199, -1));

        txtContraEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        txtContraEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtContraEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        txtContraEstudiante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraEstudianteFocusLost(evt);
            }
        });
        txtContraEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraEstudianteKeyTyped(evt);
            }
        });
        Estudiante.add(txtContraEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 107, 199, -1));

        txtNombreEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        txtNombreEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtNombreEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreEstudiante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreEstudianteFocusLost(evt);
            }
        });
        txtNombreEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstudianteKeyTyped(evt);
            }
        });
        Estudiante.add(txtNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 156, 199, -1));

        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "identificacion", "Nombre de Usuario", "Contraseña", "Programa", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblEstudiante);

        Estudiante.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 680, 192));

        jLabel16.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PROGRAMA:");
        Estudiante.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 251, 110, -1));

        cbProgramas.setBackground(new java.awt.Color(71, 100, 104));
        cbProgramas.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbProgramas.setForeground(new java.awt.Color(255, 255, 255));
        Estudiante.add(cbProgramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 248, 270, -1));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE ESTUDIANTES");
        Estudiante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 340, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumno.png"))); // NOI18N
        Estudiante.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 130, 150));

        getContentPane().add(Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCombo() {
        cbProgramas.removeAllItems();
        for (Programa value : Programa.values()) {
            cbProgramas.addItem(value);
        }
    }

    private void cambiarCalendario() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2008); // Configura el año máximo como 2008
        cal2.set(Calendar.YEAR, 1934); // Configura el año mínimo como 1934
        dateEstudiante.setMinSelectableDate(cal2.getTime());
        dateEstudiante.setMaxSelectableDate(cal1.getTime());
        dateEstudiante.setDate(cal1.getTime());
        JTextFieldDateEditor editor4 = (JTextFieldDateEditor) dateEstudiante.getDateEditor();
        editor4.setEditable(false);
    }

    private boolean camposVacios() {
        if (txtNombreEstudiante.getText().isEmpty()
                || txtIdentificacionEstudiante.getText().isEmpty()
                || txtUsuarioEstudiante.getText().isEmpty()
                || txtContraEstudiante.getPassword().length == 0
                || dateEstudiante.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    private void limpiar() {
    txtIdentificacionEstudiante.setText("");
    txtNombreEstudiante.setText("");
    txtContraEstudiante.setText("");
    txtUsuarioEstudiante.setText("");
    LocalDate fechaActual = LocalDate.now();
    dateEstudiante.setDate(java.sql.Date.valueOf(fechaActual));
}
    

    private void btnInsertarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEstudianteActionPerformed
        if (camposVacios()) {
            return;
        }

        String nombreUser = txtUsuarioEstudiante.getText();
        String contrasena = String.valueOf(txtContraEstudiante.getPassword());
        String nombre = txtNombreEstudiante.getText();
        String id = txtIdentificacionEstudiante.getText();
        Date fecha = dateEstudiante.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        Programa programa = (Programa) cbProgramas.getSelectedItem();
        Contrasena contrasenaOfi = new Contrasena(contrasena);
        Estudiante estudi = new Estudiante(programa, nombre, id, fechaNacimiento, nombreUser, contrasenaOfi, "Estudiante");
        control.agregarEstudiante(estudi);
        actualizarTablaEstudiante();
        limpiar();
    }//GEN-LAST:event_btnInsertarEstudianteActionPerformed
    private void actualizarTablaEstudiante() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEstudiante.getModel();
        modeloTabla.setRowCount(0);
        Estudiante estudiante;
        
        for (int i = 0; i < control.getListaPersonas().size(); i++) {
            if (control.getListaPersonas().get(i) instanceof Estudiante) {
                estudiante = (Estudiante) control.getListaPersonas().get(i);
               String edad= control.calcularEdad(estudiante);
                String[] rowData = {
                    estudiante.getNombre(),
                    estudiante.getId(),
                    estudiante.getNommbreUsuario(),
                    estudiante.getContrasena().getIdenContrasena(),
                    estudiante.getPrograma().toString(),
                    edad
                };
                modeloTabla.addRow(rowData);
            }

        }
        tblEstudiante.setModel(modeloTabla);
        tblEstudiante.revalidate();
    }
    private void btnBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteActionPerformed
        if (txtIdentificacionEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder buscar el usuario");
        }
        String id = txtIdentificacionEstudiante.getText();
        Persona persona = control.buscarPersonal(id);
        if (persona instanceof Estudiante) {
            Date fecha = java.sql.Date.valueOf(persona.getFechaNacimiento());
            dateEstudiante.setDate(fecha);
            txtNombreEstudiante.setText(persona.getNombre());
            txtContraEstudiante.setText(persona.getContrasena().getIdenContrasena());
            txtUsuarioEstudiante.setText(persona.getNommbreUsuario());
            cbProgramas.setSelectedItem(((Estudiante) persona).getPrograma());
        }

    }//GEN-LAST:event_btnBuscarEstudianteActionPerformed

    private void btnBorrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEstudianteActionPerformed
        if (txtIdentificacionEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene el campo del id para poder borrar el usuario");
        }
        String id = txtIdentificacionEstudiante.getText();
        control.eliminarEstudiante(id);
        actualizarTablaEstudiante();
        limpiar();
    }//GEN-LAST:event_btnBorrarEstudianteActionPerformed

    private void btnActualizarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstudianteActionPerformed
        if (camposVacios()) {
            return;
        }
        String nombreUser = txtUsuarioEstudiante.getText();
        String contrasena = String.valueOf(txtContraEstudiante.getPassword());
        String nombre = txtNombreEstudiante.getText();
        String id = txtIdentificacionEstudiante.getText();
        Date fecha = dateEstudiante.getDate();
        LocalDate fechaNacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        Programa program = (Programa) cbProgramas.getSelectedItem();
        Contrasena contrasenaOfi = new Contrasena(contrasena);
        Estudiante estudi = new Estudiante(program, nombre, id, fechaNacimiento, nombreUser, contrasenaOfi, "Estudiante");
        control.ActualizarEstudiante(estudi);
        actualizarTablaEstudiante();
        limpiar();
    }//GEN-LAST:event_btnActualizarEstudianteActionPerformed

    private void txtUsuarioEstudianteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioEstudianteFocusLost
        if (txtUsuarioEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtUsuarioEstudianteFocusLost

    private void txtUsuarioEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioEstudianteKeyTyped
         char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtUsuarioEstudianteKeyTyped

    private void txtContraEstudianteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraEstudianteFocusLost
        if (txtContraEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtContraEstudianteFocusLost

    private void txtNombreEstudianteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreEstudianteFocusLost
        if (txtNombreEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreEstudianteFocusLost

    private void txtIdentificacionEstudianteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificacionEstudianteFocusLost
        if (txtIdentificacionEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdentificacionEstudianteFocusLost

    private void txtContraEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraEstudianteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraEstudianteKeyTyped

    private void txtNombreEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstudianteKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtNombreEstudianteKeyTyped

    private void txtIdentificacionEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionEstudianteKeyTyped
        char num = evt.getKeyChar();
        if (num < '0' || num > '9')
            evt.consume();
    }//GEN-LAST:event_txtIdentificacionEstudianteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Estudiante;
    private javax.swing.JButton btnActualizarEstudiante;
    private javax.swing.JButton btnBorrarEstudiante;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JButton btnInsertarEstudiante;
    private javax.swing.JComboBox cbProgramas;
    private com.toedter.calendar.JDateChooser dateEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEstudiante;
    private javax.swing.JPasswordField txtContraEstudiante;
    private javax.swing.JTextField txtIdentificacionEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtUsuarioEstudiante;
    // End of variables declaration//GEN-END:variables
}
