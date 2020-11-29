package co.edu.ucentral.prFinalAnalisis;

public enum MenuOpcion {

	INGRESARARCHIVO(1),
	BUSCARPALABRA(2),
	GUARDARRESULTADO(3),
	MENU(4),
	SALIR(5);

	private final int valor;
	MenuOpcion(int i) {
		this.valor = i;
	}
	
	
}
