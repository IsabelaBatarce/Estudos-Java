package userInputGui;
import javax.swing.JOptionPane;

public class UserInputGui {
	public static void main(String args[]){
		String firstNumber = JOptionPane.showInputDialog("Insira um número");
				//nomedabiblioteca.método
				//ShowInputDialog -> mostra a frase em uma telinha para o usuário
		int number1 = Integer.parseInt(firstNumber);
		// tipo pré-defininido int não é uma classe
		//Integer -  classe wrapper que contém vários métodos para manipular inteiros
		
		System.out.println("O número é:"+number1);
		//função para printar o número
		String secondNumber = JOptionPane.showInputDialog("Insira um número");
		int number2 = Integer.parseInt(secondNumber);
		System.out.println("O número é:"+number2);
		
		/*Operações aritmétricas*/
		
		int soma   = number1+number2;
		int sub    = number1-number2;
		int mult   = number1*number2;
		int idiv   = number1/number2;
		float fdiv = (float)number1/number2; //transforma os números inteiros em reais
		int resto  = number1%number2;
		
		System.out.println("Soma:" + soma);
		System.out.println("Sub:" + sub);
		System.out.println("Mult:" + mult);
		System.out.println("idiv:" + idiv);
		System.out.println("fdiv:" + fdiv);
		System.out.println("Resto:" + resto);

		
	}
}

