package VeriErisimSiniflari;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sil extends Baglan { //Üst Classımızdan kalıtım yapıyoruz
    
   Statement silmeDurumu = null; // Yeni bir statement nesnesi
   
    public Sil(Connection con, String sorgu) { // Constructur
        super(con);
        try {    // Silme işlemi SQL sorgusu
            silmeDurumu = con.createStatement();
            silmeDurumu.executeUpdate(sorgu);
            System.out.println("Silme işlemi başarıyla Gerçekleşmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Sil.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Silmede Hata");
        }     
    }       
}