package tierraDeFantasia;

public abstract class Raza extends Guerrero {


	@Override
	protected boolean atacar(Guerrero guerreroWrives) {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected Guerrero obtener() {
		return this;
		
	}

	protected abstract void recibirDanio(int ataque);
	

}
