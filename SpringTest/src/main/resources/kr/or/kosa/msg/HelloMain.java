package kr.or.kosa.msg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloController controller = context.getBean("helloController",HelloController.class);
		controller.hello("홍길동");
		

	}

}
