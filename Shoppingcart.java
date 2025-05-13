import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Item  2. Remove Item  3. View Cart  4. Total Price  5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                cart.add(new Item(name, price));
                System.out.println("Item added.");
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = sc.nextLine();
                cart.removeIf(item -> item.name.equalsIgnoreCase(name));
                System.out.println("Item removed.");
            } else if (choice == 3) {
                System.out.println("Cart Items:");
                for (Item item : cart) {
                    System.out.println(item.name + " - $" + item.price);
                }
            } else if (choice == 4) {
                double total = 0;
                for (Item item : cart) {
                    total += item.price;
                }
                System.out.println("Total Price: $" + total);
            } else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}
