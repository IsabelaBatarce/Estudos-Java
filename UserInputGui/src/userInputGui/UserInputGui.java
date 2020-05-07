package userInputGui;

import javax.swing.JOptionPane;

public class UserInputGui {
	public static void main(String args[]) {
		String firstNumber = JOptionPane.showInputDialog("Insira um número");
		// nomedabiblioteca.método
		// ShowInputDialog -> mostra a frase em uma telinha para o usuário
		int number1 = Integer.parseInt(firstNumber);
		// tipo pré-defininido int não é uma classe
		// Integer - classe wrapper que contém vários métodos para manipular inteiros

		System.out.println("O número é:" + number1);
		// função para printar o número
		String secondNumber = JOptionPane.showInputDialog("Insira um número");
		int number2 = Integer.parseInt(secondNumber);
		System.out.println("O número é:" + number2);

		// Instanciando a classe Operation

		/*
		 * Tipo nome da variável = new Nome da classe (parametros solicitados pelo
		 * construtor);
		 * Classe operations + objeto operations = instanciar classe;
		 */
		Operations operations = new Operations(number1, number2);
		Soma soma = new Soma(number1,number2);
		
		// imprimindo o método operations.performOperation

		System.out.println(operations.performOperation());
		
		System.out.println(soma.performOperation());
	}
}
