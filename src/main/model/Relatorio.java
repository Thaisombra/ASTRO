package model;

import java.util.List;

public class Relatorio {
    private String titulo;//Titulo do relatório ou da atividade que ele irá relatar.
    private String conteudo;//Conteúdo do relatório.
    private int duracao;
    private List<String> participantes;
    private boolean submetido;//indicar se o relatório já foi submetido.

    public Relatorio(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.submetido = false;
    }

    public void gerarRelatorio() {
        // Implementation for gerarRelatorio
    }

    public void editarRelatorio() {
        // Implementation for editarRelatorio
    }

    public void visualizarRelatorio() {
        // Implementation for visualizarRelatorio
    }

    public boolean isSubmetido(){
        return submetido;
    }

    public void setSubmetido(boolean submetido){
        this.submetido = submetido;
    }

    @Override
    public String toString(){
        return "Título: " + titulo + "\nConteúdo: " + conteudo + "\nParticicipantes: " + participantes + "Duração: " + duracao + "\nSubmetido: " + submetido;
    }

}
