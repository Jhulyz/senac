import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println( " Informe sua primeira média ");
	
	float valor01 = leitor.nextFloat();
	System.out.println( " Informe sua segunda média ");
	float valor02 = leitor.nextFloat();
	System.out.println(" Informe sua terceira média");
	float valor03 = leitor.nextFloat();

	float resultado = (valor01*2+valor02*3+valor03*5) /(3+5+2);
	System.out.println(" Sua média final é de " + resultado);
}	
}


