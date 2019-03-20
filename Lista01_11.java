import java.util.Scanner;

class  Lista01_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numPedidos = input.nextInt();
		
		double valor = 0;
		double preco = 0;
		
		for (int i = 0; i < numPedidos; i++) {
			int codigo = input.nextInt();
			int quanti = input.nextInt();
			
			if (codigo == 10) {
				preco = 1.5;
			}
			else if (codigo == 11) {
				preco = 1.8;
			}
			else if (codigo == 12) {
				preco = 1.9;
			}
			else if (codigo == 20) {
				preco =  10;
			}
			else if (codigo == 30) {
				preco =   8;
			}
			else if (codigo == 50) {
				preco = 2.5;
			}
			
			valor += preco * quanti;
		}
		
		if (valor > 50) {
			valor -= valor / 20;
		}
		
		System.out.println("Valor a ser pago: R$ "  + valor);
	}
}