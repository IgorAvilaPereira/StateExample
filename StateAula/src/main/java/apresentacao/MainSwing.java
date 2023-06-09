/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apresentacao;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import negocio.Mario;
import negocio.MarioPequeno;

/**
 *
 * @author iapereira
 */
public class MainSwing extends javax.swing.JFrame {

    private Mario mario;
    private Music se;
    private String sound_track;

    /**
     * Creates new form MainSwing
     */
    public MainSwing() {
        initComponents();
        this.mario = new Mario();
        this.imagemEstado.setIcon(new ImageIcon("./estados_mario/" + this.mario.getEstado().getClass().getSimpleName() + ".jpg"));
        sound_track = "mario_song.wav";
        se = new Music();
        se.setFile(sound_track);
        se.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagemEstado = new javax.swing.JButton();
        btnPegarCogumelo = new javax.swing.JButton();
        btnPegarPena = new javax.swing.JButton();
        btnPegarFlor = new javax.swing.JButton();
        btnLevarDano = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPegarCogumelo.setText("PegarCogumelo");
        btnPegarCogumelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarCogumeloActionPerformed(evt);
            }
        });

        btnPegarPena.setText("PegarPena");
        btnPegarPena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarPenaActionPerformed(evt);
            }
        });

        btnPegarFlor.setText("PegarFlor");
        btnPegarFlor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarFlorActionPerformed(evt);
            }
        });

        btnLevarDano.setText("LevarDano");
        btnLevarDano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevarDanoActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jButton1.setText("playMusic");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("stopMusic");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imagemEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLevarDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPegarFlor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPegarPena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPegarCogumelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPegarCogumelo)
                        .addGap(18, 18, 18)
                        .addComponent(btnPegarPena)
                        .addGap(26, 26, 26)
                        .addComponent(btnPegarFlor)
                        .addGap(18, 18, 18)
                        .addComponent(btnLevarDano)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(imagemEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPegarCogumeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarCogumeloActionPerformed
        // TODO add your handling code here:
        mario.pegarCogumelo();
        this.imagemEstado.setIcon(new ImageIcon("./estados_mario/" + this.mario.getEstado().getClass().getSimpleName() + ".jpg"));

    }//GEN-LAST:event_btnPegarCogumeloActionPerformed

    private void btnPegarPenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarPenaActionPerformed
        // TODO add your handling code here:
        mario.pegarPena();
        this.imagemEstado.setIcon(new ImageIcon("./estados_mario/" + this.mario.getEstado().getClass().getSimpleName() + ".jpg"));

    }//GEN-LAST:event_btnPegarPenaActionPerformed

    private void btnPegarFlorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarFlorActionPerformed
        // TODO add your handling code here:
        mario.pegarFlor();
        this.imagemEstado.setIcon(new ImageIcon("./estados_mario/" + this.mario.getEstado().getClass().getSimpleName() + ".jpg"));

    }//GEN-LAST:event_btnPegarFlorActionPerformed

    private void btnLevarDanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevarDanoActionPerformed
        // TODO add your handling code here:
        mario.levarDano();
        this.imagemEstado.setIcon(new ImageIcon("./estados_mario/" + this.mario.getEstado().getClass().getSimpleName() + ".jpg"));

    }//GEN-LAST:event_btnLevarDanoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        mario.setEstado(new MarioPequeno());
        this.imagemEstado.setIcon(new ImageIcon("./estados_mario/" + this.mario.getEstado().getClass().getSimpleName() + ".jpg"));

    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        se.setFile(this.sound_track);
        se.play();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //                se.setFile(null);
        try {
            se.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSwing().setVisible(true);
            }
        });
    }

    public class Music {

        Clip clip;
        AudioInputStream sound;

        public void setFile(String soundFileName) {
            try {
                File file = new File(soundFileName);
                sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            }
        }

        public void play() {
            clip.start();
        }

        public void stop() throws IOException {
            sound.close();
            clip.close();
            clip.stop();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLevarDano;
    private javax.swing.JButton btnPegarCogumelo;
    private javax.swing.JButton btnPegarFlor;
    private javax.swing.JButton btnPegarPena;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton imagemEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
