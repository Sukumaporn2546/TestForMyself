import java.util.Scanner;

class FoodOrder {
    public String name;
    public int foodTotal = 0;
    public int grandTotal = 0;

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
        } else {
            System.out.println(deliCost);
        }
        this.grandTotal = foodTotal + deliCost;
        System.out.println(grandTotal);
    }

    public void distribIncome() {
        if (grandTotal <= 200) {
            System.out.println("Rider: " + 20);
            int grabpanda = (foodTotal * 3) / 10;
            System.out.println("GrabPanda: " + grabpanda);
            System.out.println("Food Seller: " + (grandTotal - 20 - grabpanda));
        } else {
            System.out.println("Rider: " + 30);
            int grabpanda = (foodTotal * 3) / 10;
            System.out.println("GrabPanda: " + grabpanda);
            System.out.println("Food Seller: " + (grandTotal - 30 - grabpanda));
        }
    }

}

public class GrabPanda2 {
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
        order.distribIncome();
    }
}
