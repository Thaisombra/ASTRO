package org.example.projetopoo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Coordenador;
import model.Membro;
import model.TipoDeMembro;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CadastroController {
    @FXML
    private TextField nomeCompletoField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField matriculaField;
    @FXML
    private TextField cpfField;
    @FXML
    private PasswordField senhaField;
    @FXML
    private ChoiceBox<String> tipoDeMembroChoiceBox; // Escolher entre "Aluno" e "Coordenador"

    private Stage stage;
    private Scene mainScene;

    static Map<String, Membro> usuarios = new HashMap<>(); // Armazena objetos Membro ou Coordenador

    // Método para definir o Stage e a Scene principal
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    @FXML
    private void handleCadastroAction() {
        String nomeCompleto = nomeCompletoField.getText();
        String email = emailField.getText();
        String matriculaStr = matriculaField.getText();
        String cpf = cpfField.getText();
        String senha = senhaField.getText();
        String tipoDeMembroSelecionado = tipoDeMembroChoiceBox.getValue(); // Pegar o tipo de membro selecionado

        // Verificar se todos os campos estão preenchidos
        if (nomeCompleto.isEmpty() || email.isEmpty() || matriculaStr.isEmpty() || cpf.isEmpty() || senha.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Cadastro", "Todos os campos devem ser preenchidos.");
            return;
        }

        // Converter matrícula para int
        int matricula;
        try {
            matricula = Integer.parseInt(matriculaStr);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Cadastro", "Matrícula inválida. Deve ser um número inteiro.");
            return;
        }

        // Validar CPF e matrícula
        if (!Membro.isValidCPF(cpf)) {
            showAlert(Alert.AlertType.ERROR, "Cadastro", "CPF inválido.");
            return;
        }
        if (!Membro.isValidMatricula(matricula)) {
            showAlert(Alert.AlertType.ERROR, "Cadastro", "Matrícula deve conter 6 dígitos.");
            return;
        }

        // Criar o objeto correspondente ao tipo de membro
        Membro novoMembro;
        if (tipoDeMembroSelecionado.equals("Coordenador")) {
            novoMembro = new Coordenador(nomeCompleto, cpf, senha, matricula, TipoDeMembro.COORDENADOR);
        } else {
            novoMembro = new Membro(nomeCompleto, cpf, senha, matricula, TipoDeMembro.ALUNO);
        }

        // Verificar se o usuário já está cadastrado
        if (usuarios.containsKey(nomeCompleto)) {
            showAlert(Alert.AlertType.ERROR, "Cadastro", "Usuário já cadastrado.");
        } else {
            usuarios.put(nomeCompleto, novoMembro);
            showAlert(Alert.AlertType.INFORMATION, "Cadastro", "Cadastro realizado com sucesso!");
        }
    }

    // Exibir alertas para o usuário
    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    // Botão voltar para a tela anterior
    @FXML
    public void handleBackButtonAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/button-view.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 600, 400);

        Stage currentStage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        currentStage.setScene(mainScene);
        currentStage.setTitle("Tela Principal");
    }

    public void setUsuarios(Map<String, Membro> usuarios) {
    }
}
