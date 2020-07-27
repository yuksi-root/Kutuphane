package yuksi.GUI.AdminIslemleri;

import VeriErisimSiniflari.Baglan;
import VeriErisimSiniflari.VerileriGoster;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import yuksi.GUI.UyeIslemleri.UyeGirisAnasayfa;

public class DuyuruIcerik extends javax.swing.JPanel {

    JFrame frame;
    Connection con;
    VerileriGoster vg;
    AdminDuyuruEkle ade;
    String id;
    UyeGirisAnasayfa ugax;
    Baglan b;

    public DuyuruIcerik(JFrame frame, String id) {
        initComponents();

        frame.setContentPane(this);
        frame.setSize(1300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame = frame;
        frame.setVisible(true);
        System.out.println("kullaniciId" + id);
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;database=Kutuphane;user=root;password=1234");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası");
        }
        this.id = id;
        try {
            System.out.println("uga" + ugax.duyuruId2);
            ResultSet rs;
            Statement stmt = con.createStatement();
            if (getYetki().equals("Öğrenci") || getYetki().equals("Öğretmen")) {
                rs = stmt.executeQuery("Select baslik,ileten,tarih,icerik from Duyurular "
                        + " where duyuruId=" + ugax.duyuruId2);
            } else {
                rs = stmt.executeQuery("Select baslik,ileten,tarih,icerik from Duyurular "
                        + " where duyuruId=" + ade.duyuruId);
            }

            rs.next();
            lblBaslik.setText(rs.getString(1));
            lblIleten.setText(rs.getString(2));
            lblTarih.setText(rs.getString(3));
            area1.setText(rs.getString(4));

        } catch (SQLException ex) {
            System.out.println("Duyuru Bilgilerini alırken hata oluştu");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icerik = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        lblBaslik = new javax.swing.JLabel();
        lblTarih = new javax.swing.JLabel();
        lblIleten = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();

        setLayout(null);

        icerik.setBackground(new java.awt.Color(255, 255, 255));
        icerik.setLayout(null);

        area1.setColumns(20);
        area1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        icerik.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 1150, 400);

        add(icerik);
        icerik.setBounds(17, 86, 1180, 440);

        lblBaslik.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblBaslik.setText("BASLIK");
        add(lblBaslik);
        lblBaslik.setBounds(20, 10, 510, 40);

        lblTarih.setText("TARİH");
        add(lblTarih);
        lblTarih.setBounds(830, 20, 140, 40);

        lblIleten.setText("İLETEN");
        add(lblIleten);
        lblIleten.setBounds(990, 10, 100, 50);

        btnGeri.setText("Geri Dön");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });
        add(btnGeri);
        btnGeri.setBounds(1091, 20, 100, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        System.out.println("yetkiId=" + id);
        if (getYetki().equals("Öğrenci") || getYetki().equals("Öğretmen")) {
            UyeGirisAnasayfa uga = new UyeGirisAnasayfa(frame, id);
        } else {
            AdminDuyuruEkle adex = new AdminDuyuruEkle(frame, id);
        }
    }//GEN-LAST:event_btnGeriActionPerformed
    private String getYetki() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select yetki from Kullanici"
                    + " where id='" + id + "'");
            rs.next();
            return rs.getString(1);
        } catch (SQLException ex) {
            System.out.println("getDYetki hata oluştu");
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JButton btnGeri;
    private javax.swing.JPanel icerik;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaslik;
    private javax.swing.JLabel lblIleten;
    private javax.swing.JLabel lblTarih;
    // End of variables declaration//GEN-END:variables
}
