package cursojava.executavel;

public class PrimeiraClasseJava {
	
	static int maiorIdadeGlobal = 18;
	
	/*Main é um metodo auto executavel em java*/
	 public static void main(String[] args) {
		
		 /* Escreve texto no console*/
		 System.out.println("Meu primeiro programa em java");
		 System.out.println("Java é orientado a objetos");
		 
		 String nome = "Alessandro";
		 String sobrenome = "Pedroso";
		 int idade = 28;
		 
		 System.out.println("Nome: " + nome + " " + sobrenome);
		 System.out.println("Idade: " + idade);
		 
		 metodo2();
	}
	 
	 public static void metodo2() {
		 
		 System.out.println("idade global: " + maiorIdadeGlobal);
	 }

}
