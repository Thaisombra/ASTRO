package org.example.projetopoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.MainViewController;
import org.example.projetopoo.CadastroController;
import org.example.projetopoo.LoginController;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega a tela principal com os botões
        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/view/button-view.fxml"));
        Scene mainScene = new Scene(mainLoader.load(), 600, 400);

        MainViewController mainController = mainLoader.getController();
        mainController.setStage(primaryStage);

        // Carrega a tela de Cadastro
        FXMLLoader cadastroLoader = new FXMLLoader(getClass().getResource("/view/CadastroController.fxml"));
        Scene cadastroScene = new Scene(cadastroLoader.load(), 600, 400);

        CadastroController cadastroController = cadastroLoader.getController();
        cadastroController.setStage(primaryStage);
        mainController.setCadastroScene(cadastroScene);

        // Carrega a tela de Login
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/view/LoginController.fxml"));
        Scene loginScene = new Scene(loginLoader.load(), 600, 400);

        LoginController loginController = loginLoader.getController();
        loginController.setStage(primaryStage);
        mainController.setLoginScene(loginScene);

        // Inicializa a tela principal
        primaryStage.setTitle("Tela Principal");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
