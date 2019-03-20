import java.util.Scanner;

class  Lista01_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		double diasPassados = input.nextDouble();
		
		System.out.println("Cliente: " + nome);
		
		if (diasPassados > 15) {
			System.out.println("Conta: RS " + (65.5 * diasPassados));
		}
		else if (diasPassados == 15) {
			System.out.println("Conta: RS " + (66 * diasPassados));
		}
		else {
			System.out.println("Conta: RS " + (68 * diasPassados));
		}
	}
}