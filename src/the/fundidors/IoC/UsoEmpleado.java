package the.fundidors.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//creación de objetos de tipo Empleado
		Empleados empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados juan = context.getBean("miEmpleado", Empleados.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());*/
		
		SecretarioEmpleado pablo = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		JefeEmpleado sergio = context.getBean("miEmpleado", JefeEmpleado.class);
		
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		System.out.println(maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		System.out.println("Email Pablo: " + pablo.getEmail());
		
		
		System.out.println(sergio.getTareas());
		System.out.println(sergio.getInforme());
		System.out.println(sergio.getEmail());
		System.out.println(sergio.getNombreEmpresa());
		
		context.close();

	}

}
