import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	System.out.println(" Informe o valor do seu salário atual");
	float atual = leitor.nextFloat();
	System.out.println(" Informe o valor do seu reajuste ");
	float reajuste = leitor.nextFloat();
	
	float resultado = reajuste/100 +1;
	float resultado02 = (atual * resultado); 
	System.out.println(" Seu novo salario será "+ resultado02);
	
	
	
	

	
	
	
	
	
	
	
	
	
}
}
