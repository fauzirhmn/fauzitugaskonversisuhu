/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky Hr
 */
public class frame extends javax.swing.JFrame {
calcius c = new calcius();
calvin k = new calvin();
fahrenheit f = new fahrenheit();
    /**
     * Creates new form frame
     */
    public frame() {
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

        from = new javax.swing.ButtonGroup();
        to = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tinput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fcalcius = new javax.swing.JRadioButton();
        Ffahrenheit = new javax.swing.JRadioButton();
        Fcalvin = new javax.swing.JRadioButton();
        Bconvert = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Thasil = new javax.swing.JTextField();
        Tcalcius = new javax.swing.JRadioButton();
        Tfahreinheit = new javax.swing.JRadioButton();
        Tcalvin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        Tinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinputActionPerformed(evt);
            }
        });
        Tinput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TinputKeyTyped(evt);
            }
        });

        jLabel2.setText("INPUT");

        jLabel3.setText("FROM");

        jLabel4.setText("TO");

        Fcalcius.setBackground(new java.awt.Color(102, 255, 102));
        from.add(Fcalcius);
        Fcalcius.setText("CELCIUS");

        Ffahrenheit.setBackground(new java.awt.Color(0, 153, 153));
        from.add(Ffahrenheit);
        Ffahrenheit.setText("FAHREINHEIT");

        Fcalvin.setBackground(new java.awt.Color(153, 51, 255));
        from.add(Fcalvin);
        Fcalvin.setText("CALVIN");

        Bconvert.setText("CALCULATE!");
        Bconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconvertActionPerformed(evt);
            }
        });

        jLabel5.setText("REASULT");

        Tcalcius.setBackground(new java.awt.Color(204, 204, 0));
        to.add(Tcalcius);
        Tcalcius.setText("CELCIUS");

        Tfahreinheit.setBackground(new java.awt.Color(51, 204, 0));
        to.add(Tfahreinheit);
        Tfahreinheit.setText("FAHREINHEIT");

        Tcalvin.setBackground(new java.awt.Color(0, 204, 204));
        to.add(Tcalvin);
        Tcalvin.setText("CALVIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fcalcius)
                                    .addComponent(Ffahrenheit)
                                    .addComponent(Fcalvin))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tcalvin)
                                    .addComponent(Tcalcius)
                                    .addComponent(Tfahreinheit)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Bconvert))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Thasil))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Tinput, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Fcalcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ffahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fcalvin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tcalcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tfahreinheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tcalvin)))
                .addGap(18, 18, 18)
                .addComponent(Bconvert)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Thasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconvertActionPerformed
        // TODO add your handling code here:
        
        if(Tinput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "input tidk boleh kosong", "error", JOptionPane.ERROR_MESSAGE);
        }
        double n = Double.parseDouble(Tinput.getText());

        if (Fcalvin.isSelected()){
            if (Tcalcius.isSelected()){
                n = k.toCelcius(n);
                Thasil.setText(String.valueOf(n));
            }
            if (Tfahreinheit.isSelected()){
                n = k.toFahrenheit(n);
                Thasil.setText(String.valueOf(n));
            }
            if (Tcalvin.isSelected()){
                n = k.toCalvin(n);
                Thasil.setText(String.valueOf(n));
                JOptionPane.showMessageDialog(null, "tidak ada konversi yang di lakukan ");
            }
        }
        if (Fcalcius.isSelected()){
            if (Tcalcius.isSelected()){
                n = c.toCelcius(n);
                Thasil.setText(String.valueOf(n));
                JOptionPane.showMessageDialog(null, "tidak ada konversi yang di lakukan ");
            }
            if (Tfahreinheit.isSelected()){
                n = c.toFahrenheit(n);
                Thasil.setText(String.valueOf(n));
            }
            if (Tcalvin.isSelected()){
                c.toCalvin(n);
                n = c.toCalvin(n);
                Thasil.setText(String.valueOf(n));
            }
        }
        if (Ffahrenheit.isSelected()){
            if (Tcalcius.isSelected()){
                n = f.toCelcius(n);
                Thasil.setText(String.valueOf(n));
            }
            if (Tfahreinheit.isSelected()){
                n = f.toFahrenheit(n);
                Thasil.setText(String.valueOf(n));
                JOptionPane.showMessageDialog(null, "tidak ada konversi yang di lakukan ");
            }
            if (Tcalvin.isSelected()){
                n = f.toCalvin(n);
                Thasil.setText(String.valueOf(n));
            }
        }
        

    }//GEN-LAST:event_BconvertActionPerformed

    private void TinputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TinputKeyTyped
        // TODO add your handling code here:
        cekKey(evt);
    }//GEN-LAST:event_TinputKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void TinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinputActionPerformed

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconvert;
    private javax.swing.JRadioButton Fcalcius;
    private javax.swing.JRadioButton Fcalvin;
    private javax.swing.JRadioButton Ffahrenheit;
    private javax.swing.JRadioButton Tcalcius;
    private javax.swing.JRadioButton Tcalvin;
    private javax.swing.JRadioButton Tfahreinheit;
    private javax.swing.JTextField Thasil;
    private javax.swing.JTextField Tinput;
    private javax.swing.ButtonGroup from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup to;
    // End of variables declaration//GEN-END:variables

    private void cekKey(KeyEvent a) {
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null, "input harus berupa angka", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
