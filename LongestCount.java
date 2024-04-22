import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(;;){
            String str = sc.nextLine();
            int LongestString = str.length();
            if(str.length()<=0){
                break;
            }
            if(LongestString==max){
                count++;
            }
            if(LongestString>max){
                max = LongestString;
                count = 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
