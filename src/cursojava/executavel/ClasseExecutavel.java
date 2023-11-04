package cursojava.executavel;

import cursojava.classes.Aluno;

public class ClasseExecutavel {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); /*Aqui sera o aluno João*/
		aluno1.setNome("Alessandro Schuquel Pedroso");
		aluno1.setIdade(28);
		aluno1.setNomeMae("Lucia");
		aluno1.setNomePai("Sergio");
		aluno1.setNumeroCPF("0356065057");
		aluno1.setDataNascimento("16/11/1994");
		aluno1.setDataMatricula("22315498");
		aluno1.setRegistroGeral("4546454");
		
		System.out.println("Aluno :" + aluno1.getNome());
		
		Aluno aluno2 = new Aluno(); /*Aqui sera o aluno pedro*/
		
		Aluno aluno3 = new Aluno("Maria");
		
		Aluno aluno4 = new Aluno("Alessandro", 28);		
		
	}
}
