package main.controllers;

import main.model.Relatorio;

public class RelatorioController {

    // Instância do modelo Relatorio
    private Relatorio relatorio;

    // Construtor da Controller
    public RelatorioController() {
        this.relatorio = new Relatorio(); // Inicializa o Relatorio (modelo)
    }

    // Método para configurar os dados do relatório
    public void gerarRelatorio(String nomeAtividade, String descricaoAtividade, String dataInicial, String dataFinal, int quantidadeParticipantes) {
        relatorio.setNomeAtividade(nomeAtividade);
        relatorio.setDescricaoAtividade(descricaoAtividade);
        relatorio.setDuracao(dataInicial, dataFinal);
        relatorio.setQuantidadeParticipantes(quantidadeParticipantes);
    }

    // Método para editar os dados do relatório todo
    public void editarRelatorio(String nomeAtividade, String descricaoAtividade, String dataInicial, String dataFinal, int quantidadeParticipantes) {
        if (nomeAtividade != null && !nomeAtividade.isEmpty()) {
            relatorio.setNomeAtividade(nomeAtividade);
        }
        if (descricaoAtividade != null && !descricaoAtividade.isEmpty()) {
            relatorio.setDescricaoAtividade(descricaoAtividade);
        }
        if (dataInicial != null && dataFinal != null) {
            relatorio.setDuracao(dataInicial, dataFinal);
        }
        if (quantidadeParticipantes > 0) {
            relatorio.setQuantidadeParticipantes(quantidadeParticipantes);
        }
    }

    //editar partes especificas do relatório
    public void editarDescricaoAtividade(String novaDescricaoAtividade){
        if (novaDescricaoAtividade != null && !novaDescricaoAtividade.isEmpty()) {
            relatorio.setDescricaoAtividade(novaDescricaoAtividade);
        }
    }
    
    public void editarNomeAtividade(String novoNomeAtividade){
        if (novoNomeAtividade != null && !novoNomeAtividade.isEmpty()) {
            relatorio.setNomeAtividade(novoNomeAtividade);
        }
    }    
    
    public void editarData(String novaDataInicial, String novaDataFinal){
        if (novaDataInicial != null && !novaDataInicial.isEmpty() && novaDataFinal != null && !novaDataFinal.isEmpty()) {
            relatorio.setDuracao(novaDataInicial, novaDataFinal);
        }
    }
    
    public void editarQuantidadeParticipantes(int novaQuantidadeParticipantes){
        if (novaQuantidadeParticipantes > 0) {
            relatorio.setQuantidadeParticipantes(novaQuantidadeParticipantes);
        }        
    }

    public void visualizarRelatorio() {
        relatorio.visualizarRelatorio(); 
    }
}
