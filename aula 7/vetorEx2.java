/*
2- Crie um método que recebe um array de inteiros e exiba um histograma de acordo com estes valores. Exemplo:

•5 *****
•7 *******
•2 **
•4 ****
•6 ******
*/

public class vetorEx2 {
    public static void main(String[] args) {
        int [] teste = {1, 2, 3, 4, 5, 6};
        histograma(teste);
    }
    public static void histograma(int [] vetor)
    {
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print(vetor[i] + ":\t");
            linha(vetor[i]);
        }
    }
    public static void linha(int num)
    {
        for(int i = 0; i < num; i++)
            System.out.print("*");
        System.out.println();
    }
}