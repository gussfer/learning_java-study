//Suponha que as notas de um exame sejam: 87, 68, 94, 100, 83, 78, 85, 91, 76, 87.
// Faça um contador para cada dezena e apresente quantas vezes cada aluno teve notas em cada dezena
public class arrayDesafio2 {
    public static void main(String[] args) {
        int [] dezenas = new int[11];
		int notas[]= {87,68,94,100,83,78,85,91,76,87};
		// sempre que formos usar valores para somar devemos garantir a inicialização com
		for(int cont=0; cont<dezenas.length; cont++) 
            dezenas[cont] = 0;
        // Percorre o vetor e testa as notas
        for (int cont=0; cont<notas.length; cont++) 
        {
            int dezena = notas[cont]/10;
            dezenas[dezena]++;
        }
        //printa o resultado
        for(int cont=0; cont<dezenas.length; cont++)
            System.out.println(cont+": "+ dezenas[cont]);
       
	}

}

