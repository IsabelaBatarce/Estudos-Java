package retangulo;

import java.awt.Graphics2D;

public class Retangulo {

    private Ponto ponto;
    private int largura;
    private int altura;
    private int angulo;


    // Ao dar manutenção, tenho que garantir que as chamadas continuam
    // funcionando.
    public Retangulo(Ponto supEsq, Ponto infDir){
	this.ponto = supEsq;

	int[] p1 = supEsq.getPosition();
	int[] p2 = infDir.getPosition();	
	this.largura = p2[0] - p1[0];
	this.altura  = p2[1] - p1[1];
    }
    
    // POO gera códigos extensíveis.
    public Retangulo(Ponto ponto, int largura, int altura){
	this.ponto = ponto;
	this.largura = largura;
	this.altura = altura;
    }

    public int getArea(){
	return largura*altura;
    }

    public int getPerimetro(){
	return 2*(largura + altura);
    }


    public void translade(int changeX, int changeY){
	int[] p1 = ponto.getPosition();
	Ponto nponto = new Ponto(p1[0] + changeX, p1[1] + changeY);
	this.ponto = nponto;
    }

    public void rotacione(int angulo){
	this.angulo = (this.angulo + angulo) % 360;
    }

    public String toString(){
	String str = "Estado \n" +
	    "ponto   = " + ponto.toString() + "\n" + 
	    "largura = " + largura+ "\n" + 
	    "altura  = " + altura + "\n" +
	    "angulo  = " + angulo + "\n" ;
	return str;
    }

    public void draw(Graphics2D graphics2D){
	int[] p1 = ponto.getPosition();
	//graphics2D.drawRect(p1[0], p1[1], largura, altura);
	
	graphics2D.drawLine(p1[0], p1[1], p1[0] + largura, p1[1]);
	graphics2D.drawLine(p1[0], p1[1], p1[0], p1[1] + altura);
	graphics2D.drawLine(p1[0]+largura, p1[1]+altura, p1[0] + largura, p1[1]);
	graphics2D.drawLine(p1[0]+largura, p1[1]+altura, p1[0], p1[1] + altura);	
    }
}