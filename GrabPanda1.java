import java.util.Scanner;

class FoodOrder {
    public String name;
    public int foodTotal = 0;

    public FoodOrder(String name) {
        this.name = name;
    }

    public void addFood(int price) {
        this.foodTotal += price;
    }

    public void finalizeReceipt() {
        System.out.println(name);
        System.out.println(foodTotal);
        int deliCost = 0;
        if (foodTotal <= 50) {
            deliCost = 20;
            System.out.println(deliCost);
        } else if (foodTotal > 50 && foodTotal <= 150) {
            deliCost = 10;
            System.out.println(deliCost);
        }else{
            System.out.println(deliCost);
        }
        System.out.println(foodTotal+deliCost);
    }
}

public class GrabPanda1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        FoodOrder order = new FoodOrder(name);
        for (int i = 0; i < N; i++) {
            int price = scan.nextInt();
            order.addFood(price);
        }
        order.finalizeReceipt();
    }
}
