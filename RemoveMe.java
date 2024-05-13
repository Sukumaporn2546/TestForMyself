import java.util.Scanner;

public class RemoveMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        String text = "";
        for (int i = 0; i < N; i++) {
            int option = sc.nextInt();
            String word = sc.next();
            if (option == 1) {
                int index = str.indexOf(word);
                if (index >= 0) {
                    String front = str.substring(0, index);
                    System.out.println(front);
                    String back = str.substring(index + word.length());
                    str = front + back;
                    System.out.println(str);
                } else {
                    System.out.println(str);
                }
            } else if (option == 2) {
                int lastIndex = str.lastIndexOf(word);
                if (lastIndex >= 0) {
                    String front = str.substring(0, lastIndex);
                    String back = str.substring(lastIndex + word.length());
                    str = front + back;
                    System.out.println(str);
                } else {
                    System.out.println(str);
                }
            }
        }
    }
}
