package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
	// Nos piden que para el alumno Mendoza Manuel se registre las notas finales de 4 materias
	Alumno alumno = new Alumno();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese el legajo: ");
	Integer legajo =scanner.nextInt();
	
	System.out.println("Ingrese el apellido: ");
	String apellido =scanner.next();
	
	System.out.println("Ingrese el nombre: ");
	String nombre =scanner.next();
	
	alumno.setLegajo(legajo);
	alumno.setApellido(apellido);
	alumno.setNombre(nombre);
	
	System.out.println(alumno.toString());
	
	int numMaterias = 1;
	
	while (numMaterias <= 4) {
		//cargar materias
		System.out.println("Ingrese el codigo de la materia: ");
		String codigomateria = scanner.next();
		System.out.println("Ingrese el nombre de la materia: ");
		String nombremateria = scanner.next();
		
		Materia materia = new Materia(codigomateria, nombremateria);
		
		System.out.println("Ingrese el codigo Registro de Nota: ");
		String codigoNota = scanner.next();
		System.out.println("Ingrese la Nota Final: ");
		Float nota = scanner.nextFloat();
		
		RegistroNota resgistroNota = new RegistroNota(codigoNota, alumno, materia, nota);
		
		System.out.println(resgistroNota.toString());
		numMaterias++;
		
	}
	}

}
