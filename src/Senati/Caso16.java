package Senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int horas_trabajadas = 0;
		float tarifa_hora = 0;
		
		System.out.print("Ingrese horas trabajadas: ");
		horas_trabajadas = scn.nextInt();
		System.out.print("Ingrese tarifa por hora : ");
		tarifa_hora = scn.nextFloat();
		
		
		float sueldo = horas_trabajadas * tarifa_hora;
		float bono = sueldo * 0.05f;
		float total = sueldo + bono;
		float dolar = total / (float) 3.24;
		
		System.out.println("\nResultados");
		System.out.println("============");
		System.out.println("Sueldo.......: " + df.format(sueldo));
		System.out.println("Bono.........: " + df.format(bono));
		System.out.println("Total........: " + df.format(total));
		System.out.println("Total en dolares........: " + df.format(dolar));
		
		
		
		

	}

}
