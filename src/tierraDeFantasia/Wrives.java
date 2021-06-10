package tierraDeFantasia;

public class Wrives extends Raza {

	private static final int ATAQUE_BASICO = 113;
	private boolean atacado = false;
	private int numeroDeAtaques;
	
	public Wrives() {
		setSalud(108);
	}
	

	public boolean recibioAtaque() {
		// TODO Auto-generated method stub
		return atacado;
	}
	
	/*
	 * Ataque basico
	 */
	public boolean atacar(Guerrero adversario) {
		// TODO Auto-generated method stub
		if(recibioAtaque()) {
			if(getNumeroDeAtaques() == 1) {
				
				((Raza) adversario).recibirDanio(ATAQUE_BASICO *2);
				setNumeroDeAtaques(0);
			}
			else {
				((Raza) adversario).recibirDanio(ATAQUE_BASICO);
				setNumeroDeAtaques(this.getNumeroDeAtaques()+1);
			}
				
			unsetAtacado();
			return true;
		}
		return false;
	}

	private void setNumeroDeAtaques(int ataque) {
		// TODO Auto-generated method stub
		this.numeroDeAtaques = ataque;
	}


	private int getNumeroDeAtaques() {
		// TODO Auto-generated method stub
		return this.numeroDeAtaques;
	}


	private void unsetAtacado() {
		// TODO Auto-generated method stub
		this.atacado = false;
	}

	@Override
	protected void recibirDanio(int ataque) {
		// TODO Auto-generated method stub
		this.setAtacado();
		setSalud(this.getSalud() - ataque * 2);
		if(getSalud() <= 0)
			this.setDesmayado();
		
	}

	private void setAtacado() {
		// TODO Auto-generated method stub
		this.atacado = true;
	}


	public void descansar() {
		// TODO Auto-generated method stub
		this.setSalud(this.getSalud() + 50);
	}





}
