import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Informe o número de eleitos no seu município ");
		float eleitores = leitor.nextFloat();
		System.out.println(" Informe o número de votos em branco ");
		float branco = leitor.nextFloat();
		System.out.println("  Informe o número de votos nulos ");
		float nulos = leitor.nextFloat();
		System.out.println(" Informe o número de votos válidos ");
		float validos = leitor.nextFloat();

		float resultado01 = (eleitores * branco / 100);
		float resultado02 = (eleitores * nulos / 100);
		float resultado03 = (eleitores * validos / 100);

		System.out.println(" O percentual para votos nulos é " + resultado02 + " Votos válidos " + resultado03
				+ " e votos em branco " + resultado01);

	}
}
