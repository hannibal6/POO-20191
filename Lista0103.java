import java.util.Scanner;

class  Lista0103 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double nota1, nota2, nota3;
	nota1 = input.nextInt();
	nota2 = input.nextInt();
	nota3 = input.nextInt();
	
    System.out.println("A media do alune eh: " + (nota1*2 + nota2*3 + nota3*5)/10);
    }
}