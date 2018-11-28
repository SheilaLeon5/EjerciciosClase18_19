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
		  *		- Usa la clase est�tica Math y su m�todo pow  (Cuando es est�tico no hace falta el new)
		  *
		  *2. Imprime un valor aleatorio entre 1 y 100
		  *		- Usa la clase java.util.Random y el m�todo rnd
		  *3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		  *		-Usa el m�todo substring de la clase java.lang.String
		  
		
		
		
		//1.
		System.out.println("1. " + Math.pow(2, 3));
		
		//2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));
		
		//3.
		System.out.println("3. " + "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}
	
	
			//ACTIVIDAD: Mostrar por consola los n�meros comprendidos entre dos enteros, a y b 
			
					//1Parte m�todo:. prototipo o cabecera
					public void listaIntervaloEnteros(int primero, int ultimo){
						//2Parte m�todo: cuerpo o implementaci�n del m�todo
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
							 // la otra opci�n, falso
						 }
					}
			
			// ---------------- ACTIVIDAD ----------------------------------------------------- 10/10/2018
			Dado una �cadena� (String) devolver el valor en forma de n�mero entero correspondiente. 
			Ejempo String: �ab95f1�        
			
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
			
			
			
			// ------------ ACTIVIDAD : Devolver el n�mero menor de tres (2.-Deberes Casa)----------- 11/10/2018
			

			public static int calNumMenor(int [] numeros) {
				int numPrim = numeros[0];
				
				for (int i = 1; i < numeros.length; i++) {
					
					if( numeros[i] < numPrim) {
						numPrim =  numeros[i];
					}
				}
				return numPrim;
			}
			

			
			// ---------- ACTIVIDAD : Devolver el n�mero menor de tres - Con 'If' (HECHO CLASE)----------- 16/10/2018
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
			
			
			// ---------- ACTIVIDAD : Devolver el n�mero menor de CUATRO - Con 'If' (Extensi�n actividad del 16/10/2018)----------- 17/10/2018

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

			
		// ---------------- ACTIVIDAD : Devolver el n�mero menor de CUATRO - Con 'If' ((Ejercicicio EXACTO AL ANTERIOR--HIZO PROFESOR))
		
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

			
			 -----------------ACTIVIDAD: M�todo 'Aleat�rio' + Array ------------(NO MARCADO EN CLASE )---------------16/10/2018
			  Crear un m�todo llamado aleatorio , pas�ndole un elemento "n". Nos devuelva un array de enteros cada 
			  posici�n del array tiene su contenido que es su propia posici�n.
			 
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
			 //-----------------ACTIVIDAD: M�todo Aleat�rio + Array -------------------------------------------------16/10/2018
			 /* Crear un m�todo "aleatorio" , pas�ndole un elemento "n". Nos devuelva un array de enteros aleatorio. (1-1000)
			 
			  Pasos:
			    - Declarar el array e Inicializarlo
			  	 - Recorrer el array (con un bucle)
			  	 - generar un entero y ponerlo en la posicion
			  	 - devolver array
			  */
			 					
/*			public  int[] generaAleatorio (int n) {
				Random rnd = new Random();
				int [] resultado= new int[n];   	//Declaraci�n e Inicializaci�n del array
				for (int i = 0; i < n; i++) {      //Recorrer el array. Siendo 'n' la variable que nos determina el tama�o del array 'resultado'	
					if (rnd.nextInt() == 0) {
						resultado[i] = 1 + rnd.nextInt(n);
					}else {
						resultado[i] = 1 + rnd.nextInt(n);
					}
				}
					return resultado;
			}*/

