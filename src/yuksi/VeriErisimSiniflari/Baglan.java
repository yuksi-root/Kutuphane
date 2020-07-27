
package VeriErisimSiniflari;
import java.sql.*;

public class Baglan {
    Connection con;
    public Baglan(Connection con)  //Constructor Motot, içerisine bağlantı //yapacağımız nesneyi alacak.
    {
        try {
//Class.forName(); fonksiyonu ile driverımızı belirliyoruz.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.con = con; // Oluşturduğumuz bağlantı nesnesi
            System.out.println("Database Bağlantısı Başarılı...");
//Bağlantı başarılı ise ekrana gelecek mesaj
        } catch (Exception e) {
            System.out.println("Bağlantıda bir problem oluştu.");
// Bağlantı başarısız ise ekrana gelecek mesaj
        }
    }
 
}
