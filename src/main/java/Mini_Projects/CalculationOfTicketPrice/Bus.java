package Mini_Projects.CalculationOfTicketPrice;

import java.util.ArrayList;
import java.util.List;

public class Bus {


    public String numberPlate;//34 BT 78

    //To store seats create List or Array
    public List<String> seats = new ArrayList<>();//1-33



    public Bus(String numberPlate, List<String > seats) {//shotcut: alt+ins == give us options to create contructor
        this.numberPlate = numberPlate;
        this.seats=seats;


    }
}
