package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {
    /* 
    -- connection in my sql (xampp) --
    
    public static Connection getConnection() {
        String server = "localhost";
        String database = "dbEmpresa";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://" + server + ":3306/" + database + "?useSSL=false&serverTimezone=UTC";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    */
    
    // connection in sql server (ssms)
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

}
