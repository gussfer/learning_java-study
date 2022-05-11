// Desenvolver um programa que calcule e imprima o Fatorial de um número inteiro informado, usando o Para / For
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int fat, total;
            System.out.println("Digite o número: ");
            fat = input.nextInt();
            total = 1;
            for (int i = fat; i > 1; i--) {
                total = total * i;
            }
            System.out.println("O fatorial do número inserido é: " + total);
        }
        
    }
}
