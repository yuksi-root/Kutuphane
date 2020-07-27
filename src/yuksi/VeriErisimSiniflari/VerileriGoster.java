package VeriErisimSiniflari;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
public class VerileriGoster extends Baglan {
    String sqlQuary;
    public VerileriGoster(Connection con, String sqlQuary) {
        super(con);
        this.sqlQuary = sqlQuary;
    }
    public DefaultTableModel getTable(DefaultTableModel getModel) {
        DefaultTableModel model = getModel;
        int colmnCount = getColumnCount();
        Object[] objeler = new Object[colmnCount];
        for (int k = 0; k < colmnCount; k++) {
            objeler[k] = new Object();
        }
        for (int k = 0; k < getKullaniciSayisi(); k++) {
            for (int j = 0; j < colmnCount; j++) {
                objeler[j] = getInfo(j + 1,k + 1);
            }
            model.insertRow(model.getRowCount(), objeler);
        }
        return model;
    }
    private int getKullaniciSayisi() {
        int x = 0;
        try {
            Statement durum = con.createStatement();
            ResultSet result = durum.executeQuery(sqlQuary);
            while (result.next()) {
                x++;
            }
        } catch (SQLException ex) {
            System.out.println("kullanıcı sayısı Gösterirken Hata");
        }
        return x;
    }
    private int getColumnCount() {
        int x = 0;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuary);
            ResultSetMetaData rsmd = rs.getMetaData();
            x = rsmd.getColumnCount();

        } catch (SQLException ex) {
            System.out.println("kolon sayısı çağırılırken hata oluştu");
        }
        return x;
    }
    private String getInfo(int row, int x) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuary);
            for (int k = 0; k < x; k++) {
                rs.next();
            }
            return rs.getString(row);

        } catch (SQLException ex) {
            System.out.println("Bilgi  çağırırken hata oluştu");
        }
        return "HATA";
    }
}
