import java.util.Scanner;

class  Lista01_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		int  soma = 0;
		
		for (int i = 0; i < 10; i++) {
			int num = input.nextInt();
			
			if ((i == 0) || (num < menor)) {
				menor = num;
			}
			
			if (num > maior) {
				maior = num;
			}
			
			soma += num;
		}
		
		System.out.println("Media: " + (soma / 10));
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}
