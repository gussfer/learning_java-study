import java.util.Locale;
import java.util.Scanner;

public class testeProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();
        System.out.println("Dados do produto");
        System.out.print("Nome: ");
        p.setNome(sc.nextLine());
        System.out.print("Preço: ");
        p.setPreco(sc.nextDouble());

        // Instanciar após a entrada dos dados
        Produto produto = new Produto(p.getNome(), p.getPreco());
        System.out.println();
        System.out.println("Dados do produto");
        System.out.println(produto);

        System.out.println();
        System.out.println("Digite a quantidade de entrada de produto no estoque: ");
        int qtde = sc.nextInt();
        produto.addProduto(qtde);

        System.out.println();
        System.out.println("Atualização do produto em estoque");
        System.out.println(produto);

        System.out.println();
        System.out.println("Digite a quantidade de saída do produto em estoque: ");
        qtde = sc.nextInt();
        produto.removeProduto(qtde);

        System.out.println();
        System.out.println("Atualização do produto em estoque");
        System.out.println(produto);

        sc.close();
    }
}
