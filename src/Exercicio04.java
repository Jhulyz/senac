import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Informe sua idade em dias ");
		int dias = leitor.nextInt();

		int anos = (dias / 365);
		int meses = ((dias - anos * 365) / 30);
		int resultado03 = (dias - meses * 30 - anos * 365);
		System.out.println(" você tem: " + anos + "anos" + meses + "meses" + resultado03 + "dias");

	}
}
