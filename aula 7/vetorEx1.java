/*
1- Elabore um algoritmo que leia a pontuação de 10 jogadores de um jogo e os armazene dentro de um vetor.

Depois, em ciclos independentes:
•Calcule a média desses pontos.
•Determine a maior pontuação
•Conte as pontuações menores que 150.
*/
import java.util.Scanner;
public class vetorEx1 {
    public static void main(String[] args) {
        int pont[]= new int [5];
        Scanner input = new Scanner(System.in);
        float sum=0;
        float media=0;
        //media
        for (int i=0; i<pont.length; i++){
            System.out.println("Digite o ponto " + (i+1));
            pont[i] = input.nextInt();
            media = (sum+=pont[i])/(pont.length);
        }
        //acha a maior
        float maior = pont[0];
        for (int i=0; i<pont.length; i++){
            if (pont[i] > maior) maior=pont[i];
        }
        //conta maiores que 150
        float cont=0;
        for (int i=0; i<pont.length; i++){
            if(pont[i] < 150) cont++;
        }

        System.out.println("Numeros maiores que 150: " + cont);
        System.out.println("O maior é: " + maior);
        System.out.println("A media das notas é: " + media);
    }
    //metodo que imprimeVetor
    public static void imprimeVetor(int [] vetor) {
        for (int i=0; i<vetor.length; i++){
                System.out.println(i+": "+vetor[i]);
        }
    }
}
