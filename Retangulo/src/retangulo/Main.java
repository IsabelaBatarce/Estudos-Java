package retangulo;

/*Javax.swing
 * Jframe:
 * Janela: atributos b�sicos e os comportamentos de uma janela
 * Barra de t�tulos
 * Bot�rd para minimizar e maximizar
 * Bot�es caixas de textos
 * Uma janela
 */
import javax.swing.JFrame;
/*JPanel: divs
 * Colocar um bot�o em cada um dos jpanels. 
 * Separa��o das interfaces de maneira modularizadas
 * Um quadro, colocoado nas janelas
 * */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Main extends JPanel {

	private Retangulo[] meusRetangulos = new Retangulo[10]; // instanciando a quantidade de retangulos que ir�o aparecer
															// na interface.
	private int numRetangulos = 0;

	// Adicionando retangulos no vetor
	public void addRetangulo(Retangulo retangulo) {
		meusRetangulos[numRetangulos] = retangulo; // adicionando retangulos
		numRetangulos = (numRetangulos + 1) % 10;// verificando se o o vetor atingiu o n�mero limite
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		/* m�todo herdado da classe m�e(JPanel) */
		for (int i = 0; i < numRetangulos; i++) {
		    Retangulo localRetangulo = meusRetangulos[i];
		    localRetangulo.draw(g2d);
		}
	}

	public static void main(String[] args) {
		Ponto p1 = new Ponto(150, 200);
		Ponto p2 = new Ponto(210, 310);
		Retangulo retangulo1 = new Retangulo(p1, p2);
		Retangulo retangulo2 = new Retangulo(
						    new Ponto(150,200),
						    new Ponto(210,310)
						    );
		System.out.println("�rea = " + retangulo1.getArea());
		Main Main = new Main(); // essa classe representa um JPanel
		Main.addRetangulo(retangulo1);
		Main.addRetangulo(retangulo2);
		JFrame frame = new JFrame("Retangulo"); // Colocando o nome do t�tulo da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ao fechar a janela ele encerrar� o c�digo java
		frame.setSize(400, 400); // definindo o tamanho da janela
		frame.setVisible(true);
	}

}
