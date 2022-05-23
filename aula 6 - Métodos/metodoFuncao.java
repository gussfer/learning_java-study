
public class metodoFuncao {
    public void soma (double x, double y) {
        System.out.println(Math.round(x+y));
    } // fim do metodo soma
    public void subtracao (double x, double y) {
        System.out.println(x-y);
    } // fim do metodo subtracao
    public static double multiplicacao(double x, double y) {
        return (x * y);
    }
    public static void main(String[] args) {
        metodoFuncao calc = new metodoFuncao();
        double m;
        calc.soma(3,2.345);
        calc.subtracao(5,5.3455);
        m = metodoFuncao.multiplicacao(4,5);
        System.out.println(m); //print fora da função
    }; // fim do metodo main
}
// Aula 22/03/2022
// public class Exercicios 

{
    //retorna par
    boolean parImpar (int num) 
    {
        return (num % 2 == 0);            
    }
    boolean primo (int num2) 
    {
        
        for (int i = 2; i <= num2; i++) {
            if (num2 % i == 0)
                return false;
        }
        return true; // saindo do for, número é primno
    }
    long fatorial (int num3)
    {
        long total = 1;
        for (int i = num3; i>=1; i++)
        total *= 1;
        return total;
    }
    int fibo (int num4) {
        int pos1, pos2, atual;
        pos1 = 1;
        pos2 = 1;
        atual = 0;
        if (num3 <= 2)
            return pos1;
        for (int i = 3; i<= num; i++) {
            atual = pos1 + pos2;
            pos1 = pos2;
            pos2 = atual;
        }
        return atual;
    } 
    float mediaAnima (float a1, float a2, float a3)
    {
        return a1*0.3f + a2*0.3f + a3*0.4f;
    }

    public static void main (String[]args) {
        System.out.println();
    }
}

