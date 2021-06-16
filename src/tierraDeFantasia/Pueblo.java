package tierraDeFantasia;

public class Pueblo {

	private Integer id;
	private Integer cantidadDeHabitantes;
	private String nombre;

	public Pueblo(String[] datosDelPueblo) {
		// TODO Auto-generated constructor stub
		id = Integer.valueOf( datosDelPueblo[0]);
		this.setCantidadDeHabitantes(datosDelPueblo[1].trim());
		this.setNombre(datosDelPueblo[2].trim());
	}
	
	public Pueblo(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	private void setNombre(String nuevoPueblo) {
		// TODO Auto-generated method stub
		this.nombre = nuevoPueblo;
	}

	private void setCantidadDeHabitantes(String cantidadHabitantes) {
		// TODO Auto-generated method stub
		this.cantidadDeHabitantes = Integer.valueOf(cantidadHabitantes);
	}

	public Integer getId() {
		return this.id;
		
	}

	public Integer getCantidadDeHabitantes() {
		// TODO Auto-generated method stub
		return this.cantidadDeHabitantes;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

}
