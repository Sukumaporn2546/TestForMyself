import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String text = sc.next();
        if(str.indexOf(text)==-1){
            System.out.println("string not found");
        }
        else{
            int index = -2;
            for(int i=0;i<str.length();i++){
                int num = str.indexOf(text,i);
                if(num !=index && num !=-1){
                    System.out.print(num+1+" ");
                    index = num;
                }
            }
        }
    }
}
