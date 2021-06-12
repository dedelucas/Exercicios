import java.util.Scanner;

public class Inteiro0_1000 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero=0;
		
		while (numero <= 1000) {

			System.out.println(numero);
			numero = numero + 2;
		}

		leitor.close();
	}

}
