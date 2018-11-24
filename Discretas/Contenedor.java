package Discretas;
import java.util.Comparator;

public class Contenedor{
	private String origen;
	private String prioridad;
	private Integer peso;
	private Integer numContenedor;


	public Contenedor(String origen, String prioridad, Integer peso) {
		super();
		this.origen = origen;
		this.prioridad = prioridad;
		this.peso = peso;
	}
	
	public static Comparator<Contenedor> comparadorPeso = new Comparator<Contenedor>() {
		public int compare(Contenedor c1, Contenedor c2) {
			Integer pesoCont1 = c1.getPeso();
			Integer pesoCont2 = c2.getPeso();
			return pesoCont1.compareTo(pesoCont2);
		}
	};

	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}


	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}


	public Integer getNumContenedor() {
		return numContenedor;
	}


	public void setNumContenedor(Integer numContenedor) {
		this.numContenedor = numContenedor;
	}
	
	@Override
	public String toString() {
		return String.format("Información Contenedor [Origen: %s, Prioridad:%s, Peso(Kg):%s,", origen, prioridad, peso);
	}
	

}
