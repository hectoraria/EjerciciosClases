package ejercicio1;

public class Alumno {
	private String nombre = "";

	private float notaMedia = 0;

	/**
	 * Constuctor sin parametros
	 */
	public Alumno() {
		super();

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre
	 * @param notaMedia
	 */
	public Alumno(String nombre, float notaMedia) {
		super();
		if (!nombre.equals("") && nombre != null) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}

}
