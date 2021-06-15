package tierraDeFantasia;

public class Grafo<T> {


	private Vertice<T>[] vertices;
	private int ultimoDisponible = 0;
	
	public Grafo() {
		vertices = new Vertice[10];
	}

	public Grafo(Integer cantidadDePoblados) {
		// TODO Auto-generated constructor stub
		vertices = new Vertice[cantidadDePoblados];
	}

	public void agregar(T dato) {
		// TODO Auto-generated method stub
		this.vertices[this.getUltimo()] = new Vertice<T>(dato);
		this.setUltimo(this.getUltimo() + 1);
	}

	private void setUltimo(int i) {
		// TODO Auto-generated method stub
		this.ultimoDisponible = i;
	}

	private int getUltimo() {
		// TODO Auto-generated method stub
		return ultimoDisponible ;
	}

	public T getPrimero() {
		// TODO Auto-generated method stub
		return vertices[0].getDato();
	}

	public void getCosto(T verticeOrigen, T verticeDestino) {
		// TODO Auto-generated method stub
		
	}
}
