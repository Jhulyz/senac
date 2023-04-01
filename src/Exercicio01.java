import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		 Scanner leitor = new Scanner(System.in);
		 System.out.println( "Informe a base retangular: ");
		 float valor01 = leitor.nextFloat();
		 System.out.println( " Informe a altura retangular ");
		 float valor02 = leitor.nextFloat();

		 leitor.close();
		 float resultado = ( valor01 * valor02);
		 System.out.println(" O resultado da área retangular é " + resultado);

	}

}
