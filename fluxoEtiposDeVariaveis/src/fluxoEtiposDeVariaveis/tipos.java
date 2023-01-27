package fluxoEtiposDeVariaveis;

public class tipos {
	
	public static void main(String[] args) {
		int idade = 30;
		System.out.println("Minha idade é " + idade);
		
		double salario = 2300.55;
		System.out.println("Meu salário é " + salario);
		
		double salarioEtrocados = 2300.55 + 450;
		System.out.println("Meu dinheiro no total é: " + salarioEtrocados);
		
		// conversão
		
		double salario1 = (int) salario;
		System.out.println("Meu dinheiro no total é: " + salario1);
	}
}
