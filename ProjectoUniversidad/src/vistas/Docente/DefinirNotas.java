/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.Docente;

import controladores.Docente.controladorDefinirNotas;

import controladores.administrativo.ControladorCurso;
import excepciones.ExcesoNotasException;
import excepciones.NotaExistenteException;
import excepciones.completarPorcentajeException;
import excepciones.porcentajeElevadoException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelado.Curso;
import modelado.Docente;
import modelado.Nota;

/**
 *
 * @author Juan Manuel
 */
public class DefinirNotas extends javax.swing.JFrame {

    Docente docente;
    controladorDefinirNotas controlNotas;
    ControladorCurso control;
    Curso curso;

    public DefinirNotas(Docente docente) {
        initComponents();
        this.control = new ControladorCurso();
        this.docente = docente;
        llenarCombo();

    }
// la nota tiene una lista de detalles

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbCursos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JFormattedTextField();
        btnBorra = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDescripcionNota1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setText("DEFINIR NOTAS DEL CURSO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 350, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbCursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursosItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setText("CURSO");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setText("NOTA  :");

        txtNota1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtNota1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtNota1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNota1FocusLost(evt);
            }
        });
        txtNota1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtNota1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNota1InputMethodTextChanged(evt);
            }
        });
        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNota1KeyPressed(evt);
            }
        });

        btnBorra.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnBorra.setText("BORRAR");
        btnBorra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorraActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnAgregar.setText("AÑADIR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("Descripcion");

        txtDescripcionNota1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtDescripcionNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionNota1ActionPerformed(evt);
            }
        });
        txtDescripcionNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionNota1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setText("Porcentaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAgregar)
                                            .addComponent(btnBorra))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDescripcionNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorra)
                    .addComponent(btnBuscar))
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 480, 220));

        btnAtras.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tbNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Porcentaje", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbNotas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 240, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean camposVacios() {
        if (txtNota1.getText().isEmpty()
                || txtDescripcionNota1.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Todos los campos de notas son obligatorios", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    private void limpiarCampos() {
        txtNota1.setText("");
        txtDescripcionNota1.setText("");
    }

       private void actualizarTablaEstudiante(Curso curso) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tbNotas.getModel();
        modeloTabla.setRowCount(0);
        for (int j = 0; j < curso.getListaNotas().size(); j++) {
                String[] rowData = {                 
                    // abajo de esto va la nota 1 
                    String.valueOf(curso.getListaNotas().get(j).getPorcentaje()),
                    // abajo de esto va la nota 2 
                    String.valueOf(curso.getListaNotas().get(j).getDescripcion())
                // abajo de esto va la nota 3 
                };
                modeloTabla.addRow(rowData);
        }
        tbNotas.setModel(modeloTabla);
        tbNotas.revalidate();
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            if (camposVacios()) {
                return;
            }
            double nota1 = Double.parseDouble(txtNota1.getText().replace(",", "."));
            String decripcion1 = txtDescripcionNota1.getText();
            Nota notaUno = new Nota(decripcion1, nota1);
            controlNotas.definirNota(notaUno);
            JOptionPane.showMessageDialog(null, "Se guardaron las notas");
            limpiarCampos();
            actualizarTablaEstudiante(curso);
        } catch (porcentajeElevadoException | ExcesoNotasException | NotaExistenteException |completarPorcentajeException  ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_btnAgregarActionPerformed
    private void llenarCombo() {
        cbCursos.removeAll();
        String perioso = control.validarPeriodoAnio();
        for (int i = 0; i < control.getListaCursos().size(); i++) {
            if (control.getListaCursos().get(i).getDocente().getId().equals(docente.getId())
                    &&control.getListaCursos().get(i).getPeriodo().equals(perioso) ) {
                cbCursos.addItem(control.getListaCursos().get(i));
            }
        }
    }

    private void cbCursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursosItemStateChanged
        this.curso = (Curso) cbCursos.getSelectedItem();
        this.controlNotas = new controladorDefinirNotas(curso, docente);
        actualizarTablaEstudiante(curso);
    }//GEN-LAST:event_cbCursosItemStateChanged

    private void txtDescripcionNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionNota1ActionPerformed

    private void txtDescripcionNota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionNota1KeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtDescripcionNota1KeyTyped

    private void txtNota1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNota1InputMethodTextChanged

    }//GEN-LAST:event_txtNota1InputMethodTextChanged

    private void txtNota1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNota1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1CaretPositionChanged

    private void txtNota1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota1KeyPressed

    }//GEN-LAST:event_txtNota1KeyPressed

    private void txtNota1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNota1FocusLost
        String textoNota = txtNota1.getText();
        String regex = "^[-+]?[0-9]*\\.?[0-9]+$"; // Expresión regular para números decimales
        boolean esValido = Pattern.matches(regex, textoNota);
        if (!esValido) {
            JOptionPane.showMessageDialog(this, "Solo se pueden colocarDecimales", "Campos Invalido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNota1FocusLost

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        DocenteInicial o = new DocenteInicial(docente);
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       String descri = txtDescripcionNota1.getText();
       double porcentaje = Double.parseDouble(txtNota1.getText().replace(",", "."));
       controlNotas.editarNota(descri, porcentaje);
        actualizarTablaEstudiante(curso);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         double  porcentaje;
          String descripcion;       
        int selectedRow = tbNotas.getSelectedRow();
        if (selectedRow != -1) {
            Object selectedValue = tbNotas.getValueAt(selectedRow, 0);
            Object selectedValue2 = tbNotas.getValueAt(selectedRow, 1);
            
            System.out.println(selectedValue);      
            if (selectedValue != null) {
                porcentaje = Double.parseDouble(selectedValue.toString());
               descripcion = selectedValue2.toString();
              
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar en la tabla la nota que desea buscar");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar en la tabla la nota que desea buscar");
            return;
        }
        Nota nota = controlNotas.buscarNota(descripcion,porcentaje);
        txtNota1.setText(String.valueOf(nota.getPorcentaje()));
        txtDescripcionNota1.setText(nota.getDescripcion());      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorraActionPerformed
         String descri = txtDescripcionNota1.getText();
       double porcentaje = Double.parseDouble(txtNota1.getText().replace(",", "."));
       controlNotas.borrarNota(descri, porcentaje);
        actualizarTablaEstudiante(curso);
    }//GEN-LAST:event_btnBorraActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorra;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<Curso> cbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNotas;
    private javax.swing.JTextField txtDescripcionNota1;
    private javax.swing.JFormattedTextField txtNota1;
    // End of variables declaration//GEN-END:variables
}
