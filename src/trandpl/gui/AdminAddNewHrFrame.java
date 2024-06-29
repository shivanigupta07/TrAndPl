
package trandpl.gui;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.HrDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.HrPojo;


public class AdminAddNewHrFrame extends javax.swing.JFrame {

    private String password;
    private String confrmPwd;
    public AdminAddNewHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
        loadId();
        
    }
    private void loadId(){
        try{
            int hrId=HrDAO.getNewHrId();
            lblHrId.setText("Hr-"+hrId);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error In Generating HrID",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private boolean validateInputs(){
        password=String.valueOf(txtPwd.getPassword());
        confrmPwd=String.valueOf(txtCnfrmPwd.getPassword());
        int index=jcProff.getSelectedIndex();
        if(txtName.getText().isEmpty()||txtMail.getText().isEmpty()||txtMob.getText().isEmpty()||txtCompany.getText().isEmpty()||password.isEmpty()||confrmPwd.isEmpty()||index==0)
            return false;
        return true;
    }
    private boolean matchPasswords(){
        return password.equals(confrmPwd);
    }
            
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jcProff = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtMob = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtCnfrmPwd = new javax.swing.JPasswordField();
        txtPwd = new javax.swing.JPasswordField();
        addNewHrBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        proLbl = new javax.swing.JLabel();
        UpperSeperator = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        AddNewHrLBL = new javax.swing.JLabel();
        passBar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        NameBar = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        mailLbl = new javax.swing.JLabel();
        mailBar = new javax.swing.JLabel();
        MobLbl = new javax.swing.JLabel();
        mobileBar = new javax.swing.JLabel();
        cnfPassLbl = new javax.swing.JLabel();
        cnfPassBar = new javax.swing.JLabel();
        DipperSeperator = new javax.swing.JSeparator();
        nameLbl2 = new javax.swing.JLabel();
        lblHrId = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCompany = new javax.swing.JTextField();
        nameLbl4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcProff.setBackground(new java.awt.Color(173, 192, 234));
        jcProff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Profession", "Developer", "Technical", "Apptitude", "Digital Marketing" }));
        jPanel1.add(jcProff, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 485, 300, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 710, 10));

        txtMob.setBackground(new java.awt.Color(173, 192, 234));
        txtMob.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtMob.setBorder(null);
        txtMob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobActionPerformed(evt);
            }
        });
        jPanel1.add(txtMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 485, 310, 30));

        txtName.setBackground(new java.awt.Color(173, 192, 234));
        txtName.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 395, 310, 30));

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setFont(new java.awt.Font("Heiti TC", 1, 18)); // NOI18N
        txtMail.setBorder(null);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 395, 310, 30));

        txtCnfrmPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtCnfrmPwd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCnfrmPwd.setBorder(null);
        jPanel1.add(txtCnfrmPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 565, 300, 30));

        txtPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtPwd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPwd.setBorder(null);
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 565, 310, 30));

        addNewHrBtn.setBackground(new java.awt.Color(173, 192, 234));
        addNewHrBtn.setText("Add New HR");
        addNewHrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewHrBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addNewHrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 250, 30));

        backBtn.setBackground(new java.awt.Color(173, 192, 234));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 110, -1));

        lblName.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblName.setText("Neelesh");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 265, 190, 40));

        proLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        proLbl.setText("Proffession in ");
        jPanel1.add(proLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 120, 30));
        jPanel1.add(UpperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 970, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 970, 200));

        logOutBtn.setBackground(new java.awt.Color(173, 192, 234));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 110, -1));

        AddNewHrLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddNewHrLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addNewEmp.png"))); // NOI18N
        AddNewHrLBL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(AddNewHrLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 210, 220));

        passBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(passBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, 40));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setText("Welcome , ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 110, 40));

        passLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        passLbl.setText("Password");
        jPanel1.add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 110, 30));

        NameBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(NameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 340, 40));

        nameLbl1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        nameLbl1.setText("Company name ");
        jPanel1.add(nameLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 315, 140, 30));

        mailLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        mailLbl.setText("Email ");
        jPanel1.add(mailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 110, 30));

        mailBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(mailBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 340, 40));

        MobLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        MobLbl.setText("Mobile no");
        jPanel1.add(MobLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 110, 30));

        mobileBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobileBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(mobileBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 340, 40));

        cnfPassLbl.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        cnfPassLbl.setText("Confirm Password");
        jPanel1.add(cnfPassLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 150, 30));

        cnfPassBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnfPassBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(cnfPassBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 340, 40));
        jPanel1.add(DipperSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 1030, 20));

        nameLbl2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        nameLbl2.setText("Name ");
        jPanel1.add(nameLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 110, 30));

        lblHrId.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jPanel1.add(lblHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 315, 120, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 345, 180, 10));

        txtCompany.setBackground(new java.awt.Color(243, 246, 254));
        txtCompany.setFont(new java.awt.Font("Heiti TC", 0, 18)); // NOI18N
        txtCompany.setBorder(null);
        txtCompany.setOpaque(false);
        jPanel1.add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 325, 180, 20));

        nameLbl4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        nameLbl4.setText("Hr Id :-");
        jPanel1.add(nameLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 315, 60, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 345, 180, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewHrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewHrBtnActionPerformed
        
        if(validateInputs()==false){
           JOptionPane.showMessageDialog(null,"Please input all the fields","Error!",JOptionPane.ERROR_MESSAGE);
           return;
        }
        if(matchPasswords()==false){
            JOptionPane.showMessageDialog(null,"Passwords do not match!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            HrPojo hr=new HrPojo();
            hr.setUserId(txtMail.getText().trim().toUpperCase());
            hr.setHrId(lblHrId.getText().trim());
            hr.setHrName(txtName.getText().trim());
            hr.setCompanyName(txtCompany.getText().trim());
            hr.setPassword(password);
            hr.setProfession(jcProff.getSelectedItem().toString());
            hr.setPhone(txtMob.getText().trim());
            hr.setType("Hr");
            int result=HrDAO.addNewHr(hr);
            if(result==1){
                JOptionPane.showMessageDialog(null,"Record Added!","Success!",JOptionPane.INFORMATION_MESSAGE);
                clearAll();
                loadId();
                return;
            }
            else if(result==-1){
                JOptionPane.showMessageDialog(null,"This Email Id Is Already Registered","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{
                JOptionPane.showMessageDialog(null,"Cannot add the record","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
         catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
         }  
        
        
    }//GEN-LAST:event_addNewHrBtnActionPerformed
    private void clearAll(){
        txtName.setText("");
        txtMail.setText("");
        txtCompany.setText("");
        txtMob.setText("");
        txtPwd.setText("");
        txtCnfrmPwd.setText("");
        jcProff.setSelectedIndex(0);
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void txtMobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddNewHrFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddNewHrLBL;
    private javax.swing.JSeparator DipperSeperator;
    private javax.swing.JLabel MobLbl;
    private javax.swing.JLabel NameBar;
    private javax.swing.JSeparator UpperSeperator;
    private javax.swing.JButton addNewHrBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cnfPassBar;
    private javax.swing.JLabel cnfPassLbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcProff;
    private javax.swing.JLabel lblHrId;
    private javax.swing.JLabel lblName;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel mailBar;
    private javax.swing.JLabel mailLbl;
    private javax.swing.JLabel mobileBar;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel passBar;
    private javax.swing.JLabel passLbl;
    private javax.swing.JLabel proLbl;
    private javax.swing.JPasswordField txtCnfrmPwd;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMob;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
