package the.fundidors.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {


		//Carga de xml de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//petición de beans al contenedor spring
		
		SecretarioEmpleado maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado luisa = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado ana = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado juan = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(maria);
		System.out.println(pedro);
		System.out.println(luisa);
		System.out.println(ana);
		System.out.println(juan);
		
		if(maria == pedro) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
	}

}
