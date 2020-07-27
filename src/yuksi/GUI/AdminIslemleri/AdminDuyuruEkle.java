package yuksi.GUI.AdminIslemleri;

import yuksi.Giris;
import VeriErisimSiniflari.Baglan;
import VeriErisimSiniflari.Ekle;
import VeriErisimSiniflari.Guncelle;
import VeriErisimSiniflari.Sil;
import VeriErisimSiniflari.VerileriGoster;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminDuyuruEkle extends javax.swing.JPanel {

    JFrame frame;
    Connection con;
    VerileriGoster vg;
    public DefaultTableModel modelTable;
    String id;
    Baglan b;
    boolean guncelle = false;
    public static int duyuruId;

    public AdminDuyuruEkle(JFrame frame, String id) {
        initComponents();
        this.frame = frame;
        frame.setContentPane(this);
        frame.setSize(1300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;database=Kutuphane;user=root;password=1234");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası");
        }
        this.id = id;
        String sorgu = "select duyuruId,baslik,tarih,ileten from Duyurular";
        vg = new VerileriGoster(con, sorgu);
        modelTable = vg.getTable((DefaultTableModel) jTable1.getModel());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boxDuyuru = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDuzenle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        boxIleten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxBaslik = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setText("Duyuru Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(320, 90, 110, 22);

        jButton2.setText("Üye İşlem");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(20, 90, 100, 22);

        jButton3.setText("Kitap İşlem");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(120, 90, 100, 22);

        jButton4.setText("Kitap Onay");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(220, 90, 100, 22);

        jButton5.setText("Yetkili Ekle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(430, 90, 100, 22);

        btnCikis.setText("Çıkış");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });
        add(btnCikis);
        btnCikis.setBounds(1100, 30, 100, 23);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        boxDuyuru.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(boxDuyuru);
        boxDuyuru.setBounds(120, 90, 1080, 70);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(139, 69, 0));
        jLabel3.setText("İleten");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 80, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(139, 69, 0));
        jLabel4.setText("Duyuru");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 90, 100, 22);

        btnDuzenle.setText("Düzenle");
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });
        jPanel1.add(btnDuzenle);
        btnDuzenle.setBounds(530, 180, 100, 23);

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel1.add(btnSil);
        btnSil.setBounds(670, 180, 120, 23);
        jPanel1.add(boxIleten);
        boxIleten.setBounds(120, 60, 1070, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(139, 69, 0));
        jLabel5.setText("Başlık");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 20, 80, 22);
        jPanel1.add(boxBaslik);
        boxBaslik.setBounds(120, 20, 1070, 22);

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        jPanel1.add(btnEkle);
        btnEkle.setBounds(380, 180, 100, 23);

        add(jPanel1);
        jPanel1.setBounds(10, 120, 1210, 210);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DuyuruId", "Başlık", "Tarih", "İleten"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("DuyuruId");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Başlık");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Tarih");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("İleten");
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 1180, 180);

        add(jPanel2);
        jPanel2.setBounds(10, 330, 1210, 220);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 69, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KÜTÜPHANE TAKİP SİSTEMİ");
        add(jLabel1);
        jLabel1.setBounds(260, 20, 600, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminUyeIslem aui = new AdminUyeIslem(frame);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminKitapIslem aki = new AdminKitapIslem(frame);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AdminKitapOnay ako = new AdminKitapOnay(frame);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AdminYetkiliEkle aye = new AdminYetkiliEkle(frame);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            guncelle = !guncelle;
            if (guncelle == true) {
                JOptionPane.showMessageDialog(this, "Guncelleme yapılıyor.");
                try {
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("Select baslik,ileten,tarih from Duyurular "
                            + " where duyuruId=" + modelTable.getValueAt(jTable1.getSelectedRow(), 0));
                    rs.next();
                    boxBaslik.setText(rs.getString(1));
                    boxIleten.setText(rs.getString(2));

                } catch (SQLException ex) {
                    System.out.println("Kitap bilgilerini alırken hata oluştu");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Guncelleme islemi iptal edildi.");
            }
        }
    }//GEN-LAST:event_btnDuzenleActionPerformed
    private int getDuyuruId() {
        int x = 0;

        try {
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("Select max(duyuruId) from Duyurular");
            rs.next();
            x = rs.getInt(1);

        } catch (SQLException ex) {
            System.out.println("DuyuruId hata oluştu");
        }
        return ++x;
    }
    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        if (guncelle == true) {
            if (!boxBaslik.getText().equals("") && !boxIleten.getText().equals("")) {
                String sorgu = "update Duyurular set baslik='" + boxBaslik.getText() + "',"
                        + "ileten='" + boxIleten.getText() + "',icerik='" + boxDuyuru.getText() + "'"
                        + " where duyuruId=" + modelTable.getValueAt(jTable1.getSelectedRow(), 0);
                Guncelle g = new Guncelle(con, sorgu);
                for (int i = modelTable.getRowCount() - 1; i >= 0; i--) {
                    modelTable.removeRow(i);
                }
                modelTable = vg.getTable((DefaultTableModel) jTable1.getModel());

                guncelle = false;
            }
        } else {
            if (!boxBaslik.getText().equals("") && !boxIleten.getText().equals("")) {
                String sorgu = "INSERT INTO Duyurular (duyuruId,baslik,ileten,tarih,icerik)"
                        + " VALUES (" + (getDuyuruId()) + ",'" + boxBaslik.getText() + "','" + boxIleten.getText() + "',"
                        + "getdate()" + ",'" + boxDuyuru.getText() + "')";
                Ekle e = new Ekle(con, sorgu);
                for (int i = modelTable.getRowCount() - 1; i >= 0; i--) {
                    modelTable.removeRow(i);
                }
                modelTable = vg.getTable((DefaultTableModel) jTable1.getModel());

            } else {
                JOptionPane.showMessageDialog(this, "Bütün Alanları Doldurun");
            }
        }
    }//GEN-LAST:event_btnEkleActionPerformed
    Sil sil;
    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        String sorgu = "DELETE  Duyurular WHERE duyuruId='"
                + modelTable.getValueAt(jTable1.getSelectedRow(), 0) + "'";
        sil = new Sil(con, sorgu);
        for (int i = modelTable.getRowCount() - 1; i >= 0; i--) {
            modelTable.removeRow(i);
        }
        modelTable = vg.getTable((DefaultTableModel) jTable1.getModel());
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        Giris ge = new Giris(frame);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedColumn() == 1) {
            duyuruId = getDuyurId();
            System.out.println("duyuru" + getDuyurId());
            DuyuruIcerik di = new DuyuruIcerik(frame, id);
        }
    }//GEN-LAST:event_jTable1MouseClicked
    private int getDuyurId() {
        int x = 0;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select duyuruId from Duyurular "
                    + " where duyuruId=" + modelTable.getValueAt(jTable1.getSelectedRow(), 0));
            rs.next();
            x = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println("DuyurId hata oluştu");
        }
        return x;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxBaslik;
    private javax.swing.JTextField boxDuyuru;
    private javax.swing.JTextField boxIleten;
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
