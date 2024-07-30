package models.entity;

//O enum ainda não esta funcional.
//import models.enums.TipoDeMembro;

public class Membro {
    private String nome;
    private String cpf;
    private String senha;
    private String matricula;
    private int cargaHoraria;
    private int frequencia;
    //private TipoDeMembro tipoDeMembro;

    public String getNome() {
        return nome;
    }

    //Verifica se o campo esta null ou vazio
    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
    		this.nome = nome;
    	}
    }

    public String getCpf() {
        return cpf;
    }

    //Verifica se o campo não é nulo, se possui de fato 11 digitos e se todos são numeros 
    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11 && cpf.matches("\\d+")) {
            this.cpf = cpf;
        }
    }

    public String getSenha() {
        return senha;
    }
    //verifica a mesma coisa do campo Nome
    public void setSenha(String senha) {
        if(senha != null && !senha.isEmpty()){
    		this.senha = senha;
    	}
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && matricula.length() == 6 && matricula.matches("\\d+")) {
            this.matricula = matricula;
        }
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }    
    //verifica para permitir apenas números maiores que zero
    public void setCargaHoraria(int cargaHoraria){
        if(cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        }
    } 
    
    public int getFrequencia(){
        return frequencia;
    }    
    //verifica para permitir apenas números maiores que zero
    public void setFrequencia(int frequencia){
        if(frequencia > 0){
            this.frequencia = frequencia;
        }
    } 
}
