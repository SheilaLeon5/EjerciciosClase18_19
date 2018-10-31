package control;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import modelo.Persona;

/**
 * @author sheila
 *
 */
public class Ejercicios {
	

// ---------------  04/10/2018                      ACTIVIDAD: BUSCAR EN LA API -------------------------------

/*	public void pruebasAPI() {
		
		  1. imprime por consola el valor de 2^3
		  *		- Usa la clase estática Math y su método pow  (Cuando es estático no hace falta el new)
		  *
		  *2. Imprime un valor aleatorio entre 1 y 100
		  *		- Usa la clase java.util.Random y el método rnd
		  *3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		  *		-Usa el método substring de la clase java.lang.String
		  
		
		
		
		//1.
		System.out.println("1. " + Math.pow(2, 3));
		
		//2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));
		
		//3.
		System.out.println("3. " + "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}
	
	
	//ACTIVIDAD: Mostrar por consola los números comprendidos entre dos enteros, a y b 
	
			//1Parte método:. prototipo o cabecera
			public void listaIntervaloEnteros(int primero, int ultimo){
				//2Parte método: cuerpo o implementación del método
				int i=primero;
				while(i < ultimo) 
					System.out.println(++i);
					i++;
					i=i+1; 
				for (int j = primero; j <= ultimo; j++) 
					System.out.println(j++);
				
					
					// true /false
				 boolean condicion = true;
				 if (condicion) {
					 // en caso de verdadero
				 }else {
					 // la otra opción, falso
				 }
			}
			
			// ---------------- ACTIVIDAD ----------------------------------------------------- 10/10/2018
			Dado una “cadena” (String) devolver el valor en forma de número entero correspondiente. 
			Ejempo String: “ab95f1”        
			
			String cadena ="ab95f1";
			public static int converString(String cadena) {
				int numeros = Integer.parseInt(cadena);
				return numeros;
			}
			
			
			
			// ---------------- ACTIVIDAD : Serie Fibonacci --------------------------------------- 11/10/2018
			
			public static void serieFibonacci(int cuantos){
				int num1 = 0;
				int num2 = 1;
				int total = 1;
				
				System.out.print(num1 + " ," + num2);
				for (int i = 1; i < cuantos; i++) {
					total = num1 + num2;
					System.out.print(" ," + total);
					num1 = num2;
					num2 = total;
				}
			}
			
			
			// -------------- ACTIVIDAD : Factorial  (1.-Deberes Casa)-------------------------------- 11/10/2018
			
			
			public static void factorial(int numFact) {
				int num1 = 1;
				if (numFact == 0 | numFact == 1) {
					System.out.println("El factorial de " + "'"+ numFact + "'" + " es :  1");
				}else {
					for (int i = 2 ; i <= numFact; i++) {
						num1 = num1 * i; 
					}
					System.out.println("El factorial de " + "'"+ numFact + "'" + " es :" + num1);
				}
			}
			
			
			
			// ------------ ACTIVIDAD : Devolver el número menor de tres (2.-Deberes Casa)----------- 11/10/2018
			

			public static int calNumMenor(int [] numeros) {
				int numPrim = numeros[0];
				
				for (int i = 1; i < numeros.length; i++) {
					
					if( numeros[i] < numPrim) {
						numPrim =  numeros[i];
					}
				}
				return numPrim;
			}
			

			
			// ---------- ACTIVIDAD : Devolver el número menor de tres - Con 'If' (HECHO CLASE)----------- 16/10/2018
			public static int calNumMenor(int x,int y, int z) {
				if (x < y)
					if (x < z)
						return x;
					else
						return z;
				else if (y < z)
					return y;
				else
					return z;

			}
			
			
			// ---------- ACTIVIDAD : Devolver el número menor de CUATRO - Con 'If' (Extensión actividad del 16/10/2018)----------- 17/10/2018

			public int calNumMenor(int w, int x, int y, int z) {
							
			if (w < x)
				if (w < y)
					if(w < z)
						return w;
					else
						return z;
				else if (y < z)
					return y;
				else
					return z;
			
			else 
				if (x < y)
					if (x < z)
						return x;
					else
						return z;
				else if(y < z)
					return y;
				else return z;
			}

			
		// ---------------- ACTIVIDAD : Devolver el número menor de CUATRO - Con 'If' ((Ejercicicio EXACTO AL ANTERIOR--HIZO PROFESOR))
		
			public  int calNumMenor(int x, int y, int z,int w) {
							if (x < y)
								if (x < z)
									if (x < w)
										return x;
									else
										return w;
								else if (z < w)
										return z;
									else
										return w;
							else
								if(y < z)
									if(y < w)
										return y;
									else
										return w;
								else
									if (z <w)
										return z;
							return w;
						}

			
			 -----------------ACTIVIDAD: Método 'Aleatório' + Array ------------(NO MARCADO EN CLASE )---------------16/10/2018
			  Crear un método llamado aleatorio , pasándole un elemento "n". Nos devuelva un array de enteros cada 
			  posición del array tiene su contenido que es su propia posición.
			 
			  Pasos:
			    - Declarar el array e Inicializarlo
			  	 - Recorrer el array (con un bucle)
			  	 - generar un entero y ponerlo en la posicion
			  	 - devolver array
			 
			
			public int[] aleatorio(int n){
				int [] resultado= new int[n];
				for (int i = 0; i < n; i++) {
					resultado[i] = i;
				}
				return resultado;
			}

	*/
			 //-----------------ACTIVIDAD: Método Aleatório + Array -------------------------------------------------16/10/2018
			 /* Crear un método "aleatorio" , pasándole un elemento "n". Nos devuelva un array de enteros aleatorio. (1-1000)
			 
			  Pasos:
			    - Declarar el array e Inicializarlo
			  	 - Recorrer el array (con un bucle)
			  	 - generar un entero y ponerlo en la posicion
			  	 - devolver array
			  */
/*			 					
			public  int[] generaAleatorio (int n) {
				Random rnd = new Random();
				int [] resultado= new int[n];   	//Declaración e Inicialización del array
				for (int i = 0; i < n; i++) {      //Recorrer el array. Siendo 'n' la variable que nos determina el tamaño del array 'resultado'	
					if (rnd.nextInt() == 0) {
						resultado[i] = 1 + rnd.nextInt(n);
					}else {
						resultado[i] = 1 + rnd.nextInt(n);
					}
				}
					return resultado;
			}

			
			
			
		// -----------ACTIVIDAD: IMPRIME POR CONSOLA n números enteros aleatorios entre 1-100  (ENUNCIADO NUEVO,SIMILAR ANTERIOR)-- 17/10/2018
			public void imprimeAleatorio(int n) {
				Random rnd = new Random();
				int numero=0;
				for(int i = 0; i<=n; i++) {
					numero = 1 + rnd.nextInt(100);
					System.out.println(i + 1 + ".-" + numero);
				}
			}
			
		
		//-----------ACTIVIDAD: Devolver un array con 'n' numeros aleatorios entre 'inferior' y 'superior' . Entre 100 y 500
						
			public int[] gerarListaAleatorios (int n, int inferior, int superior) {
				Random rnd = new Random();
				int [] numero = new int[n];
				for(int i = 0; i<n; i++) {
					numero[i]= rnd.nextInt(400)+100;
					System.out.println(i + ".- Numeros aletorios entre: " + inferior + "-"+ superior + ":" + Arrays.toString(numero));
				}
				return null;
			}
			
*/				
		//----------ACTIVIDAD: devolver la cantidad de veces que se repiten los números en 10 veces que se genera los números aleatorios. Rango numeros 1-6	-- 18/10/2018		
			//Versión Profesor
/*			public int[] generaEstadisticaAparicion (int n, int inferior, int superior) {
				int [] resultado; // Declaración en la tabla de símbolos
				resultado = new int[superior - inferior + 1]; //inicialización
				Random rnd = new Random();
				int numero=0;
				for(int i = 0; i<=n; i++) {
					numero = inferior +  rnd.nextInt(superior - inferior + 1);
					resultado[numero - 1]++;
				}
				return resultado;	
			}
			
			// Versión Sheila.
			public int[] generaEstadisticaAparicion (int n, int inferior, int superior) {
				int [] resultado;
				resultado = new int[superior + inferior];
				Random rnd = new Random();
				int numero;
				for(int i=1 ;i<= n; i++) {
					numero	= inferior + rnd.nextInt(superior);
					resultado[numero] = resultado[numero]+1;  //Suma 1 a la cantidad que haya en la posicion del array. Se puede sustituir por lo anterior al igual y finalizado por un ++
				}
				return resultado;
			}		
			
		//---------ACTIVIDAD: crearListaPersonas [Array] (Constructor Vacío) 24/10/2018
		 * 					crear un método que devuelva una lista de 'n' personas. 
		 *		 			Se crean las personas con el constructor Persona().
		 * 
			public Persona[] crearListaPersona (int n){
				Persona[] personas = new Persona[n];
				for(int i=0; i < n; i++)
					personas [i] = new Persona();	
					return personas;
			}

	
	  //											25/10/2018
	 // ---------ACTIVIDAD: Dado una String pasada por parámetros mostrar por pantalla caracter a caracter el String (Método CharAt)
	 public void muestraCaracter(String caracteres){
		 for (int i = 0; i < caracteres.length(); i++) {
			System.out.println(caracteres.charAt(i));
		}
	 }
	 
*/	 
	 
