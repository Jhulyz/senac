import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		System.out.println(" Informe o valor de fabrica do véiculo");
		Scanner leitor = new Scanner(System.in);
		float valor = leitor.nextFloat();

		float resultado = ((float) 28 / 100 * valor);
		float resultado01 = ((float) 45 / 100 * valor);
		float resultado02 = (resultado + resultado01 + valor);
		System.out.println(" O valor de custo do consumidor foi de " + resultado02);

	}

}