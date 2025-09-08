class MovieTicket {
    String movieName;
    String seatNumber;
    double price;


    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0;
    }


    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }


    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");
        ticket.bookTicket("A10", 12.50);
        ticket.displayTicket();
    }
}
