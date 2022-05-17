import java.util.Scanner; // classe scanner para input
public class switchCase {
        public static void main(String[] args) {
            try (//declarando scanner
        Scanner input = new Scanner(System.in)) {
            // declaração
            int diaSemana;
            //entrada
            System.out.println("Digite número do dia da semana:");
            diaSemana = input.nextInt();
            // comando de decisão múltipla switch case
            switch (diaSemana) {
            // conjunto de instruções
                case 1:
                    System.out.print("Domingo");
                    break;
                case 2:
                    System.out.print("Segunda");
                    break;
                case 3:
                    System.out.print("Terça");
                    break;
                case 4:
                    System.out.print("Quarta");
                    break;
                case 5:
                    System.out.print("Quinta");
                    break;
                case 6:
                    System.out.print("Sextou");
                    break;
                case 7:
                    System.out.print("Sabadou");
                    break;
                default:
                    System.out.print(diaSemana + " Não é um dia da semana");
            }
    }
  }
}