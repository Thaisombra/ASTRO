package main;

import models.entity.Aluno;
import models.entity.Membro;

public class Main {
    public static void main(String[] args) {
        //teste para gerar pela classe aluno e pela membro
        Membro aluno = new Membro();
        aluno.setNome("Teste");
        aluno.setMatricula("510288");
        aluno.setCpf("12345678910");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Matricula: " + aluno.getCpf());


        Aluno aluno1 = new Aluno();
        aluno1.setNome("Teste_2");
        aluno1.setMatricula("510289");
        aluno1.setCpf("12345678911");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Matricula: " + aluno1.getCpf());
    }
}
