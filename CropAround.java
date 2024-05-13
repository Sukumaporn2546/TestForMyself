import java.util.Scanner;

public class CropAround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j =0;j<C;j++){
                arr[i][j] = sc.nextInt();
            }
        }
            int x = sc.nextInt();
            int y = sc.nextInt();
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(x<0 || x>R || y<0 || y>C){
                System.out.println("invalid");
            }
            else{
                
            }
    }
}
