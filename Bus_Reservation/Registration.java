package Bus_Reservation;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Bus.addBus(40,false);
        Bus.addBus(50,false);
        Bus.addBus(50,true);
        System.out.println("Welcome Jee Bus transport and Travels");
        Scanner scanner=new Scanner(System.in);
        while (true) {
        System.out.print("Select Below Options for further process" +
                "\n1.Booking" +
                "\n2.View ticktet" +
                "\n3.Cancel ticket" +
                "\n4.Exit");
        System.out.println();
        int ch=scanner.nextInt();
        boolean flag=true;

           switch (ch) {
               case 1:
                   Booking.BookingSeat();
                   break;
               case 2: {
                   System.out.print("Enter your ticket ID");
                   int id = scanner.nextInt();
                   Booking.viewTicket(id);
                   break;
               }
               case 3: {
                   System.out.print("Enter your ticket ID");
                   int id = scanner.nextInt();
                   Booking.cancelTicket(id);
               }
               default:
                   System.out.println("Enter the valid option 1, 2, or 3");
                   break;
           }
       }

    }
}
