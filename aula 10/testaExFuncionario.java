public class testaExFuncionario {
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e1.add(new ExFuncionario("João ", 40, 15));
        e1.add(new Senior("Maria ", 40, 15, 10));
        e1.add(new ExFuncionario("Cleber ", 40, 15));
        e1.add(new Senior("Roberto ", 40, 15, 6));

        e1.listar();
        e1.listarSalario();
        e1.listaPorFaixa(4000, 6000);
        e1.totalSenior();

        ExFuncionario f1 = new ExFuncionario("Gus", 40, 10);// Estanciar objeto da Classe ExFuncionario
        System.out.println(f1.toString());

        ExFuncionario fs1 = new Senior("Rainne", 40, 10, 10); // polimorfismo: Estanciar Objeto "Senior" partir da Super
                                                              // Classe (Objeto) ExFuncionario
        System.out.println(fs1.toString());

    }
}
