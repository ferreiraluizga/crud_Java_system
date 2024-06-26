package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {
    public static Connection getConnection() {
        String url = "jdbc:sqlserver://localhost:1433;database=dbEmpresa;user=sa;password=admin123;encrypt=false";     
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

