package fluxoEtiposDeVariaveis;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
			
		int idade = 25;
		int quantidadedePessoas = 3;
		boolean acompanhado = true;
		if(idade >= 30 && quantidadedePessoas > 1) {
			System.out.println("A pessoa tem 30 ou mais de 30 anos e temos mais de um");
		} else if (20 > idade || idade < 30 && acompanhado == true) {
			System.out.println("Esta pessoa está perto de fazer 30 anos e está acompanhado");
		}
		else {
			System.out.println("A pessoa tem menos de 30 anos");
		}
	}
}
