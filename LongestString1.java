import java.util.Scanner;

public class LongestString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            String str = sc.nextLine();
            int LongestString = str.length();
            if(LongestString>max){
                max = LongestString;
            }
        }
        System.out.println(max);
    }
}
