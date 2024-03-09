package all_in_one;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;

/*
 * Name : Rajesh Biswas ;
 * Id   : 2002060 (re add);
 * Reg. : 09577 ; 
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    private String stgame = "X";
    private int xcount = 0;
    private int ocount = 0;
    private int click_count = 0;

    public Tic_Tac_Toe() {
        initComponents();
    }

    private void gamescore() {
        playerxx.setText(String.valueOf(xcount));
        playeroo.setText(String.valueOf(ocount));
    }

    private void choose_a_player() {
        if (stgame.equalsIgnoreCase("X")) {
            stgame = "O";
        } else {
            stgame = "X";
        }
    }

    private void clear() {
        click_count = 0;
        stgame = "X";
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);

        t4.setText(null);
        t5.setText(null);
        t6.setText(null);

        t7.setText(null);
        t8.setText(null);
        t9.setText(null);

        t1.setBackground(Color.LIGHT_GRAY);
        t2.setBackground(Color.LIGHT_GRAY);
        t3.setBackground(Color.LIGHT_GRAY);

        t4.setBackground(Color.LIGHT_GRAY);
        t5.setBackground(Color.LIGHT_GRAY);
        t6.setBackground(Color.LIGHT_GRAY);

        t7.setBackground(Color.LIGHT_GRAY);
        t8.setBackground(Color.LIGHT_GRAY);
        t9.setBackground(Color.LIGHT_GRAY);
    }

    private void winingGame() {
        String b1 = t1.getText();
        String b2 = t2.getText();
        String b3 = t3.getText();

        String b4 = t4.getText();
        String b5 = t5.getText();
        String b6 = t6.getText();

        String b7 = t7.getText();
        String b8 = t8.getText();
        String b9 = t9.getText();
        gamescore();
        //player x ----------------------------------------------------------------------------------------
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)) {

            xcount++;
            gamescore();

            t1.setBackground(Color.ORANGE);
            t2.setBackground(Color.ORANGE);
            t3.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)) {

            xcount++;
            gamescore();

            t4.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)) {

            xcount++;
            gamescore();

            t7.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)) {
            xcount++;
            gamescore();

            t1.setBackground(Color.ORANGE);
            t4.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)) {

            xcount++;
            gamescore();

            t2.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)) {

            xcount++;
            gamescore();

            t3.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)) {

            xcount++;
            gamescore();

            t1.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)) {

            xcount++;
            gamescore();

            t3.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player X Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        // end player x --------------------------------------------------------------------------------------
        //player o -------------------------------------------------------------------------------------------
        if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)) {

            ocount++;
            gamescore();

            t1.setBackground(Color.ORANGE);
            t2.setBackground(Color.ORANGE);
            t3.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)) {
            ocount++;
            gamescore();

            t4.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)) {

            ocount++;
            gamescore();

            t7.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)) {
            ocount++;
            gamescore();

            t1.setBackground(Color.ORANGE);
            t4.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)) {

            ocount++;
            gamescore();

            t2.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)) {

            ocount++;
            gamescore();

            t3.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)) {

            ocount++;
            gamescore();

            t1.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)) {

            ocount++;
            gamescore();

            t3.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);

            JOptionPane.showMessageDialog(this, "Player O Win", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            return;
        }
        // end player o -----------------------------------------------------------------------------------------
        if (click_count == 9) {
            JOptionPane.showMessageDialog(this, "The game is draw\nPlay again", "Play with brain and mind",
                    JOptionPane.INFORMATION_MESSAGE);
            gamescore();
            clear();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t8 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        t9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerxx = new javax.swing.JLabel();
        playeroo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Play with brain and mind");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        t1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        t7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        t8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        t3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        t9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 204, 204));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 153, 153));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerx.setBackground(new java.awt.Color(255, 0, 153));
        playerx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        playerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerx.setText("Player X :");
        playerx.setPreferredSize(new java.awt.Dimension(80, 30));

        playero.setBackground(new java.awt.Color(255, 0, 153));
        playero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        playero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playero.setText("Player O :");
        playero.setPreferredSize(new java.awt.Dimension(80, 30));

        playerxx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        playerxx.setForeground(new java.awt.Color(0, 153, 255));
        playerxx.setText("XXXXXXXXXX");

        playeroo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        playeroo.setForeground(new java.awt.Color(0, 153, 255));
        playeroo.setText("OOOOOOOOO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(playerxx))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(playeroo)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playerxx))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playeroo))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(exit)
                                                        .addComponent(reset))
                                                .addGap(65, 65, 65))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
        click_count++;
        t9.setText(stgame);
        if (stgame.equalsIgnoreCase("X")) {
            t9.setForeground(Color.RED);
        } else {
            t9.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");
        stgame = "X";
        if (JOptionPane.showConfirmDialog(frame, "Confirm you want reset?",
                "Play with brain and mind", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            xcount = 0;
            ocount = 0;
            clear();
            gamescore();
        }
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm you want exit?",
                "Play with brain and mind", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            clear();
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
        t2.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t2.setForeground(Color.RED);
        } else {
            t2.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        t1.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t1.setForeground(Color.RED);
        } else {
            t1.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
        t3.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t3.setForeground(Color.RED);
        } else {
            t3.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        t4.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t4.setForeground(Color.RED);
        } else {
            t4.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
        t5.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t5.setForeground(Color.RED);
        } else {
            t5.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
        t6.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t6.setForeground(Color.RED);
        } else {
            t6.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t6ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
        t7.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t7.setForeground(Color.RED);
        } else {
            t7.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t7ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
        t8.setText(stgame);
        click_count++;
        if (stgame.equalsIgnoreCase("X")) {
            t8.setForeground(Color.RED);
        } else {
            t8.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winingGame();
    }//GEN-LAST:event_t8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playeroo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxx;
    private javax.swing.JButton reset;
    private javax.swing.JButton t1;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    private javax.swing.JButton t8;
    private javax.swing.JButton t9;
    // End of variables declaration//GEN-END:variables
}
