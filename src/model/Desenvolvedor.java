package model;

import controller.Connect;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Desenvolvedor {

    private int id;
    private String nome;
    private String nascimento;
    private String genero;
    private String estadoCivil;
    private String areas;
    private String cep;
    private String endereco;
    private String bairro;
    private String complemento;
    private String estado;
    private String cidade;
    private String celular;
    private String telefone;
    private String cadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }
    
    public Desenvolvedor(){}

    public Desenvolvedor(String nome, String nascimento, String genero, String estadoCivil, String areas, String cep,
            String endereco, String bairro, String complemento, String estado, String cidade, String celular,
            String telefone, String cadastro) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.areas = areas;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.celular = celular;
        this.telefone = telefone;
        this.cadastro = cadastro;
    }

    public Desenvolvedor(int id, String nome, String nascimento, String genero, String estadoCivil, String areas, String cep,
            String endereco, String bairro, String complemento, String estado, String cidade, String celular, String telefone) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.areas = areas;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.celular = celular;
        this.telefone = telefone;
    }

    public void cadastrarDev() {
        try {
            Connection con = Connect.getConnection();
            String sql = "INSERT INTO tbDesenvolvedores (nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone, cadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, nascimento);
            stmt.setString(3, genero);
            stmt.setString(4, estadoCivil);
            stmt.setString(5, areas);
            stmt.setString(6, cep);
            stmt.setString(7, endereco);
            stmt.setString(8, bairro);
            stmt.setString(9, complemento);
            stmt.setString(10, estado);
            stmt.setString(11, cidade);
            stmt.setString(12, celular);
            stmt.setString(13, telefone);
            stmt.setString(14, cadastro);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!", "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Dados do Usuário", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Desenvolvedor consultarDev(int id) {
        Desenvolvedor dev = null;
        String sql = "SELECT nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone FROM tbDesenvolvedores WHERE id=?";
        try (Connection con = Connect.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String nascimento = rs.getString("nascimento");
                    String genero = rs.getString("genero");
                    String estadoCivil = rs.getString("estadoCivil");
                    String areas = rs.getString("areas");
                    String cep = rs.getString("cep");
                    String endereco = rs.getString("endereco");
                    String bairro = rs.getString("bairro");
                    String complemento = rs.getString("complemento");
                    String estado = rs.getString("estado");
                    String cidade = rs.getString("cidade");
                    String celular = rs.getString("celular");
                    String telefone = rs.getString("telefone");

                    dev = new Desenvolvedor(id, nome, nascimento, genero, estadoCivil, areas, cep, endereco,
                            bairro, complemento, estado, cidade, celular, telefone);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Desenvolvedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dev;
    }

    public void editarDev(int id) {
        try {
            Connection con = Connect.getConnection();
            String sql = "UPDATE tbDesenvolvedores SET nome=?, nascimento=?, genero=?, estadoCivil=?, areas=?, cep=?, endereco=?, bairro=?, complemento=?, estado=?, cidade=?, celular=?, telefone=? WHERE id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, this.nome);
            stmt.setString(2, this.nascimento);
            stmt.setString(3, this.genero);
            stmt.setString(4, this.estadoCivil);
            stmt.setString(5, this.areas);
            stmt.setString(6, this.cep);
            stmt.setString(7, this.endereco);
            stmt.setString(8, this.bairro);
            stmt.setString(9, this.complemento);
            stmt.setString(10, this.estado);
            stmt.setString(11, this.cidade);
            stmt.setString(12, this.celular);
            stmt.setString(13, this.telefone);
            stmt.setInt(14, id);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum desenvolvedor encontrado com o ID especificado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do desenvolvedor: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static List<Desenvolvedor> listarDev() {
        List<Desenvolvedor> desenvolvedores = new ArrayList<>();

        Connection con = Connect.getConnection();

        if (con != null) {
            String sql = "SELECT id, nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone FROM tbDesenvolvedores";
            try (PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String nascimento = rs.getString("nascimento");
                    String genero = rs.getString("genero");
                    String estadoCivil = rs.getString("estadoCivil");
                    String areas = rs.getString("areas");
                    String cep = rs.getString("cep");
                    String endereco = rs.getString("endereco");
                    String bairro = rs.getString("bairro");
                    String complemento = rs.getString("complemento");
                    String estado = rs.getString("estado");
                    String cidade = rs.getString("cidade");
                    String celular = rs.getString("celular");
                    String telefone = rs.getString("telefone");

                    Desenvolvedor dev = new Desenvolvedor(id, nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone);
                    desenvolvedores.add(dev);
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

        return desenvolvedores;
    }

    public void deletarDev(int id) {
        try {
            Connection con = Connect.getConnection();
            String sql = "DELETE FROM tbDesenvolvedores WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Erro ao deletar desenvolvedor", JOptionPane.ERROR_MESSAGE);
        }
    }

}
