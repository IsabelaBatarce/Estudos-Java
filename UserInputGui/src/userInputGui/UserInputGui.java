package userInputGui;
import javax.swing.JOptionPane;

public class UserInputGui {
	public static void main(String args[]){
		String firstNumber = JOptionPane.showInputDialog("Insira um n�mero");
				//nomedabiblioteca.m�todo
				//ShowInputDialog -> mostra a frase em uma telinha para o usu�rio
		int number1 = Integer.parseInt(firstNumber);
		// tipo pr�-defininido int n�o � uma classe
		//Integer -  classe wrapper que cont�m v�rios m�todos para manipular inteiros
		
		System.out.println("O n�mero �:"+number1);
		//fun��o para printar o n�mero
		String secondNumber = JOptionPane.showInputDialog("Insira um n�mero");
		int number2 = Integer.parseInt(secondNumber);
		System.out.println("O n�mero �:"+number2);
		
		/*Opera��es aritm�tricas*/
		
		int soma   = number1+number2;
		int sub    = number1-number2;
		int mult   = number1*number2;
		int idiv   = number1/number2;
		float fdiv = (float)number1/number2; //transforma os n�meros inteiros em reais
		int resto  = number1%number2;
		
		System.out.println("Soma:" + soma);
		System.out.println("Sub:" + sub);
		System.out.println("Mult:" + mult);
		System.out.println("idiv:" + idiv);
		System.out.println("fdiv:" + fdiv);
		System.out.println("Resto:" + resto);

		
	}
}

