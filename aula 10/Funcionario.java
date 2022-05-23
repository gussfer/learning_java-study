
public class Funcionario {
    public String nome;
    public double salario;

    // construtor
    // dentro do () vão os parametros e o this. é usado pra atribuir o valor dos

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double perc) {

        double total = perc / 100 * salario;
        salario = salario + total; // salario = salario * perc

    }

    public String toString() {
        return "Funcionário: " + nome
                + " Salário: " + salario;
    }

}
