package model;

import java.util.ArrayList;
import java.util.List;

public class Atividade {
    private String nomeDaAtividade;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private List<String> participantes;

    // criando o construtor
    public Atividade(String nomeDaAtividade, String descricao, String dataInicio, String dataFim) {
        this.nomeDaAtividade = nomeDaAtividade;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.participantes = new ArrayList<>(); // criando um objeto para adicionar os participantes
    }

    public void adicionarParticipante(String participante) {
        // condição para verificar se o participante está ou não na equipe para adicioná-lo
        if (!participantes.contains(participante)) {
            participantes.add(participante);
            System.out.println(participante + " foi adicionado à atividade.");
        } else {
            System.out.println(participante + " já está participando da atividade.");
        }
    }

    public void removerParticipante(String participante) {
        // condição para verificar se o participante está ou não na equipe para removê-lo
        if (participantes.contains(participante)) {
            participantes.remove(participante);
            System.out.println(participante + " foi removido da atividade.");
        } else {
            System.out.println(participante + " não está participando da atividade.");
        }
    }

    public String getNomeDaAtividade() {
        return nomeDaAtividade;
    }

    public void setNomeDaAtividade(String nomeDaAtividade) {
        // verificando se o nome da atividade é nulo ou vazio
        if (nomeDaAtividade != null && !nomeDaAtividade.trim().isEmpty()) {
            this.nomeDaAtividade = nomeDaAtividade;
        } else {
            System.out.println("O nome da atividade não pode ser vazio ou nulo.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        // verificando se a descrição é nula ou vazia
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        } else {
            System.out.println("A descrição não pode ser vazia ou nula.");
        }
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        // verificando se a data de início é ser nula ou vazia
        if (dataInicio != null && !dataInicio.trim().isEmpty()) {
            this.dataInicio = dataInicio;
        } else {
            System.out.println("A data de início não pode ser vazia ou nula.");
        }
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        // verificando se a data de fim é nula ou vazia
        if (dataFim != null && !dataFim.trim().isEmpty()) {
            this.dataFim = dataFim;
        } else {
            System.out.println("A data de fim não pode ser vazia ou nula.");
        }
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<String> participantes) {
        // verificando se a lista de participantes é ser nula
        if (participantes != null) {
            this.participantes = participantes;
        } else {
            System.out.println("A lista de participantes não pode ser nula.");
        }
    }
}