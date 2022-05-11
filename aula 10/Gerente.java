public class Gerente extends Funcionario {
    private int nrFuncionarios;

    // construtor
    public Gerente(String nome, double salario, int nrFuncionarios) {
        super(nome, salario);
        this.nrFuncionarios = nrFuncionarios;
    }

    public int getNrFuncionarios() {
        return nrFuncionarios;
    }

    public void setNrFuncionarios(int nrFuncionarios) {
        this.nrFuncionarios = nrFuncionarios;
    }

}
