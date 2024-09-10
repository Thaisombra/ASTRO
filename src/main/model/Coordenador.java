package model;

import java.util.ArrayList;
import java.util.List;

public class Coordenador {
    private int projetosCoordenador;
    private List<String> projetos;
    private List<String> alunos;

    public Coordenador() {
        this.projetos = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    // Define o número de projetos do coordenador
    public void setProjetosCoordenador(int projetosCoordenador) {
        // Verificação: o número de projetos não pode ser negativo
        if (projetosCoordenador >= 0) {
            this.projetosCoordenador = projetosCoordenador;
        } else {
            System.out.println("O número de projetos não pode ser negativo.");
        }
    }

    // Retorna o número de projetos do coordenador.
    public int getProjetosCoordenador() {
        return projetosCoordenador;
    }

    // Método para cadastrar um novo projeto.
    public void cadastrarProjeto(String nomeProjeto) {
        //Verifica se o nome do projeto não é nulo nem vazio antes de cadastrá-lo.
        if (nomeProjeto != null && !nomeProjeto.trim().isEmpty()) {
            if (!projetos.contains(nomeProjeto)) {
                projetos.add(nomeProjeto);
                projetosCoordenador = projetos.size();
                System.out.println("Projeto '" + nomeProjeto + "' cadastrado com sucesso.");
            } else {
                System.out.println("Projeto '" + nomeProjeto + "' já está cadastrado.");
            }
        } else {
            System.out.println("O nome do projeto não pode ser vazio ou nulo.");
        }
    }

    // Método para remover um projeto.
    public void removerProjeto(String nomeProjeto) {
        //Verifica se o nome do projeto não é nulo nem vazio antes de tentar removê-lo.
        if (nomeProjeto != null && !nomeProjeto.trim().isEmpty()) {
            if (projetos.contains(nomeProjeto)) {
                projetos.remove(nomeProjeto);
                projetosCoordenador = projetos.size();
                System.out.println("Projeto '" + nomeProjeto + "' removido com sucesso.");
            } else {
                System.out.println("Projeto '" + nomeProjeto + "' não encontrado.");
            }
        } else {
            System.out.println("O nome do projeto não pode ser vazio ou nulo.");
        }
    }

    // Método para cadastrar um novo aluno.
    public void cadastrarAluno(String nomeAluno) {
        //Verifica se o nome do aluno não é nulo nem vazio antes de cadastrá-lo.
        if (nomeAluno != null && !nomeAluno.trim().isEmpty()) {
            if (!alunos.contains(nomeAluno)) {
                alunos.add(nomeAluno);
                System.out.println("Aluno '" + nomeAluno + "' cadastrado com sucesso.");
            } else {
                System.out.println("Aluno '" + nomeAluno + "' já está cadastrado.");
            }
        } else {
            System.out.println("O nome do aluno não pode ser vazio ou nulo.");
        }
    }

    // Método para remover um aluno.
    public void removerAluno(String nomeAluno) {
        //Verifica se o nome do aluno não é nulo nem vazio antes de removê-lo.
        if (nomeAluno != null && !nomeAluno.trim().isEmpty()) {
            if (alunos.contains(nomeAluno)) {
                alunos.remove(nomeAluno);
                System.out.println("Aluno '" + nomeAluno + "' removido com sucesso.");
            } else {
                System.out.println("Aluno '" + nomeAluno + "' não encontrado.");
            }
        } else {
            System.out.println("O nome do aluno não pode ser vazio ou nulo.");
        }
    }
}