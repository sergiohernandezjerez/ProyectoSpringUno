package the.fundidors.IoC;

public class JefeEmpleado implements Empleados{
	
	private String email;
	private String nombreEmpresa;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	//Creación de campo tipo CreacionInformne(interfaz)
		private CreacionInformes informeNuevo;
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es un informe de Jefe Empleado: " + informeNuevo.getInforme();
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

	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	

}
