package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;


public class Relatorio {
    
    public Relatorio() {
    }

    private String nomeAtividade; 
    private String descricaoAtividade; 
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private int quantidadeParticipantes; 

    public void setNomeAtividade(String nomeAtividade){
            if(nomeAtividade != null && !nomeAtividade.isEmpty() && nomeAtividade.length() <= 1000){
                this.nomeAtividade = nomeAtividade;
            }      
    }

    public String getNomeAtividade(){
        return nomeAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade){
        if(descricaoAtividade != null && !descricaoAtividade.isEmpty() && descricaoAtividade.length() <= 1000){ 
            this.descricaoAtividade = descricaoAtividade;
        }      
    }  

    public String getDescricaoAtividade(){
        return descricaoAtividade;
    }

    public void setDuracao(String dataInicial, String dataFinal) {
        // Formato desejado: "dd/MM/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            if (dataInicial != null && !dataInicial.isEmpty() && dataFinal != null && !dataFinal.isEmpty()) {
                this.dataInicial = LocalDate.parse(dataInicial, formatter);
                this.dataFinal = LocalDate.parse(dataFinal, formatter);
            } else if (dataInicial !=null && !dataInicial.isEmpty() || dataFinal.isEmpty() || dataFinal == null){
                this.dataInicial = LocalDate.parse(dataInicial, formatter);
            } else 
                dataFinal = null;
                this.dataInicial = LocalDate.parse(dataInicial, formatter);
            }
            
        catch (DateTimeParseException e) {
            throw new IllegalArgumentException("As datas devem estar no formato dd/MM/yyyy.");
        }
    }


    public long getDuracao() {
        LocalDate dataFinalCalculada = (dataFinal != null) ? dataFinal : LocalDate.now();
        // Calcula a diferença total em dias
        return ChronoUnit.DAYS.between(dataInicial, dataFinalCalculada);
    }   

    public void setQuantidadeParticipantes(int quantidadeParticipantes){
        if(quantidadeParticipantes >= 1){
            this.quantidadeParticipantes = quantidadeParticipantes;
        }
    }

    public int getQuantidadeParticipantes(){
        return quantidadeParticipantes;
    }  

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
    
        relatorio.append("Relatório da Atividade\n");
        relatorio.append("Nome da Atividade: ").append(nomeAtividade).append("\n");
    
        relatorio.append("Descrição: ").append(descricaoAtividade).append("\n");
  
        relatorio.append("Quantidade de Participantes: ").append(quantidadeParticipantes).append("\n");
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (dataInicial != null) {
            relatorio.append("Data Inicial: ").append(dataInicial.format(formatter)).append("\n");
        }
        if (dataFinal != null) {
            relatorio.append("Data Final: ").append(dataFinal.format(formatter)).append("\n");
        } else {
            relatorio.append("Data Final: Não definida (em andamento)").append("\n");
        }
        long duracao = getDuracao();
        relatorio.append("Duração: ").append(duracao).append(" dia(s)\n");
    
        return relatorio.toString(); // Retorna o relatório como uma String
    }

    public void editarRelatorio(String novoNomeAtividade, String novaDescricaoAtividade, 
                            String novaDataInicial, String novaDataFinal, 
                            int novaQuantidadeParticipantes) {
    
        if (novoNomeAtividade != null && !novoNomeAtividade.isEmpty()) {
            setNomeAtividade(novoNomeAtividade);
        }

        if (novaDescricaoAtividade != null && !novaDescricaoAtividade.isEmpty()) {
            setDescricaoAtividade(novaDescricaoAtividade);
        }
    
        if (novaDataInicial != null && !novaDataInicial.isEmpty() && novaDataFinal != null && !novaDataFinal.isEmpty()) {
            setDuracao(novaDataInicial, novaDataFinal);
        }
    
        if (novaQuantidadeParticipantes > 0) {
            setQuantidadeParticipantes(novaQuantidadeParticipantes);
        }
    }
    
    public void editarDescricaoAtividade(String novaDescricaoAtividade){
        if (novaDescricaoAtividade != null && !novaDescricaoAtividade.isEmpty()) {
            setDescricaoAtividade(novaDescricaoAtividade);
        }
    }
    
    public void editarNomeAtividade(String novoNomeAtividade){
        if (novoNomeAtividade != null && !novoNomeAtividade.isEmpty()) {
            setNomeAtividade(novoNomeAtividade);
        }
    }    
    
    public void editarData(String novaDataInicial, String novaDataFinal){
        if (novaDataInicial != null && !novaDataInicial.isEmpty() && novaDataFinal != null && !novaDataFinal.isEmpty()) {
            setDuracao(novaDataInicial, novaDataFinal);
        }
    }
    
    public void editarQuantidadeParticipantes(int novaQuantidadeParticipantes){
        if (novaQuantidadeParticipantes > 0) {
            setQuantidadeParticipantes(novaQuantidadeParticipantes);
        }        
    }

    public void visualizarRelatorio() {
        String relatorio = gerarRelatorio(); // Gera o relatório como String
        System.out.println(relatorio); // Exibe o relatório no console
    }
}