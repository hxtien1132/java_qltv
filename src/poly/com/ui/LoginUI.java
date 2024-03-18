/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.ui;

import javax.swing.JOptionPane;
import poly.com.dao.AdminDAO;
import poly.com.dao.SinhVienDAO;
import poly.com.model.Admin;
import poly.com.model.SinhVien;
/**
 *
 * @author PC
 */
public class LoginUI extends javax.swing.JFrame {
    public static String us;
    public static String ps;
    Admin ad ;
    AdminDAO addao = new AdminDAO();
    SinhVien sv = new SinhVien();
    SinhVienDAO svdao = new SinhVienDAO();
    /**
     * Creates new form Login
     */
    public LoginUI() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public String getUser(){
    return  us;
    }
    public String getPass(){
    return  ps;
    }
    public boolean valiform() {
        if (txtUser.getText().equals("") || txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ các thông tin","Error",1);
            return false;
        }else 
        return true;
    };
    public void DangNhap(){
         if(valiform()==true){
            if(rdoAdmin.isSelected()==true){
            ad = addao.dangnhap(txtUser.getText(), txtPass.getText());
            if(ad!=null){
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                us = txtUser.getText();
                ps = txtPass.getText();
                QuanLyUI ql = new QuanLyUI();
                ql.setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
            }
        } else if(rdoSinhVien.isSelected()==true){
            sv = svdao.dangnhap(txtUser.getText(), txtPass.getText());
            if(sv!=null){
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                us = txtUser.getText();
                SinhVienUI svui = new SinhVienUI();
                svui.setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
            }   
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn vai trò của bạn");
        }
        }
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
        pnlForm = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        rdoAdmin = new javax.swing.JRadioButton();
        rdoSinhVien = new javax.swing.JRadioButton();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        pnl1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 550));

        pnlForm.setBackground(new java.awt.Color(197, 197, 197));
        pnlForm.setMinimumSize(new java.awt.Dimension(900, 550));
        pnlForm.setPreferredSize(new java.awt.Dimension(900, 550));

        lblUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUser.setText("Username");

        lblPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPass.setText("Password");

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        buttonGroup1.add(rdoAdmin);
        rdoAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdoAdmin.setText("ADMIN");

        buttonGroup1.add(rdoSinhVien);
        rdoSinhVien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdoSinhVien.setText("Sinh Viên");

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/login.jpg"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/cancel.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        pnl1.setBackground(new java.awt.Color(0, 51, 102));
        pnl1.setForeground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("QUẢN LÝ THƯ VIỆN");

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/8.png"))); // NOI18N

        lblSignIn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(0, 51, 153));
        lblSignIn.setText("Sign In");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPass)
                            .addComponent(lblUser))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoAdmin))
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(rdoSinhVien))
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126)))
                .addGap(57, 57, 57))
            .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFormLayout.createSequentialGroup()
                    .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 567, Short.MAX_VALUE)))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSignIn)
                .addGap(27, 27, 27)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addGap(35, 35, 35)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass))
                .addGap(31, 31, 31)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoAdmin)
                    .addComponent(rdoSinhVien))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
       DangNhap();
                
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoSinhVien;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}