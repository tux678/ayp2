package tierraDeFantasia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mapa {

	private Integer cantidadDePoblados;
	private Grafo<Pueblo> poblados;
	private int puebloInicio;
	private int puebloFinal;
	
	
	
	public Mapa() {
		
		this.getCantidadDePobladosDesdeArchivo();
		this.poblados = new Grafo<Pueblo>(this.getCantidadDePoblados());
		this.leerMapaDesdeArchivo();
		
	
	}

	private void getCantidadDePobladosDesdeArchivo() {
		// TODO Auto-generated method stub
		try {
			FileReader archivoDeMapa = new FileReader("recursos/mapa");
			String primeraLinea;
			BufferedReader lectorDeArchivo = new BufferedReader(archivoDeMapa);
			if((primeraLinea = lectorDeArchivo.readLine()) != null)
				setCantidadDePoblados(primeraLinea);
			lectorDeArchivo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void leerMapaDesdeArchivo() {
		// TODO Auto-generated method stubea
		try {
			FileReader archivoDeMapa = new FileReader("recursos/mapa");
			BufferedReader lectorDeArchivo = new BufferedReader(archivoDeMapa);
			if((lectorDeArchivo.readLine()) != null) {
				leerPoblados(lectorDeArchivo);
				leerRecorrido(lectorDeArchivo);
			}
			lectorDeArchivo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void leerRecorrido(BufferedReader lectorDeArchivo) throws IOException {
		// TODO Auto-generated method stub
		String[] recorrido = lectorDeArchivo.readLine().split("->");
		this.setPuebloInicio(recorrido[0]);
		this.setPuebloFinal(recorrido[1]);
	}

	private void setPuebloFinal(String puebloFinal) {
		// TODO Auto-generated method stub
		this.puebloFinal = Integer.valueOf(puebloFinal.trim());
	}

	private void setPuebloInicio(String puebloInicio) {
		// TODO Auto-generated method stub
		this.puebloInicio = Integer.valueOf(puebloInicio.trim());
	}

	private void leerPoblados(BufferedReader lectorDeArchivo) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 1; i<=this.getCantidadDePoblados();i++) {
			this.agregarPueblo(lectorDeArchivo.readLine());
		}
	}
	
	private void agregarPueblo(String pueblo) {
		// TODO Auto-generated method stub
		String[] datosDelPueblo = pueblo.split(" ");
		poblados.agregar(new Pueblo(datosDelPueblo));
		
	}
	
	private void setCantidadDePoblados(String primeraLinea) {
		// TODO Auto-generated method stub
		this.cantidadDePoblados = Integer.valueOf(primeraLinea);
	}

	public Integer getCantidadDePoblados() {
		// TODO Auto-generated method stub
		return cantidadDePoblados;
	}
	public Pueblo getPuebloPropio() {
		// TODO Auto-generated method stub
		return this.poblados.getPrimero();
	}

	public Integer getPuebloDeInicio() {
		// TODO Auto-generated method stub
		return this.puebloInicio;
	}

	public int getPuebloFinal() {
		// TODO Auto-generated method stub
		return this.puebloFinal;
	}

	public Integer getCosto(Pueblo puebloDestino) {
		// TODO Auto-generated method stub
		return poblados.getCosto( puebloDestino);
	}
	
}
