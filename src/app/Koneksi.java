package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author avrians
 */
public class Koneksi {

    public static Connection konekKeDB() {
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root");
            mds.setPassword("");
            mds.setDatabaseName("ppdbonline");
            mds.setServerName("localhost");
            mds.setPortNumber(3306);
            mds.setServerTimezone("Asia/Jakarta");
            Connection koneksi = mds.getConnection();
            return koneksi;
        } catch (SQLException e) {
//                            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
}
