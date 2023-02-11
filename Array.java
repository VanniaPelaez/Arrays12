package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	    
	    public static void main (String[] args){
	        
	        Scanner enteros = new Scanner(System.in);
	        System.out.println("Ingrese los datos para llenar el arreglo");
	        
	        for (int i = 0; i < longitud.length; i++) {
	            longitud[i] = enteros.nextLine();
	        }   
	
	
	public void Show(Array[] arreglo) {
		System.out.println(Arrays.toString(arreglo));
	}
	
	public void Look(String[] arreglo, String word) {
		int i=0, j=0;
		
		for(String y : arreglo) {
			if(word.equals(y)) {
				System.out.println("Su posición es:" + i);
				j++;
			}
			i++;
		}
		
		if(j==0) {
			System.out.println("No se encuentra.");
		}
	}
	
	public void Look(int[] arreglo, int number) {
		int i=0, j=0;
		
		for(int y : arreglo) {
			if(number == y) {
				System.out.println("Se encontro en la posicion: " + i);
				j++;
			}
			i++;
		}
		
		if(j==0) {
			System.out.println("No se encuentra");
		}
	}
	
	public void Delete(int[] arreglo, int number) {
		int i=0;
		int x=-1;
		
		for(int y : arreglo) {
			if(number == y) {
				x = i;
				break;
			}
			i++;
		}	
	}
		
	
	public void Delete(String[] arreglo, String word) {
		int i=0;
		int x=-1;
		
		for(String y : arreglo) {
			if(word == y) {
				x = i;
				break;
			}
			i++;
		}	
		
	}
	
	
}
