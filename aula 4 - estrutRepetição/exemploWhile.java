public class exemploWhile {
    public static void main(String[] args) {
        //contador inicializado antes do inicio
        int i=0;
        // printar os numeros pares
        while (i<20){
        if(i%2 == 0)
            System.out.println(i);
            i++;
        }
        // printar os numeros impares
        int j=1;
        while(j<20){
        if (i%2 == 1)
            System.out.println(j);
            j++;
        }    
    }
}
