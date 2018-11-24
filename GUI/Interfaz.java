package GUI;

import java.awt.Toolkit;
import javax.swing.*;

import Discretas.DescargaRecursiva;

public class Interfaz extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nContenedor;
	JButton Solucion;
	JLabel texto;



	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Interfaz().setVisible(true);

			}
		});
	}

	public Interfaz() {
		start();
	}

	public void start(){
		DescargaRecursiva d = new DescargaRecursiva();
		d.ingresoDatosConsola();
		d.imprimirContenedor();

//		JPanel p=new JPanel();
//		p.setVisible(true);
//		texto=new JLabel("Numero de Contenedores");
		nContenedor=new JTextField(8);
		NContainer tf = new NContainer(d.getListaContenedor().size());
		tf.setIconImage(Toolkit.getDefaultToolkit().getImage("/images/logo_tps.jpg"));
		tf.setVisible(true);
		tf.setBounds(0,0,510,550);
		tf.setLocationRelativeTo(null);
		tf.setTitle("TPS");
//		Solucion=new JButton("Resolver");
//		Solucion.addActionListener(new ActionListener() {

//			public void actionPerformed(ActionEvent arg0) {
//				NContainer tf = new NContainer(d.getListaContenedor().size());
//				tf.setVisible(true);
//				tf.setBounds(0,0,510,550);
//				tf.setLocationRelativeTo(null);
//				tf.setTitle("TPS");
//			}
//		});
//		p.add(texto);
//		p.add(nContenedor);
//		p.add(Solucion);
//		add(p);
	}
}

