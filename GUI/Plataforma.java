package GUI;

import GUI.Contain;

import java.awt.Color;
import java.awt.Graphics;

public class Plataforma {
	private int n, x;
	private int bNegra, container, anchobNegra; 
	private Contain contain[];

	public Plataforma(int n, int x) {
		this.n = n;
		this.x = x;
		bNegra = 20;
		container = 140;
		anchobNegra = 150;
		contain = new Contain[11];
		for (int i = 0; i < n; i++) {
			contain[i]= new Contain((int)(container * (1 - 0.1 * i)), bNegra);
		}
	}

	public void ponContain(int n) {
		this.n = n;
		contain = new Contain[10];
		for(int i= 0; i < n; i++) {
			contain[i]= new Contain((int)(container * (1 - 0.1*i)), bNegra);
		}
	}

	public void agregarContain(Contain d) {
		contain[n] = d;
	n++; 
	}

	public Contain quitaContain() {
		if(n!=0){
			n--;
		}
		Contain d = contain[n];
		contain[n] = null;
		return d; 
	}

	public void dibuja(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x - anchobNegra / 2, 500 - 15 * bNegra, anchobNegra, 15 * bNegra);
		g.setColor(Color.BLACK);
		g.fillRect(x - anchobNegra / 2, 500 - bNegra, anchobNegra, bNegra);
		for(int i = 0; i < n; i++) {
			if(contain[i]!=null){
				contain[i].dibuja(g, x, 500 - bNegra - i * bNegra);
			}
		}
	}
}