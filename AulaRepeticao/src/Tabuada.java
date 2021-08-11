import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero da Tabuada:"); 
		numero = leitor.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int res = numero * i;
			
			System.out.printf("%s x %s = %s\n", numero, i, res);
			
		}

	}

}
