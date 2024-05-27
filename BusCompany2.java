import java.util.Scanner;
/* 
class Bus {
    public String id;
    public int type, seats, currentSeat = 0;
    boolean state = true;

    public Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    void printStats() {
        System.out.println(id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.println(this.currentSeat + " " + seats);
        System.out.println(state ? "Active" : "Inactive");
    }
*/
    boolean reserve(int seat) {
        if (seat + this.currentSeat <= this.seats && seat>=0 && state==true) {
            this.currentSeat += seat;
            return true;
        } else {
            return false;
        }
    }

    void sendToRepair() {
        this.state = false;
    }

    void backToService() {
        this.state = true;
    }
}

public class BusCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1)
                b.reserve(K);
            else if (P == 2)
                b.sendToRepair();
            else if (P == 3)
                b.backToService();
            b.printStats();
        }

    }
}
