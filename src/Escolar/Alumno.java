package Escolar;

public class Alumno  extends Persona{
	 private String matricula;
	 private char horario;
	 private String gpo;
	 private int semestre;
	 private String carrera;
	 private String status;
	
	 public Alumno(){
		 
	 }
	 
	 public Alumno(String name,String curp ,String genero, int edad,String fechanac,String direccion, String  tel,
			 String matricula,char horario,String gpo,int semestre, String carrera, String status) {
		 super(name,curp, genero,edad,fechanac,direccion,tel); 
		 this.matricula=matricula;
		 this.horario=horario;
		 this.gpo=gpo;
		 this.semestre=semestre;
		 this.carrera=carrera;
		 this.status= status;
	 
	}
	
	public String getmat() {
		return matricula;
	}
	
	public char gethorario() {
		return horario;
	}
	
	public String getgpo() {
		return gpo;
	}
	
	public void setmat(String matricula) {
		if (matricula==null )
			System.out.println("Matricula no valida");
		else
		  this.matricula=matricula;
	}
	
	public void sethorario(char horario) {
		if (horario !='M' )
			System.out.println("Matricula no valida");
		else
		    this.horario=horario;
	}
	
	public void  setgpo(String gpo) {
		if (matricula==null )
			System.out.println("Grupo no valido");
		else
		   this.gpo=gpo;
	}
	
	public void imprimir(){
		super.imprimir();
		System.out.println("Horario: "+horario);
		System.out.println("Grupo: "+gpo);
		System.out.println("Semestre: "+semestre);
		System.out.println("Carrera : "+carrera);
		System.out.println("Status: "+status);
		
		
		
		
		
	}
	
}