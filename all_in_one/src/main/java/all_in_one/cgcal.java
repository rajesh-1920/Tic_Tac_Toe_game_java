package all_in_one;

public class cgcal extends javax.swing.JFrame {

    public cgcal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cceTF = new javax.swing.JTextField();
        citTF = new javax.swing.JTextField();
        eeeTF = new javax.swing.JTextField();
        phyTF = new javax.swing.JTextField();
        matTF = new javax.swing.JTextField();
        lcmTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cceCH = new javax.swing.JTextField();
        citCH = new javax.swing.JTextField();
        eeeCH = new javax.swing.JTextField();
        phyCH = new javax.swing.JTextField();
        matCH = new javax.swing.JTextField();
        lcmCH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ccesTF = new javax.swing.JTextField();
        ccesCH = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        eeesTF = new javax.swing.JTextField();
        eeesCH = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        physTF = new javax.swing.JTextField();
        physCH = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        gpaTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        PcgpaTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cgpaTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cceG = new javax.swing.JTextField();
        citG = new javax.swing.JTextField();
        eeeG = new javax.swing.JTextField();
        phyG = new javax.swing.JTextField();
        matG = new javax.swing.JTextField();
        lcmG = new javax.swing.JTextField();
        ccesG = new javax.swing.JTextField();
        eeesG = new javax.swing.JTextField();
        physG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CGPA CALCULATOR");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CCE-121 :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("CIT-121 :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("EEE-121 :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("PHY-121 :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("MAT-121 :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("LCM-121 :");

        citTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citTFActionPerformed(evt);
            }
        });

        eeeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eeeTFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText(" C.HOUR");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("C. NAME");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("   MARKS");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("CCE-122 :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("EEE-122 :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("PHY-122 :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("      GPA");

        gpaTF.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("   P.CGPA");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("    CGPA");

        cgpaTF.setEditable(false);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("GRADE");

        cceG.setEditable(false);
        cceG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cceGActionPerformed(evt);
            }
        });

        citG.setEditable(false);

        eeeG.setEditable(false);

        phyG.setEditable(false);

        matG.setEditable(false);
        matG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matGActionPerformed(evt);
            }
        });

        lcmG.setEditable(false);
        lcmG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcmGActionPerformed(evt);
            }
        });

        ccesG.setEditable(false);

        eeesG.setEditable(false);

        physG.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lcmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lcmCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lcmG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(physTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(physCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(physG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eeesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eeesCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(eeesG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(cceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cceCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cceG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(citTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(citCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(citG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eeeCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(eeeG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(phyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(phyCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(phyG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(matTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(matCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(matG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PcgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(159, 159, 159))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ccesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ccesCH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(ccesG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1)
                                                .addGap(145, 145, 145))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(316, 316, 316))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cceCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cceG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(citTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(citCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(citG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeeCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeeG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phyCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PcgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phyG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(matTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(matCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(matG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lcmTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lcmCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lcmG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ccesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ccesCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)
                                        .addComponent(ccesG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeesCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeesG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(physTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(physCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(physG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void citTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citTFActionPerformed

    private void eeeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eeeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eeeTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // calculate the all cgpa
        String cceScore, citScore, eeeScore, phyScore, matScore, lcmScore, ccesScore, eeesScore, physScore;
        String cceChour, citChour, eeeChour, phyChour, matChour, lcmChour, ccesChour, eeesChour, physChour;
        String PreviousCG;
        double cceGrade, citGrade, eeeGrade, phyGrade, matGrade, lcmGrade, ccesGrade, eeesGrade = 0, physGrade = 0;
        double gpa = 0;
        double cgpa, totalCredit;

        cceScore = cceTF.getText();
        cceChour = cceCH.getText();
        citScore = citTF.getText();
        citChour = citCH.getText();
        eeeScore = eeeTF.getText();
        eeeChour = eeeCH.getText();
        phyScore = phyTF.getText();
        phyChour = phyCH.getText();
        matScore = matTF.getText();
        matChour = matCH.getText();
        lcmScore = lcmTF.getText();
        lcmChour = lcmCH.getText();
        ccesScore = ccesTF.getText();
        ccesChour = ccesCH.getText();
        eeesScore = eeesTF.getText();
        eeesChour = eeesCH.getText();
        physScore = physTF.getText();
        physChour = physCH.getText();

        PreviousCG = PcgpaTF.getText();

        double cce121 = Double.parseDouble(cceScore);
        double cce121h = Double.parseDouble(cceChour);

        double cit121 = Double.parseDouble(citScore);
        double cit121h = Double.parseDouble(citChour);

        double eee121 = Double.parseDouble(eeeScore);
        double eee121h = Double.parseDouble(eeeChour);

        double phy121 = Double.parseDouble(phyScore);
        double phy121h = Double.parseDouble(phyChour);

        double mat121 = Double.parseDouble(matScore);
        double mat121h = Double.parseDouble(matChour);

        double lcm121 = Double.parseDouble(lcmScore);
        double lcm121h = Double.parseDouble(lcmChour);

        double cce122 = Double.parseDouble(ccesScore);
        double cce122h = Double.parseDouble(ccesChour);

        double eee122 = Double.parseDouble(eeesScore);
        double eee122h = Double.parseDouble(eeesChour);

        double phy122 = Double.parseDouble(physScore);
        double phy122h = Double.parseDouble(physChour);

        double pcgpa = Double.parseDouble(PreviousCG);

        if (cce121 >= 80) {
            cceG.setText("A+");
            cceGrade = 4.0;
        } else if (cce121 >= 75 && cce121 <= 79) {
            cceG.setText("A");
            cceGrade = 3.75;
        } else if (cce121 >= 70 && cce121 <= 74) {
            cceG.setText("A-");
            cceGrade = 3.50;
        } else if (cce121 >= 65 && cce121 <= 69) {
            cceG.setText("B+");
            cceGrade = 3.25;
        } else if (cce121 >= 60 && cce121 <= 64) {
            cceG.setText("B");
            cceGrade = 3.00;
        } else if (cce121 >= 55 && cce121 <= 59) {
            cceG.setText("B-");
            cceGrade = 2.75;
        } else if (cce121 >= 50 && cce121 <= 54) {
            cceG.setText("C+");
            cceGrade = 2.50;
        } else if (cce121 >= 45 && cce121 <= 49) {
            cceG.setText("C");
            cceGrade = 2.25;
        } else if (cce121 >= 40 && cce121 <= 44) {
            cceG.setText("D");
            cceGrade = 2.00;
        } else {
            cceG.setText("F");
            cceGrade = 0.00;
        }

        if (cit121 >= 80) {
            citG.setText("A+");
            citGrade = 4.0;
        } else if (cit121 >= 75 && cit121 <= 79) {
            citG.setText("A");
            citGrade = 3.75;
        } else if (cit121 >= 70 && cit121 <= 74) {
            citG.setText("A-");
            citGrade = 3.50;
        } else if (cit121 >= 65 && cit121 <= 69) {
            citG.setText("B+");
            citGrade = 3.25;
        } else if (cit121 >= 60 && cit121 <= 64) {
            citG.setText("B");
            citGrade = 3.00;
        } else if (cit121 >= 55 && cit121 <= 59) {
            citG.setText("B-");
            citGrade = 2.75;
        } else if (cit121 >= 50 && cit121 <= 54) {
            citG.setText("C+");
            citGrade = 2.50;
        } else if (cit121 >= 45 && cit121 <= 49) {
            citG.setText("C");
            citGrade = 2.25;
        } else if (cit121 >= 40 && cit121 <= 44) {
            citG.setText("D");
            citGrade = 2.00;
        } else {
            citG.setText("F");
            citGrade = 0.00;
        }
        // Grade for EEE

        if (eee121 >= 80) {
            eeeG.setText("A+");
            eeeGrade = 4.0;
        } else if (eee121 >= 75 && eee121 <= 79) {
            eeeG.setText("A");
            eeeGrade = 3.75;
        } else if (eee121 >= 70 && eee121 <= 74) {
            eeeG.setText("A-");
            eeeGrade = 3.50;
        } else if (eee121 >= 65 && eee121 <= 69) {
            eeeG.setText("B+");
            eeeGrade = 3.25;
        } else if (eee121 >= 60 && eee121 <= 64) {
            eeeG.setText("B");
            eeeGrade = 3.00;
        } else if (eee121 >= 55 && eee121 <= 59) {
            eeeG.setText("B-");
            eeeGrade = 2.75;
        } else if (eee121 >= 50 && eee121 <= 54) {
            eeeG.setText("C+");
            eeeGrade = 2.50;
        } else if (eee121 >= 45 && eee121 <= 49) {
            eeeG.setText("C");
            eeeGrade = 2.25;
        } else if (eee121 >= 40 && eee121 <= 44) {
            eeeG.setText("D");
            eeeGrade = 2.00;
        } else {
            eeeG.setText("F");
            eeeGrade = 0.00;
        }
        //Grade for physics..

        if (phy121 >= 80) {
            phyG.setText("A+");
            phyGrade = 4.0;
        } else if (phy121 >= 75 && phy121 <= 79) {
            phyG.setText("A");
            phyGrade = 3.75;
        } else if (phy121 >= 70 && phy121 <= 74) {
            phyG.setText("A-");
            phyGrade = 3.50;
        } else if (phy121 >= 65 && phy121 <= 69) {
            phyG.setText("B+");
            phyGrade = 3.25;
        } else if (phy121 >= 60 && phy121 <= 64) {
            phyG.setText("B");
            phyGrade = 3.00;
        } else if (phy121 >= 55 && phy121 <= 59) {
            phyG.setText("B-");
            phyGrade = 2.75;
        } else if (phy121 >= 50 && phy121 <= 54) {
            phyG.setText("C+");
            phyGrade = 2.50;
        } else if (phy121 >= 45 && phy121 <= 49) {
            phyG.setText("C");
            phyGrade = 2.25;
        } else if (phy121 >= 40 && phy121 <= 44) {
            phyG.setText("D");
            phyGrade = 2.00;
        } else {
            phyG.setText("F");
            phyGrade = 0.00;
        }
        // Grade for math..

        if (mat121 >= 80) {
            matG.setText("A+");
            matGrade = 4.0;
        } else if (mat121 >= 75 && mat121 <= 79) {
            matG.setText("A");
            matGrade = 3.75;
        } else if (mat121 >= 70 && mat121 <= 74) {
            matG.setText("A-");
            matGrade = 3.50;
        } else if (mat121 >= 65 && mat121 <= 69) {
            matG.setText("B+");
            matGrade = 3.25;
        } else if (mat121 >= 60 && mat121 <= 64) {
            matG.setText("B");
            matGrade = 3.00;
        } else if (mat121 >= 55 && mat121 <= 59) {
            matG.setText("B-");
            matGrade = 2.75;
        } else if (mat121 >= 50 && mat121 <= 54) {
            matG.setText("C+");
            matGrade = 2.50;
        } else if (mat121 >= 45 && mat121 <= 49) {
            matG.setText("C");
            matGrade = 2.25;
        } else if (mat121 >= 40 && mat121 <= 44) {
            matG.setText("D");
            matGrade = 2.00;
        } else {
            matG.setText("F");
            matGrade = 0.00;
        }
        // Grade for lcm..

        if (lcm121 >= 80) {
            lcmG.setText("A+");
            lcmGrade = 4.0;
        } else if (lcm121 >= 75 && lcm121 <= 79) {
            lcmG.setText("A");
            lcmGrade = 3.75;
        } else if (lcm121 >= 70 && lcm121 <= 74) {
            lcmG.setText("A-");
            lcmGrade = 3.50;
        } else if (lcm121 >= 65 && lcm121 <= 69) {
            lcmG.setText("B+");
            lcmGrade = 3.25;
        } else if (lcm121 >= 60 && lcm121 <= 64) {
            lcmG.setText("B");
            lcmGrade = 3.00;
        } else if (lcm121 >= 55 && lcm121 <= 59) {
            lcmG.setText("B-");
            lcmGrade = 2.75;
        } else if (lcm121 >= 50 && lcm121 <= 54) {
            lcmG.setText("C+");
            lcmGrade = 2.50;
        } else if (lcm121 >= 45 && lcm121 <= 49) {
            lcmG.setText("C");
            lcmGrade = 2.25;
        } else if (lcm121 >= 40 && lcm121 <= 44) {
            lcmG.setText("D");
            lcmGrade = 2.00;
        } else {
            lcmG.setText("F");
            lcmGrade = 0.00;
        }
        // Grade for cce sessional

        if (cce122 >= 80) {
            ccesG.setText("A+");
            ccesGrade = 4.0;
        } else if (cce122 >= 75 && cce122 <= 79) {
            ccesG.setText("A");
            ccesGrade = 3.75;
        } else if (cce122 >= 70 && cce122 <= 74) {
            ccesG.setText("A-");
            ccesGrade = 3.50;
        } else if (cce122 >= 65 && cce122 <= 69) {
            ccesG.setText("B+");
            ccesGrade = 3.25;
        } else if (cce122 >= 60 && cce122 <= 64) {
            ccesG.setText("B");
            ccesGrade = 3.00;
        } else if (cce122 >= 55 && cce122 <= 59) {
            ccesG.setText("B-");
            ccesGrade = 2.75;
        } else if (cce122 >= 50 && cce122 <= 54) {
            ccesG.setText("C+");
            ccesGrade = 2.50;
        } else if (cce122 >= 45 && cce122 <= 49) {
            ccesG.setText("C");
            ccesGrade = 2.25;
        } else if (cce122 >= 40 && cce122 <= 44) {
            ccesG.setText("D");
            ccesGrade = 2.00;
        } else {
            ccesG.setText("F");
            ccesGrade = 0.00;
        }
        // Grade for eee sessional..

        if (eee122 >= 80) {
            eeesG.setText("A+");
            eeesGrade = 4.0;
        } else if (eee122 >= 75 && eee122 <= 79) {
            eeesG.setText("A");
            eeesGrade = 3.75;
        } else if (eee122 >= 70 && eee122 <= 74) {
            eeesG.setText("A-");
            eeesGrade = 3.50;
        } else if (eee122 >= 65 && eee122 <= 69) {
            eeeG.setText("B+");
            eeeGrade = 3.25;
        } else if (eee122 >= 60 && eee122 <= 64) {
            eeesG.setText("B");
            eeesGrade = 3.00;
        } else if (eee122 >= 55 && eee122 <= 59) {
            eeesG.setText("B-");
            eeesGrade = 2.75;
        } else if (eee122 >= 50 && eee122 <= 54) {
            eeesG.setText("C+");
            eeesGrade = 2.50;
        } else if (eee122 >= 45 && eee122 <= 49) {
            eeesG.setText("C");
            eeesGrade = 2.25;
        } else if (eee122 >= 40 && eee122 <= 44) {
            eeesG.setText("D");
            eeesGrade = 2.00;
        } else {
            eeesG.setText("F");
            eeesGrade = 0.00;
        }
        // Grade for phy sessinoal 

        if (phy122 >= 80) {
            physG.setText("A+");
            physGrade = 4.0;
        } else if (phy122 >= 75 && phy122 <= 79) {
            physG.setText("A");
            physGrade = 3.75;
        } else if (phy122 >= 70 && phy122 <= 74) {
            physG.setText("A-");
            physGrade = 3.50;
        } else if (phy122 >= 65 && phy122 <= 69) {
            phyG.setText("B+");
            phyGrade = 3.25;
        } else if (phy122 >= 60 && phy122 <= 64) {
            physG.setText("B");
            physGrade = 3.00;
        } else if (phy122 >= 55 && phy122 <= 59) {
            physG.setText("B-");
            physGrade = 2.75;
        } else if (phy122 >= 50 && phy122 <= 54) {
            physG.setText("C+");
            physGrade = 2.50;
        } else if (phy122 >= 45 && phy122 <= 49) {
            physG.setText("C");
            physGrade = 2.25;
        } else if (phy122 >= 40 && phy122 <= 44) {
            physG.setText("D");
            physGrade = 2.00;
        } else {
            physG.setText("F");
            physGrade = 0.00;
        }

        totalCredit = cce121h + cit121h + eee121h + phy121h + mat121h + lcm121h + cce122h + eee122h + phy122h;

        gpa = (((cceGrade * 3.0) + (citGrade * 3.0) + (eeeGrade * 3.0) + (phyGrade * 3.0) + (matGrade * 3.0) + (lcmGrade * 2.0) + (ccesGrade * 1.5) + (eeesGrade * 1.5) + (physGrade * 1.5)) / totalCredit);

        gpaTF.setText(Double.toString(gpa));

        cgpa = (pcgpa + gpa) / 2.0;

        cgpaTF.setText(Double.toString(cgpa));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cceGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cceGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cceGActionPerformed

    private void matGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matGActionPerformed

    private void lcmGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcmGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lcmGActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PcgpaTF;
    private javax.swing.JTextField cceCH;
    private javax.swing.JTextField cceG;
    private javax.swing.JTextField cceTF;
    private javax.swing.JTextField ccesCH;
    private javax.swing.JTextField ccesG;
    private javax.swing.JTextField ccesTF;
    private javax.swing.JTextField cgpaTF;
    private javax.swing.JTextField citCH;
    private javax.swing.JTextField citG;
    private javax.swing.JTextField citTF;
    private javax.swing.JTextField eeeCH;
    private javax.swing.JTextField eeeG;
    private javax.swing.JTextField eeeTF;
    private javax.swing.JTextField eeesCH;
    private javax.swing.JTextField eeesG;
    private javax.swing.JTextField eeesTF;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lcmCH;
    private javax.swing.JTextField lcmG;
    private javax.swing.JTextField lcmTF;
    private javax.swing.JTextField matCH;
    private javax.swing.JTextField matG;
    private javax.swing.JTextField matTF;
    private javax.swing.JTextField phyCH;
    private javax.swing.JTextField phyG;
    private javax.swing.JTextField phyTF;
    private javax.swing.JTextField physCH;
    private javax.swing.JTextField physG;
    private javax.swing.JTextField physTF;
    // End of variables declaration//GEN-END:variables
}
