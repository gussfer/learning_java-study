// Calcule a pontuação média de um jogador à partir dos pontos obtidos em 3 fases. 
// Leia o valor das 3 pontuações e mostre na saída a média.
import java.util.Scanner;

public class ex1 {
    public static void main(String [] args) {
        //declarando as variáveis
        float num1, num2, num3, media;
        try (Scanner input = new Scanner(System.in)) {
            //entrada
            System.out.println("Digite o número 1:");
            num1 = input.nextInt();
            System.out.println("Digite o número 2:");
            num2 = input.nextInt();
            System.out.println("Digite o número 3:");
            num3 = input.nextInt();
        }
        media = (num1+num2+num3)/3;
        System.out.println("A media é: " + media);
    }
}

