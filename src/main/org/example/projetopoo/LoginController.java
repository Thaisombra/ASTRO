package org.example.projetopoo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Coordenador;
import model.Membro;

import java.io.IOException;
import java.util.Map;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;

    private Stage primaryStage; // Armazena a referência à janela principal

    // Mapa de usuários que será compartilhado entre Cadastro e Login
    private Map<String, Membro> usuarios;

    // Método para receber os usuários cadastrados do CadastroController
    public void setUsuarios(Map<String, Membro> usuarios) {
        this.usuarios = usuarios;
    }

    // Método que será chamado quando o botão de login for clicado
    @FXML
    private void handleLoginAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Lógica de validação do login
        Membro membro = validarLogin(username, password);

        if (membro != null) {
            try {
                login(membro);
                // Fechar a janela de login após login bem-sucedido
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            mostrarAlertaErro("Login falhou", "Credenciais inválidas. Tente novamente.");
        }
    }

    // Método que faz a validação do login
    private Membro validarLogin(String username, String password) {
        // Verificar se o usuário existe e se a senha está correta
        if (usuarios.containsKey(username)) {
            Membro membro = usuarios.get(username);
            if (membro.getSenha().equals(password)) {
                return membro;
            }
        }
        return null; // Credenciais inválidas
    }

    // Método que será chamado após a validação do login
    private void login(Membro membro) throws Exception {
        if (membro instanceof Coordenador) {
            // Abrir a tela de coordenador
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TelaCoordenador.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Área do Coordenador");
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            // Aqui você pode criar outras telas para outros tipos de membros, se necessário
            System.out.println("Login para outro tipo de membro.");
        }
    }

    // Método para exibir alertas de erro
    private void mostrarAlertaErro(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    @FXML
    public void handleBackButtonAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/button-view.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 600, 400);

        Stage currentStage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(mainScene);
        currentStage.setTitle("Tela Principal");
    }

    public void setStage(Stage primaryStage) {
        this.primaryStage = primaryStage; // Definir a referência à janela principal
    }
}
