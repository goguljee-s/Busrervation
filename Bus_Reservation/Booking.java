package Bus_Reservation;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
public class Booking {
    private String name;
    private int seatCount;
    private int[] seatNo;
    private  int busNo;
    private int ticketId;
    static Map<Integer,Booking> b=new HashMap<>();
    public Booking(String name,int[] seatNo,int busNo,int ticketId,int seatCount) {
        this.name = name;
        this.seatNo = seatNo;
        this.busNo = busNo;
        this.ticketId =ticketId ;
        this.seatCount=seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public int getBusNo(){
        return busNo;
   }
    public static void BookingSeat(){
        Bus.displayBus();
        int ticketId=1000+(int)(Math.random()*9000);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=sc.nextLine();
        System.out.print("\nEnter the number of seat to book : ");
        int seatCount=sc.nextInt();
        System.out.print("\nEnter the Bus No from above list : ");
        int busNo= sc.nextInt();
        Bus.available_seat(busNo);
        System.out.println();
            int[] seats = new int[seatCount];
            for(int i=0;i<seatCount;i++){
                System.out.println("Seat "+(i+1));
                int seatNo=sc.nextInt();
                if(Bus.isSeatAvailable(seatNo,busNo)){
                    seats[i]=seatNo;
                }else{
                    System.out.print("The seat is not available");
                }
            }
            Bus bus=Bus.buses.get(busNo-1);
            bus.setCapasity(seats);
            b.put(ticketId,new Booking(name, seats, busNo, ticketId,seatCount));
            Booking booking=b.get(ticketId);
            System.out.println("Your ticket booked succefully");
            Booking.viewTicket(ticketId);
    }
    public  static void cancelTicket(int ticketId){
        Booking book=b.get(ticketId);
        Bus bus=Bus.buses.get(book.getBusNo()-1);
            for(int i=0;i< book.seatCount;i++) {
                bus.setCapasity(book.seatNo[i]);
            }
        b.remove(ticketId);
        book=null;
    }

    public int getSeatNo(int ticketId) {
        Booking booking=b.get(ticketId);
        return booking.seatNo.length;
    }

    public String getName() {
        return name;
    }
    public static void viewTicket(int ticketId) {
        Booking booking = b.get(ticketId);
        System.out.println("Your Ticket Id : "+ticketId);
        if (booking != null) {
            System.out.print("Name " + booking.getName() + "\nBus Number " + booking.getBusNo() + "\nSeats " + booking.getSeatNo(ticketId));
        }else{
            System.out.print("No ticket Found");
        }
    }
}
