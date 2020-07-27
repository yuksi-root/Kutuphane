
package VeriErisimSiniflari;
import java.sql.*;
public class Guncelle extends Baglan{
// Güncellenecek verileri alıyoruz..
    public Guncelle(Connection con,String sorgu) {
        super(con);
        try {
           Statement durum = con.createStatement();//Yeni bir Statement oluşturduk
            durum.execute(sorgu);
            System.out.println("Update işlemi başarılı");
        } catch (Exception e) {
            System.out.println("Update işlemi Hatalı");
        }
    }   
}