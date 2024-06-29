package model;

import controller.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private int id;
    private String nome;
    private String usuario;
    private String email;
    private String senha;

    public Administrador(int id, String nome, String usuario, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

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
