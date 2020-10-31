package Senati;

import java.util.Scanner; 

public class Caso24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		float m1,m2,m3;
		
		System.out.print("Ingrese primer monto: ");
		m1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo monto: ");
		m2 = scn.nextFloat();
		
		System.out.print("Ingrese tercer monto: ");
		m3 = scn.nextFloat();
		
		float result1 = (float)(m1 / 5 + m2 * 0.2);
		
		float result2 = (float)(m3 + m3 * 0.6) / 2;
		
		float result3 = (float)((m1 + m2 + m3) - (m1 + m2 + m3)*0.08);
		
		System.out.println("El resulta 1 es: " + result1);
		System.out.println("El resulta 2 es: " + result2);
		System.out.println("El resulta 3 es: " + result3);

	}

}