/*			
			
			
		// -----------ACTIVIDAD: IMPRIME POR CONSOLA n n�meros enteros aleatorios entre 1-100  (ENUNCIADO NUEVO,SIMILAR ANTERIOR)-- 17/10/2018
			public void imprimeAleatorio(int n) {
				Random rnd = new Random();
				int numero=0;
				for(int i = 0; i<=n; i++) {
					numero = 1 + rnd.nextInt(100);
					System.out.println(i + 1 + ".-" + numero);
				}
			}
		
		
		//-----------ACTIVIDAD: Devolver un array con 'n' numeros aleatorios entre 'inferior' y 'superior' . Entre 100 y 500
						
			public int[] generarListaAleatorios (int n, int inferior, int superior) {
				Random rnd = new Random();
				int [] numero = new int[n];
				for(int i = 0; i<n; i++) {
					numero[i]= inferior + rnd.nextInt(superior-inferior + 1);
					System.out.println(i + ".- Numeros aletorios entre: " + inferior + "-"+ superior + ":" + Arrays.toString(numero));
				}
				return null;
			}
*/				
				
		//----------ACTIVIDAD: devolver la cantidad de veces que se repiten los n�meros en 10 veces que se genera los n�meros aleatorios. Rango numeros 1-6	-- 18/10/2018		
			//Versi�n Profesor
