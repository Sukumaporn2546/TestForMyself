import java.util.Scanner;
/* 
class Bus {
    public String id;
    public int type, seats, currentSeat=0;
    boolean state = true;
    public Bus(String id, int type, int seats){
        this.id = id;
        this.type = type;
        this.seats = seats;
    }
    void printStats(){
        System.out.println(id);
        if(type==1){
            System.out.println("Fan");
        }else if(type==2){
            System.out.println("P1");
        }else{
            System.out.println("VIP");
        }
        System.out.println(currentSeat+" "+seats);
        System.out.println(state?"Active":"Inactive");
    }
}
*/
public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}
