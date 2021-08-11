import java.util.Scanner;

public class ExemploFOR04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor de inicio: ");
		int inicio = leitor.nextInt();	
				
		System.out.println("Digite um valor: ");		
		int fim = leitor.nextInt();
		
		for(int i = inicio; i <= fim; i++) {
			System.out.println(i);	
		}
		
	}

}