/*			public int[] generaEstadisticaAparicion (int n, int inferior, int superior) {
				int [] resultado; // Declaraci�n en la tabla de s�mbolos
				resultado = new int[superior - inferior + 1]; //inicializaci�n
				Random rnd = new Random();
				int numero=0;
				for(int i = 0; i<=n; i++) {
					numero = inferior +  rnd.nextInt(superior - inferior + 1);
					resultado[numero - 1]++;
				}
				return resultado;	
			}
			
			// Versi�n Sheila.
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
			
		//---------ACTIVIDAD: crearListaPersonas [Array] (Constructor Vac�o) 24/10/2018
		 * 					crear un m�todo que devuelva una lista de 'n' personas. 
		 *		 			Se crean las personas con el constructor Persona().
		 * 
			public Persona[] crearListaPersona (int n){
				Persona[] personas = new Persona[n];
				for(int i=0; i < n; i++)
					personas [i] = new Persona();	
					return personas;
			}

	
	  //											25/10/2018
	 // ---------ACTIVIDAD: Dado una String pasada por par�metros mostrar por pantalla caracter a caracter el String (M�todo CharAt)
	 public void muestraCaracter(String caracteres){
		 for (int i = 0; i < caracteres.length(); i++) {
			System.out.println(caracteres.charAt(i));
		}
	 }
	 
*/	 
	 
	/* ---------ACTIVIDAD: Dan dos cadenas de caracteres por par�metros que hay que comparar entre s� (CompareTo)

	*/
	
	
	
	
	
	
	
	
	
	
	
	
	/* ---------ACTIVIDAD: Hacer un m�todo que recorra y devuleva un acumulado de ventas por vendedor. 31/10/2018

	
	public float [] resumenVendedor(float[][] ventas) {
		float sumVendedor =0;
		float [] resultado = new float[ventas.length];  //Declaraci�n array
		for (int i = 0; i < ventas.length; i++) {
			sumVendedor = 0;
			for (int j = 0; j < ventas[i].length; j++) {  //Especificamos i porque nos encontramos en la linea i
				sumVendedor += ventas[i][j];
			}
			resultado[i] = sumVendedor;
			System.out.println("Vendedor " + i + " ha ganado: " + sumVendedor + "�" );
		}
		return resultado;		
	}
	*/
	
	
	/* ---------ACTIVIDAD: Hacer un m�todo que recorra y devuleva un resumen de cada mes ( recorrer por columnas). 31/10/2018
		Poner nombre de meses y vendedores (String[] meses{"enero","febrero"...} , String("pepe"...)
		
	public float[] resumenMes(float[][]meses){
		String [] nombreMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		float [] resultado = new float[12];
		
		for (int j = 0; j < meses[0].length; j++) {
			for (int i = 0; i < meses.length; i++) {
				resultado[j] += meses[i][j];
			}
			System.out.println(nombreMeses[j] + " " + resultado[j] + "�");
		}
		return resultado;
	}
	*/	 	

	
	/*
	//-------- Extension ACTIVIDAD ANTERIOR: Mostrar nombre de los vendedores-----06/11/2018
	public void mostrarVentasVendedor(){
		String [] nombresVendedor = {"JUAN CARLOS","ISABEL","MARTA"};
		float [][] ventasYear =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		float [] ventas = resumenVendedor(ventasYear);   //Hemos usado dos metodos. Aqu� usamos el m�todo "resumenVendedor"
		for (int i = 0; i < ventas.length; i++) {
			System.out.println(nombresVendedor[i] + " :" + ventas[i]);
		}	
	}
	*/
	
	
	/*---------ACTIVIDAD: Dado un array de cadenas, devolver la lista como n�meros.---------- 06/11/2018 
						En caso de que no pueda devolver el valor -1
						El array de salida tiene el MISMO numero de elementos que el de entrada
	
	
	public int [] convierteCadenas (String[] cadenas) {
		int[] resultado = new int[cadenas.length];
		for (int i = 0; i < cadenas.length; i++) {
			try {
				resultado[i] = Integer.parseInt(cadenas[i]);
				System.out.println("Lllega aqu�");
			}
			catch(NumberFormatException ex){
					resultado[i]= -1;   //devuelve -1 si no es convertible
			}
		}
		System.out.println(Arrays.toString(resultado));
		return resultado;	
	}
	
	*/
	
	
	/*-------ACTIVIDAD: Realizar un reloj ------- 07/11/2018 
				
	public void  mostrarReloj(){
		//Recorrer horas
		for (int h = 0; h < 1; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {   // objeto 'e' o 'ex' excepci�n es lo mismo
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}

	}
	*/
	
	//---- ACTIVIDAD: Mostrar si el n�mero es primo --------- 08/11/2018 
	/*public boolean esPrimo(int numero) {
		for (int i = 2; i < numero; i++) { 
			if (numero%i == 0) {
				return false;
			}
		}
		return true;
	}*/
	
	
	
	//-----ACTIVIDAD: Listar los n�meros primos del 1 hasta el 300 (usando tamb�en el m�todo  'esPrimo')---------------08/11/2018
	/*public void listarPrimos(int desde , int hasta) {
		for (int i = desde; i < hasta; i++) {
			if(esPrimo(i)) {
				System.out.print(i + ", ");
			}
		}
	}
	
	
	
	
	----ACTIVIDAD: Listar  los x n�meros primeros -----------08/11/2018  (usando tamb�en el m�todo  'esPrimo')
	public void listarPrimos2(int desde, int cuantos) {
		int contador = 0;
		while(contador < cuantos) {
			if(esPrimo(++desde)) {
				System.out.print(desde + ", ");
				contador++;
			}
		}
	}
	*/
	
	/*----ACTIVIDAD: Meter en una lista los x n�meros primos -----------08/11/2018  (usando tamb�en el m�todo  'esPrimo')
	
	public int[] listarPrimos3(int desde, int cuantos) {
		int[]resultado = new int[cuantos];
		int contador = 0;
		while(contador < resultado.length) {
			if(esPrimo(desde)) {
				resultado[contador]=desde;
				contador++;
			}
			
			desde++;
		}
		return resultado;
	}
	*/
	
	
	//---ACTIVIDAD: Pasar una lista de n�meros desordenados y mostrarlos ordenados 14/11/2018

		public void ordenarArray(int[] numeros) {
			for (int i = 0; i < numeros.length -1; i++) {
				for (int j = i+1; j < numeros.length; j++) {
					if(numeros[i] > numeros[j]) {
						int numComparador = numeros[i];
						 numeros[i] = numeros[j];
						 numeros[j] = numComparador;
					}
				}
			}
		}			

		
			
	//---ACTIVIDAD: Ordenar un array de cadenas  14/11/2018
			/* 	
			 *  �Qu� devuelve compareTo?
			 * devuelve <0, entonces la cadena que llama al m�todo es primero lexicogr�ficamente
			 * 	devuelve == 0 entonces las dos cadenas son lexicogr�ficamente equivalentes
			 * 	devuelve> 0, entonces el par�metro pasado al m�todo compareTo es lexicogr�ficamente el primero.
			 */
