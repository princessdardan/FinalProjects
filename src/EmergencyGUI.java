import javax.swing.*;

public class EmergencyGUI extends javax.swing.JFrame {
    LinkedPriorityQueue lpq;
    int c;
    Patient p;
    
    public EmergencyGUI() {
        initComponents();
        lpq = new LinkedPriorityQueue(3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        rbtnfair = new javax.swing.JRadioButton();
        rbtnserious = new javax.swing.JRadioButton();
        rbtncritical = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnschedule = new javax.swing.JButton();
        btntreatnext = new javax.swing.JButton();
        btntreatall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtorder = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Program = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel1.setText("Patient Name :");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnfair);
        rbtnfair.setForeground(new java.awt.Color(51, 204, 0));
        rbtnfair.setText("Fair Condition");
        rbtnfair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnfair.setBorderPainted(true);

        buttonGroup1.add(rbtnserious);
        rbtnserious.setForeground(new java.awt.Color(255, 220, 113));
        rbtnserious.setText("Serious Condition");
        rbtnserious.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnserious.setBorderPainted(true);

        buttonGroup1.add(rbtncritical);
        rbtncritical.setForeground(new java.awt.Color(255, 51, 51));
        rbtncritical.setText("Critical Condition");
        rbtncritical.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtncritical.setBorderPainted(true);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setText("Enter Patient Condition");

        btnschedule.setText("Schedule");
        btnschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscheduleActionPerformed(evt);
            }
        });

        btntreatnext.setText("Treat Next");
        btntreatnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatnextActionPerformed(evt);
            }
        });

        btntreatall.setText("Treat All");
        btntreatall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatallActionPerformed(evt);
            }
        });

        txtorder.setColumns(20);
        txtorder.setRows(5);
        jScrollPane1.setViewportView(txtorder);

        Program.setText("Program");

        mnuclear.setText("Clear");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        Program.add(mnuclear);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        Program.add(mnuexit);

        jMenuBar1.add(Program);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbtnserious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnfair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtncritical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnschedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntreatall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntreatnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnfair)
                    .addComponent(btnschedule))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnserious)
                    .addComponent(btntreatnext))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtncritical)
                    .addComponent(btntreatall, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscheduleActionPerformed
        String nm="";
        c = 00100100;
        nm = txtname.getText();
        if(rbtnfair.isSelected()){c=2;}
        else if(rbtnserious.isSelected()){c=1;}
        else if(rbtncritical.isSelected()){c=0;}  
        p = new Patient(nm, c);
        if (p.setName(nm)==false&& p.setCondition(c)==false){
            JOptionPane.showMessageDialog(this,"Must complete the form.");
            return;
        }
        else if (p.setName(nm)==false){
            JOptionPane.showMessageDialog(this,"Must enter a name for the patient.");
            return;  
        }
        else if (p.setCondition(c)==false){
            JOptionPane.showMessageDialog(this,"Must set the patient's condition.");
            return;
        }//end else if
        else{
        //sends patient info to queue matching their priority
        lpq.enqueue(p,c);
        //adds patient info to the list of patients
        txtorder.append(p.toString()+"\tStatus: Waiting\n");
        //sets txtname and radio buttons as null
        buttonGroup1.clearSelection();
        txtname.setText("");
        }
    }//GEN-LAST:event_btnscheduleActionPerformed

    private void btntreatnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatnextActionPerformed
        //checks if list is empty
        if(lpq.peekFront()==""){ 
            JOptionPane.showMessageDialog(this,"There are currently no patients in the waiting room.");
            return;  
        }
        else
            // treats the next patient according priority
        txtorder.append(lpq.dequeue()+"\tStatus: Treated\n");
    }//GEN-LAST:event_btntreatnextActionPerformed

    private void btntreatallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatallActionPerformed
        //checks if list is empty
        if(lpq.peekFront()==""){ 
            JOptionPane.showMessageDialog(this,"There are currently no patients in the waiting room.");
            return;  
        }
        else
            //treats all patients in order of priority and stops when the list is empty
            while(lpq.peekFront()!= "")
            {
                txtorder.append(lpq.dequeue()+"\tStatus: Treated\n");
            }
            
    }//GEN-LAST:event_btntreatallActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        //this clears the gui
        buttonGroup1.clearSelection();
        txtorder.setText("");
        txtname.setText("");
        //this clears any patients currently in lpq by moving through and "treating" them
        //but doesnt print that they have been treated
        //uses the same while loop as treatall
        while(lpq.peekFront()!= "")
            {
                lpq.dequeue();
            }
    }//GEN-LAST:event_mnuclearActionPerformed

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
            java.util.logging.Logger.getLogger(EmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmergencyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmergencyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Program;
    private javax.swing.JButton btnschedule;
    private javax.swing.JButton btntreatall;
    private javax.swing.JButton btntreatnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JRadioButton rbtncritical;
    private javax.swing.JRadioButton rbtnfair;
    private javax.swing.JRadioButton rbtnserious;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtorder;
    // End of variables declaration//GEN-END:variables
}
