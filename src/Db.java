


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

    final private String url = "org.sqlite.JDBC";
    final private String db = "jdbc:sqlite:db/";
    private String dbName = "susatis.db";
    private Connection conn = null;
    private Statement st = null;
    
    public Db() {

    }

    public Db(String dbName) {
        this.dbName = dbName;
}
public Statement baglan() {
    try {
        Class.forName(url);
        conn = DriverManager.getConnection(db + dbName);
        st = conn.createStatement();
        System.out.println("Bağlantı başarılı");
    } catch (ClassNotFoundException | SQLException e) {
        System.err.println("Bağlantı hatası : " + e);
    }
    return st;
   
}
public void kapat() {
    if(st !=null && conn!= null) {
        try {
            st.close();
            conn.close();
            st=null;
            conn=null;
            System.out.println("Bağlantı kapatıldı! ");
        } catch (SQLException e) {
            System.err.println("Kapatma hatası : " + e);
        }
    }
}
}
