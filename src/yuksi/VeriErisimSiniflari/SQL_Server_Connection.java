package VeriErisimSiniflari;
import java.sql.*;
public class SQL_Server_Connection {
    public static String kullaniciEkleSorgusu;
    public static String kitaplikEkleSorgu;
    public static Statement stmt;
    public static Connection con = null;
    
    public static void main(String[] args) {
        System.out.println("Veri Tabanı Bağlantı işlemleri>>\n");
        try {
             con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;database=Kutuphane;user=root;password=1234");
        } catch (Exception e) {
            System.out.println("Baglantı basarısız");
        }  
   
        kitaplikEkleSorgu = "INSERT INTO  Kitaplik (kitapId,kitapAd,kitapTur,yazar,"
                 + "yayinEvi,yerNo) VALUES (?,?,?,?,?,?) ";
         VerileriGoster kayitlariGoster = new VerileriGoster(con,kitaplikEkleSorgu);
    }  
}


