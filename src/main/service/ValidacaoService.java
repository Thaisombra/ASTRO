package service;

public class ValidacaoService {
    public boolean isValidCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        return cpf.length() == 11;
    }

    public boolean isValidMatricula(int matricula) {
        return String.valueOf(matricula).length() == 6;
    }
}
