import java.util.Scanner;

class LectRoom {
    public int classCode, capacity;
    public String name;
    public int currentSeats;

    public LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        this.currentSeats = 0;
    }

    public boolean reserveSeats(int seat) {
        if (seat + this.currentSeats <= this.capacity) {
            this.currentSeats += seat;
            return true;
        } else {
            return false;
        }
    }
}

public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        LectRoom[] lectroom = new LectRoom[K];
        for (int i = 0; i < K; i++) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            lectroom[i] = new LectRoom(classCode, name, capacity);
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int codeR = sc.nextInt();
            int seat = sc.nextInt();
            boolean isFound = false;
            for (int j = 0; j < K; j++) {
                if (codeR == lectroom[j].classCode) {
                    boolean c = lectroom[j].reserveSeats(seat);
                    if (c) {
                        System.out.println(lectroom[j].name);
                        isFound = true;
                        break;
                    }
                }
            }
            if (!isFound) {
                System.out.println("sorry");
            }
        }
    }
}
