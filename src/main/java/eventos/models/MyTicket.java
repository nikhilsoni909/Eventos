package eventos.models;
import java.sql.Timestamp;
import java.util.Comparator;
import java.util.Objects;
public class MyTicket {
    private int ticketId;
    private String eventName;
    private Timestamp date;
    private String city;
    private String seatCategory;
    private int numberOfSeats;
    private Timestamp bookingDate;

    // Constructors
    public MyTicket() {
    }

    public MyTicket(int ticketId, String eventName, Timestamp date, String city, String seatCategory, int numberOfSeats, Timestamp bookingDate) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.date = date;
        this.city = city;
        this.seatCategory = seatCategory;
        this.numberOfSeats = numberOfSeats;
        this.bookingDate = bookingDate;
    }

    // Getters and Setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Timestamp getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Timestamp bookingDate) {
        this.bookingDate = bookingDate;
    }
    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTicket myTicket = (MyTicket) o;
        return ticketId == myTicket.ticketId &&
                numberOfSeats == myTicket.numberOfSeats &&
                Objects.equals(eventName, myTicket.eventName) &&
                Objects.equals(date, myTicket.date) &&
                Objects.equals(city, myTicket.city) &&
                Objects.equals(seatCategory, myTicket.seatCategory) &&
                Objects.equals(bookingDate, myTicket.bookingDate);
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(ticketId, eventName, date, city, seatCategory, numberOfSeats, bookingDate);
    }
    // toString() method
    @Override
    public String toString() {
        return "MyTickets{" +
                "ticketId=" + ticketId +
                ", eventName='" + eventName + '\'' +
                ", date=" + date +
                ", city='" + city + '\'' +
                ", seatCategory='" + seatCategory + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", bookingDate=" + bookingDate +
                '}';
    }

    // Comparator implementation
    public static Comparator<MyTicket> myTicketsComparator = new Comparator<MyTicket>() {
        @Override
        public int compare(MyTicket t1, MyTicket t2) {
            return t1.getBookingDate().compareTo(t2.getBookingDate());
        }
    };
}