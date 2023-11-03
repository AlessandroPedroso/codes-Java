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
			System.out.println("Aluno em recupera��o: " + media);
		}else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		/*Opera��es ternarios s�o para micros valida��es*/
		
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		System.out.println("Ternario com uma condi��o: " + saidaResultado);
		
		String saidaResultado2 = media >= 70 ? "Aluno Aprovado" : (media >=40 && media <=69)? "Aluno em Recupera��o":"Aluno Reprovado"; 
		
		System.out.println("Ternario com duas condi��o: " + saidaResultado2);
		
		/*Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es*/
		
		if (media >=50) {
			if (media >=70) {
				if (media >=90) {
					System.out.println("Aluno est� aprovado direto - Parab�ns " + media);
				}else {
					System.out.println("Aluno est� aprovado direto " + media);
				}
				
			}else {
				System.out.println("Aluno est� em recupera��o " + media);
			}
		}else {
			System.out.println("Aluno reprovado direto " + media);
		}
	}
}
