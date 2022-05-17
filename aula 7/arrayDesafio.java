// Vetor com 10 posições onde o vetor calcule vetor[cont]=2+2*cont
public class arrayDesafio {
    public static void main(String[] args) {
        int vet[];
        vet= new int[10];
        int cont;
        System.out.printf("%s%8s\n", "Index", "Valor");// títulos das colunas
        for (cont = 0; cont <10; cont++){
            vet[cont] = 2 + 2 * cont;
            System.out.printf("%5d%8d\n", cont, vet[cont]);
         }
         

    }
    
}
