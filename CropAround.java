/*
FILE: java
*/
/*
LANG: JAVA
COMPILER: JAVA
*/
import java.util.Scanner;

public class CropAround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int [][] arr = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int targetR = sc.nextInt();
        int targetC = sc.nextInt();
        int Rnum = sc.nextInt();
        int Cnum = sc.nextInt();

        int startR = targetR-Rnum/2;
        if(targetR-Rnum/2 < 0){
            startR = 0;
        }
        int endR = targetR+Rnum/2;
        if(targetR+Rnum/2 >= R){
            endR = R-1;
        }
        int startC = targetC-Cnum/2;
        if(targetC-Rnum/2 < 0){
            startC = 0;
        }
        int endC = targetC+Cnum/2;
        if(targetC+Cnum/2 >= C){
            endC = C-1;
        }

        if(targetR < 0 || targetC < 0 || targetC >= C || targetR >= R){
            System.out.println("invalid");
        } else {
            for(int i=startR;i<=endR;i++){
                for(int j=startC;j<=endC;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
