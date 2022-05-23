
/*
abobrinha
4,5 - ate 5 unidades - (10%)
4,2 - ate 20 unidades - (10%)
4,0 - mais de 20 unidades - (10%)


*/
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int valor;

        // atributos do objeto
        // int abobrinha;
        // double preco;

        // System.out.println("Insira a quantidade de abobrinhas: ");
        // abobrinha = sc.nextInt();

        // if (abobrinha <= 5) {
        // preco = 4.5;
        // } else if (abobrinha > 5 && abobrinha <= 20) {
        // preco = 4.2;
        // } else {
        // preco = 4.0;
        // }

        // System.out.println("o valor é " + (preco * abobrinha * 0.9));
        // }
    }

    public static boolean valores(int valor, int valor2, int valor3, int valor4) {
        if (valor == valor2 || valor == valor3 || valor == valor4)
            return true;

    }
}