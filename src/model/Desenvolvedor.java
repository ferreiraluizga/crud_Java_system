package model;

import controller.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public Desenvolvedor(String nome, String nascimento, String genero, String estadoCivil, String areas, String cep, String endereco, String bairro, String complemento, String estado, String cidade, String celular, String telefone, String cadastro) {
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
}
