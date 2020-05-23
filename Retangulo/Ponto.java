package retangulo;

public class Ponto {
	
	private int x,y;
	
	public Ponto (int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	/*Array
	 * Grupos de elementos de um mesmo tipo.
	 * É um tipo pré-definido.
	 * tipo [] arr = {1,2,3,4}; -> maneira de inicializar.
	 * Tipos pré-definidos como: inteiro, float ou objetos.
	 * */
	
	public int[] getPosition(){	
		int[] arr = {x,y};
		return arr; //devolve um array de inteiros
		
	}
	
	public String toString(){
		return "("+this.x + "," + this.y + ")";
	    }

}
