package modelo;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
	
	private String nif;
	private String nombre;
	private int longitudPaso;
	private LocalDate fecha_nac; // Clase "LocalDate" manejar fechas
	private char sexo; // 'M' 'F'
	private Persona [] hijosBiologicos;  // 2.- En la clase "Persona" declara un array de "Persona" que representa los hijos biol�gicos que tiene    28/11/2018
	private Persona padre;
	private Persona madre;

	public Persona() {
		this.nif = "12345678F";
		this.nombre="An�nimo";
		this.fecha_nac=LocalDate.now();
		this.longitudPaso=33;
		
	}

	public Persona(String nif, String nombre, int longitudPaso, LocalDate fecha_nac , char sexo , Persona [] hijosBiologicos ) {
		this.nif = nif;
		this.nombre = nombre;
		this.longitudPaso = longitudPaso;
		this.fecha_nac = null;
		this.sexo = sexo;
		this.hijosBiologicos = hijosBiologicos;

	}

	
	 
	 public int caminar (int numPasos) {
		 
		 double a=9.0;
		 double raiz = Math.sqrt(a);
		 
		 Random miRandom = new Random(); // Crea un objeto de la clase "Random"
		 
		 int valor = miRandom.nextInt();
		 
		 return numPasos * longitudPaso / 100;
		 
	 }

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;  // -- nif de la derecha es que se pasa por par�metro. Es diferente a la propiedad nif
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLongitudPaso() {
		return longitudPaso;
	}

	public void setLongitudPaso(int longitudPaso) {
		this.longitudPaso = longitudPaso;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Persona[] getHijosBiologicos() {
			return hijosBiologicos;
	}

	public void setHijosBiologicos(Persona[] hijosBiologicos) {
		this.hijosBiologicos = hijosBiologicos;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		this.padre = padre;
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	
}
