package parcialPOO2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	int cantApp;
	int tamanioApp;
	int[] aplicaciones;

	public void leerArchivo(String archivo) throws IOException {
		/* Lee el archivo */
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		/* Lee las lineas */
		String linea = br.readLine();
		String linea2 = br.readLine();

		/* Spliteamos primera linea del .in */
		String[] datosLinea1 = linea.split(" ");
		/* Spliteamos segunda linea del .in */
		String[] datosLinea2 = linea2.split(" ");
		br.close();
		
		aplicaciones = new int[datosLinea2.length];
		
		/* Validacion de cantidad de Apps */
		if (Integer.parseInt(datosLinea1[0]) > 50000 || Integer.parseInt(datosLinea1[0]) < 1) {
			throw new Error("Cantidad de aplicaciones erronea");
		}
		
		/* Se asigna la cantidad de app */
		cantApp = Integer.parseInt(datosLinea1[0]);
		/* Validacion de tamaño de aplicacion */
		if (Integer.parseInt(datosLinea1[1]) > 1000 || Integer.parseInt(datosLinea1[1]) < 1) {
			throw new Error("Cantidad de MB erronea");
		}
		tamanioApp = Integer.parseInt(datosLinea1[1]);
		/*
		 * Recorrido para pasar los valores de datosLinea2 a Integer y poder añadirlos
		 * al vector aplicaciones
		 */
		
		for(int i = 0; i < aplicaciones.length; i++) {
			if (Integer.parseInt(datosLinea2[i]) <= 0)
					throw new Error("Algun MB de las aplicaciones ingresada parece ser incorrecta");
			else
				aplicaciones[i] = Integer.parseInt(datosLinea2[i]);
		}

	}

	public int getCantApp() {
		return cantApp;
	}

	public int getTamanioApp() {
		return tamanioApp;
	}

	public int[] getApps() {
		return aplicaciones;
	}
	
	public void escribirSalida(Almacenamiento a) throws IOException {
		
		    PrintWriter printSalida = new PrintWriter(new File("source/almacenamiento.out"));
		    printSalida.println(a.revisaryEliminarApps());
		    printSalida.close();
	}

}
