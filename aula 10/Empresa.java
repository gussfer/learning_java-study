import java.util.ArrayList;

public class Empresa {
    public ArrayList<ExFuncionario> funcionarios;

    public Empresa() {
        // lista vazia
        funcionarios = new ArrayList<ExFuncionario>();
    }

    public void add(ExFuncionario novo) {
        funcionarios.add(novo);
    }

    public void listar() {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).toString());
        }
    }

    public void listarSalario() {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(
                    "Nome: " + funcionarios.get(i).nome +
                            "Salario: " + funcionarios.get(i).salarioFinal());
        }
    }

    public void totalSenior() {
        int total = 0;
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i) instanceof Senior)// testa se os Objetos pertence a Classe Senior
                total++;
        }
        System.out.println("Seniores: " + total);
    }

    public void listaPorFaixa(double min, double max) {

        for (int i = 0; i < funcionarios.size(); i++) {
            double salario = funcionarios.get(i).salarioFinal();
            if (salario >= min && salario <= max)
                // Polimorfismo
                System.out.println("Nome: " + funcionarios.get(i).nome + salario);

        }
    }

}
