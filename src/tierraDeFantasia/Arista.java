package tierraDeFantasia;

public class Arista<T> {

	private Integer peso;
	private Vertice<T> verticeOrigen;
	private Vertice<T> verticeDestino;

	public Arista(Vertice<T> verticeOrigen, Vertice<T> verticeDestino, Integer peso) {
		// TODO Auto-generated constructor stub
		this.peso = peso;
		this.verticeOrigen = verticeOrigen;
		this.verticeDestino = verticeDestino;
	}

	public Integer getPeso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

}
