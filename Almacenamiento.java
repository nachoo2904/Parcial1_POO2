package parcialPOO2;

public class Almacenamiento {
	int cantidadMinima = Integer.MAX_VALUE;
	Celular ce;

	public Almacenamiento(Celular ce) {
		this.ce = ce;
	}

	public int revisaryEliminarApps() {
		int[] arrayApps = ce.getAplicaciones();
		int aux = 0;
		int acumulador = 0;
		int contadorApps = 0;

		for (int i = 0; i < arrayApps.length; i++) {
			aux = i;

			if (acumulador >= ce.getTamanio()) {
				contadorApps = 0;
				acumulador = 0;
			}
			while (aux < arrayApps.length) {
				acumulador += arrayApps[aux];
				contadorApps++;

				aux++;

				if (acumulador >= ce.getTamanio()) {
					break;
				}

			}

			if (contadorApps < cantidadMinima && acumulador >= ce.getTamanio()) {
				cantidadMinima = contadorApps;
			}

		}
		return contadorApps;
	}
}