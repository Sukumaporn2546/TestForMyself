import java.util.Scanner;

public class Auction2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] startPrice = new int[N];
        for (int i = 0; i < N; i++) {
            startPrice[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int[] auctionPrice = new int[N];
        int[] countRound = new int[N];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                auctionPrice[j] = sc.nextInt();
                if (auctionPrice[j] > startPrice[j] && countRound[j] < 3) {
                    startPrice[j] = auctionPrice[j];
                    countRound[j] = 0;
                } else {
                    countRound[j]++;
                }

            }
            for (int l = 0; l < N; l++) {
                System.out.print(startPrice[l] + " ");
            }

            System.out.println();

        }
    }
}
