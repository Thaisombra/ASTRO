package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.entity.Membro;


public class MembroDAO {
    //atributos usados para fazer conexao com o banco de dados (mysql)
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USER = "ASTRO";
    private static final String PASSWORD = "astros";

    //metodo para pegar as informações dos atributos citados a cima e fazer conexao com o banco de dados
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
   // metodo para cadastrar o membro 
    public void cadastrar(Membro membro) {
        
        String sql = "INSERT INTO membro (cpf, nome, senha) VALUES (?, ?, ?)";

        //caso seja possivel fazer o cadastro, ele pega conexao com o banco de dados e adiciona um membro com os parametros citados na 30,31 e 32
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, membro.getCpf());
            stmt.setString(2, membro.getNome());
            stmt.setString(3, membro.getSenha());

            stmt.executeUpdate();
        //caso não seja possivel ele entra no catch e retornar erro 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //metodo para fazer login do mebro 
    public Membro login(String cpf, String senha) {
        String sql = "SELECT * FROM membro WHERE cpf = ? AND senha = ?";
        Membro membro = null;

        //caso seja possivel fazer o login, ele pega conexao com o banco de dados e faz o login no site usando os parametros da linha 49 e 50
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            stmt.setString(2, senha);
        //caso seja possivel fazer o login, ele busca no banco de dados um membro com os seguintes parametros citados na linha 55;57
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    membro = new Membro();
                    membro.setCpf(rs.getString("cpf"));
                    membro.setNome(rs.getString("nome"));
                    membro.setSenha(rs.getString("senha"));
                }
            }
        //caso não seja possivel ele retornar erro
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return membro;
    }
}

