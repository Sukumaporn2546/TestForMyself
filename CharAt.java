import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = sc.nextInt();
        if(index<=0 || index>str.length()){
            System.out.println("invalid position");
        }
        else{
            System.out.println(str.charAt(index-1));
        }
    }
}
