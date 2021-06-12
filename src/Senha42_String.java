import java.util.Scanner;

public class Senha42_String {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int resposta=0;
		
		while (resposta != 42) {

			System.out.println("Qual a resposta para a vida, o universo e tudo mais");
			resposta = leitor.nextInt();
		}
		
		System.out.println("Você acertou!!");
		leitor.close();
	}

}
