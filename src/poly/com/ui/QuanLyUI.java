/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.ui;

import java.util.ArrayList;
import poly.com.dao.AdminDAO;
import poly.com.dao.ThongKeDAO;
import poly.com.model.Admin;
import poly.com.ui.QuanLyPhieuMuon;
import poly.com.ui.QuanLySach;
import poly.com.ui.QuanLySinhVien;
import poly.com.ui.QuanLyTheLoaiSach;

/**
 *
 * @author PC
 */
public class QuanLyUI extends javax.swing.JFrame {

    ThongKeDAO tkdao = new ThongKeDAO();
    ArrayList<Admin> listad;
    LoginUI lg = new LoginUI();
    String us = lg.getUser();
    public QuanLyUI() {
        initComponents();
        setLocationRelativeTo(null);
        loadad();
        TongSV();
        TongSach();
        TongTheLoaiTLS();
        TongPM();
    }
    public void TongTheLoaiTLS(){
        int tongso = tkdao.TKsoTheLoaiTLS();
        lblSoTLS.setText(String.valueOf(tongso));
    }
    public void TongSV(){
        int tongso = tkdao.TKsoSV();
        lblSoSV.setText(String.valueOf(tongso));
    }
    public void TongSach(){
        int tongso = tkdao.TKsoSach();
        lblSoSach.setText(String.valueOf(tongso));
    }
    public void TongPM(){
        int tongso = tkdao.TKTongPM();
        lblSoPM.setText(String.valueOf(tongso));
    }
    public void loadad(){
        AdminDAO addao =new AdminDAO() ;
        listad = addao.LoadMa(us);
            
            for(Admin ad: listad){
                Object[] row = new Object[]{
                    ad.getUsername(),ad.getPassword(),ad.getTen()
                };

            lblName.setText(ad.getTen());


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

        jMenuItem4 = new javax.swing.JMenuItem();
        pnlFrom = new javax.swing.JPanel();
        pnlThongKe = new javax.swing.JPanel();
        lblHinhTK = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        pnlPM = new javax.swing.JPanel();
        lblHinhPM = new javax.swing.JLabel();
        lblQLPM = new javax.swing.JLabel();
        lblPM = new javax.swing.JLabel();
        lblSoPM = new javax.swing.JLabel();
        pnlTLS = new javax.swing.JPanel();
        lblHinhTLS = new javax.swing.JLabel();
        lblQLTLS = new javax.swing.JLabel();
        lblTLS = new javax.swing.JLabel();
        lblSoTLS = new javax.swing.JLabel();
        pnlQLS = new javax.swing.JPanel();
        lblHinhS = new javax.swing.JLabel();
        lblQLS = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        lblSoSach = new javax.swing.JLabel();
        pnlQLSV = new javax.swing.JPanel();
        lblHinhSV = new javax.swing.JLabel();
        lblQLSV = new javax.swing.JLabel();
        lblSV = new javax.swing.JLabel();
        lblSoSV = new javax.swing.JLabel();
        pnlWelcome = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        mnb = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniThoat = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniQLPM = new javax.swing.JMenuItem();
        mniQLS = new javax.swing.JMenuItem();
        mniQLSV = new javax.swing.JMenuItem();
        mniQLTL = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mnuTroGiup = new javax.swing.JMenu();
        mniGioiThieu = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setSize(new java.awt.Dimension(900, 650));

        pnlFrom.setBackground(new java.awt.Color(197, 197, 197));
        pnlFrom.setMinimumSize(new java.awt.Dimension(900, 650));
        pnlFrom.setPreferredSize(new java.awt.Dimension(900, 650));

        pnlThongKe.setBackground(new java.awt.Color(0, 153, 0));
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseClicked(evt);
            }
        });

        lblHinhTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/4.png"))); // NOI18N

        lblThongKe.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setText("Thống Kê");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblHinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblThongKe)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongKeLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lblThongKe)
                .addGap(63, 63, 63))
            .addComponent(lblHinhTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlPM.setBackground(new java.awt.Color(204, 0, 204));
        pnlPM.setPreferredSize(new java.awt.Dimension(380, 170));
        pnlPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPMMouseClicked(evt);
            }
        });

        lblHinhPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/7.png"))); // NOI18N

        lblQLPM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLPM.setForeground(new java.awt.Color(255, 255, 255));
        lblQLPM.setText("Quản Lý");

        lblPM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblPM.setForeground(new java.awt.Color(255, 255, 255));
        lblPM.setText("Phiếu Mượn");

        lblSoPM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSoPM.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlPMLayout = new javax.swing.GroupLayout(pnlPM);
        pnlPM.setLayout(pnlPMLayout);
        pnlPMLayout.setHorizontalGroup(
            pnlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhPM, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPMLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPM))
                    .addGroup(pnlPMLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblQLPM))
                    .addGroup(pnlPMLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblSoPM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlPMLayout.setVerticalGroup(
            pnlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPMLayout.createSequentialGroup()
                        .addComponent(lblQLPM)
                        .addGap(18, 18, 18)
                        .addComponent(lblPM)
                        .addGap(18, 18, 18)
                        .addComponent(lblSoPM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(lblHinhPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlTLS.setBackground(new java.awt.Color(181, 181, 50));
        pnlTLS.setPreferredSize(new java.awt.Dimension(380, 170));
        pnlTLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTLSMouseClicked(evt);
            }
        });

        lblHinhTLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/1.png"))); // NOI18N

        lblQLTLS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLTLS.setForeground(new java.awt.Color(255, 255, 255));
        lblQLTLS.setText("Quản Lý");

        lblTLS.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblTLS.setForeground(new java.awt.Color(255, 255, 255));
        lblTLS.setText("Thể Loại Sách");

        lblSoTLS.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSoTLS.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlTLSLayout = new javax.swing.GroupLayout(pnlTLS);
        pnlTLS.setLayout(pnlTLSLayout);
        pnlTLSLayout.setHorizontalGroup(
            pnlTLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTLSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTLSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTLS))
                    .addGroup(pnlTLSLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblQLTLS))
                    .addGroup(pnlTLSLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblSoTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTLSLayout.setVerticalGroup(
            pnlTLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTLSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTLSLayout.createSequentialGroup()
                        .addComponent(lblQLTLS)
                        .addGap(18, 18, 18)
                        .addComponent(lblTLS)
                        .addGap(18, 18, 18)
                        .addComponent(lblSoTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(lblHinhTLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQLS.setBackground(new java.awt.Color(255, 102, 51));
        pnlQLS.setPreferredSize(new java.awt.Dimension(380, 170));
        pnlQLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQLSMouseClicked(evt);
            }
        });

        lblHinhS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/3.png"))); // NOI18N

        lblQLS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLS.setForeground(new java.awt.Color(255, 255, 255));
        lblQLS.setText("Quản Lý");

        lblS.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblS.setForeground(new java.awt.Color(255, 255, 255));
        lblS.setText("Sách");

        lblSoSach.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSoSach.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlQLSLayout = new javax.swing.GroupLayout(pnlQLS);
        pnlQLS.setLayout(pnlQLSLayout);
        pnlQLSLayout.setHorizontalGroup(
            pnlQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLSLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(pnlQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQLS)
                            .addComponent(lblS)))
                    .addGroup(pnlQLSLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblSoSach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlQLSLayout.setVerticalGroup(
            pnlQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLSLayout.createSequentialGroup()
                        .addComponent(lblQLS)
                        .addGap(18, 18, 18)
                        .addComponent(lblS)
                        .addGap(18, 18, 18)
                        .addComponent(lblSoSach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblHinhS, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQLSV.setBackground(new java.awt.Color(255, 51, 51));
        pnlQLSV.setPreferredSize(new java.awt.Dimension(380, 170));
        pnlQLSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlQLSVMouseClicked(evt);
            }
        });

        lblHinhSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/2.png"))); // NOI18N

        lblQLSV.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQLSV.setForeground(new java.awt.Color(255, 255, 255));
        lblQLSV.setText("Quản Lý");

        lblSV.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSV.setForeground(new java.awt.Color(255, 255, 255));
        lblSV.setText("Sinh Viên");

        lblSoSV.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSoSV.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlQLSVLayout = new javax.swing.GroupLayout(pnlQLSV);
        pnlQLSV.setLayout(pnlQLSVLayout);
        pnlQLSVLayout.setHorizontalGroup(
            pnlQLSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLSVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlQLSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLSVLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblQLSV))
                    .addGroup(pnlQLSVLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblSV))
                    .addGroup(pnlQLSVLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlQLSVLayout.setVerticalGroup(
            pnlQLSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLSVLayout.createSequentialGroup()
                        .addComponent(lblQLSV)
                        .addGap(18, 18, 18)
                        .addComponent(lblSV)
                        .addGap(18, 18, 18)
                        .addComponent(lblSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblHinhSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlWelcome.setBackground(new java.awt.Color(51, 102, 255));
        pnlWelcome.setPreferredSize(new java.awt.Dimension(380, 170));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/com/icon/5.png"))); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome");

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFromLayout = new javax.swing.GroupLayout(pnlFrom);
        pnlFrom.setLayout(pnlFromLayout);
        pnlFromLayout.setHorizontalGroup(
            pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFromLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPM, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(pnlQLS, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(pnlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlTLS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(pnlQLSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(pnlThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        pnlFromLayout.setVerticalGroup(
            pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFromLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlQLSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFromLayout.createSequentialGroup()
                        .addComponent(pnlTLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFromLayout.createSequentialGroup()
                        .addComponent(pnlQLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        mnuHeThong.setText("Hệ Thống");

        mniDoiMatKhau.setText("Đổi mật khẩu ");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);

        mniDangXuat.setText("Đăng Xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        mniThoat.setText("Thoát");
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniThoat);

        mnb.add(mnuHeThong);

        mnuQuanLy.setText("Quản Lý");

        mniQLPM.setText("Quản Lý Phiếu Mượn");
        mniQLPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLPMActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLPM);

        mniQLS.setText("Quản Lý Sách");
        mniQLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLSActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLS);

        mniQLSV.setText("Quản Lý Sinh Viên");
        mniQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLSVActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLSV);

        mniQLTL.setText("Quản Lý Thể Loại");
        mniQLTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLTLActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLTL);

        mnb.add(mnuQuanLy);

        mnuThongKe.setText("Thống Kê");
        mnuThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongKeActionPerformed(evt);
            }
        });
        mnb.add(mnuThongKe);

        mnuTroGiup.setText("Trợ Giúp");

        mniGioiThieu.setText("Giới Thiệu");
        mnuTroGiup.add(mniGioiThieu);

        mnb.add(mnuTroGiup);

        setJMenuBar(mnb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        LoginUI lg = new LoginUI();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniThoatActionPerformed

    private void pnlQLSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQLSVMouseClicked
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlQLSVMouseClicked

    private void pnlQLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQLSMouseClicked
        QuanLySach qls = new QuanLySach();
        qls.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlQLSMouseClicked

    private void pnlTLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTLSMouseClicked
        QuanLyTheLoaiSach qltls = new QuanLyTheLoaiSach();
        qltls.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlTLSMouseClicked

    private void pnlPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPMMouseClicked
        QuanLyPhieuMuon qlpm = new QuanLyPhieuMuon();
        qlpm.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlPMMouseClicked

    private void pnlThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseClicked
        ThongKeUI tk = new ThongKeUI();
        tk.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlThongKeMouseClicked

    private void mniQLPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLPMActionPerformed
        QuanLyPhieuMuon qlpm = new QuanLyPhieuMuon();
        qlpm.setVisible(true);
        dispose();
    }//GEN-LAST:event_mniQLPMActionPerformed

    private void mniQLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLSActionPerformed
        QuanLySach qls = new QuanLySach();
        qls.setVisible(true);
        dispose();
    }//GEN-LAST:event_mniQLSActionPerformed

    private void mniQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLSVActionPerformed
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.setVisible(true);
        dispose();
    }//GEN-LAST:event_mniQLSVActionPerformed

    private void mniQLTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLTLActionPerformed
        QuanLyTheLoaiSach qltls = new QuanLyTheLoaiSach();
        qltls.setVisible(true);
        dispose();
    }//GEN-LAST:event_mniQLTLActionPerformed

    private void mnuThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongKeActionPerformed
        ThongKeUI tk = new ThongKeUI();
        tk.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuThongKeActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        DoiMatKhauUI dmk = new DoiMatKhauUI();
        dmk.setVisible(true);
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblHinhPM;
    private javax.swing.JLabel lblHinhS;
    private javax.swing.JLabel lblHinhSV;
    private javax.swing.JLabel lblHinhTK;
    private javax.swing.JLabel lblHinhTLS;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPM;
    private javax.swing.JLabel lblQLPM;
    private javax.swing.JLabel lblQLS;
    private javax.swing.JLabel lblQLSV;
    private javax.swing.JLabel lblQLTLS;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblSV;
    private javax.swing.JLabel lblSoPM;
    private javax.swing.JLabel lblSoSV;
    private javax.swing.JLabel lblSoSach;
    private javax.swing.JLabel lblSoTLS;
    private javax.swing.JLabel lblTLS;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JMenuBar mnb;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniQLPM;
    private javax.swing.JMenuItem mniQLS;
    private javax.swing.JMenuItem mniQLSV;
    private javax.swing.JMenuItem mniQLTL;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlFrom;
    private javax.swing.JPanel pnlPM;
    private javax.swing.JPanel pnlQLS;
    private javax.swing.JPanel pnlQLSV;
    private javax.swing.JPanel pnlTLS;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}