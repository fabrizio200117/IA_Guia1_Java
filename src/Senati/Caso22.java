package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float nota1 = 0, nota2 = 0, nota3 = 0;
		
		System.out.print("Ingrese el nombre del alumno: ");
		String alumno = scn.nextLine();
		
		System.out.print("Ingrese 1era nota: ");
		nota1 = scn.nextFloat();
		System.out.print("Ingrese 2do nota: ");
		nota2 = scn.nextFloat();
		System.out.print("Ingrese 3ra nota: ");
		nota3 = scn.nextFloat();
		
		
		
		float n1 = nota1 * 0.20f;
		float n2 = nota2 * 0.30f;
		float n3 = nota3 * 0.50f;
		
		float promedio = n1 + n2 + n3;
		
		System.out.println("\nResultados");
		System.out.println("================================");
		System.out.println("Alumno: " + alumno);
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Nota 3: " + n3);
		System.out.println("Promedio: " + promedio);
		
	}
	

}