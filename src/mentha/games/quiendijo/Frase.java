package mentha.games.quiendijo;

public class Frase {
	private String frase;
	private String[] respuesta;
	private String autor;

	void cargarDatos() {
		// TODO
	}

	String obtenerFrase() {
		return frase;
	}

	String obtenerRespuesta(int indice) {
		if (indice >= 1 || indice <= 4) {
			return this.respuesta[indice + 1];
		}

		return null;
	}

	boolean respuestaCorrecta(String respuesta) {
		if (this.autor.compareTo(respuesta) == 0) {
			return true;
		}

		return false;
	}
}
