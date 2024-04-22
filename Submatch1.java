import java.util.Scanner;

public class Submatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String text = sc.next();
        for(int i=0;i<3;i++){
            int num = str.indexOf(text.substring(i, i+3));
            if(num<0){
                System.out.println("No");
            }
            else{
                System.out.println(num+1);
            }
        }
    }
}
