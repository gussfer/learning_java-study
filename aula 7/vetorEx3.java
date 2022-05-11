/*
3- Faça um algoritmo que leia um vetor de 10 posições de números reais e divida todos os 
seus elementos pelo maior valor do vetor e armazene o resultado no mesmo vetor. 
Mostre o vetor após os cálculos.
*/
import java.util.Scanner;


public class vetorEx3 {
    public static void main(String[] args) {
        float [] valores = new float[10];
        float maior;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) 
        {
            System.out.println("Número um núnero:");
            valores[i] = scan.nextFloat();
        }
        imprime(valores);

        maior = achaMaior(valores);
        System.out.println(maior);
        //dividir todos pelo maior
        for (int i = 0; i < valores.length; i++) 
        {
            
            valores[i] /= maior;
        }
        imprime(valores);
    }

    //
    public static float achaMaior(float [] vetor) { // metodo acha maior
        float maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) 
        {
            if (vetor[i]> maior) maior =vetor[i];
        }
        return maior;
    }
    
    //
    public static void imprime(float [] vetor) { // metodo imprime
        for (int i = 0; i < vetor.length; i++) {
        System.out.println(i+":"+vetor[i]);

        }
    }
}
