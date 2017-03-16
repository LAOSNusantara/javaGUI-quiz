
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zulf
 */
public class MainMenu extends javax.swing.JFrame {

    public static String Nama;

    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(this);

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
        minititle = new javax.swing.JLabel();
        isiNama = new javax.swing.JTextField();
        nameGuide = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("LetterOMatic!", 0, 24)); // NOI18N
        title.setText("La Historia !");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        minititle.setFont(new java.awt.Font("LetterOMatic!", 0, 14)); // NOI18N
        minititle.setText("A Game About History");
        getContentPane().add(minititle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        isiNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiNamaActionPerformed(evt);
            }
        });
        getContentPane().add(isiNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 220, 30));

        nameGuide.setFont(new java.awt.Font("LetterOMatic!", 0, 14)); // NOI18N
        nameGuide.setText("Isi Namamu Disini");
        getContentPane().add(nameGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        playButton.setFont(new java.awt.Font("LetterOMatic!", 0, 12)); // NOI18N
        playButton.setText("Let's Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 120, 50));

        helpButton.setFont(new java.awt.Font("LetterOMatic!", 0, 12)); // NOI18N
        helpButton.setText("HELEP");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 120, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buatinterface/baggie.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isiNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiNamaActionPerformed
        this.Nama = isiNama.getText();
    }//GEN-LAST:event_isiNamaActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        if (isiNama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "MASUKIN NAMA ELU DULU SAKDIK", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            new Play().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Jangan Bodo - Bodo , apalagi Macak Bodo , \n Nanti Kamu Jomblo , Baca soal dan Pilih Tombol Jawaban", "HELP", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton helpButton;
    private javax.swing.JTextField isiNama;
    private javax.swing.JLabel minititle;
    private javax.swing.JLabel nameGuide;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
