import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random numberRandom = new Random();
        int numberDrawn = numberRandom.nextInt(101);     
        int numberChooseByUser;
         
        System.out.println("Nós sorteamos um número entre 0 e 100, tente acertá-lo: ");
        numberChooseByUser = scan.nextInt();
    
        while (numberChooseByUser != numberDrawn) {
          if (numberChooseByUser > numberDrawn)System.out.println("Quase acertou, seu numero é maior que o numero sorteado tente novamente:" );
           
          if (numberChooseByUser < numberDrawn)System.out.println("Quase acertou, seu numero é menor que o numero sorteado tente novamente:");
          
          numberChooseByUser = scan.nextInt();
        }
        System.out.println("Parabéns, você acertou o numero escolhido: " + numberDrawn);
      }
}
