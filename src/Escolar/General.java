package Escolar;


public class General {
public static void main(String[] args) {
	
	Persona p1= new Persona("Anay","IAPA851207MCHBYN00","Mujer",37,"",""," 6141913342");
	Alumno A1= new Alumno("Jesus","RACJ831125MCHBYN00","Hombre",39,"","","6144865925", "A01003960",
			              'M',"A2",6,"Electronica","Activo");
	Alumno A2= new Alumno();
	
	A2.setname("Edwin");
	
	System.out.println("Los datos de la persona 1 son :\n ");
	p1.imprimir();
	
	System.out.println("\nLos datos del alumno son :\n ");
	A1.imprimir();
   
	
}
}
