/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author arnol
 */
public class Psp2 extends javax.swing.JFrame {

    /**
     * Creates new form Psp2
     */
    public Psp2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfContraseña = new javax.swing.JTextField();
        jbtIniciarSeccion = new javax.swing.JButton();
        jpnRegistrarse = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfContraseña1 = new javax.swing.JTextField();
        jbtRegistrarse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfUsuario2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfUsuario4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfUsuario3 = new javax.swing.JTextField();
        jtfUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfContraseña.setName("jtfContraseña"); // NOI18N

        jbtIniciarSeccion.setText("Iniciar Seccion");
        jbtIniciarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIniciarSeccionActionPerformed(evt);
            }
        });

        jpnRegistrarse.setBackground(new java.awt.Color(153, 255, 153));

        jLabel4.setText("Contraseña");

        jtfContraseña1.setName("jtfContraseña"); // NOI18N

        jbtRegistrarse.setText("Registrarse");
        jbtRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrarseActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuario");

        jtfUsuario2.setName("jtfUsuario"); // NOI18N

        jLabel7.setText("Identificacion");

        jtfUsuario4.setName("jtfUsuario"); // NOI18N

        jLabel3.setText("Nombre");

        jtfUsuario1.setName("jtfUsuario"); // NOI18N

        jLabel6.setText("Apallido");

        jtfUsuario3.setName("jtfUsuario"); // NOI18N

        javax.swing.GroupLayout jpnRegistrarseLayout = new javax.swing.GroupLayout(jpnRegistrarse);
        jpnRegistrarse.setLayout(jpnRegistrarseLayout);
        jpnRegistrarseLayout.setHorizontalGroup(
            jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtRegistrarse)
                .addGap(114, 114, 114))
            .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRegistrarseLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                                .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfUsuario1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfUsuario2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfUsuario3)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jpnRegistrarseLayout.setVerticalGroup(
            jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRegistrarseLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                        .addGroup(jpnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRegistrarseLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jbtRegistrarse)
                .addGap(32, 32, 32))
        );

        jtfUsuario.setName("jtfUsuario"); // NOI18N

        jLabel1.setText("Contraseña");

        jLabel2.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtIniciarSeccion)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jbtIniciarSeccion)
                .addGap(36, 36, 36))
            .addComponent(jpnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtIniciarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIniciarSeccionActionPerformed
        // TODO add your handling code here:
        if(true)
        {
            new Psp2().setVisible(false);
            new MenuGerente().setVisible(true);
        }
        else
        {
            new Psp2().setVisible(false);
            new MenuGerente().setVisible(true);
        }
    }//GEN-LAST:event_jbtIniciarSeccionActionPerformed

    private void jbtRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Psp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Psp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Psp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Psp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Psp2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtIniciarSeccion;
    private javax.swing.JButton jbtRegistrarse;
    private javax.swing.JPanel jpnRegistrarse;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfContraseña1;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JTextField jtfUsuario1;
    private javax.swing.JTextField jtfUsuario2;
    private javax.swing.JTextField jtfUsuario3;
    private javax.swing.JTextField jtfUsuario4;
    // End of variables declaration//GEN-END:variables
}
