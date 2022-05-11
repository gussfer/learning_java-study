public class ExFuncionario {
    public String nome;
    public double horas;
    public double valorHora;

    // Construtor
    public ExFuncionario(String nome, double horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    // Metodo para calcular salario
    public double salarioFinal() {
        return horas * valorHora;
    }

    // Metodo para printar informações
    public String toString() {
        return "Funcionário: " + nome +
                " Horas Trabalhadas: " + horas +
                " Valor da Hora: " + valorHora +
                " Salário: " + salarioFinal();
    }

}
