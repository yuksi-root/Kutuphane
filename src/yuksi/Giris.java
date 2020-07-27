package yuksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import yuksi.GUI.AdminIslemleri.AdminUyeIslem;
import yuksi.GUI.UyeIslemleri.UyeGirisAnasayfa;
import yuksi.GUI.UyeIslemleri.UyeKayit;

public class Giris extends javax.swing.JPanel {

    Connection con;
    JFrame frame;

    public Giris(JFrame frame) {
        initComponents();

        this.frame = frame;
        frame.setContentPane(this);
        frame.setBounds(100, 100, 472, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxKad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        btnKayit = new javax.swing.JButton();
        boxSifre = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(472, 350));
        setMinimumSize(new java.awt.Dimension(472, 350));
        setPreferredSize(new java.awt.Dimension(472, 350));
        setVerifyInputWhenFocusTarget(false);
        setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KÜTÜPHANE TAKİP SİSTEMİ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1);
        jLabel1.setBounds(80, 40, 2, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(139, 69, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("KÜTÜPHANE TAKİP SİSTEMİ");
        add(jLabel2);
        jLabel2.setBounds(30, 50, 400, 25);

        boxKad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKadActionPerformed(evt);
            }
        });
        add(boxKad);
        boxKad.setBounds(220, 130, 150, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(139, 69, 0));
        jLabel3.setText("Kullanıcı Adı : ");
        add(jLabel3);
        jLabel3.setBounds(80, 130, 100, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(139, 69, 0));
        jLabel4.setText("Şifre : ");
        add(jLabel4);
        jLabel4.setBounds(80, 180, 100, 22);

        btnGiris.setForeground(new java.awt.Color(139, 69, 0));
        btnGiris.setText("Giriş");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });
        add(btnGiris);
        btnGiris.setBounds(130, 240, 75, 25);

        btnKayit.setForeground(new java.awt.Color(139, 69, 0));
        btnKayit.setText("Üye Kayıt");
        btnKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitActionPerformed(evt);
            }
        });
        add(btnKayit);
        btnKayit.setBounds(240, 240, 100, 25);
        add(boxSifre);
        boxSifre.setBounds(220, 180, 150, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void boxKadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxKadActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed

        String sorgu = "SELECT sifre,yetki,id FROM Kullanici WHERE  kullaniciAdi='"
                + boxKad.getText() + "'";
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;database=Kutuphane;user=root;password=1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sorgu);
            rs.next();
            if (boxSifre.getText().equals(rs.getString(1))) {
                if (rs.getString(2).equals("admin")) {
                    AdminUyeIslem aui = new AdminUyeIslem(frame);
                } else {
                    UyeGirisAnasayfa uga = new UyeGirisAnasayfa(frame, rs.getString(3));
                }
            } else {
                JOptionPane.showMessageDialog(this, "Kullanici Adı ya da Şifre Yanlış!");
            }
        } catch (Exception e) {
            System.out.println("Kullanici Adi veya Şifre yanlış");
            JOptionPane.showMessageDialog(this, "Kullanici Adı ya da Şifre Yanlış!");
        }
    }//GEN-LAST:event_btnGirisActionPerformed

    private void btnKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitActionPerformed
        UyeKayit uk = new UyeKayit(frame);
    }//GEN-LAST:event_btnKayitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxKad;
    private javax.swing.JPasswordField boxSifre;
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnKayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
