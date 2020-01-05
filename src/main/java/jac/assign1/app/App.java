package jac.assign1.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jac.assign1.model.Student;
import jac.assign1.model.Teacher;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Student student1 = (Student)context.getBean("studentBean1");
		Student student2 = (Student)context.getBean("studentBean2");
		Teacher teacher = (Teacher)context.getBean("teacherBean");

		System.out.println( teacher.toString() );
		
		( (ClassPathXmlApplicationContext)(context) ).close();
				
	}

}
