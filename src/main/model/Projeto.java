package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Projeto {
    private String titulo;
    private Date dataDeVigencia;
    private String localAtual;
    private String areaPrincipalDeAtuacao;
    private String areaSecundariaDeAtuacao;
    private String[] palavrasChave;
    private String websiteDoProjeto;
    private String telefone;
    private String email;
    private boolean projetoAtivo;
    private List<Projeto> vinculoComOutrosProjetos;
    private String unidadePertencente;
    private List<Atividade> atividades;
    private List<Relatorio> relatorios;
    private List<String> participantes;
    private static final int MAX_PARTICIPANTES = 20;//limite máximo de participantes.

    //Contrutor
    public Projeto(String titulo, Date dataDeVigencia, String localAtual){
        this.titulo = titulo;
        this.dataDeVigencia = dataDeVigencia;
        this.localAtual = localAtual;
        this.atividades = new ArrayList<>();
        this.relatorios = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.vinculoComOutrosProjetos = new ArrayList<>();

    }

    public void cadastrarRelatorio(Relatorio relatorio){
        if(relatorio != null){
            relatorios.add(relatorio);//adiciona o relatório a lista.
            System.out.println("Relatório cadastrado com sucesso");
        }else{
            System.out.println("O relatório não pode ser nulo");
        }
    }

    public void exibirRelatorio(){
        for(Relatorio rel : relatorios){
            System.out.println(rel);
        }
    }

    public void submeterRelatorio(Relatorio relatorio) {
        if(relatorio != null){
            if(!relatorio.isSubmetido()){
                relatorio.setSubmetido(true);
                System.out.println("Relatorio '" +  relatorio.toString() + "' submetido com sucesso!");
            }else{
                System.out.println("Este relatório já foi submetido.");
            }
        }else{
            System.out.println("O relatório não pode ser nulo.");
        }
    }

    public void adicionarParticipante(String participante) {
        if(participantes.size() < MAX_PARTICIPANTES){
            if(!participantes.contains(participante)){
                participantes.add(participante);
                System.out.println("Participante " + participante + " adicionado ao projeto.");
            }else{
                System.out.println("Participante " + participante + " já está no projeto.");
            }
        }else{
            System.out.println("ERRO: Limite máximo de participantes atingido.");
        }
    }

    public void exibirParticipantes(){
        System.out.println("Lista de Paticipantes");
        for(String participante : participantes){
            System.out.println(participante);
        }
    }

    public void adicionarAtividade(String nomeDaAtividade, String descricao, String dataInicio, String dataFim){
        Atividade atividade = new Atividade(nomeDaAtividade, descricao, dataInicio, dataFim);
        atividades.add(atividade);
        System.out.println("Atividade '" + nomeDaAtividade + "' adicionada ao projeto.");
    }

    public void exibirAtividades(){
        System.out.println("Lista de Atividades:");
        for(Atividade atividade : atividades){
            System.out.println(atividade);
        }
    }

       //Getters
       public String getTitulo() {
        return titulo;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public String getAreaPrincipalDeAtuacao() {
        return areaPrincipalDeAtuacao;
    }

    public String getAreaSecundariaDeAtuacao() {
        return areaSecundariaDeAtuacao;
    }

    public int getMaximoDeParticipantes() {
        return MAX_PARTICIPANTES;
    }

    public String[] getPalavrasChave() {
        return palavrasChave;
    }

    public String  getWebsiteDoProjeto() {
        return websiteDoProjeto;
    }

    public String getEmail() {
        return email;
    }

    public String getUnidadePertencente() {
        return unidadePertencente;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDataDeVigencia() {
        return dataDeVigencia;
    }

    public boolean isProjetoAtivo() {
        return projetoAtivo;
    }

    public List<Projeto> getVinculoComOutrosProjetos() {
        return vinculoComOutrosProjetos;
    }

    //Setters
    public void setTitulo(String titulo) {//setando o titulo do projeto.
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public void setLocalAtuante(String localAtual) {//setando local de atuação do projeto.
        if (localAtual != null) {
            this.localAtual = localAtual;
        }
    }

    public void setAreaPrincipalDeAtuacao(String areaPrincipalDeAtuacao) {//setando o as areas de especialização do projeto.
        if (areaPrincipalDeAtuacao != null) {
            this.areaPrincipalDeAtuacao = areaPrincipalDeAtuacao;
        } else {
            System.out.println("A area principal de atuacao nao foi encontrada!");
        }
    }

    public void setAreaSecundariaDeAtuacao(String areaSecundariaDeAtuacao) {//area secundaria de atuação.
        if (areaSecundariaDeAtuacao != null) {
            this.areaSecundariaDeAtuacao = areaSecundariaDeAtuacao;
        } else {
            System.out.println("A area secundaria de atuacao nao foi encontrada!");
        }
    }

    public void setMaximoDeParticipantes(int maximoDeParticipantes) {//definindo o publico/participantes previstos das reuniões.
        if (maximoDeParticipantes >= 0 && maximoDeParticipantes <= MAX_PARTICIPANTES) {
           //MAX_PARTICIPANTES, já é definido como constante.
        } else {
            System.out.println("A quantidade ultrapassa o limite de publico!");
        }
    }

    public void setPalavrasChave(String[] palavrasChave) {//palavras-chave para busca dos artigos sobre o projeto.
        if (palavrasChave != null) {
            this.palavrasChave = palavrasChave;
        }
    }

    public void setWebsiteDoProjeto(String websiteDoProjeto) {//url do website do projeto.
        if (websiteDoProjeto != null) {
            this.websiteDoProjeto = websiteDoProjeto;
        }
    }

    public void setEmail(String email) {//email do responsável.
        if (email != null) {
            this.email = email;
        }
    }

    public void setUnidadePertencente(String unidadePertencente) {//bloco e sala em que o projeto será realizado.
        if (unidadePertencente !=null) {
            this.unidadePertencente = unidadePertencente;
        } else {
            System.out.println("A unidade nao foi encontrado!");
        }
    }

    public void setTelefone(String telefone) {//telefone do coordenador do projeto.
        if (telefone != null) {
            this.telefone = telefone;
        }
    }

    public void setDataDeVigencia(Date dataDeVigencia) {//data de inicio das pesquisas do projeto.
        if (dataDeVigencia != null && dataDeVigencia.compareTo(new Date()) >= 0) {
            this.dataDeVigencia = dataDeVigencia;
        }
    }

    public void setProjetoAtivo(boolean projetoAtivo) {//projeto está ou não ativo.
        if (projetoAtivo) {
            this.projetoAtivo = true;
        } else {
            System.out.println("O projeto nao esta ativo!");
        }
    }

    public void setVinculoComOutrosProjetos(List<Projeto> vinculoComOutrosProjetos) {//lista de projetos parceiros.
            this.vinculoComOutrosProjetos = vinculoComOutrosProjetos;
    }

    public void adicionarVinculoComOutroProjeto(Projeto projeto){
        if(projeto != null){
            vinculoComOutrosProjetos.add(projeto);
        }
    }
}
