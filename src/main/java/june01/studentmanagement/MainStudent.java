package june01.studentmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("studentbeans.xml");
        Student student = (Student) context.getBean("4");
        System.out.println(student);

    }
}
