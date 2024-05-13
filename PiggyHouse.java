import java.util.Scanner;
class House{
    public int width;
    public int length;
    public int amountPig = 0;
    public House(int width, int length){
        this.width = width;
        this.length = length;
    }
    public void printPiggies(){
        System.out.println("Piggies "+ amountPig+", Space "+(9*amountPig));
    }
    public static void encourage(){
        System.out.println("Piggy Together STRONG!");
    }
}
public class PiggyHouse {
    public static void main(String[] args) {
    House.encourage();
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        House H = new House(w, l);
        while(true){
            int K = sc.nextInt();
            int areaHouse = w*l;
            if(9*(K+H.amountPig)<=areaHouse){
                H.amountPig +=K;
                H.printPiggies();
            }else{
                System.out.println("no space, need a new house");
                break;
            }
        }
    }
}
