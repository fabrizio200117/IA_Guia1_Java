package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float precio = 0;
		 
		System.out.print("Ingrese el gasto: ");
		precio = scn.nextFloat();
		
		float disminuya = precio * 0.12f;
		float total = precio - disminuya;
		
		System.out.println("La disminucion del gasto es de: " + disminuya);
		System.out.println("El gasto total es: " + total);

	}
}


