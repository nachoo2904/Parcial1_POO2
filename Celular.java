package parcialPOO2;

public class Celular {

	int cantApp;
	int tamanioApp;
	int[] aplicaciones;

	public Celular(int cantApp, int tamanioApp, int[] aplicaciones) {
		this.cantApp = cantApp;
		this.tamanioApp = tamanioApp;
		this.aplicaciones = aplicaciones;
	}

	public int getCantApp() {
		return cantApp;
	}

	public int getTamanio() {
		return tamanioApp;
	}

	public int[] getAplicaciones() {
		return aplicaciones;
	}

	
	
}
