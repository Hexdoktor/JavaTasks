public class TicketSystem {
    private int availableSeats;

    public TicketSystem(int seats){
        this.availableSeats = seats;
    }

    public synchronized boolean reserve(int seatsRequested){
        if(seatsRequested > availableSeats){
            return false;
        }else{
            availableSeats -= seatsRequested;
            return true;
        }
    }
}
