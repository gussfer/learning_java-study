
public class testaFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Rainne", 1000);
        System.out.println(f.toString());
        f.aumentarSalario(20); // au
        System.out.println(f);
        // System.out.println(nome + salario);
    }
}
