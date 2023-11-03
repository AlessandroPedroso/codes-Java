package cursojava.executavel;

public class OperacaoSwitchCase {
	public static void main(String[] args) {
		
		double nota1 = 90;
		double nota2 = 90;
		double nota3 = 80;
		double nota4 = 90;
		
		double media = 0;
		
		media = (nota1 +  nota2 + nota3 + nota4) /4;
		
		/*SWITCH CASE: OPERAÇÕES EXATAS*/
		int dia = 3;
		
		switch (dia) {
		case 1:
				System.out.println("domingo");
			break;
		
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			
			System.out.println("Terça-feira");
			break;

		default: System.out.println("Outro dia qualquer");
			break;
		}
	}
}
