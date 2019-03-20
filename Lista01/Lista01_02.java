import java.util.Scanner;

class  Lista01_02 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
	
	int anoNascimento;
	anoNascimento = input.nextInt();
	
    	System.out.println("A idade atual eh: " + (2019 - anoNascimento));
    }
}
