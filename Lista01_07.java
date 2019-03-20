import java.util.Scanner;

class  Lista01_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nota = input.nextInt();
		
		
		if (nota < 50) {
			System.out.println("Insuficiente");
		}
		else if (nota < 65) {
			System.out.println("Regular");
		}
		else if (nota < 85){
			System.out.println("Bom");
		}
		else if (nota <= 100){
			System.out.println("Otimo");
		}
	}
}