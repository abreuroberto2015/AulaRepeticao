import java.util.Scanner;

public class ExemploFOR03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		int fim = leitor.nextInt();
		
		for(int i = 1; i <= fim; i++) {
			System.out.println(i);	
		}
		
	}

}

