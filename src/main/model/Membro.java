package model;

import main.models.enums.TipoDeMembro;

public class Membro {
    private String nome;
    private String cpf;
    private String senha;
    private int matricula;
    private int cargaHoraria;
    private int registroDeFrequencia;
    private TipoDeMembro tipoDeMembro;

    // Construtor
    public Membro(String nome, String cpf, String senha, int matricula, TipoDeMembro tipoDeMembro) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.matricula = matricula;
        this.cargaHoraria = 0;
        this.registroDeFrequencia = 0;
        this.tipoDeMembro = tipoDeMembro;
    }

    // Validação de CPF
    public static boolean isValidCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); // Remove qualquer caractere que não seja número
        return cpf.length() == 11; // Verifica se o CPF tem 11 dígitos
    }

    // Validação de matrícula
    public static boolean isValidMatricula(int matricula) {
        return String.valueOf(matricula).length() == 6; // Verifica se a matrícula tem 6 dígitos
    }

    // Métodos para gerar relatórios e atualizar dados
    public void gerarRelatorioDeFrequencia() {
        System.out.println("Relatório de Frequência:");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Frequência: " + registroDeFrequencia + " dias");
    }

    public void adicionarRelatorio() {
        registroDeFrequencia++;
        System.out.println("Frequência atualizada para: " + registroDeFrequencia);
    }

    public void adicionarNovaAtividade(int horas) {
        cargaHoraria += horas;
        System.out.println("Carga horária atualizada para: " + cargaHoraria + " horas");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // verificando se o nome é nulo ou vazio
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode ser vazio ou nulo.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // verificando se o CPF é válido
        if (isValidCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. O CPF deve conter 11 dígitos.");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        // verificando se a senha é nula ou vazia e se tem pelo menos 6 caracteres
        if (senha != null && senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("A senha deve ter pelo menos 6 caracteres.");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        // verificando se a matrícula é válida (6 dígitos)
        if (isValidMatricula(matricula)) {
            this.matricula = matricula;
        } else {
            System.out.println("Matrícula inválida. A matrícula deve conter 6 dígitos.");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        // verificando se a carga horária é negativa
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("A carga horária não pode ser negativa.");
        }
    }

    public int getRegistroDeFrequencia() {
        return registroDeFrequencia;
    }

    public void setRegistroDeFrequencia(int registroDeFrequencia) {
        // verificando se o registro de frequência é negativo
        if (registroDeFrequencia >= 0) {
            this.registroDeFrequencia = registroDeFrequencia;
        } else {
            System.out.println("O registro de frequência não pode ser negativo.");
        }
    }

    public TipoDeMembro getTipoDeMembro() {
        return tipoDeMembro;
    }

    public void setTipoDeMembro(TipoDeMembro tipoDeMembro) {
        // verificando se o tipo de membro é nulo
        if (tipoDeMembro != null) {
            this.tipoDeMembro = tipoDeMembro;
        } else {
            System.out.println("O tipo de membro não pode ser nulo.");
        }
    }
}
