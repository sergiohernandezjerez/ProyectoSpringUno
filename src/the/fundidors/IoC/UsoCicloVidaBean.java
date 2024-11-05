package the.fundidors.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Empleados juan = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getInforme());
		
		context.close();

	}

}
