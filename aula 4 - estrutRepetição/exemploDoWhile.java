import java.util.Scanner; // classe scanner para input
public class exemploDoWhile {
    public static void main(String[] args) {
        //contador inicializado antes do inicio
        
        int i=0;
        // printar os numeros pares
        while (i<20){
        if(i%2 == 0)
            System.out.println(i);
            i++;
        }
    }
}
