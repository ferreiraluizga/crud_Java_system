package DAO;

import dao.ExceptionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Desenvolvedor;

public class DesenvolvedorDAO {
    
    public static void cadastrarDev(Desenvolvedor dev) throws ExceptionDAO{
        String sql = "INSERT INTO tbDesenvolvedores (nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone, cadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Connect.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, dev.getNome());
            stmt.setString(2, dev.getNascimento());
            stmt.setString(3, dev.getGenero());
            stmt.setString(4, dev.getEstadoCivil());
            stmt.setString(5, dev.getAreas());
            stmt.setString(6, dev.getCep());
            stmt.setString(7, dev.getEndereco());
            stmt.setString(8, dev.getBairro());
            stmt.setString(9, dev.getComplemento());
            stmt.setString(10, dev.getEstado());
            stmt.setString(11, dev.getCidade());
            stmt.setString(12, dev.getCelular());
            stmt.setString(13, dev.getTelefone());
            stmt.setString(14, dev.getCadastro());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!", "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar desenvolvedor: " + e.getMessage());
        }
    }
    
    public static List<Desenvolvedor> listarDev() throws ExceptionDAO {
        List<Desenvolvedor> desenvolvedores = new ArrayList<>();
        
        String sql = "SELECT * FROM tbDesenvolvedores";

        try (Connection con = Connect.getConnection(); PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Desenvolvedor dev = new Desenvolvedor();
                dev.setId(rs.getInt("id"));
                dev.setNome(rs.getString("nome"));
                dev.setNascimento(rs.getString("nascimento"));
                dev.setGenero(rs.getString("genero"));
                dev.setEstadoCivil(rs.getString("estadoCivil"));
                dev.setAreas(rs.getString("areas"));
                dev.setCep(rs.getString("cep"));
                dev.setEndereco(rs.getString("endereco"));
                dev.setBairro(rs.getString("bairro"));
                dev.setComplemento(rs.getString("complemento"));
                dev.setEstado(rs.getString("estado"));
                dev.setCidade(rs.getString("cidade"));
                dev.setCelular(rs.getString("celular"));
                dev.setTelefone(rs.getString("telefone"));
                dev.setCadastro(rs.getString("cadastro"));
                desenvolvedores.add(dev);
            }
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao listar desenvolvedores: " + e.getMessage());
        }
        
        return desenvolvedores;

    }

    public static Desenvolvedor consultarDev(int id) {
        Desenvolvedor dev = new Desenvolvedor();
        String sql = "SELECT * FROM tbDesenvolvedores WHERE id=?";
        try (Connection con = Connect.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    dev.setNome(rs.getString("nome"));
                    dev.setNascimento(rs.getString("nascimento"));
                    dev.setGenero(rs.getString("genero"));
                    dev.setEstadoCivil(rs.getString("estadoCivil"));
                    dev.setAreas(rs.getString("areas"));
                    dev.setCep(rs.getString("cep"));
                    dev.setEndereco(rs.getString("endereco"));
                    dev.setBairro(rs.getString("bairro"));
                    dev.setComplemento(rs.getString("complemento"));
                    dev.setEstado(rs.getString("estado"));
                    dev.setCidade(rs.getString("cidade"));
                    dev.setCelular(rs.getString("celular"));
                    dev.setTelefone(rs.getString("telefone"));
                    dev.setCadastro(rs.getString("cadastro"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Desenvolvedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dev;
    }

    public static void editarDev(Desenvolvedor dev) throws ExceptionDAO {
        String sql = "UPDATE tbDesenvolvedores SET nome=?, nascimento=?, genero=?, estadoCivil=?, areas=?, cep=?, endereco=?, bairro=?, complemento=?, estado=?, cidade=?, celular=?, telefone=? WHERE id=?";
        try (Connection con = Connect.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, dev.getNome());
            stmt.setString(2, dev.getNome());
            stmt.setString(3, dev.getNome());
            stmt.setString(4, dev.getNome());
            stmt.setString(5, dev.getNome());
            stmt.setString(6, dev.getNome());
            stmt.setString(7, dev.getNome());
            stmt.setString(8, dev.getNome());
            stmt.setString(9, dev.getNome());
            stmt.setString(10, dev.getNome());
            stmt.setString(11, dev.getNome());
            stmt.setString(12, dev.getNome());
            stmt.setString(13, dev.getNome());
            stmt.setInt(14, dev.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao editar desenvolvedor: " + e.getMessage());
        }
    }

    public static void deletarDev(int id) throws ExceptionDAO{
        String sql = "DELETE FROM tbDesenvolvedores WHERE id = ?";
        try (Connection con = Connect.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso", "Deletar", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao deletar desenvolvedor: " + e.getMessage());
        }
    }
    
}
