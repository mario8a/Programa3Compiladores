/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3compiladores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author MARIO
 */
public class Programa3Compiladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    
        //abrir el fichero
      //  FileReader fr = new FileReader("archivo.txt");
       
    //Scanner miScanner = new Scanner(fr);
 
		//Se almacena el texto introducido en la variable frase y pasa el
		//texto todo a minúsculas
		//String frase = miScanner.nextLine().toLowerCase();
 
		//Se crea el objeto tok de la clase StringTokenizer
		//StringTokenizer tok = new StringTokenizer(frase);
 
		//Variable que almacenará la palabra que queramos bucar
		//String palabras;
		//Variable que almacena el número de veces que aparece la palabra
		//int contador = 0;
		/*
		Bucle while que se repetirá mientras que existan tokens. Dentro del
		bucle se crea un condicional if que compara si el elemento es igual a
		la palabra a buscar. En caso de que así se el contador aumentará en uno
		*/
		/*while(tok.hasMoreTokens()) {
			if(tok.nextElement().equals(frase)) {
				contador++;
			}
		}
		System.out.println("La frase '" + frase + "'\ncontine " + contador + " veces la palabra '");
 */
                
  ////////CODIGO SIN LEER FICHERO////////////////////////////
  
  
  /////// Por simplicidad, la frase no se lee de un fichero,  
        // sino que se lee de teclado como un String de Palabras 
  
  
  		//Creamos un objeto de la clase Scanner para leer por teclado
		Scanner miScanner = new Scanner(System.in);
 
		System.out.println("Introduce una frase: ");
 
		//Se almacena el texto introducido en la variable frase y pasa el
		//texto todo a minúsculas
		String frase = miScanner.nextLine().toLowerCase();
 
		//Se crea el objeto tok de la clase StringTokenizer
		StringTokenizer tok = new StringTokenizer(frase);
 
		//Variable que almacenará la palabra que queramos bucar
		String palabras;
 
		//Variable que almacena el número de veces que aparece la palabra
		int contador = 0;
 
		System.out.print("Introduce la palabra a contar: ");
 
		//Se introduce la palabra a buscar pasándola toda a minúscula
		palabras = miScanner.nextLine().toLowerCase();
 
		/*
		Bucle while que se repetirá mientras que existan tokens. Dentro del
		bucle se crea un condicional if que compara si el elemento es igual a
		la palabra a buscar. En caso de que así se el contador aumentará en uno
		*/
		while(tok.hasMoreTokens()) {
			if(tok.nextElement().equals(palabras)) {
				contador++;
			}
		}
 
		System.out.println("La frase '" + frase + "'\ncontine " + contador + " veces la palabra '" + palabras + "'");
    
    
    
    }
    
}
