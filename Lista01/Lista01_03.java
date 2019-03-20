import java.util.Scanner;

class  Lista01_03 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double nota1, nota2, nota3;
	    
	nota1 = input.nextInt();
	nota2 = input.nextInt();
	nota3 = input.nextInt();
	
    	System.out.println("A media do aluno eh: " + (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10);
    }
}
