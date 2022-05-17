import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner ( System.in )) {
            float conta, num1, num2;
            String opc;
            
            System.out.println("Digite um número: ");
            num1 = input.nextFloat();
            System.out.println("Digite um número: ");
            num2 = input.nextFloat();
            System.out.println("Digite: \n(+) soma \n(-) subtração \n(*) multiplicação \n(/) divisão"); 
            opc = input.next();
   
            switch(opc) {
            case "+":
            	conta = num1 + num2;
            	System.out.println(conta);
            	break;
            case "-":
            	conta = num1 - num2;
            	System.out.println(conta);
            	break;
            case "*":
            	conta = num1 * num2;
            	System.out.println(conta);
            	break;
            case "/":
            	conta = num1 / num2;
            	System.out.println(conta);
            	break;
            default:
            	System.out.println("Opção inválida");
            	break;
            }
        }	

	}

}

