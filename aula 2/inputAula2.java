import java.util.Scanner; // classe scanner para input

class Main {
    public static void main(String args[]) {
        try (//declarando scanner
        Scanner input = new Scanner(System.in)) {
            //declarando as variáveis
            int num1;
            int num2;
            int soma;
            //entrada
            System.out.println("Digite o número 1:");
            num1 = input.nextInt();
            System.out.println("Digite o número 2:");
            num2 = input.nextInt();
            soma = num1+num2;
            //processamento
            if (soma >= 1000) {
                //saída condição verdadeira
                System.out.println("Win");
            } //else if (num1 == num2){
            //     //saída condição verdadeira
            //     System.out.println("Os números são iguais");
             else {
                //saída condição falsa
                System.out.println("Loose");
            }
        }
    }
}