/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author Aljadis Adán
 */
public class Rectangulo extends javax.swing.JFrame {

    /**
     * Creates new form Rectangulo
     */
    public Rectangulo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAreaR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 340));
        setMinimumSize(new java.awt.Dimension(400, 340));
        setPreferredSize(new java.awt.Dimension(400, 340));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ethnocentric", 0, 14)); // NOI18N
        jLabel1.setText("       ÁREA DE UN RECTÁNGULO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 360, 16);

        jLabel2.setFont(new java.awt.Font("Ethnocentric", 0, 14)); // NOI18N
        jLabel2.setText("Alto:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 100, 70, 16);

        jLabel3.setFont(new java.awt.Font("Ethnocentric", 0, 14)); // NOI18N
        jLabel3.setText("Ancho:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 150, 80, 16);
        getContentPane().add(txtAlto);
        txtAlto.setBounds(250, 100, 60, 20);
        getContentPane().add(txtAncho);
        txtAncho.setBounds(250, 150, 60, 20);

        jLabel4.setFont(new java.awt.Font("Ethnocentric", 0, 14)); // NOI18N
        jLabel4.setText("Área:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 200, 70, 16);
        getContentPane().add(txtAreaR);
        txtAreaR.setBounds(250, 200, 60, 20);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 250, 90, 23);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 250, 90, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
    
 
        double AreaR;
        double alto = Double.parseDouble(txtAlto.getText());
        double ancho = Double.parseDouble(txtAncho.getText());
        Procesos Calcular = new Procesos();
        AreaR = Calcular.Calcular_AreaR(alto, ancho);
        txtAreaR.setText(String.valueOf(AreaR));
}
catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Ingrese un número válido.","Algo salió mal.", JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtAncho.setText(" ");
        txtAlto.setText(" ");
        txtAreaR.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rectangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtAreaR;
    // End of variables declaration//GEN-END:variables
}
