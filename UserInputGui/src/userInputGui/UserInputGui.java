package userInputGui;

import javax.swing.JOptionPane;

public class UserInputGui {
	public static void main(String args[]) {
		String firstNumber = JOptionPane.showInputDialog("Insira um n�mero");
		// nomedabiblioteca.m�todo
		// ShowInputDialog -> mostra a frase em uma telinha para o usu�rio
		int number1 = Integer.parseInt(firstNumber);
		// tipo pr�-defininido int n�o � uma classe
		// Integer - classe wrapper que cont�m v�rios m�todos para manipular inteiros

		System.out.println("O n�mero �:" + number1);
		// fun��o para printar o n�mero
		String secondNumber = JOptionPane.showInputDialog("Insira um n�mero");
		int number2 = Integer.parseInt(secondNumber);
		System.out.println("O n�mero �:" + number2);

		// Instanciando a classe Operation

		/*
		 * Tipo nome da vari�vel = new Nome da classe (parametros solicitados pelo
		 * construtor);
		 * Classe operations + objeto operations = instanciar classe;
		 */
		Operations operations = new Operations(number1, number2);
		Soma soma = new Soma(number1,number2);
		
		// imprimindo o m�todo operations.performOperation

		System.out.println(operations.performOperation());
		
		System.out.println(soma.performOperation());
	}
}
