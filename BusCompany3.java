import java.util.Scanner;

class Bus {
    public String id;
    public int type;
    private int seats, currentSeat;
    private boolean state = true;

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

    boolean reserve(int K) {
        if (K + currentSeat <= seats && K > 0 &&   state ) {
            this.currentSeat += K;
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

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Bus[] b = new Bus[Q];
        for (int i = 0; i < Q; i++) {
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            b[i] = new Bus(id, type, seats);
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            if (P == 1){
                boolean check = false;
                for(int j =0;j<Q;j++){
                    if(b[j].type == T){
                        if(b[j].reserve(K)){
                            check = true;
                            System.out.println(b[j].id);
                            break;
                        }
                    }
                }
                if(!check){
                    System.out.println("sorry");
                }
            }
            else if (P == 2){
                b[T-1].sendToRepair();
            }
            else {
                b[T-1].backToService();
            }
        }
    }
}
