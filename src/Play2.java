

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zulf
 */
public class Play2 extends javax.swing.JFrame {

    public int nilai2 = Play.nilainya;
    String nilai2tru = "" + nilai2;

    public Play2() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.score.setText(nilai2tru);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        soal = new javax.swing.JLabel();
        bandung = new javax.swing.JButton();
        zimbabwe = new javax.swing.JButton();
        jakarta = new javax.swing.JButton();
        MALANG = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        scoreguide = new javax.swing.JLabel();
        Clue = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("LetterOMatic!", 0, 24)); // NOI18N
        title.setText("Soal 2");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        soal.setFont(new java.awt.Font("LetterOMatic!", 0, 14)); // NOI18N
        soal.setText("<html> Dimanakah IbuKOTA INDONESIA ? Clue: Lihat Foto </html>");
        soal.setToolTipText("");
        soal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(soal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 90));

        bandung.setText("BANDUNG");
        bandung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandungActionPerformed(evt);
            }
        });
        getContentPane().add(bandung, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 50));

        zimbabwe.setText("ZIMBABWE");
        zimbabwe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zimbabweActionPerformed(evt);
            }
        });
        getContentPane().add(zimbabwe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, 50));

        jakarta.setText("JAKARTA");
        jakarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jakartaActionPerformed(evt);
            }
        });
        getContentPane().add(jakarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 50));

        MALANG.setText("MALANG");
        MALANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALANGActionPerformed(evt);
            }
        });
        getContentPane().add(MALANG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 50));

        score.setFont(new java.awt.Font("LetterOMatic!", 0, 18)); // NOI18N
        score.setText("0");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        scoreguide.setFont(new java.awt.Font("LetterOMatic!", 0, 18)); // NOI18N
        scoreguide.setText("SCORE :");
        getContentPane().add(scoreguide, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        Clue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buatinterface/jiketo.png"))); // NOI18N
        getContentPane().add(Clue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buatinterface/bagi2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bandungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandungActionPerformed
        new Play3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bandungActionPerformed

    private void zimbabweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zimbabweActionPerformed
        new Play3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_zimbabweActionPerformed

    private void jakartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jakartaActionPerformed
        Play.nilainya++;
        score.setText("" + Play.nilainya);
        new Play3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jakartaActionPerformed

    private void MALANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALANGActionPerformed
        new Play3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MALANGActionPerformed

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
            java.util.logging.Logger.getLogger(Play2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clue;
    private javax.swing.JButton MALANG;
    private javax.swing.JLabel background;
    private javax.swing.JButton bandung;
    private javax.swing.JButton jakarta;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreguide;
    private javax.swing.JLabel soal;
    private javax.swing.JLabel title;
    private javax.swing.JButton zimbabwe;
    // End of variables declaration//GEN-END:variables
}
