package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Administrador;

public class AdministradorDAO {
    
    public static List<Administrador> listarAdm() {
        List<Administrador> administradores = new ArrayList<>();
        Connection con = Connect.getConnection();

        if (con != null) {
            String sql = "SELECT id, nome, usuario, email, senha FROM tbAdministradores";
            try (PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String usuario = rs.getString("usuario");
                    String email = rs.getString("email");
                    String senha = rs.getString("senha");

                    Administrador admin = new Administrador(id, nome, usuario, email, senha);
                    administradores.add(admin);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString(), "Erro ao Listar Administradores", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return administradores;
    }
    
    public static boolean verificarAdm(String usuario, String senha) {
        List<Administrador> administradores = listarAdm();

        for (Administrador adm : administradores) {
            if ((usuario.equals(adm.getUsuario()) || usuario.equals(adm.getEmail())) && senha.equals(adm.getSenha())) {
                return true;
            }
        }
        
        return false;
    }
    
}
