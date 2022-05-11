/*
4 - Palindromos são palavras ou frases ... 

*/


public class vetorEx4 {
    public static void main(String[] args) {
        checkPalin("teste");
        if ( checkPalin("teste"))
            System.out.println("é palindromo");
        else 
        System.out.println("Não é palindromo");
    }
    public static boolean checkPalin(String palavra) 
    {
        boolean palin = true;
        for (int i = 0, j = palavra.length() -1; i < palavra.length(); i++, j--) 
        {
            if (palavra.charAt(i) != palavra.charAt(j))
            return false;
        }
        return palin;
    }
}



// Public static boolean checkPalin(String palavra) 
//     {
//         for (int i = 0; i < palavra.length(); i++)        
//         {
//             System.out.println(palavra.charAt(i));
//         }
//         return false;
//     }

