/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Service.NhanVienService;
import Service.impl.NhanVienServiceimpl;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import View.BanHang;
import java.awt.Frame;
import java.awt.Window;

import java.awt.PopupMenu;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Home extends javax.swing.JFrame {

    public NhanVienService nvs = new NhanVienServiceimpl();

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        lbHoTen.setText(nvs.getNVOnline().get(0).getHoTen());

    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnBanHang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnThongKe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnLogOut = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        pnDoiMK = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(766, 512));

        jPanel1.setBackground(new java.awt.Color(25, 30, 50));

        pnBanHang.setBackground(new java.awt.Color(25, 30, 50));
        pnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBanHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBanHangMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/checkout_50px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BÁN HÀNG");

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        pnThongKe.setBackground(new java.awt.Color(25, 30, 50));
        pnThongKe.setDoubleBuffered(false);
        pnThongKe.setEnabled(false);
        pnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnThongKeMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/analytics_50px.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THỐNG KÊ");

        javax.swing.GroupLayout pnThongKeLayout = new javax.swing.GroupLayout(pnThongKe);
        pnThongKe.setLayout(pnThongKeLayout);
        pnThongKeLayout.setHorizontalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThongKeLayout.setVerticalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        pnSanPham.setBackground(new java.awt.Color(25, 30, 50));
        pnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/used_product_50px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SẢN PHẨM");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnNhanVien.setBackground(new java.awt.Color(25, 30, 50));
        pnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_groups_50px.png"))); // NOI18N
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NHÂN VIÊN");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnLogOut.setBackground(new java.awt.Color(25, 30, 50));
        pnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnLogOutMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/export_50px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ĐĂNG XUẤT");

        javax.swing.GroupLayout pnLogOutLayout = new javax.swing.GroupLayout(pnLogOut);
        pnLogOut.setLayout(pnLogOutLayout);
        pnLogOutLayout.setHorizontalGroup(
            pnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jLabel10))
        );
        pnLogOutLayout.setVerticalGroup(
            pnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(25, 30, 50));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Xin chào!!!");

        lbHoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(255, 255, 255));
        lbHoTen.setText("jLabel12");

        pnDoiMK.setBackground(new java.awt.Color(25, 30, 50));
        pnDoiMK.setPreferredSize(new java.awt.Dimension(0, 68));
        pnDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnDoiMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnDoiMKMouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/change_50px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ĐỔI MK");

        javax.swing.GroupLayout pnDoiMKLayout = new javax.swing.GroupLayout(pnDoiMK);
        pnDoiMK.setLayout(pnDoiMKLayout);
        pnDoiMKLayout.setHorizontalGroup(
            pnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDoiMKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDoiMKLayout.setVerticalGroup(
            pnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseClicked
        Frame[] allFrames = Frame.getFrames();
        for (Frame fr : allFrames) {
            System.out.println(fr);
            String specificFrameName = fr.getClass().getName();
            if (!specificFrameName.equals("View.Home")) {
                fr.dispose();
            }
        }
        BanHang bh = new BanHang(jPanel2.getLocationOnScreen());
        bh.getObj(jPanel2.getLocationOnScreen()).setVisible(true);
    }//GEN-LAST:event_pnBanHangMouseClicked

    private void pnBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseEntered
        pnBanHang.setBackground(new Color(135, 142, 205));
    }//GEN-LAST:event_pnBanHangMouseEntered

    private void pnBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseExited
        pnBanHang.setBackground(new Color(25, 30, 50));
    }//GEN-LAST:event_pnBanHangMouseExited

    private void pnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongKeMouseEntered
        pnThongKe.setBackground(new Color(135, 142, 205));
    }//GEN-LAST:event_pnThongKeMouseEntered

    private void pnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongKeMouseExited
        pnThongKe.setBackground(new Color(25, 30, 50));
    }//GEN-LAST:event_pnThongKeMouseExited

    private void pnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongKeMouseClicked
        Frame[] allFrames = Frame.getFrames();
        for (Frame fr : allFrames) {
            System.out.println(fr);
            String specificFrameName = fr.getClass().getName();
            if (!specificFrameName.equals("View.Home")) {
                fr.dispose();
            }
        }
        List<DomainModel.NhanVien> nv = nvs.getNVOnline();
        DomainModel.NhanVien newNV = nv.get(0);
        String tenChucVu = newNV.getChucVu().getTenChucVu();
        if (nvs.getNVOnline().get(nvs.getNVOnline().size() - 1).getChucVu().getTenChucVu().equals("Nhân Viên")) {
            JOptionPane.showMessageDialog(this, "Bạn cần đăng nhập quyền quản trị");
        } else {
            ThongKe tk = new ThongKe(jPanel2.getLocationOnScreen());
            tk.getThongKe(jPanel2.getLocationOnScreen()).setVisible(true);
        }
    }//GEN-LAST:event_pnThongKeMouseClicked

    private void pnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseClicked
        Frame[] allFrames = Frame.getFrames();
        for (Frame fr : allFrames) {
            System.out.println(fr);
            String specificFrameName = fr.getClass().getName();
            if (!specificFrameName.equals("View.Home")) {
                fr.dispose();
            }
        }
        ViewChiTietSP sp = new ViewChiTietSP(jPanel2.getLocationOnScreen());
        sp.getManSanPham(jPanel2.getLocationOnScreen()).setVisible(true);
    }//GEN-LAST:event_pnSanPhamMouseClicked

    private void pnSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseEntered
        pnSanPham.setBackground(new Color(135, 142, 205));
    }//GEN-LAST:event_pnSanPhamMouseEntered

    private void pnSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseExited
        pnSanPham.setBackground(new Color(25, 30, 50));
    }//GEN-LAST:event_pnSanPhamMouseExited

    private void pnNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseExited
        pnNhanVien.setBackground(new Color(25, 30, 50));
    }//GEN-LAST:event_pnNhanVienMouseExited

    private void pnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseEntered
        pnNhanVien.setBackground(new Color(135, 142, 205));
    }//GEN-LAST:event_pnNhanVienMouseEntered

    private void pnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseClicked
        Frame[] allFrames = Frame.getFrames();
        for (Frame fr : allFrames) {
            System.out.println(fr);
            String specificFrameName = fr.getClass().getName();
            if (!specificFrameName.equals("View.Home")) {
                fr.dispose();
            }
        }
        if (nvs.getNVOnline().get(nvs.getNVOnline().size() - 1).getChucVu().getTenChucVu().equals("Nhân Viên")) {
            JOptionPane.showMessageDialog(this, "Bạn cần đăng nhập quyền quản trị");
        } else {
            ViewNhanVien nv = new ViewNhanVien(jPanel2.getLocationOnScreen());
            nv.getNhanVien(jPanel2.getLocationOnScreen()).setVisible(true);
        }
    }//GEN-LAST:event_pnNhanVienMouseClicked

    private void pnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogOutMouseEntered
        pnLogOut.setBackground(new Color(135, 142, 205));
    }//GEN-LAST:event_pnLogOutMouseEntered

    private void pnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogOutMouseExited
        pnLogOut.setBackground(new Color(25, 30, 50));
    }//GEN-LAST:event_pnLogOutMouseExited

    private void pnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogOutMouseClicked
        new Login().setVisible(true);
        Frame[] allFrames = Frame.getFrames();
        for (Frame fr : allFrames) {
            //uncomment the below line to see frames names and properties/atr.
            System.out.println(fr);
            //to get specific frame name
            String specificFrameName = fr.getClass().getName();
            //if found frame that I want I can close or any you want
            //GUIS.CheckForCustomer is my specific frame name that I want to close.
            if (!specificFrameName.equals("View.Login")) {
                //close the frame
                fr.dispose();
            }
        }
        for (DomainModel.NhanVien nv : nvs.getNVOnline()) {
            nv.setTrangThai(1);
            nvs.update(nv);
        }
        this.dispose();
    }//GEN-LAST:event_pnLogOutMouseClicked

    private void pnDoiMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDoiMKMouseEntered
        pnDoiMK.setBackground(new Color(135, 142, 205));
    }//GEN-LAST:event_pnDoiMKMouseEntered

    private void pnDoiMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDoiMKMouseExited
        pnDoiMK.setBackground(new Color(25, 30, 50));
    }//GEN-LAST:event_pnDoiMKMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnDoiMK;
    private javax.swing.JPanel pnLogOut;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnThongKe;
    // End of variables declaration//GEN-END:variables
}
