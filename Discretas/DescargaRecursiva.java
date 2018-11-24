package Discretas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DescargaRecursiva{
	private List<Contenedor> listaContenedor = new ArrayList<Contenedor>();
	
	static void Descarga(Integer n, String origen, String destino, String plataformaAux) {
		  if (n == 1) 
	        { 
	            System.out.println("Moviendo contenedor 1 Desde " +  origen + " Hacia " + destino); 
	            return; 
	        }
		Descarga(n - 1, origen, plataformaAux, destino);
		System.out.println("Moviendo contenedor " + n + " Desde " + origen + " Hacia " + destino );
		Descarga(n-1, plataformaAux, destino, origen);
		
	}

	public void ingresoDatosConsola() {
		Integer answer = 0;
		Scanner teclado = new Scanner(System.in);
		Contenedor c = null;

		System.out.println("=======================");
		System.out.println("Matemáticas Discretas ");
		System.out.println("=======================\n\n");

		System.out.println("Número de contenedores a ingresar:");
		answer = teclado.nextInt();
		if(answer>0 && answer < 2) {
			System.out.println("ERROR: Deben haber mínimo 4 contenedores.");
		}else {
			for(int i = 0; i<answer; i++) {
				System.out.println("\nINFORMACIÓN CONTENEDOR");
				System.out.println("Peso: ");
				Integer peso = teclado.nextInt();

				System.out.println("Origen:");
				String origen = teclado.next();

				System.out.println("Prioridad");
				String prioridad = teclado.next();

				c = new Contenedor(origen, prioridad, peso);
				listaContenedor.add(c);
				Collections.sort(listaContenedor, Contenedor.comparadorPeso);
			}teclado.close();
		}	
	}

	public void imprimirContenedor() {
		Integer numContenedor = 0;
		for(Contenedor c : listaContenedor) {
			numContenedor += 1;
			System.out.println(c +" Número Contenedor: " +numContenedor + "]");
		}
		System.out.println("\n");
		Descarga(listaContenedor.size(), "Barco", "Final", "Auxiliar");
	}

	public List<Contenedor> getListaContenedor() {
		return listaContenedor;
	}

	public void setListaContenedor(List<Contenedor> listaContenedor) {
		this.listaContenedor = listaContenedor;
	}

}
