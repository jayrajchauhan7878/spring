package june01.booking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainITransportBooking {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bookingbeans.xml");

        BookingSystem bookingsystem = (BookingSystem) context.getBean("bookingSystem");

        bookingsystem.bookTransport("bus");
        bookingsystem.bookTransport("train");







    }
}
