import java.util.PriorityQueue;

public class TicketBookingSystem {
    public static void main(String[] args) {
        // Creating a priority queue for ticket bookings
        PriorityQueue<Ticket> ticketQueue = new PriorityQueue<>();

        // Adding sample ticket bookings
        ticketQueue.add(new Ticket("John", "Business Class"));
        ticketQueue.add(new Ticket("Emily", "First Class"));
        ticketQueue.add(new Ticket("David", "Economy Class"));
        ticketQueue.add(new Ticket("Sophia", "Business Class"));
        ticketQueue.add(new Ticket("Daniel", "Economy Class"));

        // Processing ticket bookings based on priority
        while (!ticketQueue.isEmpty()) {
            Ticket ticket = ticketQueue.poll();
            System.out.println("Processing ticket for passenger: " + ticket.getPassengerName()
                    + ", Class: " + ticket.getTicketClass());
        }
    }
}

class Ticket implements Comparable<Ticket> {
    private String passengerName;
    private String ticketClass;

    public Ticket(String passengerName, String ticketClass) {
        this.passengerName = passengerName;
        this.ticketClass = ticketClass;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        // Comparing tickets based on priority
        if (this.ticketClass.equals("First Class"))
            return -1;
        else if (otherTicket.ticketClass.equals("First Class"))
            return 1;
        else if (this.ticketClass.equals("Business Class"))
            return -1;
        else if (otherTicket.ticketClass.equals("Business Class"))
            return 1;
        else
            return 0;
    }
}


