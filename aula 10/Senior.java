public class Senior extends ExFuncionario {
    public double bonus;

    // construtor
    public Senior(String nome, double horas, double valorHora, double bonus) {

        super(nome, horas, valorHora);
        this.bonus = bonus;
    }

    public double salarioFinal() {
        // calcular qtde de bonus aplicado
        double bonusTotal = ((int) (horas / 10) * bonus);// converter double em int
        // quando bonus é em horas
        // return (horas + bonusTotal) * valorHora;
        // quando bonus é percentual
        return ((horas * (bonusTotal / 100)) + horas) * valorHora;
    }

    public String toString() {
        return super.toString() + "bônus: " + bonus; // Sobrescrever o método toString() existente na Classe
                                                     // ExFuncionario
    }
}
