package fluxoEtiposDeVariaveis;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
			
		int idade = 25;
		if(idade >= 30) {
			System.out.println("A pessoa tem 30 ou mais de 30 anos");
		} else if (20 > idade || idade < 30) {
			System.out.println("Esta pessoa está perto de fazer 30 anos");
		}
		else {
			System.out.println("A pessoa tem menos de 30 anos");
		}
	}
}
