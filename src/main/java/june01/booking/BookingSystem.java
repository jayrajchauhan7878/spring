package june01.booking;

public class BookingSystem {


    private ITransportBooking busBooking;
    private ITransportBooking trainBooking;
    private String type;

    public BookingSystem(ITransportBooking busBooking , ITransportBooking trainBooking) {

        this.busBooking = busBooking;
        this.trainBooking = trainBooking;
        this.type = "Standar Booking";
    }

    public void bookTransport(String transportType){

        System.out.println(type);
        if("bus".equals(transportType)){
            busBooking.book();
        }else if("train".equals(transportType)){
            trainBooking.book();
        }else{
            System.out.println("Invalid Transport");
        }
    }
}
