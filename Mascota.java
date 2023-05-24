import javax.swing.JOptionPane;

public class Mascota {
// Atributos
	String nombre;
	String especie;
	int edad;
	String identificacion;

// Constructor sin parametros
	public Mascota() {
		nombre = "max";
		especie = "perro";
		edad = 1;
		identificacion = "";

	}

// Constructor con parametros
	public Mascota(String identificacion, String nombre, String especie, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.identificacion = identificacion;
	}

// Método para mostrar información de la mascota
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Especie: " + especie);
		System.out.println("Edad: " + edad + " años");
	}

// Método para hacer que la mascota realice un sonido
	public void hacerSonido() {
		if (especie.equalsIgnoreCase("perro")) {
			System.out.println("¡Guau guau!");
		} else if (especie.equalsIgnoreCase("gato")) {
			System.out.println("¡Miau miau!");
		} else {
			System.out.println("La mascota no hace sonidos conocidos.");
		}
	}

	public void comer() {
		if (especie.equalsIgnoreCase("perro")) {
			System.out.println("el perro come croquetas");
		} else if (especie.equalsIgnoreCase("gato")) {
			System.out.println("el gato come atun");
		} else {
			System.out.println("la mascota no come.");
		}
	}

	public void dormir() {
		System.out.println("la mascota duerme");
	}

	public void incrementarEdad() {
		edad++;
		System.out.println("La mascota ha cumplido " + edad + " años.");
		System.out.println("----------------------------");
	}

	// Método para cambiar el nombre de la mascota
	public void cambiarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
		System.out.println("El nombre de la mascota ha sido cambiado a: " + nombre);
	}
	//Metodo para ingresar datos desde la clase Mascota
	public void ingresarDatos() {
		nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
		especie = JOptionPane.showInputDialog("Ingrese la especie de la mascota");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la mascota"));
		identificacion = JOptionPane.showInputDialog("Ingrese la identificación de la mascota");
	}

}
