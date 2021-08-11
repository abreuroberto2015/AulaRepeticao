import java.util.Scanner;

public class ExemploFOR05 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor de inicio: ");
		int fim = leitor.nextInt();	
				
		System.out.println("Digite um valor de fim: ");		
		int inicio = leitor.nextInt();
		
		for(int i = fim; i >= inicio; i--) {
			System.out.println(i);	
		}
		
	}

}
