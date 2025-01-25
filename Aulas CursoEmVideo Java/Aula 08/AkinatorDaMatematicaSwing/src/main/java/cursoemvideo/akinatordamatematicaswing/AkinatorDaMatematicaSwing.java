/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoemvideo.akinatordamatematicaswing;

/**
 *
 * 
 * @author Berg
 */
public class AkinatorDaMatematicaSwing extends javax.swing.JFrame {

    /**
     * Creates new form AkinatorDaMatematicaSwing
     */
    public AkinatorDaMatematicaSwing() {
        initComponents();
        lblRes.setText("<html>Vou Pensar em um valor entre <strong>1</strong> e <strong>5</strong>. Tente Adivinhar</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValor = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdivinhar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 80, 38));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 37, -1, -1));

        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRes.setText("Olá Eu ");
        lblRes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, 60));

        jLabel4.setText("Escolha um  Número");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        btnAdivinhar.setAction(btnAdivinhar.getAction());
        btnAdivinhar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAdivinhar.setText("Adivinhar");
        btnAdivinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinharActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdivinhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 114, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Speech-Bubble-PNG-Images.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Akinator-BlogdoNel.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinharActionPerformed
        int ale = (int) (1 + Math.random() * (5 - 1));
        int valor = (int) lblValor.getValue();

    String res;
    if (ale == valor) {
        res = "<html>CORRETO! Parabéns!</html>";
    } else {
        res = "<html>ERRADO. Eu pensei no número: " + ale + "</html>";
    }
    lblRes.setText(res);
    }//GEN-LAST:event_btnAdivinharActionPerformed

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
            java.util.logging.Logger.getLogger(AkinatorDaMatematicaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AkinatorDaMatematicaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AkinatorDaMatematicaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AkinatorDaMatematicaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AkinatorDaMatematicaSwing().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinhar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblRes;
    private javax.swing.JSpinner lblValor;
    // End of variables declaration//GEN-END:variables
}
