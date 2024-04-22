import java.util.Scanner;

public class IndexOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String text = sc.next();
        if(str.indexOf(text)==-1){
            System.out.println("string not found");
        }
        else{
            System.out.println(str.indexOf(text)+1);
        }
    }
}
