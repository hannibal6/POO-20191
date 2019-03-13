import java.util.Scanner;

class  Lista0104 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		nota1 = input.nextInt();
		nota2 = input.nextInt();
		nota3 = input.nextInt();
		nota4 = input.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4; 
		
		System.out.println("Media: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado.");
		} 
		else if (media >= 5) {
			System.out.println("Final.");
		}
		else {
			System.out.println("Reprovado.");
		}
	}
}