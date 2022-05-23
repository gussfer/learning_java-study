public class exemploFor {
    public static void main(String[] args) {
        int i;
        //contador: sempre inteiro; iniciados por 0 ou 1; nomeados i, j, etc
        // estrutura padrão do for (contadorValorInicial; condiçãoContador; contadorIncremento)
        //pares
        for (i = 0; i <= 10; i++) { 
            if (i%2 == 0) {// numero par: se o resto da divisão por 2 for zero
            System.out.println(i);
            }
        }
        //impares
        for (i = 1; i <= 10; i++)
            if (i%2 == 1) {//numero impar: se o resto da divisão por 2 for um 
                System.out.println(i);
        }
            System.out.println("O contador após o looping é: "+ i);
    }
}