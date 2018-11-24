package GUI;

import GUI.Contain;
import java.awt.Graphics;
import java.lang.InterruptedException;
import GUI.Plataforma;

public class TPS {

	private int n;
	private Plataforma izq, cen, der;

	public TPS(int n) {
		this.n = n;
		izq = new Plataforma(n, 80);
		cen = new Plataforma(0, 250);
		der = new Plataforma(0, 420); 
	}

	public void resuelve(Graphics g) {

		solucion(n, izq, cen, der, g);
	}

	public void dibuja(Graphics g) {

		izq.dibuja(g);
		cen.dibuja(g);
		der.dibuja(g);
	}

	public void reset() {

		izq.ponContain(n);
		der.ponContain(0);
		cen.ponContain(0);
	}

	public void solucion(int n, Plataforma f, Plataforma d, Plataforma a,Graphics g) {

		if(n==0){
			return;
		}else{
			solucion(n-1,f,a,d,g);
			mover(f,a,g);
			solucion(n-1,d,f,a,g);
		}

	} 

	public void mover(Plataforma a, Plataforma b, Graphics g) {

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			g.drawString("Error en sleep", 100, 100);
		}

		Contain d=a.quitaContain();
		b.agregarContain(d);
		a.dibuja(g);
		b.dibuja(g);

}
}