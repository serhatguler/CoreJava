package miniproject.buscalculation;

import java.util.Scanner;

public class BusTicketCalculation {
        /*
        Project: app that calculates bus ticket price based on distance and conditions
    Distance from User (KM), age and trip type (One-Way OR  Round-trip (Going&Returning )
    Get seat number information.
    All buses should have a seat number in total "32".

    Take the payment as 1 USD / km per distance. (*2 for Round-trip trip)
    First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;

    Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
    Otherwise, "You Have Entered Wrong Data!" or Any warning should be given.

    1- If the person has chosen the "Journey Type" Round-trip trip, 20% discount is applied on the ticket price.


    2- Single Seat Fee:
    If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.


    3- Age discount:
    If the person is younger than 12 years old, 50% discount is applied on the ticket price.
    If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
    If the person is over 65 years old, a 30% discount is applied on the ticket price.
       */

    public static void main(String[] args) {
        //Create a bus object
        Bus bus = new Bus("Istanbul 123");


        // create a ticket object

        Ticket ticket = new Ticket();
        start(bus,ticket);


    }

    // Create a method to get input from user
     public static void start(Bus bus, Ticket ticket){
         Scanner scan = new Scanner(System.in);
         int select;

         do {
             System.out.println("---Welcome to our ticket reservation Desk system--- ");
             System.out.println("Enter the distance you want to travel");
             double distance = scan.nextDouble();
             System.out.println("Enter the type of journey");
             System.out.println("1- One Way \n 2- Round Trip");
             int type = scan.nextInt();

             System.out.println("Enter your age");
             int age = scan.nextInt();
             System.out.println("Choose your seat");
             System.out.println("Single seat is 20% more expensive than others");
             System.out.println(bus.seats);
             int seat = scan.nextInt();

             // remove the reversed seat from the bus list
             bus.seats.remove(String.valueOf(seat));

             //check if the values are valid or not -> journey type, distance, age

            boolean check = type == 1 || type == 2;

            if (distance>0 && age>0 && check){
                //calculate the price
                ticket.price = calculatePrice(ticket , age);
                ticket.distance = distance;
                ticket.journeyType = type;
                ticket.seatNumber = seat;
                ticket.printTicket(bus);



            }else{
                System.out.println("You Have Entered Wrong Data!");
            }
            // option to restart or quit
             System.out.println("Enter any number to start or press 0 to quit");
             select = scan.nextInt();


         }while (select!=0);

    }

    // Create a method top calculate ticket price

    public static double calculatePrice(Ticket ticket, int age){
        double dist = ticket.distance;
        int type = ticket.journeyType;
        int seat = ticket.seatNumber;

        double total = 0;

        switch (type){
            case 1:
                if(seat%3==0){ // for single seat ->>>>> ONE WAY
                    total = dist*1.2;

                }else{ // for other seats
                    total = dist*1;
                }
                System.out.println("Total Price is: "+ total);
                break;
            case 2: // OTHER SEATS             ->>>>>>>> ROUND TRIP
                if(seat%3==0){
                    total = dist*2.4;

                }else{
                    total = dist*2;
                }
                total = total*0.8;
                System.out.println("Total Price is: "+ total);
                break;
        }
        // AGE DISCOUNT
        
        if (age>0 && age<12){
            total = total*0.5;
            System.out.println("Total Price after age discount: "+ total);

        } else if (age>=12 && age <=24) {
            total = total*0.9;
            System.out.println("Total Price after age discount: "+ total);
            
        } else if (age>=65 && age<=120) {
            total = total*0.7;
            System.out.println("Total Price after age discount: "+ total);

        }
        return total;

    }












}
