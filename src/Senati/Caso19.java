package Senati;

import java.util.Scanner;

public class Caso19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float lado1 = 0;
		float lado2 = 0;
		float lado3 = 0;
		
		System.out.print("Ingrese ladoA: ");
		lado1 = scn.nextInt();
		
		System.out.print("Ingrese ladoB: ");
		lado2 = scn.nextInt();
		
		System.out.print("Ingrese ladoC: ");
		lado3 = scn.nextInt();
		
		
		float perimetro = lado1 + lado2 + lado3;
		
		System.out.println("RESULTADOS");
		System.out.println("=============");
		System.out.println("Perimetro del Triangulo es...........: " + perimetro);

	}


}
