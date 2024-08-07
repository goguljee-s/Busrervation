package Bus_Reservation;

import java.util.ArrayList;

public class Bus{
    private  int busId;
    private static int count=1;
    private  int[] capasity;
    private  boolean ac;
    public static ArrayList<Bus> buses=new ArrayList<>();
    public Bus(int busId,int[] capasity, boolean ac){
        this.busId=busId;
        this.capasity=capasity;
        this.ac=ac;
        initial();
    }
    public  void initial(){
        for (int i = 0; i <getCapasity() ; i++) {
            capasity[i]=0;
        }
    }
    public static void addBus( int capasity, boolean ac){
        int busId=count++;
        int[] arr=new int[capasity];
        buses.add(new Bus(busId,arr,ac));

    }
    public static void available_seat(int busId){
        System.out.println("-----------Available(A)--Booked(B)-------------");
        System.out.println();
        Bus b=buses.get(busId-1);
        for(int i=1;i<=b.capasity.length;i++){
           if(b.capasity[i-1]!=1){
               System.out.print(i+"->( )\t\t");
           }else{
               System.out.print(i+"->(B)\t\t");
           }
           if(i%4==0) {
               System.out.println();
           }
        }
    }
   public static boolean isSeatAvailable(int seatNo, int busNo){
        Bus bus= buses.get(busNo-1);
        return bus.capasity[seatNo]!=1;
   }
    public static boolean isAc(int busNo) {
        Bus bus=buses.get(busNo-1);
        return bus.ac;
    }
    public int getBusId() {
        return busId;
    }

    public  int getCapasity() {
        return capasity.length;
    }
   public  void setCapasity(int seatNo){
        capasity[seatNo]=0;
   }
    public  void setCapasity(int[] capa) {
        for (int i = 0; i < capa.length; i++) {
            capasity[capa[i]-1]=1;
        }
    }
    public static void displayBus(){
        System.out.println("----------Available Buses----------");
        for(Bus bus:buses){
            System.out.println("|Bus No : "+bus.getBusId()+" Capasity : "+bus.getCapasity()+" AC : "+bus.ac+"|");
        }
    }
}
