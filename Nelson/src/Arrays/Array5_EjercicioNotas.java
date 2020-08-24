package Arrays;

import java.util.Scanner;

public class Array5_EjercicioNotas {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		String[] alumno = new String [3];
		int [] programacion = new int [3];
		int [] fol = new int [3];
		int [] bdd = new int [3];
		int opcion = 0; 

		do {
		System.out.println("");
		System.out.println("menu");
		System.out.println("1. introducir nombres de alumnos");
		System.out.println("2. rellenar notas alumnos");
		System.out.println("3. mostrar notas de alumnos");
		System.out.println("4. modficar notas de alumnos");
		System.out.println("5. mostrar nombre del mejor alumno");
		System.out.println("6. mostrar nota media de un alumno");
		System.out.println("7. mostrar nota media de todos loa alumnos");
		System.out.println("8. mostrar nota media por asignaturas");
		System.out.println("9. mostrar peor alumno");
		System.out.println("10. salir");
		
		opcion = sn.nextInt();
			
		switch (opcion) {
		case 1:
			for (int i = 0; i < alumno.length; i++) {
				System.out.println("introduce el nombre: ");
				alumno [i] = sc.nextLine();
			}
			break;
		case 2: 
			for (int i = 0; i < programacion.length; i++) {
				programacion [i] = (int) (Math.random()*11);
			}
			for (int i = 0; i < bdd.length; i++) {
				bdd [i] = (int) (Math.random()*11);
			}
			for (int i = 0; i < fol.length; i++) {
				fol [i] = (int) (Math.random()*11);
			}
			
		case 3:
			for (int i = 0; i < alumno.length; i++) {
				System.out.println("alumnos: " + alumno[i] +" ,programacion: " + programacion[i] + " ,bdd: " + bdd[i] + " ,fol: " + fol[i]) ;
			}
			break;
						
		case 4:
			String nombreAModificar = sc.nextLine();
			String moduloAModificar = sc.nextLine();
			int notaNueva = 0;
			
			for (int i = 0; i < alumno.length; i++) {
				if (nombreAModificar.equals(alumno[i]) && moduloAModificar.equals("programacion")) {
					notaNueva = sn.nextInt();
					programacion[i]=notaNueva;
					break;
				
				}else if (nombreAModificar.equals(alumno[i]) && moduloAModificar.equals("bdd")) {
					notaNueva = sn.nextInt();
					bdd[i]=notaNueva;
					break;
					
				}else if (nombreAModificar.equals(alumno[i]) && moduloAModificar.equals("fol")) {
					notaNueva = sn.nextInt();
					fol[i]=notaNueva;
					break;
					
				}else {
					System.out.println("error");
				}
			}
			
			break;
		
		case 5:
			
			int notaMayor = 0;
			for (int i = 0; i < alumno.length; i++) {
				
				int notaMedia = (programacion[i] + bdd[i]  + fol[i])/3;
				
				if( notaMedia>notaMayor) {
					notaMayor = notaMedia;
				}
			}
			System.out.println("la nota media mas alta de los alumnos es: " + notaMayor);
		
		case 6:
			System.out.println("introduzca el nombre del alumno: ");
			String nombreNuevo = sc.nextLine();
			
			for (int i = 0; i < alumno.length; i++) {
				
				if(nombreNuevo.equals(alumno[i])) {
					System.out.println("su nota media es: " +  (programacion[i] + bdd[i]  + fol[i])/3);
				}
			}
			
			break;
			
		case 7:
			
			boolean encontrado = false;
			for (int i = 0; i < alumno.length; i++) {
				
				int notaMedia = ((programacion[i] + bdd[i]  + fol[i])/3);
				
				System.out.println("Alumno: " + alumno[i] + "\n nota media: " + notaMedia);
				encontrado =true;
			}
			
			if(encontrado=false) {
				System.out.println("el alumno no existe");
			}
			break;
		
		case 8:
			
			int mediaSuma = 0;
			int primeraP = 0;
			int segundaB = 0;
			int terceraF = 0;
			
			for (int i = 0; i < programacion.length; i++) {
				 mediaSuma = mediaSuma+programacion[i];
				 primeraP = mediaSuma/3;
				
			}
			for (int i = 0; i < bdd.length; i++) {
				mediaSuma = mediaSuma+bdd[i];
				 segundaB = mediaSuma/3;
			}
			for (int i = 0; i < fol.length; i++) {
				mediaSuma = mediaSuma+fol[i];
				 terceraF = mediaSuma/3;
			}
			
			System.out.println("la nota media de programacion es: " + primeraP);
			System.out.println("la nota media de bdd es: " + segundaB);
			System.out.println("la nota media de fol es: " + terceraF);
			break;
			
		case 9:
			int notaMenor = 0;
			for (int i = 0; i < alumno.length; i++) {

				
				int notaMedia = ((programacion[i] + bdd[i]  + fol[i])/3);
				
				if (notaMedia<notaMenor) {
					notaMenor=notaMedia;
				}
			}
			System.out.println("su nota menor es " +  notaMenor);
			
			break;
		default:
			
			System.out.println("Has decidido salir. ");
			break;
		}
		} while (opcion!=10);

	}

}
