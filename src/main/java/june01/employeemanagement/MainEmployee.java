package june01.employeemanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("employeebeans.xml");
        Employee employee = (Employee) context.getBean("employee2");
        System.out.println(employee);
    }
}
