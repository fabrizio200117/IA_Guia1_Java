package Senati;

import java.util.Scanner; 

public class Caso23 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		String producto;
		int cantidad;
		float precio;
		
		System.out.print("Ingrese el nombre del producto: ");
		producto = scn.nextLine();
		
		System.out.print("Ingrese el precio del producto: ");
		precio = scn.nextFloat();
		
		System.out.print("Ingrese la cantidad del producto: ");
		cantidad = scn.nextInt();
		
		float importe = precio * cantidad;
		
		float igv = (float)(importe * 0.18);
		
		float descuento = (float)(importe *0.03);
		
		float total = importe + igv + descuento;
		
		
		System.out.println("Importe es.......: " + importe);
		System.out.println("Igv es...........: " + igv);
		System.out.println("Descuento es.....: " + descuento);
		System.out.println("Total es.........: " + total);



	}

}
