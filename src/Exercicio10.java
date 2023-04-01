import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Informe o número de carros vendidos ");
		float resultado = leitor.nextFloat();
		System.out.println(" Informe o valor total de suas vendas ");
		float resultado01 = leitor.nextFloat();
		System.out.println(" Informe o seu salário fixo ");
		float resultado02 = leitor.nextFloat();
		System.out.println(" Informe o valor que você recebe por cada carro vendido ");
		float resultado03 = leitor.nextFloat();

		float valorResultante = resultado03 * resultado;
		float valorResultante02 = ((float) 5 / 100 * resultado01);
		float valorResultanteExato = valorResultante + valorResultante02 + resultado02;
		System.out.println(" O seu salário final é de " + valorResultanteExato);

	}
}
