package parcialPOO2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Archivo ar = new Archivo();
		ar.leerArchivo("source/almacenamiento.in");

		Celular c1 = new Celular(ar.getCantApp(), ar.getTamanioApp(), ar.getApps());
		Almacenamiento al = new Almacenamiento (c1);
		al.revisaryEliminarApps();
		ar.escribirSalida(al);
	}

}
