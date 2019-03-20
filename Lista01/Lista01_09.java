import java.util.Scanner;

class  Lista01_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int    aux = 0;
		int numPar = 0;
		int numImp = 0;
		
		if (num2 < num1) {
			aux  = num1;
			num1 = num2;
			num2 =  aux;
		}
		
		//for (int i = num1 + 1; i < num2; i++) {			
		//	  if (i % 2 == 0) {
		//		  numPar++;
		//	  }
		//	  else {
		//	  	  numImp++;
		//	  }
		//}
		//
		
		if (num1 % 2 != num2 % 2) {
			numImp = (num2 - num1 - 1) / 2;
			numPar = (num2 - num1 - 1) / 2;
		}
		else if (num1 % 2 == 0) {
			numImp = (num2 - num1) / 2;
			numPar =        numImp - 1;
		}
		else {
			numPar = (num2 - num1) / 2;
			numImp =        numPar - 1;
		}
		
		System.out.println("Numero de pares: " + numPar);
		System.out.println("Numero de impares: " + numImp);
		System.out.println("Soma: " + (num1 + num2));
	}
}
