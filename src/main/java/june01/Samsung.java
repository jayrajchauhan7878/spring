package june01;

public class Samsung {


    IBooking booking;

    String model;


    public Samsung(){

        booking = new Cineplex();
        model = "S24 Ultra";


    }

    public void bookMovie(){

        System.out.println(model);

        booking.book();


    }
}
