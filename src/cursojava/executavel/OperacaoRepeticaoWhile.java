package cursojava.executavel;

public class OperacaoRepeticaoWhile {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		while(numero <=3) { /*verifica e depois executa*/
			System.out.println("O numero atual é: " + numero);
			numero ++;
		}
		
		/*-------------------------------------*/
			
		int numero2 = 0;
		
		do { /*primeiro executa e depois verifica*/
			
			System.out.println("O numero atual é: " + numero2);
			numero2 ++;
			
		} while(numero2 <=60);
		
		
	}
}
