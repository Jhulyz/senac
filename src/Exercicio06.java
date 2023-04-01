import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Informe o grau em Fahrenheit ");
		float graus = leitor.nextFloat();

		float resultado = (graus - 32) / (float) 1.8;
		System.out.println(" O grau em Celsius é" + resultado);

	}
}