/*	public void ordenarCadena(String[] cadenas ) {
		for (int i = 0; i < cadenas.length -1; i++) {
			for (int j = i+1; j < cadenas.length; j++) {
				if(cadenas[i].compareTo(cadenas[j]) > 0) {
					String cadenaMayor = cadenas[i];
					cadenas[i] = cadenas[j];
					cadenas[j] = cadenaMayor;
				}
			}
		}
	}
			
*/
			
			
	//---ACTIVIDAD: Usar el m�todo "generarListaAleatorios" y ordenar los numeros	14/11/2018 	
			/*
			 *  explicaci�n :El m�todo generarListaAleatorios est� creado en esta misma clase
			 *  pero con unos cambios es por ello que decid� copiar y pegar con las variaciones
			 *  justo encima del m�todo que lo va a llamar para mayor claridad.
			 */
/*				public int[] generarListaAleatorios (int n, int inferior, int superior) {
					Random rnd = new Random();
					int [] numero = new int[n];
					for(int i = 0; i<n; i++) {
						numero[i]= inferior + rnd.nextInt(superior-inferior + 1);
					}
					return numero;
				}	

			
		public void ordenarArray() {
			int[] numeros =generarListaAleatorios(5, 1, 40);
			System.out.println(Arrays.toString(numeros) + " N�meros aleat�rios");
			for (int i = 0; i < numeros.length -1; i++) {
				for (int j = i+1; j < numeros.length; j++) {
					if(numeros[i] > numeros[j]) {
						int numComparador = numeros[i];
						 numeros[i] = numeros[j];
						 numeros[j] = numComparador;
					}
				}
			}System.out.println(Arrays.toString(numeros) + " N�meros aleatorios ordenados");
		}


			
			
			
	//---ACTIVIDAD: (Recorrer matriz irregular )Sumar las columnas de un matriz heterogenea o irregular  14/11/2018  
			
			//��������������������HACER ACTIVIDAD!!!!!!!
			
		//recorrer matriz irregular	
/*	public int[] sumaColumnasMatrizHeterogenea(int[][]matriz) {
		int numColMax=0;
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i].length > numColMax) {
				numColMax= matriz[i].length;
			}	
		}
		int [] resultado = new int[numColMax];
		for (int j = 0; j < numColMax; j++) {
			for (int i = 0; i < matriz.length; i++) {
				resultado[j] += matriz[i][j]; 
			}
		}
		return resultado;
		
	}
		*/
	
			

		//------------------------------ TRES  PEQUE�OS RETOS -------------------------------------------20/11/2018	
			
			
	// ---ACTIVIDAD: Invertir elementos de una lista 20/11/2018
			public void invertirLista(int[] lista) {
				int numMover;
				for (int i = 0; i < lista.length / 2; i++) {
					numMover = lista[i];
					lista[i] = lista[lista.length -1 -i];
					lista[lista.length -1 -i] = numMover;
				}
				//System.out.println("Lista mezclada --> " + Arrays.toString(lista));
			}
			
			
			
	//--- ACTIVIDAD: Dadas dos listas PREVIAMENTE ORDENADAS, se pide obtener la lista MEZCLADA de ambas .(Mezclar listas) 20/11/2018		
			// En esta actividad hemos llamado al m�todo "ordenarArray".
			public int[] mezclaListaOrdenadas(int[] l1, int[] l2) {
				ordenarArray(l1);
				ordenarArray(l2);
				
				// Une listas
				int[] listaUnificada = new int[l1.length+l2.length];

				for (int i = 0; i < l1.length; i++) {
					listaUnificada[i] = l1[i]; 
				}
				
				for (int j = 0; j < l2.length; j++) {
					listaUnificada[l1.length +j] = l2[j];
				}
				
			ordenarArray(listaUnificada);
			//System.out.println( "Lista unificada --> " + Arrays.toString(listaUnificada));
			//invertirLista(listaUnificada);
			return listaUnificada;	
			}
			
			
