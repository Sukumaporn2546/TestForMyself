import java.util.Scanner;

public class Battleship2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R][C];
        int countShot = 0;
        int countOutsideShot = 0;
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= R && x > 0 && y > 0 && y <= C) {
                countShot++;
            } else {
                countOutsideShot++;
            }
        }
        System.out.println(countShot);
        System.out.println(countOutsideShot);
    }
}
