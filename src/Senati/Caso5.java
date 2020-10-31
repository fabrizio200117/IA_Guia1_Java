package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");

	
		int n1, n2;
		
		System.out.print("Ingrese primer numero: ");
		n1 = scn.nextInt();
		System.out.print("Ingrese segundo numero: ");
		n2 = scn.nextInt();
		
		int promedio = (n1 + n2) / 2;
		
		int aumento =(int)(n1 + n1 * 0.2);
		
		int descuento =(int)(n2 - n2 * 0.3);
		
		System.out.println("Resultados");
		System.out.println("==================");
		System.out.println("Resultado 1: " + df.format(promedio));
		System.out.println("Resultado 2: " + df.format(aumento));
		System.out.println("Resultado 3: " + df.format(descuento));
		
		
		
		
	}

}
