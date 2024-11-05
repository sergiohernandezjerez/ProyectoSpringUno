package the.fundidors.IoC;

public class DirectorEmpleado implements Empleados {
	
	private String email;
	private String nombreEmpresa;
	
	//Creación de campo tipo CreacionInformne(interfaz)
	private CreacionInformes informeNuevo;
	
	//Creación de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	//método init. Ejecutar tareas antes de que el bean esté disponible
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aquí irían las tareas a ejecutar antes de que el bean esté listo");
	}
	
	
	//método destroy. Ejecutar tareas después de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aquí irían las tareas a ejecutar después de utilizar el bean");
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es un informe de un Director Empleado: " + informeNuevo.getInforme();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	

}
