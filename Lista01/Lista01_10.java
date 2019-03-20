import java.util.Scanner;

class  Lista01_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num = input.nextDouble();
		
		int cont   = 0;
		
		while (num >= 1) {
			num /= 2;
			cont++;
		}
		
		System.out.println("Resultado da ultima divisao: " + num);
		System.out.println("Numero de divisoes: "  + cont);
	}
}
