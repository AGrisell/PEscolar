package Escolar;

public class Persona {
	private String name;
	private String curp;
	private String genero;
	private String fechanac;
	private int edad;
	private String direccion;
	private String tel;
	
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre,String curp, String genero, int edad,String fechanac, String direccion, String tel) {
		this.name=nombre;
		this.curp=curp;
		this.genero=genero;
		this.fechanac=fechanac;
		this.edad=edad;
		this.direccion=direccion;
		this.tel=tel;
		
	}
	
	public String getname() {
		return name;
	}
	
	public String getgenero() {
		return genero;
	}
	
	public int getedad() {
		return edad;
	}
	public String getcurp() {
		return curp;
	}
		
	public void setname(String name) {
		this.name=name;
	}
	
	public void setgenero(String genero) {
		this.genero=genero;
	}
	
	public void  setedad(int edad) {
		this.edad=edad;
	}
	
	public void  setcurp(String curp) {
		this.curp=curp;
	}
	public void imprimir() {
		System.out.println("Nombre: "+name);
		System.out.println("Curp: "+curp);
		System.out.println("Genero: "+genero);
		System.out.println("Edad: "+edad);
		System.out.println("Fecha de nacimiento: "+fechanac);
		System.out.println("Direccion: "+direccion);
		System.out.println("Telefono: "+tel);
	}

}
