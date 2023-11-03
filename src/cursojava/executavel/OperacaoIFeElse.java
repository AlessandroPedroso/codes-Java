package cursojava.executavel;

public class OperacaoIFeElse {
	public static void main(String[] args) {
		
		double nota1 = 90;
		double nota2 = 90;
		double nota3 = 80;
		double nota4 = 90;
		
		double media = 0;
		
		media = (nota1 +  nota2 + nota3 + nota4) /4;
		
		
		if(media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		}else if (media >=40 && media <=69) {
			System.out.println("Aluno em recuperação: " + media);
		}else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		/*Operações ternarios são para micros validações*/
		
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		System.out.println("Ternario com uma condição: " + saidaResultado);
		
		String saidaResultado2 = media >= 70 ? "Aluno Aprovado" : (media >=40 && media <=69)? "Aluno em Recuperação":"Aluno Reprovado"; 
		
		System.out.println("Ternario com duas condição: " + saidaResultado2);
		
		/*Operações lógicas aninhadas: São operações dentro de operações*/
		
		if (media >=50) {
			if (media >=70) {
				if (media >=90) {
					System.out.println("Aluno está aprovado direto - Parabéns " + media);
				}else {
					System.out.println("Aluno está aprovado direto " + media);
				}
				
			}else {
				System.out.println("Aluno está em recuperação " + media);
			}
		}else {
			System.out.println("Aluno reprovado direto " + media);
		}
	}
}
