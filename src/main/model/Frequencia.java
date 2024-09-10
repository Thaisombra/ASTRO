package model;

import java.util.ArrayList;
import java.util.List;

public class Frequencia {
    private String nomeDaAtividade;
    private Membro matricula;
    private String nomeMembro;
    private boolean bolsista;
    private static List<Frequencia> registrosDeFrequencia = new ArrayList<>();

    // criando o construtor
    public Frequencia(String nomeDaAtividade, Membro matricula, String nomeMembro, boolean bolsista) {
        this.nomeDaAtividade = nomeDaAtividade;
        this.matricula = matricula;
        this.nomeMembro = nomeMembro;
        this.bolsista = bolsista;
    }

    // cadastrando uma frequencia
    public void cadastrarFrequencia() {
        registrosDeFrequencia.add(this); // adicionando o próprio objeto à lista de registros
        System.out.println("Frequência cadastrada para: " + nomeMembro);
    }

    // abrindo uma frequencia
    public String visualizarFrequencia() {
        if (registrosDeFrequencia.isEmpty()) {
            System.out.println("Nenhuma frequência cadastrada");
        } else {
            System.out.println("Frequências cadastradas:");
            for (int i = 0; i < registrosDeFrequencia.size(); i++) {
                Frequencia frequencia = registrosDeFrequencia.get(i); // retorna a frequência que queremos visualizar
                System.out.println("Atividade: " + frequencia.nomeDaAtividade +
                        ", Matrícula: " + frequencia.matricula +
                        ", Membro: " + frequencia.nomeMembro +
                        ", Bolsista: " + (frequencia.bolsista ? "Sim" : "Não")); // verifica se é um bolsista ou não
            }
        }
        return "";
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

    public Membro getMatricula() {
        return matricula;
    }

    public void setMatricula(Membro matricula) {
        // verificando se a matrícula é nula
        if (matricula != null) {
            this.matricula = matricula;
        } else {
            System.out.println("A matrícula não pode ser nula.");
        }
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        // verificando se o nome do membro é nulo ou vazio
        if (nomeMembro != null && !nomeMembro.trim().isEmpty()) {
            this.nomeMembro = nomeMembro;
        } else {
            System.out.println("O nome do membro não pode ser vazio ou nulo.");
        }
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
}