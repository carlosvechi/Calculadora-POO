package visualizacao;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOperacao() {
		
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada: \n"
		+ "1- Soma\n"
		+ "2- Subtração\n"
		+ "3- Multiplicação\n"
		+ "4- Divisão"));
			return operacao;
		}
	
	public static double solicitaNumero(String ordem) {
		
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " número"));
		return num;
	}
	
	public static void mostraResultado(double resultado, int operacao) { //se o usuário escolher 1, OP vai receber ''soma'' e assim em diante.
		String op = "";
		if(operacao == 1) {
			op = "soma";
		}else if(operacao == 2) {
			op = "subtracao";
		}else if(operacao == 3) {
			op = "multiplicacão";
		}else {
			op = "divisão";
		}
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " é: " + resultado);	
	}
	
		
	}
