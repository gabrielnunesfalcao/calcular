package calcular;
import java.util.*;
public class calcular {

	public static void main(String[] args) {
		while(true) {			
			Scanner input = new Scanner(System.in);
			System.out.println("Escolha uma operação");
			System.out.println("1 - Soma");
			System.out.println("2 - Diminuir");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			
			int escolha = input.nextInt();
			
			if (escolha == 5) {
				System.out.println("Encerrando a calculadora");
				break;
			}
			
			System.out.println("Digite o primeiro numero: ");
			double numero1 = input.nextDouble();
			
			System.out.println("Digite o segundo numero: ");
			double numero2 = input.nextDouble();
			
			double resultado = 0.0;
			
			switch (escolha) {
			case 1:
				resultado = numero1 + numero2;
				break;
			case 2:
				resultado = numero1 - numero2;
				break;
			case 3: 
				resultado = numero1 * numero2;
			case 4:
				if (numero2 != 0) {
				resultado = numero1 / numero2;
				} else {
					System.out.println("Erro: Divisão por zero!");
					continue;
					
				}
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}
			
			System.out.println("Resultado: " + resultado);
				}
	
}
}
			System.out.println("Resultado: " +  resultado );
		
		
		
		
	}
	}
}
