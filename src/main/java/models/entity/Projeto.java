public class Projeto {//Declaração de variáveis
    private int titulo;//Título do Projeto.
    private int localAtuante;//
    private int areaPrincipalDeAtuacao;//
    private int areaSecundariaDeAtuacao;//
    private int publicoEstimado;//Quantidade de pessoas que irão fazer parte.
    private int palavrasChave;//
    private int websiteDoProjeto;//Link numérico do website do projeto.
    private int email;//Email do(s) responsável(eis) do projeto.
    private int unidadePertencente;//
    private long telefone;//Telefone do(s) responsável(eis) do projeto.
    private long dataDeVigencia;//
    private boolean projetoAtivo;//Projeto está ou não ativo.
    private boolean vinculoComOutrosProjetos;//Aviso de vínculo com algum outro projeto.

    //Getters

    public int getTitulo() {
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

    public int getPalavrasChave() {
        return palavrasChave;
    }

    public int getWebsiteDoProjeto() {
        return websiteDoProjeto;
    }

    public int getEmail() {
        return email;
    }

    public int getUnidadePertencente() {
        return unidadePertencente;
    }

    public long getTelefone() {
        return telefone;
    }

    public long getDataDeVigencia() {
        return dataDeVigencia;
    }

    public boolean isProjetoAtivo() {
        return projetoAtivo;
    }

    public boolean isVinculoComOutrosProjetos() {
        return vinculoComOutrosProjetos;
    }

    //Setters

    public void setTitulo(int titulo) {
        if (titulo >= 0) {
            this.titulo = titulo;
        } else {
            System.out.println("O titulo nao foi encontrado!");
        }
    }

    public void setLocalAtuante(int localAtuante) {
        if (localAtuante >= 0) {
            this.localAtuante = localAtuante;
        } else {
            System.out.println("O local atuante nao foi encontrado!");
        }
    }

    public void setAreaPrincipalDeAtuacao(int areaPrincipalDeAtuacao) {
        if (areaPrincipalDeAtuacao >= 0) {
            this.areaPrincipalDeAtuacao = areaPrincipalDeAtuacao;
        } else {
            System.out.println("A area principal de atuacao nao foi encontrada!");
        }
    }

    public void setAreaSecundariaDeAtuacao(int areaSecundariaDeAtuacao) {
        if (areaSecundariaDeAtuacao >= 0) {
            this.areaSecundariaDeAtuacao = areaSecundariaDeAtuacao;
        } else {
            System.out.println("A area secundaria de atuacao nao foi encontrada!");
        }
    }

    public void setPublicoEstimado(int publicoEstimado) {
        int limite = 20;
        if (publicoEstimado >= 0 && publicoEstimado <= limite) {
            this.publicoEstimado = publicoEstimado;
        } else {
            System.out.println("A quantidade ultrapassa o limite de publico!");
        }
    }

    public void setPalavrasChave(int palavrasChave) {
        if (palavrasChave >= 0) {
            this.palavrasChave = palavrasChave;
        } else {
            System.out.println("A palavra chave nao foi encontrada!");
        }
    }

    public void setWebsiteDoProjeto(int websiteDoProjeto) {
        if (websiteDoProjeto >= 0) {
            this.websiteDoProjeto = websiteDoProjeto;
        } else {
            System.out.println("O link do website nao foi encontrado!");
        }
    }

    public void setEmail(int email) {
        if (email >= 0) {
            this.email = email;
        } else {
            System.out.println("O email nao foi encontrado!");
        }
    }

    public void setUnidadePertencente(int unidadePertencente) {
        if (unidadePertencente >= 0) {
            this.unidadePertencente = unidadePertencente;
        } else {
            System.out.println("A unidade nao foi encontrado!");
        }
    }

    public void setTelefone(long telefone) {
        if (telefone >= 0) {
            this.telefone = telefone;
        } else {
            System.out.println("O numero de telefone nao foi encontrado!");
        }
    }

    public void setDataDeVigencia(long dataDeVigencia) {
        if (dataDeVigencia >= 0) {
            this.dataDeVigencia = dataDeVigencia;
        } else {
            System.out.println("A data de vigencia nao existe!");
        }
    }

    public void setProjetoAtivo(boolean projetoAtivo) {
        if (projetoAtivo) {
            this.projetoAtivo = true;
        } else {
            System.out.println("O projeto nao esta ativo!");
        }
    }

    public void setVinculoComOutrosProjetos(boolean vinculoComOutrosProjetos) {
        if (vinculoComOutrosProjetos) {
            this.vinculoComOutrosProjetos = true;
        } else {
            System.out.println("O projeto nao esta vinculado a nenhum outro projeto existente!");
        }
    }

    public void cadastrarRelatorio() {

    }
}
