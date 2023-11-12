/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana.pkg7;

/**
 *
 * @author netXMM
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        bArribaIzquierda = new javax.swing.JButton();
        bAbajoIzquierda = new javax.swing.JButton();
        bArribaDerecha = new javax.swing.JButton();
        bAbajoDerecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi ventana GUI");
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(100, 100));

        bArribaIzquierda.setText("Arriba izquierda");
        bArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArribaIzquierdaActionPerformed(evt);
            }
        });

        bAbajoIzquierda.setText("Abajo izquierda");
        bAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbajoIzquierdaActionPerformed(evt);
            }
        });

        bArribaDerecha.setText("ArribaDerecha");
        bArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArribaDerechaActionPerformed(evt);
            }
        });

        bAbajoDerecha.setText("AbajoDerecha");
        bAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbajoDerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bArribaIzquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bArribaDerecha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAbajoIzquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(bAbajoDerecha)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bArribaIzquierda)
                    .addComponent(bArribaDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAbajoIzquierda)
                    .addComponent(bAbajoDerecha))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArribaIzquierdaActionPerformed
        setLocation(bArribaIzquierda.getLocation());
    }//GEN-LAST:event_bArribaIzquierdaActionPerformed

    private void bAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbajoIzquierdaActionPerformed
        setLocation(bAbajoIzquierda.getLocation());
    }//GEN-LAST:event_bAbajoIzquierdaActionPerformed

    private void bArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArribaDerechaActionPerformed
        setLocation(bArribaDerecha.getLocation());
    }//GEN-LAST:event_bArribaDerechaActionPerformed

    private void bAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbajoDerechaActionPerformed
        setLocation(bAbajoDerecha.getLocation());
    }//GEN-LAST:event_bAbajoDerechaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAbajoDerecha;
    private javax.swing.JButton bAbajoIzquierda;
    private javax.swing.JButton bArribaDerecha;
    private javax.swing.JButton bArribaIzquierda;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
