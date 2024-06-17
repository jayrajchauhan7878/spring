package june01.booking;

public class TrainBooking implements ITransportBooking {

    @Override
    public void book() {

        System.out.println("Book Train");
    }
}
