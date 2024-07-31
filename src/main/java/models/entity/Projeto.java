import java.util.Date;

public class Projeto {//Declaração de variáveis
    private int localAtuante;// Perguntar para os membros da equipe como isso deveria funcionar
    private int areaPrincipalDeAtuacao;// Perguntar se isso é um código ou um nome
    private int areaSecundariaDeAtuacao;// Mesma coisa
    private int publicoEstimado;//Quantidade de pessoas que irão fazer parte.
    private int unidadePertencente;//
    private String[] palavrasChave;//
    private String websiteDoProjeto;//Link numérico do website do projeto.
    private String email;//Email do(s) responsável(eis) do projeto.
    private String titulo;//Título do Projeto.
    private String telefone;//Telefone do(s) responsável(eis) do projeto.
    private Date dataDeVigencia;//Data em que o projeto iniciou.
    private Projeto[] vinculoComOutrosProjetos;//Aviso de vínculo com algum outro projeto.
    private boolean projetoAtivo;//Projeto está ou não ativo.

    //Getters

    public String getTitulo() {
        return titulo;
    }

    public int getLocalAtuante() {
        return localAtuante;
    }

    public int getAreaPrincipalDeAtuacao() {
        return areaPrincipalDeAtuacao;
    }

    public int getAreaSecundariaDeAtuacao() {
        return areaSecundariaDeAtuacao;
    }

    public int getPublicoEstimado() {
        return publicoEstimado;
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

    public int getUnidadePertencente() {
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

    public Projeto[] isVinculoComOutrosProjetos() {
        return vinculoComOutrosProjetos;
    }

    //Setters

    public void setTitulo(String titulo) {//setando o titulo do projeto.
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public void setLocalAtuante(int localAtuante) {//setando local de atuação do projeto.
        if (localAtuante >= 0) {
            this.localAtuante = localAtuante;
        }
    }

    public void setAreaPrincipalDeAtuacao(int areaPrincipalDeAtuacao) {//setando o as areas de especialização do projeto.
        if (areaPrincipalDeAtuacao >= 0) {
            this.areaPrincipalDeAtuacao = areaPrincipalDeAtuacao;
        } else {
            System.out.println("A area principal de atuacao nao foi encontrada!");
        }
    }

    public void setAreaSecundariaDeAtuacao(int areaSecundariaDeAtuacao) {//area secundaria de atuação.
        if (areaSecundariaDeAtuacao >= 0) {
            this.areaSecundariaDeAtuacao = areaSecundariaDeAtuacao;
        } else {
            System.out.println("A area secundaria de atuacao nao foi encontrada!");
        }
    }

    public void setPublicoEstimado(int publicoEstimado) {//definindo o publico/participantes previstos das reuniões.
        int limite = 20;//limite de participantes.
        if (publicoEstimado >= 0 && publicoEstimado <= limite) {
            this.publicoEstimado = publicoEstimado;
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

    public void setUnidadePertencente(int unidadePertencente) {//bloco e sala em que o projeto será realizado.
        if (unidadePertencente >= 0) {
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
        if (dataDeVigencia != null) {
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

    public void setVinculoComOutrosProjetos(Projeto[] vinculoComOutrosProjetos) {//lista de projetos parceiros.
            this.vinculoComOutrosProjetos = vinculoComOutrosProjetos;
    }

    public void setVinculoComOutrosProjetos(Projeto vinculoComOutrosProjetos) {//sobrecarga para a lista de projetos vinculados.
        if(this.vinculoComOutrosProjetos != null){
            this.vinculoComOutrosProjetos[this.vinculoComOutrosProjetos.length+1] = vinculoComOutrosProjetos;
        }
    }

    public void cadastrarRelatorio() {//função/operação de cadstro do relatório das reuniões e progresso do projeto.
    }

    /*public Relatorio submeterRelatorio(){
    }*/

    public void cadastrarFrequencia(){//função/operação de cadastro da frequência dos participantes.
    }

    public void visualizarFrequencia(){//função/operação para a visualização dos participantes presentes daquele dia.
    }

    public void adicionarParticipante(){//função/operação para adição de novos participantes.
    }

    public void adicionarAtividade(){//função/operação para adição de novas atividades a serem desenvolvidas.
    }

}
