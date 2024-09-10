package org.example.projetopoo;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ProjetosCadastradosController {

    @FXML
    private ListView<String> projetosListView;

    public void initialize() {
        // Carregar os projetos cadastrados
        projetosListView.getItems().addAll("Projeto 1", "Projeto 2", "Projeto 3");
    }
}
