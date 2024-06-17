package june01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainIBooking {


    public static void main(String[] args) {


        //Samsung s24 = new Samsung(new Cineplex());
        //s24.bookMovie();


        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Samsung s24 = context.getBean(Samsung.class);

        s24.bookMovie();
    }
}
