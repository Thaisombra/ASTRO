package main.controllers;

import main.dao.CoordenadorDAO;
import main.entity.Coordenador;

public class CoordenadorController {
    private CoordenadorDAO coordenadorDAO = new CoordenadorDAO();

    //Metodo para o coodernador fazer o cadastro de projetos no site
    public void cadastrarProjeto(Coordenador coordenador) {
        coordenador.cadastrarProjeto();
        coordenadorDAO.salvar(coordenador);
    }

    //metodo para o Coodernador remover projetos
    public void removerProjeto(Coordenador coordenador) {
        coordenador.removerProjeto();
        coordenadorDAO.atualizar(coordenador);
    }

    //metodo para cadastrar aluno no projeto que coordenador pertence
    public void cadastrarAluno(Coordenador coordenador) {
        coordenador.cadastrarAluno();
        coordenadorDAO.salvar(coordenador);
    }

    //metodo para remover aluno no projeto que coordenador pertence

    public void removerAluno(Coordenador coordenador) {
        coordenador.removerAluno();
        coordenadorDAO.atualizar(coordenador);
    }

    //metodo para fazer a busca do coordenador no BD
    public Coordenador buscarCoordenador(int id) {
        return coordenadorDAO.buscar(id);
    }
}
