package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		/*System.out.println(resposta);*/ /*sim=0,n�o=1,cancelar=2*/
		
		if (resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o?");
		
		if(resposta == 0 ) {
			
			JOptionPane.showMessageDialog(null, "O resto da divis�o � " + resto);
		}
		
		
		
		/*System.out.println("Divis�o para pessoas deu " + divisao + " carros e sobrou " + resto + " carros");*/
	}
}
