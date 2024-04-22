import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char text = sc.next().charAt(0);
        int start = 0;
        boolean target = false;
        boolean output = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == text) {
                target = true;
                if (start != i) {
                    System.out.println(str.substring(start, i));
                    output = true;
                }
                start = i + 1;
            } else if (i == str.length() - 1 && start != 0) {
                System.out.println(str.substring(start, str.length()));
                output = true;
            }
        }
        if (target == false) {
            System.out.println("no target character found");
        } else if (output == false) {
            System.out.println("no output");
        }
    }
}
