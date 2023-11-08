package calcular;
import java.util.*;
public class calcular {

	public static void main(String[] args) {
		while(true) {			
			Scanner input = new Scanner(System.in);
			System.out.println("");
			if (opcao == 1)
			System.out.println("Digite o primeiro numero: ");
			double soma1 = input.nextDouble();			
			System.out.println("Digite o segundo numero: ");
			double soma2 = input.nextDouble();
			double resultado = soma1 + soma2;
			System.out.println("Resultado: " +  resultado );
			
			else
			System.out.println("Digite o primeiro numero: ");
			double diminuir1 = input.nextDouble();			
			System.out.println("Digite o segundo numero: ");
			double diminuir2 = input.nextDouble();
			double resultado = diminuir1 - diminuir2;
			System.out.println("Resultado: " +  resultado );
			
			
			System.out.println("Digite o primeiro numero: ");
			double mult1 = input.nextDouble();			
			System.out.println("Digite o segundo numero: ");
			double mult2 = input.nextDouble();
			double resultado = mult1 * mult2;
			System.out.println("Resultado: " +  resultado );
			
			
			System.out.println("Digite o primeiro numero: ");
			double dividir1 = input.nextDouble();			
			System.out.println("Digite o segundo numero: ");
			double dividir2 = input.nextDouble();
			double resultado = dividir1 / dividir2;
			System.out.println("Resultado: " +  resultado );
		
		
		
		
	}
	}
}
