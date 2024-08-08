package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect { 
    // connection in my sql (xampp) --
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String url = "jdbc:mysql://localhost:3306/dbempresa?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    /* connection in sql server (ssms)
    public static Connection getConnection() {
        String server = "localhost:1433";
        String database = "dbEmpresa";
        String user = "sa";
        String password = "admin123";
        
        String url = "jdbc:sqlserver://" + server + ";database=" + database + ";user=" + user + ";password=" + password + ";encrypt=false";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    */

}
