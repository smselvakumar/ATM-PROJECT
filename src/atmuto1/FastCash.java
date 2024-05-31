/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmuto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Selvakumar
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }
    int MyAccNum;
        public FastCash(int AccNum) {
            initComponents();
            MyAccNum=AccNum;
            GetBalance();
        }
            Connection con =null;
            PreparedStatement pst=null,pst1=null;
            ResultSet rs=null,rs1=null;
            Statement st=null,st1=null;
            int oldBalance;
  private void GetBalance()
  {
       String Query="Select * from accounttbl where AccNum='"+MyAccNum+"'";
        try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                st1 = con.createStatement();
                rs1= st1.executeQuery(Query);
            if(rs1.next()){
                    oldBalance= rs1.getInt(9);
                    BallLbl.setText("Rs "+oldBalance);
            }else
                {
    
                }

        }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }

  }

    @SuppressWarnings("unchecked")
   
      
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DEPOSITBTN2 = new javax.swing.JButton();
        DEPOSITBTN = new javax.swing.JButton();
        DEPOSITBTN3 = new javax.swing.JButton();
        DEPOSITBTN1 = new javax.swing.JButton();
        DEPOSITBTN5 = new javax.swing.JButton();
        DEPOSITBTN4 = new javax.swing.JButton();
        BallLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DEPOSITBTN2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DEPOSITBTN2.setForeground(new java.awt.Color(153, 0, 0));
        DEPOSITBTN2.setText("Rs 1000");
        DEPOSITBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN2MouseClicked(evt);
            }
        });
        DEPOSITBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN2ActionPerformed(evt);
            }
        });

        DEPOSITBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DEPOSITBTN.setForeground(new java.awt.Color(153, 0, 0));
        DEPOSITBTN.setText("Rs 5000");
        DEPOSITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTNMouseClicked(evt);
            }
        });
        DEPOSITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTNActionPerformed(evt);
            }
        });

        DEPOSITBTN3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DEPOSITBTN3.setForeground(new java.awt.Color(153, 0, 0));
        DEPOSITBTN3.setText("Rs 15000");
        DEPOSITBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN3MouseClicked(evt);
            }
        });
        DEPOSITBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN3ActionPerformed(evt);
            }
        });

        DEPOSITBTN1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DEPOSITBTN1.setForeground(new java.awt.Color(153, 0, 0));
        DEPOSITBTN1.setText("Rs 10000");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });
        DEPOSITBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN1ActionPerformed(evt);
            }
        });

        DEPOSITBTN5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DEPOSITBTN5.setForeground(new java.awt.Color(153, 0, 0));
        DEPOSITBTN5.setText("Rs 20000");
        DEPOSITBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN5MouseClicked(evt);
            }
        });
        DEPOSITBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN5ActionPerformed(evt);
            }
        });

        DEPOSITBTN4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DEPOSITBTN4.setForeground(new java.awt.Color(153, 0, 0));
        DEPOSITBTN4.setText("Rs 25000");
        DEPOSITBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN4MouseClicked(evt);
            }
        });
        DEPOSITBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN4ActionPerformed(evt);
            }
        });

        BallLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BallLbl.setForeground(new java.awt.Color(51, 51, 51));
        BallLbl.setText("AMOUNT");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fast Cash");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(349, 349, 349))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(17, 17, 17))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("POP BANK");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("POP ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmuto1/LOGO.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(322, 322, 322))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
  
    }//GEN-LAST:event_jLabel7MouseClicked

    private void DEPOSITBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN4ActionPerformed

    private void DEPOSITBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN4MouseClicked
        if(oldBalance<25000){
            JOptionPane.showMessageDialog(this,"Nope Enough Balance");
        }else{

            try{
                String Query = "Update accounttbl set Balance=? where AccNum=?";
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1,oldBalance-25000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this,"Your Balance Withdraw...");
                   
                    new Manu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Missing Information...");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN4MouseClicked

    private void DEPOSITBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN5ActionPerformed

    private void DEPOSITBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN5MouseClicked
        if(oldBalance<20000){
            JOptionPane.showMessageDialog(this,"Nope Enough Balance");
        }else{
            try{
                String Query = "Update accounttbl set Balance=? where AccNum=?";
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1,oldBalance-20000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this,"Balance Withdraw");
                    new Manu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN5MouseClicked

    private void DEPOSITBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN1ActionPerformed

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
        if(oldBalance<10000){
            JOptionPane.showMessageDialog(this,"Nope Enough Balance");
        }else{

            try{
                String Query = "Update accounttbl set Balance=? where AccNum=?";
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1,oldBalance-10000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this,"Balance Withdraw");
                    new Manu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void DEPOSITBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN3ActionPerformed

    private void DEPOSITBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN3MouseClicked
        if(oldBalance<15000){
            JOptionPane.showMessageDialog(this,"Nope Enough Balance");
        }else{

            try{
                String Query = "Update accounttbl set Balance=? where AccNum=?";
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1,oldBalance-15000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this,"Balance Withdraw");
                    new Manu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN3MouseClicked

    private void DEPOSITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTNActionPerformed

    private void DEPOSITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTNMouseClicked
        if(oldBalance<5000){
            JOptionPane.showMessageDialog(this,"Nope Enough Balance");
        }else{

            try{
                String Query = "Update accounttbl set Balance=? where AccNum=?";
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1,oldBalance-5000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this,"Balance Withdraw");
                    new Manu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTNMouseClicked

    private void DEPOSITBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN2ActionPerformed

    private void DEPOSITBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN2MouseClicked
        if(oldBalance<1000){
            JOptionPane.showMessageDialog(this,"Nope Enough Balance");
        }else{

            try{
                String Query = "Update accounttbl set Balance=? where AccNum=?";
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1,oldBalance-1000);
                ps.setInt(2,MyAccNum);
                if(ps.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(this,"Balance Withdraw");
                    new Manu(MyAccNum).setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Missing Information");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Manu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BallLbl;
    private javax.swing.JButton DEPOSITBTN;
    private javax.swing.JButton DEPOSITBTN1;
    private javax.swing.JButton DEPOSITBTN2;
    private javax.swing.JButton DEPOSITBTN3;
    private javax.swing.JButton DEPOSITBTN4;
    private javax.swing.JButton DEPOSITBTN5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
