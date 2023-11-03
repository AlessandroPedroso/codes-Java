package cursojava.executavel;

public class EstruturaRepeticaoFor {
	
	public static void main(String[] args) {
		
		/*Estrutura de repeti��o FOR*/
		
		for(int numero = 0; numero <= 10; numero++) {
				
			System.out.println("Numero atual �: " + numero);
		}
		
		 System.out.println("******************************************");
		 
		for(int numero = 10; numero >=0; numero --) {
			System.out.println("Numero atual �: " + numero);
		}
		
		System.out.println("******************************************");
		/*Estrutura de repeti��o FOR com Break (Parada)*/
		
		for(int numero = 0; numero <=10; numero++) {
			System.out.println("Executa at� encontrar: " + numero);
			if (numero == 7) {
				System.out.println("Encontrei o numero 7");
				System.out.println("Estou parando de executar");
				break;
			}
			
		}
		System.out.println("******************************************");
		
		/*Estrutura de repeti��o FOR e continue*/
		
		
		for(int numero = 0; numero <=10; numero++) {
			System.out.println("Executa at� encontrar: " + numero);
			if (numero == 3 || numero == 6  || numero == 9) {
				System.out.println("Encontrei o numero " + numero);
				System.out.println("Estou continuando o processamento");
				continue;
				
			}
			
			 /* quando encontrar ignora o codigo abaixo*/
			System.out.println("Processando la�o de repeti��o");
		}
		
	}

}
