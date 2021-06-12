import java.util.Scanner;

public class Senha42 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String resposta="";
		
		while (!resposta.equals("42")) {

			System.out.println("Qual a resposta para a vida, o universo e tudo mais");
			resposta = leitor.next();
		}
		
		System.out.println("Você acertou!!");
		leitor.close();
	}

}
