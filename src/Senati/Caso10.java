package Senati;

import java.util.Scanner;


public class Caso10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float radio = 0;
		float pi = (float) 3.1416;
		
		System.out.println("Ingrese Radio del Circulo: ");
		radio = scn.nextInt();
		
		float area = (float) (pi * Math.pow(radio, 2));
		float perimetro = 2 * pi * radio;
		
		System.out.println("RESULTADOS");
		System.out.println("=============");
		System.out.println("Area del Circulo...........: " + area);
		System.out.println("Perímetro del Circulo......: " + perimetro);

	}

}
