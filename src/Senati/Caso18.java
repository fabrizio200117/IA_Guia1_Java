package Senati;

import java.util.Scanner;

public class Caso18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float base = 0;
		float altura = 0;
		
		System.out.print("Ingrese Base del triangulo: ");
		base = scn.nextInt();
		
		System.out.print("Ingrese Altura del triangulo: ");
		altura = scn.nextInt();
		
		float area = base * altura / 2;
		
		System.out.println("RESULTADOS");
		System.out.println("=============");
		System.out.println("Area del Triangulo...........: " + area);

	}


}
