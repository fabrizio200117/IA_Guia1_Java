package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float precio = 0;
		 
		System.out.print("Ingrese el precio: ");
		precio = scn.nextFloat();
		
		float incremento = precio * 0.42f;
		float total = precio + incremento;
		
		System.out.println("El incremento del precio es de: " + incremento);
		System.out.println("El total es : " + total);
		
		
		
	}

}
