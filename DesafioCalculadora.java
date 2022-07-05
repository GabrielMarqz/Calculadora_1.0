package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite um operador: ");
		String operador = entrada.next();
		
		System.out.print("Digite o segundo valor: ");
		double num2 = entrada.nextDouble();

		System.out.print("Resultado: ");
		System.out.println(operador.equals("+") ? num1 + num2
				: operador.equals("-") ? num1 - num2 
				: operador.equals("*") ? num1 * num2 
				: operador.equals("/") ? num1 / num2 
				: num1 % num2 );

		entrada.close();
	}
}