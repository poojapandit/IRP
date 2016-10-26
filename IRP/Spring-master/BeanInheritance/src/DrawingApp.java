// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		//Triangle triangle1=(Triangle)context.getBean("triangle1");
		//triangle1.draw();
		//2
		//
		Triangle triangle2=(Triangle)context.getBean("triangle2");//output with nullpointerexception because pointc is not present
		triangle2.draw();

	}

}


