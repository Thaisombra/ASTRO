package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    private Stage stage;
    private Scene cadastroScene;
    private Scene loginScene;

    // Método para definir o Stage
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    // Método para definir as cenas de cadastro e login
    public void setCadastroScene(Scene cadastroScene) {
        this.cadastroScene = cadastroScene;
    }

    public void setLoginScene(Scene loginScene) {
        this.loginScene = loginScene;
    }

    @FXML
    private void handleCadastroButtonAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/CadastroController.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            Stage currentStage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.setTitle("Cadastro");
        } catch (IOException e) {
            showAlert(Alert.AlertType.ERROR, "Erro", "Não foi possível carregar a tela de cadastro.");
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/LoginController.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            Stage currentStage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.setTitle("Login");
        } catch (IOException e) {
            showAlert(Alert.AlertType.ERROR, "Erro", "Não foi possível carregar a tela de login.");
            e.printStackTrace();
        }
    }


    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