/*			
 * 				--- ACTIVIDAD DEL PROFESOR
 * 				public int[] mezclaListaOrdenadas(int[] l1, int[] l2) {

				int[] resultado = new int[l1.length + l2.length];
				int i = 0;
				int j = 0;
				int k = 0;

				while (k < l1.length + l2.length) {
					// while (i < l1.length || j < l2.length) {
					try {
						if (l1[i] < l2[j]) {
							resultado[k] = l1[i];
							i++;
						} else {
							resultado[k] = l2[j];
							j++;
						}
						k++;
					} catch (ArrayIndexOutOfBoundsException e) {
						if (i == l1.length) // fin de l1..
							l1[--i] = Integer.MAX_VALUE;
						else
							l2[--j] = Integer.MAX_VALUE;
					}
				}
				return resultado;

			}	*/		
			
	
			
	//--- ACTIVIDAD: Dada una cadena, obtener la cadena INVIRTIENDO sus caracteres(usar charAt() o toCharArray() 20/11/2018
			//Invertir caracteres de una cadena ( Extension - hacer m�todo saber si es pal�ndromo)  
			
			
			/*public String invertirCaracteres(String cadena) {
				String cadenaAlReves = new String();
				
				for (int i = cadena.length()- 1; i >= 0; i--) {
					 cadenaAlReves += cadena.charAt(i);
				}
				
				System.out.println(cadenaAlReves);
				
				return cadenaAlReves;
			}*/
				
			
			
			
			
	// --- ACTIVIDAD: Ordenar cada array de la matriz (usando el m�todo ordenarArray) 21/11/2018		
			
			public void ordenaFilaMatriz (int[][] matriz) {
				for (int i = 0; i < matriz.length; i++) {
					this.ordenarArray(matriz[i]);
					System.out.println(Arrays.toString(matriz[i]));
				}
			}
			
	// --- ACTIVIDAD: Una vez ordenado cada arrays de la matriz ahora hay que ORDENAR TODA la matriz comparando con los array  22/11/2018
			public int[] matrizToArrayOrdenado(int[][] matriz) {
				int [] resultado = new int[1];
				ordenaFilaMatriz(matriz);
				for (int i = 0; i < matriz.length; i++) {
					resultado = matriz[i];
					resultado  = mezclaListaOrdenadas(matriz[i], resultado);
				}
				return resultado;
			}
		
	
	/* 	--------------------------------------- EJERCICIOS -----------------------------------------	28/11/2018 
		1) Declarar en la clase "Ejercicios" un array de personas
		2) En la clase "Persona" declara un array de "Persona" que representa los hijos biol�gicos que tiene			
	*/		
			
			//----------ACTIVIDAD: Mostrar nombre progenitor sus padres y sus hijos-------------------------
			public Persona [] personas;          //1.- Declarar en la clase "Ejercicios" un array de persona
			
			public void hijosPersona() {
				//personas[0].getHijosBiologicos(); //accedemos a una persona concreta y muestra sus hijos
				
				for (int i = 0; i < personas.length; i++) {
					Persona[] hijos = personas[i].getHijosBiologicos();
					Persona padre = personas[i].getPadre();
					Persona madre = personas[i].getMadre();
					
					System.out.println("El padre de "+ personas[i].getNombre() + ": " + padre.getNombre() + ". La madre de " + personas[i].getNombre() + ":" + madre.getNombre());
					System.out.println("Progenitor -> " + personas[i].getNombre());
					if (hijos != null) {
						for (int j = 0; j < hijos.length; j++) {
							System.out.println("Hij@s --> " + hijos[j].getNombre());
						}
					}
				}
				
			}

	public static void main(String[]args) {
		

		
		Persona sheila = new Persona("78474714","Sheila", 50, null, 'F', new Persona[0]);  //Crear sheila
		Persona cindy = new Persona("78474718","Cindy", 55, null, 'F', new Persona[0]);   //Crear cindy
		Persona[] hijos = {sheila , cindy};
		
		Persona orlando = new Persona("45454545","Orlando",33, null,'M',hijos );
		Persona pepe = new Persona("48888845","Pepe",38,null,'M' , new Persona[3]);
		Persona concha = new Persona("45999945","Concha",77,null,'F' , new Persona[3]);
		
		Persona toni = new Persona("45664545","Toni",33,null,'F' , hijos);
		
		sheila.setMadre(toni);
		sheila.setPadre(orlando);
		
		orlando.setMadre(concha);
		orlando.setPadre(pepe);
		
		
		Ejercicios ejercicio = new Ejercicios();
		Persona [] resultado = {sheila,orlando};
		ejercicio.personas = resultado;
		ejercicio.hijosPersona();
		
		
			
		
		
	
/*		Ejercicios ejercicios = new Ejercicios();
		int matrizNum[][]= {
				{7,4,6},
				{6},
				{5,2,3},
				{4,2,5,1,9,0,3},
				{5,6,1,3}
		};
		
		int[] vector = ejercicios.matrizToArrayOrdenado(matrizNum);
		
*/

		
		
		
		
		
		/*
		
		int matrizNum[][]= {
				{5,4,8},
				{7,2,3,4},
				{8,5}
		};		
		
		Ejercicios ejercicios = new Ejercicios();
		ejercicios.sumaColumnasMatrizHeterogenea(matrizNum);*/
				
		

	//	Persona juan = new Persona();
	//	int pasos = juan.caminar(20);
		
	//Persona juan;
	//juan = new Persona("4545455X", "Juan Luis", 47,null);
	//Persona persona1 = new Persona();
		

		
		
		
/*	
 		//28/11/2018 ------------ACTIVIDAD: Mostrar nombre progenitor sus padres y sus hijos. 
 		Persona sheila = new Persona("78474714","Sheila", 50, null, 'F', new Persona[0]);  //Crear sheila
		Persona cindy = new Persona("78474718","Cindy", 55, null, 'F', new Persona[0]);   //Crear cindy
		Persona[] hijos = {sheila , cindy};
		
		Persona orlando = new Persona("45454545","Orlando",33, null,'M',hijos );
		Persona pepe = new Persona("48888845","Pepe",38,null,'M' , new Persona[3]);
		Persona concha = new Persona("45999945","Concha",77,null,'F' , new Persona[3]);
		
		Persona toni = new Persona("45664545","Toni",33,null,'F' , hijos);
		sheila.setMadre(toni);
		sheila.setPadre(orlando);
		
		orlando.setMadre(concha);
		orlando.setPadre(pepe);
				
		Ejercicios ejercicio = new Ejercicios();
		Persona [] resultado = {orlando};
		ejercicio.personas = resultado;
		ejercicio.hijosPersona();
 		 
 		 
 
 		// 22/11/2018 ----------- ACTIVIDAD: Una vez ordenado cada arrays de la matriz ahora hay que ORDENAR TODA la matriz comparando con los array 
 		Ejercicios ejercicios = new Ejercicios();
		int matrizNum[][]= {
				{7,4,6},
				{6},
				{5,2,3},
				{4,2,5,1,9,0,3},
				{5,6,1,3}
		};
		ejercicios.matrizToArrayOrdenado(matrizNum);
		
		//OJO: Esta actividad hay que comprobarla con el debug porque solo retorna el resultado, no muestro por pantalla
 
 
 
 
  		//20/11/2018 -------------ACTIVIDAD: ACTIVIDAD: Ordenar cada matriz del array (usando el m�todo ordenarArray) 21/11/2018
  		 Ejercicios ejercicios = new Ejercicios();
		int matrizNum[][]= {
				{7,4,6},
				{6},
				{5,2,3},
				{4,2,5,1,9,0,3},
				{5,6,1,3}
		};
		
		ejercicios.ordenaFilaMatriz(matrizNum);
  		 
  		 
 
 		// 20/11/2018 ------------- ACTIVIDAD: Dada una cadena, obtener la cadena INVIRTIENDO sus caracteres(usar charAt() o toCharArray()
 		Ejercicios ejercicios= new Ejercicios();
		String cadena = "Sheila";
		ejercicios.invertirCaracteres(cadena);
 		
 		
 		
 		// 20/11/2018 --------------ACTIVIDAD:  Dadas dos listas PREVIAMENTE ORDENADAS, se pide obtener la lista MEZCLADA de ambas .(Mezclar listas)
		Ejercicios ejercicios = new Ejercicios();
		int[] lista2 = {1,3,2,5,4};
		int[] lista1 = {8,7,6};	
		ejercicios.mezclaListaOrdenadas(lista1, lista2);
 		 
 
 		// 20/11/2018 ---------------ACTIVIDAD: Invertir elementos de una lista 
	 	Ejercicios ejercicios = new Ejercicios();
		int lista[]= {40,8,2,1,30};
		ejercicios.invertirLista(lista);
		

 		//14/11/2018 -----------------ACTIVIDAD: Usar el m�todo "generarListaAleatorios" y ordenar los n�meros
 		 Ejercicios ejercicios= new Ejercicios();
		ejercicios.ordenarArray();
		
		CORREGIR!!!
 		 

 		//14/11/2018 -------------------ACTIVIDAD: Ordenar un array de cadenas  
 		Ejercicios ejercicios= new Ejercicios();
		String palabras[]= {"zorro","azul","abeja","pez"};
		ejercicios.ordenarCadena(palabras);
 		
 		
 		//14/11/2018 -------------------ACTIVIDAD: Pasar una lista de n�meros desordenados y mostrarlos ordenados 
 		Ejercicios ejercicios = new Ejercicios();
		int ordenarArray[]= {40,8,2,1,30};
		ejercicios.ordenarArray(ordenarArray);
		System.out.println(Arrays.toString(ordenarArray));
 		
 
 		//08/11/2018 -------------------ACTIVIDAD:Meter en una lista los x n�meros primos 
 		Ejercicios ejercicios = new Ejercicios();
		int inicio=5;
		int cuantos=8;
		int[] numeros = ejercicios.listarPrimos3(inicio,cuantos);
		System.out.println(Arrays.toString(numeros));
 
 
 		//08/11/2018 --------------------ACTIVIDAD:  Listar los x n�meros primeros (usando tamb�en el m�todo  'esPrimo')----------
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.listarPrimos2(1,10);
 		  
 
 		//08/11/2018---------------------ACTIVIDAD: Mostrar los 20 primeros n�meros primos (usando tamb�en el m�todo  'esPrimo')
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.listarPrimos(1,100);
 		 
		
		//08/11/2018---------------------ACTIVIDAD: Mostrar si el n�mero es primo
		Ejercicios ejercicios = new Ejercicios();
		System.out.println(ejercicios.esPrimo(8));
		
 		// 07/11/2018 -------------------ACTIVIDAD: Realizar un reloj -------
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.mostrarReloj();
 
 		//06/11/2018-----------------------ACTIVIDAD: Dado un array de cadenas, devolver la lista como n�meros.---------- 
 		Ejercicios ejercicios = new Ejercicios();
		String[] cadenaNumerica={"123","8k8","9811","xyz"};
		ejercicios.convierteCadenas(cadenaNumerica);
		
		-------- Extension ACTIVIDAD ANTERIOR: Mostrar nombre de los vendedores-----06/11/2018
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.mostrarVentasVendedor();
		
		
 		//31/10/2018-----------------------ACTIVIDAD: Hacer un m�todo que recorra y devuleva un resumen de cada mes(recorrer por columnas)
 		 Ejercicios ejercicios = new Ejercicios();
		float [][] ventasMeses =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		ejercicios.resumenMes(ventasMeses);
 		 
 		 
 		//31/10/2018-----------------------ACTIVIDAD: Hacer un m�todo que recorra y devuleva un acumulado de ventas por vendedor. (recorrer por filas)
 		 Ejercicios ejercicios = new Ejercicios();
		float [][] VentasYear =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		float[] resumenVendedor;
		resumenVendedor = ejercicios.resumenVendedor(VentasYear);
		
 
 		//25/10/2018-----------------------ACTIVIDAD: Dan dos cadenas de caracteres por par�metros que hay que comparar entre s� (CompareTo)
 		PENDIENTE
 		
 		
 		
 		
 		
 		
 		
 		
 		//25/10/2018-----------------------ACTIVIDAD: Dado una String pasada por par�metros mostrar por pantalla caracter a caracter el String (M�todo CharAt)
 		Ejercicios ejercicios = new Ejercicios();
		String caracteres = new String("Cadenadecaracteres");
		ejercicios.muestraCaracter(caracteres);
		
		�PENDIENTE DE ENUNCIADO -FALT� A CLASE!
		
 
 		//24/10/2018-----------------------ACTIVIDAD:crearListaPersonas [Array] (Constructor Vac�o)
 		Ejercicios ejercicios = new Ejercicios ();
		Persona [] listapersona = ejercicios.crearListaPersona(5);
		System.out.println(Arrays.toString(listapersona));
 
 		//18/10/2018------------------------ACTIVIDAD: devolver la cantidad de veces que se repiten los n�meros en  10 veces que se genera los n�meros aleatorios. Rango numeros 1-6			
 		Ejercicios ejercicios = new Ejercicios();
		int[] array = ejercicios.generaEstadisticaAparicion(10,1,6);
		System.out.println(Arrays.toString(array));
		
 		//---------------------------------ACTIVIDAD:Devolver array con 'n' numeros aleatorios entre 'inferior'(100) y 'superior'(500)
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicio.generarListaAleatorios(5,100,500);
 
 		//17/10/2018 -----------------------ACTIVIDAD: IMPRIME POR CONSOLA n n�meros aleatorios entre 1-100 (ENUNCIADO NUEVO,SIMILAR ANTERIOR)-
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.imprimeAleatorio(100); //veces que se muestra un n�mero aleat�rio
 
 
  		//16/10/2018------------------------ACTIVIDAD: M�todo Aleat�rio + Array (devuelva un array de enteros, 1-1000)-------
  		Ejercicios ejercicios = new Ejercicios();
		int array [] = ejercicios.generaAleatorio(1000);
		System.out.println(Arrays.toString(array));
 
 		//16/10/2018------------------------ACTIVIDAD: M�todo "Aleat�rio" + Array (No marcado en Clase-- VARIANTE )--------
 		Ejercicios ejercicios = new Ejercicios();
		int array[] = ejercicios.aleatorio(4);
		System.out.println(Arrays.toString(array));  //Para mostrar el contenido del array "bien" hay que usar el .toString
 
		// 17/10/2018---------------------- ACTIVIDAD : Devolver el n�mero menor de CUATRO - Con 'If' (Extensi�n actividad del 16/10/2018)---
		Ejercicios ejercicios = new Ejercicios();
		int a=10, b=50 , c=5 , d=80;
		System.out.println("el menor es:"+ ejercicios.calNumMenor(a,b,c,d));
		
		// 16/10/2018-----------------------ACTIVIDAD : Devolver el n�mero menor de tres - Con 'If' (HECHO CLASE)-----
		Ejercicios ejercicios = new Ejercicios();
		int a=5, b=19 , c=100;
		System.out.println("el menor es:"+ ejercicios.calNumMenor(a,b,c));

		// 11/10/2018---------------------- ACTIVIDAD : Devolver el n�mero menor de tres (2.-Deberes Casa)-------------
		int [] numeros = {7,3,8};
		System.out.println(calNumMenor(numeros));
		
		// 11/10/2018---------------------- ACTIVIDAD : Factorial  (1.-Deberes Casa)-----------------------------------
		factorial(5);
		
		// 11/10/2018----------------------ACTIVIDAD : Serie Fibonacci -------------------------------------------------
		serieFibonacci(8);
		
		// 10/10/2018 ---------------------ACTIVIDAD: �cadena� (String) devolver el valor en forma de n�mero entero-----
		System.out.println(converString("8fgf"));
		
		//------------------------ ACTIVIDAD: Mostrar por consola los n�meros comprendidos entre dos enteros, a y b  ---
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
