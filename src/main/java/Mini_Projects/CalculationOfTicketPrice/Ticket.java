package Mini_Projects.CalculationOfTicketPrice;

public class Ticket {


    //the ticket have information which are defined  below

    public int distance;

    public int typeNo;

    public int seatNo;

    public double price;



    public void printTicket(Bus bus){

        System.out.println("Ticket price: "+price);
        System.out.println("---Ticket Detail---");
        System.out.println("Bus Plate: "+bus.numberPlate);
        System.out.println("Distance: "+distance);
        System.out.println("Travel type "+ (typeNo==1? "One Way" : "Round trip"));
        System.out.println("Koltuk no: "+seatNo);
        System.out.println("Enjoy your journey...");


    }


}
