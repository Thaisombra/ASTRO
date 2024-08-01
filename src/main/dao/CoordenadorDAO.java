package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.entity.Coordenador;

public class CoordenadorDAO {
    //atributos usados para fazer conexao com o banco de dados (mysql)
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USER = "ASTRO";
    private static final String PASSWORD = "astros";
    //metodo para pegar as informações dos atributos citados a cima e fazer conexao com o banco de dados
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    //metodo para inserir projetos do coordenador 
    public void salvar(Coordenador coordenador) {
        String sql = "INSERT INTO coordenador (projetos_coordenador) VALUES (?)";
    //caso seja possivel inserir o projeto do coordernador, ele pega os projetos que o coordenador participa 
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, coordenador.getProjetosCoordenador());

            stmt.executeUpdate();
        //caso não seja possivel ele retorna erro
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // metodo para buscar os coordenadores 
    public Coordenador buscar(int id) {
        String sql = "SELECT * FROM coordenador WHERE id = ?";
        Coordenador coordenador = null;
    // caso seja possivel, ele pega a conexao com o banco de dados 
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
    // e caso seja possivel fazer a conexao ele faz a busca no banco de dados e retorna os coordenadores
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    coordenador = new Coordenador();
                    coordenador.setProjetosCoordenador(rs.getInt("projetos_coordenador"));
                }
            }
    //caso não seja possivel ele retorna erro
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return coordenador;
    }
   // metodo para atualizar caso o coordenador, não seja mais o coordenador atual do projeto ele atualiza para o novo coordenador 
    public void atualizar(Coordenador coordenador) {
        String sql = "UPDATE coordenador SET projetos_coordenador = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, coordenador.getProjetosCoordenador());
            //stmt.setInt(2, coordenador.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //metodo para deletar coordenador, ideia do metodo caso exista um coordenador com determinado id ele faz a exclusao do mesmo
    public void deletar(int id) {
        String sql = "DELETE FROM coordenador WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
