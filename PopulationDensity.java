import java.util.Scanner;

public class PopulationDensity {
    static long density(int npeople, double area){
        double ans = npeople/area;
        return Math.round(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int npeople = sc.nextInt();
        double area = sc.nextDouble();
        long d = density(npeople, area);
        System.out.println("population density is "+d);
    }
}
