package GUI;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import GUI.TPS;

public class NContainer extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TPS h;
	private boolean resolver;

	public NContainer(int nCon) {

		setLayout(new FlowLayout()); 
		h = new TPS(nCon); 
		resolver = true;
	}

	public void paint(Graphics g) {

		h.dibuja(g);
		if(resolver) {
			h.resuelve(g);
		}
	}

}