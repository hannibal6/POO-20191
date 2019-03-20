import java.util.Scanner;

class  Lista01_01 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double velocidade;
	velocidade = input.nextDouble();
	
    System.out.println(velocidade*3.6 + "km/h");
    }
}