	/* ---------ACTIVIDAD: Dan dos cadenas de caracteres por parámetros que hay que comparar entre sí (CompareTo)
	 * 
	 * PENDIENTE
	*/
	
	
	
	/* ---------ACTIVIDAD: Hacer un método que recorra y devuleva un acumulado de ventas por vendedor. 31/10/2018
	
	*/
	public float [] resumenVendedor(float[][] ventas) {
		float sumVendedor =0;
		float [] resultado = new float[ventas.length];  //Declaración array
		for (int i = 0; i < ventas.length; i++) {
			sumVendedor = 0;
			for (int j = 0; j < ventas[i].length; j++) {  //Especificamos i porque nos encontramos en la linea i
				sumVendedor += ventas[i][j];
			}
			resultado[i] = sumVendedor;
			//System.out.println("Vendedor" + i + "ha ganado: " + sumVendedor + "€" );
		}
		return resultado;		
	}
	
	
	
/* ---------ACTIVIDAD: Hacer un método que recorra y devuleva un resumen de cada mes ( recorrer por columnas). 31/10/2018
		Poner nombre de meses y vendedores (String[] meses{"enero","febrero"...} , String("pepe"...)
	*/
	
	public float [] resumenVendedor(float[][] ventas) {
		float sumVendedor =0;
		float [] resultado = new float[ventas.length];  //Declaración array
		for (int i = 0; i < ventas.length; i++) {
			sumVendedor = 0;
			for (int j = 0; j < ventas[i].length; j++) {  //Especificamos i porque nos encontramos en la linea i
				sumVendedor += ventas[i][j];
			}
			resultado[i] = sumVendedor;
			//System.out.println("Vendedor" + i + "ha ganado: " + sumVendedor + "€" );
		}
		return resultado;		
	}
	
				
	public static void main(String[]args) {
		
		
		Ejercicios ejercicios = new Ejercicios();
		float [][] VentasYear =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		float[] resumenVendedor;
		resumenVendedor = ejercicios.resumenVendedor;
		
		

	//	Persona juan = new Persona();
	//	int pasos = juan.caminar(20);
		
	//Persona juan;
	//juan = new Persona("4545455X", "Juan Luis", 47,null);
	//Persona persona1 = new Persona();
		

		
/*		
 		//31/10/2018-----------------------ACTIVIDAD: Hacer un método que recorra y devuleva un acumulado de ventas por vendedor.
 		 
 
 		//25/10/2018-----------------------ACTIVIDAD: Dan dos cadenas de caracteres por parámetros que hay que comparar entre sí (CompareTo)
 		PENDIENTE
 		
 		//25/10/2018-----------------------ACTIVIDAD: Dado una String pasada por parámetros mostrar por pantalla caracter a caracter el String (Método CharAt)
 		Ejercicios ejercicios = new Ejercicios();
		String caracteres = new String("Cadenadecaracteres");
		ejercicios.muestraCaracter(caracteres);
		
		¡PENDIENTE DE ENUNCIADO -FALTÉ A CLASE!
		
 
 		//24/10/2018-----------------------ACTIVIDAD:crearListaPersonas [Array] (Constructor Vacío)
 		Ejercicios ejercicios = new Ejercicios ();
		Persona [] listapersona = ejercicios.crearListaPersona(5);
		System.out.println(Arrays.toString(listapersona));
 
 		//18/10/2018------------------------ACTIVIDAD: devolver la cantidad de veces que se repiten los números en  10 veces que se genera los números aleatorios. Rango numeros 1-6			
 		Ejercicios ejercicios = new Ejercicios();
		int[] array = ejercicios.generaEstadisticaAparicion(10,1,6);
		System.out.println(Arrays.toString(array));
		
 		//---------------------------------ACTIVIDAD:Devolver array con 'n' numeros aleatorios entre 'inferior'(100) y 'superior'(500)
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicio.gerarListaAleatorios(5,100,500);
 
 		//17/10/2018 -----------------------ACTIVIDAD: IMPRIME POR CONSOLA n números aleatorios entre 1-100 (ENUNCIADO NUEVO,SIMILAR ANTERIOR)-
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.imprimeAleatorio(100); //veces que se muestra un número aleatório
 
 
  		//16/10/2018------------------------ACTIVIDAD: Método Aleatório + Array (devuelva un array de enteros, 1-1000)-------
  		Ejercicios ejercicios = new Ejercicios();
		int array [] = ejercicios.generaAleatorio(1000);
		System.out.println(Arrays.toString(array));
 
 		//16/10/2018------------------------ACTIVIDAD: Método "Aleatório" + Array (No marcado en Clase-- VARIANTE )--------
 		Ejercicios ejercicios = new Ejercicios();
		int array[] = ejercicios.aleatorio(4);
		System.out.println(Arrays.toString(array));  //Para mostrar el contenido del array "bien" hay que usar el .toString
 
		// 17/10/2018---------------------- ACTIVIDAD : Devolver el número menor de CUATRO - Con 'If' (Extensión actividad del 16/10/2018)---
		Ejercicios ejercicios = new Ejercicios();
		int a=10, b=50 , c=5 , d=80;
		System.out.println("el menor es:"+ ejercicios.calNumMenor(a,b,c,d));
		
		// 16/10/2018-----------------------ACTIVIDAD : Devolver el número menor de tres - Con 'If' (HECHO CLASE)-----
		Ejercicios ejercicios = new Ejercicios();
		int a=5, b=19 , c=100;
		System.out.println("el menor es:"+ ejercicios.calNumMenor(a,b,c));

		// 11/10/2018---------------------- ACTIVIDAD : Devolver el número menor de tres (2.-Deberes Casa)-------------
		int [] numeros = {7,3,8};
		System.out.println(calNumMenor(numeros));
		
		// 11/10/2018---------------------- ACTIVIDAD : Factorial  (1.-Deberes Casa)-----------------------------------
		factorial(5);
		
		// 11/10/2018----------------------ACTIVIDAD : Serie Fibonacci -------------------------------------------------
		serieFibonacci(8);
		
		// 10/10/2018 ---------------------ACTIVIDAD: “cadena” (String) devolver el valor en forma de número entero-----
		System.out.println(converString("8fgf"));
		
		//------------------------ ACTIVIDAD: Mostrar por consola los números comprendidos entre dos enteros, a y b  ---
		Ejercicios ejercicios = new Ejercicios();
		int x=10;
		int y= 30;
		ejercicios.listaIntervaloEnteros(x, y);
		
		
		//04/10/2018   ------------------ ACTIVIDAD: BUSCAR EN LA API----------------------------------------------------
		new Ejercicios().pruebasAPI();	
		System.out.println("Fin del programa");
*/		
	}
}
