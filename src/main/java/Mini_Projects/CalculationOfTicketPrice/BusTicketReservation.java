package Mini_Projects.CalculationOfTicketPrice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusTicketReservation {


    /*
    Project: Application that calculates bus ticket price according to distance and conditions.
             Get Distance (KM), age and travel type (One Way, Round-Round) and seat number from the user.
             Take the fare as 1 TL / km per distance. (*2 for round trip)
             First, calculate the total price of the trip and then apply the following rules to the customer ticket according to the conditions;

         Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
         Otherwise, A warning, "You Have Entered invalid data", should be given.

        1- If the person has chosen the "Journey Type" as round trip, 20% discount is applied on the ticket price.

        2- Age discount:
           If the person is younger than 12 years old, 50% discount is applied on the ticket price.
           If the person is between the ages of 12-24,  10% discount is applied on the ticket price.
           If the person is over 65 years old, 30% discount is applied on the ticket price.

        3-Single Seat Fee:
           If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.
     */
    public static void main(String[] args) {

        List<String > seatsNo = new ArrayList<>();
        for (int i = 1; i <33; i++){
            seatsNo.add(String.valueOf(i));
        }

        Ticket ticket = new Ticket();// I created an object from Ticket class and it provides me same data that Ticket class have.
        Bus bus =new Bus("34 BT 78",seatsNo);

        start(ticket,bus);


    }


    public static void start(Ticket ticket, Bus bus){

        Scanner scan = new Scanner(System.in);
        int select=1;

        do {

            System.out.println("Welcome to Ticket Reservation Operations ");
            System.out.print("Please enter distance (km): ");
            ticket.distance = scan.nextInt();
            System.out.println("choose travel type: ");
            System.out.println("1- One Way \n 2- Round Trip");
            ticket.typeNo= scan.nextInt();
            System.out.print("Please enter your age: ");
            int age = scan.nextInt();
            System.out.println("Choose seat number: ");
            System.out.println("Single seat is charged %20 more ");
            System.out.println(bus.seats);
            ticket.seatNo=scan.nextInt();
            // we removed the seat that user have chosen.
            bus.seats.remove(String.valueOf(ticket.seatNo));

            boolean check = (ticket.typeNo==1|| ticket.typeNo==2) && ticket.distance>0 && age>0 ;
            if (check){
             ticket.price=getTotalPrice(ticket,age);
             ticket.printTicket(bus);
            }else {
                System.out.println("Invalid chosen...");
            }
            System.out.println("yeni islem icin 1 cikis icin 0 giriniz");
            select=scan.nextInt();


        }while (select!=0);
        System.out.println("Have a good day...");


    }

    public static double getTotalPrice(Ticket ticket, int age ){

        int dist = ticket.distance;
        int type = ticket.typeNo;
        int seatNo = ticket.seatNo;
        double total =0;
        switch (type){//one way
            case 1:
                if(seatNo%3==0){
                    total=dist*1.20;

                }else {
                    total=dist;
                }
                System.out.println("Tutar: " +total);
                break;
            case 2://round way
                if (seatNo%3==0){
                    total=dist*2.4;
                }else {
                    total=dist*2;
                }
                System.out.println("Total: "+total);
                total=total*0.8;
        }
        if (age<=12){

            total=total/2;
            System.out.println("reduced price for age");

        }else if (age>12&&age<24){
            total=total*0.9;

        } else if (age>65) {
            total=total*0.7;
        }

        return total;


    }






}
