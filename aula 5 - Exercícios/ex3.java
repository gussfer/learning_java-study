// Supondo que a população de um formigueiro A seja da ordem de 90.000 formigas com uma taxa anual de crescimento de 3% 
// e que a população do formigueiro B seja, aproximadamente, de 200.000 formigas com uma taxa anual de crescimento de 1.7%, 
// fazer um algoritmo que calcule e escreva o número de anos necessários para que a quantidade de formigas do formigueiro A 
// ultrapasse ou iguale a do formigueiro B, mantidas essas taxas de crescimento.
public class ex3 {
    public static void main(String[] args) {
        double A = 90000;
        double B = 200000;
        double taxaA = 0.03;
        double taxaB = 0.017;
        int ano = 0;
        while (A < B){
          A = A + (A * taxaA);
          B = B + (B * taxaB);
          ano = ano + 1 ;
        }
        System.out.println("Serão necessários " + ano + " anos para que a população do A ultrapasse ou iguale a população B");
      }
}
