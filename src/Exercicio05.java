import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println(" Informe sua idade em anos");
		int anos = leitor.nextInt();
		System.out.println("Informe quantos meses");
		int meses = leitor.nextInt();
		System.out.println(" Informe quantos dias ");
		int dias = leitor.nextInt();

		int valor01 = (anos * 365);
		int valor02 = (meses * 30);
		int resultado03 = (valor01 + valor02 + dias);
		System.out.println(" você tem:  "+resultado03+"dias");
		
		
		

	}
}
