/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Utilidades.Modelo;
import Utilidades.Persona;

/**
 *
 * @author spala
 */
public class Inscripcion1 extends javax.swing.JFrame {

    /**
     * Creates new form Inscripcion1
     */
    public Inscripcion1() { 
        initComponents();
    }
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscripcion1().setVisible(true);
            }
        });
    }
    private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jTextFieldNombre = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            jTextFieldId = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            jComboBoxSexo = new javax.swing.JComboBox<>();
            jButtonAgregar = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jComboBoxEscolaridad = new javax.swing.JComboBox<>();
            jLabel8 = new javax.swing.JLabel();
            jComboBoxAvisoLegal = new javax.swing.JComboBox<>();
            jLabel9 = new javax.swing.JLabel();
            jComboBoxPrograma = new javax.swing.JComboBox<>();
            jLabel10 = new javax.swing.JLabel();
            jTextFieldIdTelefono = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
            jTextFieldCorreo = new javax.swing.JTextField();
    
            //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
            jLabel1.setFont(new java.awt.Font("Stay and Shine", 1, 24)); // NOI18N
            jLabel1.setText("Nuevo Registro");
    
            jLabel4.setText("Nombre:");
    
            jTextFieldNombre.setToolTipText("");
            jTextFieldNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            jTextFieldNombre.setName(""); // NOI18N
    
            jLabel5.setText("ID:");
    
            jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldIdActionPerformed(evt);
                }
            });
    
            jLabel6.setText("Sexo:");
    
            jComboBoxSexo.setMaximumRowCount(4);
            jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino", "Otro" }));
            jComboBoxSexo.setToolTipText("");
            jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBoxSexoActionPerformed(evt);
                }
            });
    
            jButtonAgregar.setBackground(new java.awt.Color(0, 102, 255));
            jButtonAgregar.setText("Agregar");
            jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAgregarActionPerformed(evt);
                }
            });
    
            jLabel7.setText("Nivel de escolaridad:");
    
            jComboBoxEscolaridad.setMaximumRowCount(4);
            jComboBoxEscolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Primaria", "Bachiller", "Tecnico", "Tecnologo", "Profesional", "Posgrado" }));
            jComboBoxEscolaridad.setToolTipText("");
            jComboBoxEscolaridad.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBoxEscolaridadActionPerformed(evt);
                }
            });
    
            jLabel8.setText("Aviso Legal de Protección de Datos Personales:");
    
            jComboBoxAvisoLegal.setMaximumRowCount(3);
            jComboBoxAvisoLegal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));
            jComboBoxAvisoLegal.setToolTipText("");
            jComboBoxAvisoLegal.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBoxAvisoLegalActionPerformed(evt);
                }
            });
    
            jLabel9.setText("Programa académico:");
    
            jComboBoxPrograma.setMaximumRowCount(10);
            jComboBoxPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Danza", "Drama", "Cello", "Clarinete", "Trombón", "Piano", "Violín", "Flauta", "Trompeta", "Canto" }));
            jComboBoxPrograma.setToolTipText("");
            jComboBoxPrograma.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBoxProgramaAcademicoActionPerformed(evt);
                }
            });
    
            jLabel10.setText("Télefono:");
            
            jLabel11.setText("Correo:");
            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBoxAvisoLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBoxEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBoxPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldIdTelefono)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldCorreo)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextFieldNombre)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(52, 52, 52)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(276, 276, 276))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(302, 302, 302)
                            .addComponent(jButtonAgregar)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxAvisoLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6)
                            .addGap(6, 6, 6)))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jComboBoxPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldIdTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addComponent(jButtonAgregar)
                    .addContainerGap(35, Short.MAX_VALUE))
            );
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
    
            pack();
        }// </editor-fold>                        
    
        private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {                                              
    
        }                                             
    
        private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                               
            Modelo.AGENDA.adiccionarCliente(new Persona(jTextFieldId.getText(), jTextFieldNombre.getText(), jComboBoxSexo.getSelectedItem().toString(),
            jComboBoxAvisoLegal.getSelectedItem().toString(), jComboBoxEscolaridad.getSelectedItem().toString(), jComboBoxPrograma.getSelectedItem().toString(), 
            jTextFieldIdTelefono.getText(), 0, "", 0, "", 0));
            
            jTextFieldNombre.setText("");
            jTextFieldId.setText("");
            jTextFieldIdTelefono.setText("");
            jTextFieldCorreo.setText("");
            jComboBoxSexo.setSelectedIndex(0);
            jComboBoxEscolaridad.setSelectedIndex(0);
            jComboBoxPrograma.setSelectedIndex(0);
            jComboBoxAvisoLegal.setSelectedIndex(0);
        }                                              
    
        private void jComboBoxAvisoLegalActionPerformed(java.awt.event.ActionEvent evt) {                                                       
            // TODO add your handling code here:
        }                                                      
    
        private void jComboBoxEscolaridadActionPerformed(java.awt.event.ActionEvent evt) {                                                 
            // TODO add your handling code here:
        }                                                
    
        private void jComboBoxProgramaAcademicoActionPerformed(java.awt.event.ActionEvent evt) {                                                
            // TODO add your handling code here:
        }                                               
    
        private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {                                             
            // TODO add your handling code here:
        }                                            
    
    
        // Variables declaration - do not modify                     
        private javax.swing.JButton jButtonAgregar;
        private javax.swing.JComboBox<String> jComboBoxAvisoLegal;
        private javax.swing.JComboBox<String> jComboBoxPrograma;
        private javax.swing.JComboBox<String> jComboBoxEscolaridad;
        private javax.swing.JComboBox<String> jComboBoxSexo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextFieldId;
        private javax.swing.JTextField jTextFieldIdTelefono;
        private javax.swing.JTextField jTextFieldCorreo;
        private javax.swing.JTextField jTextFieldNombre;
        // End of variables declaration 
    }
