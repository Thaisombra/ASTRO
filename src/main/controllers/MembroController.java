package main.controllers;
import main.dao.MembroDAO;
import main.entity.Membro;

public class MembroController {
    private MembroDAO membroDAO = new MembroDAO();
    
    //metodo para cadastrar membro
    public void cadastrarMembro(Membro membro) {
        membroDAO.cadastrar(membro);
    }
    //metodo para fazer login
    public Membro login(String cpf, String senha) {
        return membroDAO.login(cpf, senha);
    }
}
