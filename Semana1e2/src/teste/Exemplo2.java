package teste;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		System.out.print("Digite o terceiro número: ");
		double numero3 = scanner.nextDouble();
		double soma = numero1 + numero2 + numero3;
		System.out.println("A soma dos números é: " + soma);
		scanner.close(); // Fechar o Scanner no final para liberar os recursos

	}

}
