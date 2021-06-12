import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, res;
		int contador=1;
		
		System.out.println("Vc quer calcular a tabuada de qual numero?");
		n = leitor.nextInt();
		
		while (contador < 10) {
			res = n * contador;
			System.out.println(n + " x " + contador + " = " + res);
			contador = contador + 1;
		}

		leitor.close();
	}

}
