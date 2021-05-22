package appswingreyna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Patrick Rodriguez
 * @author Compu
 */


public class ConexionMySQL {

    public String driver = "com.mysql.jdbc.Driver";
    public String database = "dbreyna";
    public String hostname = "localhost";
    public String port = "3306";
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    public String username = "root";
    public String password = "Halion2012";
    private static Connection conn = null;
    
    public Connection conectarMySQL() {
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void cerrar() {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    boolean insertDB(Object value, Statement statement) {
        Comprobante comprobante = (Comprobante) value;
        try {
            String query = " insert into ryacomprobante  values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt (1, comprobante.serie);
            preparedStmt.setInt (2, comprobante.numero);
            preparedStmt.setString(3, comprobante.tipo+"");
            preparedStmt.setString(4, comprobante.cliente);
            preparedStmt.setString(5, comprobante.clidocumento);
            preparedStmt.setString(6, comprobante.clidireccion);
            preparedStmt.setDouble(7, comprobante.mbruto);
            preparedStmt.setDouble(8, comprobante.impuesto);
            preparedStmt.setDouble(9, comprobante.mtotal);
            preparedStmt.setString(10, "2021-05-22");
            
            preparedStmt.execute();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
