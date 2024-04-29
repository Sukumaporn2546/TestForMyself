import java.util.Scanner;

public class Battleship3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int countFirstShip = 0;
        int countFailInside = 0;
        int countSameAreaShip = 0;
        int countSameArea = 0;
        int countOutsideShot = 0;
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= R && x > 0 && y > 0 && y <= C) {
                if (map[x - 1][y - 1] == 1) {
                    map[x - 1][y - 1] = -1;
                    countFirstShip++;
                } else if (map[x - 1][y - 1] == -1) {
                    countSameAreaShip++;
                } else if (map[x - 1][y - 1] == 0) {
                    map[x - 1][y - 1] = -2;
                    countFailInside++;
                } else {
                    countSameArea++;
                }
            } else {
                countOutsideShot++;
            }
        }
        System.out.println(countFirstShip);
        System.out.println(countFailInside);
        System.out.println(countSameAreaShip);
        System.out.println(countSameArea);
        System.out.println(countOutsideShot);
    }
}
