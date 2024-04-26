/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.InternalFramesGestionAdministraTivo;

import controladores.administrativo.ControladorAsginarEstudiante;
import controladores.administrativo.ControladorCurso;
import javax.swing.table.DefaultTableModel;
import modelado.Curso;
import modelado.Enums.Materia;
import modelado.Estudiante;
import modelado.Horario;
import modelado.Persona;
import util.IList;

/**
 *
 * @author Juan Manuel
 */
public class AsignacionEstudiante extends javax.swing.JInternalFrame {

    ControladorCurso controlCurso;
    ControladorAsginarEstudiante control;

    public AsignacionEstudiante() {
        initComponents();
        this.controlCurso = new ControladorCurso();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnExpulsion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbJornada = new javax.swing.JComboBox<>();
        cbEstudiante = new javax.swing.JComboBox<>();
        cbCursos = new javax.swing.JComboBox<>();
        cbHorario = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 39, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HORARIO:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cursos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, -1));

        btnAgregar.setBackground(new java.awt.Color(71, 100, 104));
        btnAgregar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Asignacion");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        btnExpulsion.setBackground(new java.awt.Color(71, 100, 104));
        btnExpulsion.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnExpulsion.setForeground(new java.awt.Color(255, 255, 255));
        btnExpulsion.setText("Expulsion");
        btnExpulsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpulsionActionPerformed(evt);
            }
        });
        jPanel1.add(btnExpulsion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(71, 100, 104));
        btnBuscar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estudiantes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jLabel28.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("JORNADA:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cbJornada.setBackground(new java.awt.Color(71, 100, 104));
        cbJornada.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbJornada.setForeground(new java.awt.Color(255, 255, 255));
        cbJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Noche" }));
        cbJornada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJornadaItemStateChanged(evt);
            }
        });
        cbJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJornadaActionPerformed(evt);
            }
        });
        jPanel1.add(cbJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 350, -1));

        cbEstudiante.setBackground(new java.awt.Color(71, 100, 104));
        cbEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cbEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 350, -1));

        cbCursos.setBackground(new java.awt.Color(71, 100, 104));
        cbCursos.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbCursos.setForeground(new java.awt.Color(255, 255, 255));
        cbCursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursosItemStateChanged(evt);
            }
        });
        jPanel1.add(cbCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 350, -1));

        cbHorario.setBackground(new java.awt.Color(71, 100, 104));
        cbHorario.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbHorario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cbHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 350, -1));

        tblEstudiante.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        tblEstudiante.setForeground(new java.awt.Color(0, 0, 0));
        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "identificacion", "Nombre de Usuario", "Contraseña", "Programa"
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
        jScrollPane3.setViewportView(tblEstudiante);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 860, 192));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ASIGNACION DE ESTUDIANTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esrudiante.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 90, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     Estudiante estudi =(Estudiante)   cbEstudiante.getSelectedItem();
        this.control.asignarEstudiante(estudi);
        Curso curso = (Curso) cbCursos.getSelectedItem();
        actualizarTablaEstudiante(curso);

    }//GEN-LAST:event_btnAgregarActionPerformed
    private void llenarCombo() {
        cbCursos.removeAll();
        for (int i = 0; i < controlCurso.getListaCursos().size(); i++) {
            cbCursos.addItem(controlCurso.getListaCursos().get(i));
        }
        cbEstudiante.removeAllItems();
        IList<Persona> lista = controlCurso.getListaPersonas();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Estudiante) {
                cbEstudiante.addItem((Estudiante) lista.get(i));
            }
        }
    }

    private void llenarHorarios(String codigo, String jornada) {
        cbHorario.removeAllItems();
        for (int i = 0; i < controlCurso.getListaCursos().size(); i++) {
            if (controlCurso.getListaCursos().get(i).getCodigoDeCurso().equals(codigo)) {
                for (int j = 0; j < controlCurso.getListaCursos().get(i).getHorariosEstablecidos().size(); j++) {
                    if (controlCurso.getListaCursos().get(i).getJornada().equals(jornada)) {
                        cbHorario.addItem(controlCurso.getListaCursos().get(i).getHorariosEstablecidos().get(j));
                    }
                }

            }
        }
    }
    
           private void actualizarTablaEstudiante(Curso curso) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEstudiante.getModel();
        modeloTabla.setRowCount(0);
        Estudiante estudiante;
        for (int i = 0; i < curso.getListaEstudiantes().size(); i++) {
            if (curso.getListaEstudiantes().get(i) instanceof Estudiante) {
                estudiante = (Estudiante) curso.getListaEstudiantes().get(i);
                String[] rowData = {
                    estudiante.getNombre(),
                    estudiante.getId(),
                    estudiante.getNommbreUsuario(),
                    estudiante.getContrasena().getIdenContrasena(),
                    estudiante.getPrograma().toString()
                };
                modeloTabla.addRow(rowData);
            }

        }
        tblEstudiante.setModel(modeloTabla);
        tblEstudiante.revalidate();
    }
    
    
    
    private void btnExpulsionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpulsionActionPerformed
     Estudiante estudi =(Estudiante)   cbEstudiante.getSelectedItem();
        this.control.quitarCursoEstudiante(estudi.getId());
           Curso curso = (Curso) cbCursos.getSelectedItem();
        actualizarTablaEstudiante(curso);
    }//GEN-LAST:event_btnExpulsionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJornadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJornadaActionPerformed

    private void cbCursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursosItemStateChanged

        Curso curso = (Curso) cbCursos.getSelectedItem();
        String jornada = cbJornada.getSelectedItem().toString();
        llenarHorarios(curso.getCodigoDeCurso(), jornada);
        actualizarTablaEstudiante(curso);
        this.control = new ControladorAsginarEstudiante(curso);

    }//GEN-LAST:event_cbCursosItemStateChanged

    private void cbJornadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbJornadaItemStateChanged
        Curso curso = (Curso) cbCursos.getSelectedItem();
        String jornada = cbJornada.getSelectedItem().toString();
        llenarHorarios(curso.getCodigoDeCurso(), jornada);
    }//GEN-LAST:event_cbJornadaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExpulsion;
    private javax.swing.JComboBox<Curso> cbCursos;
    private javax.swing.JComboBox<Estudiante> cbEstudiante;
    private javax.swing.JComboBox<Horario> cbHorario;
    private javax.swing.JComboBox<String> cbJornada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEstudiante;
    // End of variables declaration//GEN-END:variables
}
