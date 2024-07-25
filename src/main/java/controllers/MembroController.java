package controllers;

import models.entity.Membro;

public class MembroController {
    private MembroDAO membroDAO = new MembroDAO();
    
    public void cadastrarMembro(Membro membro) {
        membroDAO.cadastrar(membro);
    }
    
    public Membro login(String cpf, String senha) {
        return membroDAO.login(cpf, senha);
    }
}
