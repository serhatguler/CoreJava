package miniproject.buscalculation;

public class Ticket {
    // distance, journey type, seat number,price
    public double distance;
    public int journeyType;
    public int seatNumber;
    public double price;


    //to print these values on the ticket

    public void printTicket(Bus bus){
        System.out.println("---Ticket details---");
        System.out.println("The bus number is: "+ bus.busNum);
        System.out.println("Distance: "+ this.distance);
        System.out.println("Type of Journey"+ (this.journeyType == 1 ? "One way" : "Round Trip"));
        System.out.println("Your seat no: "+ this.seatNumber);
        System.out.println("Total price is: "+ this.price);
        System.out.println("Have a nice trip! ");
    }















}
