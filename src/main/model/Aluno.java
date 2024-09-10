package model;

import main.models.enums.TipoDeMembro;

public class Aluno extends Membro {
    private boolean bolsista;

    public Aluno(String nome, String cpf, String senha, int matricula, TipoDeMembro tipoDeMembro) {
        super(nome, cpf, senha, matricula, tipoDeMembro);
    }

    // Getter e Setter para bolsista
    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    // Método específico para Aluno
    public void exibirStatusBolsista() {
        if (bolsista) {
            System.out.println("O aluno é bolsista.");
        } else {
            System.out.println("O aluno não é bolsista.");
        }
    }
}
