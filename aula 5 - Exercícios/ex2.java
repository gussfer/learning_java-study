// Escreva um algorítmo que considere a entrada de 3 pontuações e exiba qual é a maior.
import java.util.Scanner;

public class ex2 {
    public static void main(String [] args) {
        //declarando as variáveis
        float num1, num2, num3;
        Scanner input = new Scanner(System.in);
        //entrada
        System.out.println("Digite o número 1:");
        num1 = input.nextInt();
        System.out.println("Digite o número 2:");
        num2 = input.nextInt();
        System.out.println("Digite o número 3:");
        num3 = input.nextInt();
        if (num1>num2 && num1>num3) {
        System.out.println(num1);
        }
        if (num2>num3 && num2>num1) {
        System.out.println(num2);
        }
        if (num3>num2 && num3>num1){
          System.out.println(num3);
        }
    }
}
