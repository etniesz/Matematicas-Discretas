package GUI;

import java.awt.Color;
import java.awt.Graphics;

public class Contain {

	private int base, altura;

	public Contain(int b, int h) {

		this.base = b;
		this.altura = h;
	}
	
	public void dibuja(Graphics g, int x, int y) {

		g.setColor(Color.YELLOW);
		g.fillRoundRect(x-base/2,y-altura, base, altura,10,10);
		g.setColor(Color.BLACK);
		g.drawRoundRect(x-base/2,y-altura, base, altura,10,10); 
	}
}