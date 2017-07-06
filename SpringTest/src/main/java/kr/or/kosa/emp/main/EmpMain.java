package kr.or.kosa.emp.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosa.emp.Employee;
import kr.or.kosa.emp.service.EmpService;

public class EmpMain {

	public static void main(String[] args) {
		
			
			
			AbstractApplicationContext context=
					new ClassPathXmlApplicationContext("applicationContext.xml");
			
			EmpService service=context.getBean("empService",EmpService.class);
			
			
					
			
			System.out.println(service.getEmployee(100));
					
			context.close();
			
			
		

	}

}
