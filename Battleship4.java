import java.util.Scanner;

public class Battleship4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R][C];
        int ship = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) {
                    ship++;
                }
            }
        }
        int countFirstShip = 0;
        int countFailInside = 0;
        int countSameAreaShip = 0;
        int countSameArea = 0;
        int countOutsideShot = 0;
        int position_first = 0;
        int position_last = 0;
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= R && x > 0 && y > 0 && y <= C) {
                if (map[x - 1][y - 1] == 1) {
                    map[x - 1][y - 1] = -1;
                    countFirstShip++;
                    if (position_first == 0) {
                        position_first = i;
                    } else {
                        position_last = i;
                    }
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
        if (countFirstShip == ship) {
            System.out.println("attacker " + (position_last + 1));
        } else if (countFirstShip <= ship) {
            System.out.println("battleship " + (position_first + 1));
        } else {
            System.out.println("battleship -1");
        }
    }
}
