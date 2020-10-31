package Senati;

import java.util.Scanner;

public class Caso13 {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nombre, apellido = "";
		
		System.out.println("Ingrese un Nombre: ");
		nombre = scn.nextLine();
		
		System.out.println("Ingrese un Apellido: ");
		apellido = scn.nextLine();
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Alumno....: " + nombre + " " + apellido);
    }


}
