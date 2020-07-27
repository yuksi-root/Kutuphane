package VeriErisimSiniflari;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ekle extends Baglan {
    public Ekle(Connection con, String sorgu) {
        super(con);
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(sorgu);
        } catch (SQLException ex) {
            System.out.println("Eklemede hata");
        }
        System.out.println("EKLEME BASARILI");
    }
//    public Ekle(Connection con,String sorgu,String kitapId,String kitapAd,String kitapTur,
//            String yazar,String yayinEvi,String YerNo) {
//        super(con);
//        try {
//            PreparedStatement prepare = con.prepareStatement(sorgu);
//            prepare.setString(1,kitapId); // Buradaki 1 veritabanındaki ilk alan olan ad alanı ad ise alan //adı olan ad
//            prepare.setString(2, kitapAd);
//            prepare.setString(3,kitapTur);
//            prepare.setString(4,yazar);
//            prepare.setString(5,yayinEvi);
//            prepare.setString(6,YerNo);
//            prepare.executeUpdate(); // Verileri Ekledikten sonra veritabanını güncelliyoruz.
//             System.out.println("Ekleme işlemi başarılı.");
//        } catch (SQLException ex) {
//            Logger.getLogger(Ekle.class.getName()).log(Level.SEVERE, null, ex);
//        }
//           }
//    public Ekle(Connection con,String sorgu,int id,String ad,String soyad,String kullaniciAdi,
//            String sifre,String yetki) {
//        super(con);
//        try {
//
//            PreparedStatement prepare = con.prepareStatement(sorgu);
//            prepare.setInt(1,id);
//            prepare.setString(2,ad); // Buradaki 1 veritabanındaki ilk alan olan ad alanı ad ise alan //adı olan ad
//            prepare.setString(3, soyad);
//            prepare.setString(4,kullaniciAdi);
//            prepare.setString(5,sifre);
//            prepare.setString(6,yetki);
//            prepare.executeUpdate(); // Verileri Ekledikten sonra veritabanını güncelliyoruz.
//             System.out.println("Ekleme işlemi başarılı.");
//        } catch (SQLException ex) {
//            Logger.getLogger(Ekle.class.getName()).log(Level.SEVERE, null, ex);
//        }
//           }
}
//         String sorgu ="INSERT INTO  Kullanici (id,ad,soyad,kullaniciAdi,sifre,yetki) VALUES (?,?,?,?,?,?) ";
//          Ekle veriEkle = new Ekle(con,sorgu,(getId() + 1),boxAd.getText(),boxSoyad.getText(),
//                  boxKad1.getText(),boxSifre.getText(),comboYetki.getText());
//           for(int i = modelTable.getRowCount() - 1; i>=0;i--){
//            modelTable.removeRow(i);
//            }
