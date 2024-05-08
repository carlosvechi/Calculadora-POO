package controle;

import javax.swing.JOptionPane;
import modelo.*;
import visualizacao.EntradaSaida;

public class Controladora {

	public void exibeMenu() {
		int continuar;
		double resultado = 0;
		Operacoes oper = null;
				
		do {
			double num1 = EntradaSaida.solicitaNumero("1º");
			double num2 = EntradaSaida.solicitaNumero("2º");
			int operacao = EntradaSaida.solicitaOperacao();
			
			switch(operacao) {
			case 1:
				oper = new Soma();
				break;
			case 2:
				oper = new Subtracao();
				break;
			case 3:
				oper = new Multiplicacao();
				break;
			case 4: //É uma validação para não permitir que o segundo número da divisão seja igual a ZERO. Caso entre nessa validação, o programa não permitirá que prossiga, até o usuário trocar o segundo valor.
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º"); //aqui ele reiniciará o método, mas pedirá somente o segundo valor, e não os dois valores.
				}
				oper = new Divisao();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada");
				System.exit(0);
				
			}
			
			oper.setNum1(num1);
			oper.setNum2(num2);
			resultado = oper.calcula();
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- sim | 2- nao "));
			
		} while(continuar == 1);
	}
	
}
