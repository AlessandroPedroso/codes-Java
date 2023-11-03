package cursojava.executavel;

public class EstruturaRepeticaoFor {
	
	public static void main(String[] args) {
		
		/*Estrutura de repetição FOR*/
		
		for(int numero = 0; numero <= 10; numero++) {
				
			System.out.println("Numero atual é: " + numero);
		}
		
		 System.out.println("******************************************");
		 
		for(int numero = 10; numero >=0; numero --) {
			System.out.println("Numero atual é: " + numero);
		}
		
		System.out.println("******************************************");
		/*Estrutura de repetição FOR com Break (Parada)*/
		
		for(int numero = 0; numero <=10; numero++) {
			System.out.println("Executa até encontrar: " + numero);
			if (numero == 7) {
				System.out.println("Encontrei o numero 7");
				System.out.println("Estou parando de executar");
				break;
			}
			
		}
		System.out.println("******************************************");
		
		/*Estrutura de repetição FOR e continue*/
		
		
		for(int numero = 0; numero <=10; numero++) {
			System.out.println("Executa até encontrar: " + numero);
			if (numero == 3 || numero == 6  || numero == 9) {
				System.out.println("Encontrei o numero " + numero);
				System.out.println("Estou continuando o processamento");
				continue;
				
			}
			
			 /* quando encontrar ignora o codigo abaixo*/
			System.out.println("Processando laço de repetição");
		}
		
	}

}
