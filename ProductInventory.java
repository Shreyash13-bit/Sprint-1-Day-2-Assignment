import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add 2. Update 3. Remove 4. Check Stock 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            if (choice == 1) {
                System.out.print("Product name: ");
                String name = sc.nextLine();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                inventory.put(name, qty);
                System.out.println("Product added.");
            } else if (choice == 2) {
                System.out.print("Product name: ");
                String name = sc.nextLine();
                if (inventory.containsKey(name)) {
                    System.out.print("New quantity: ");
                    int qty = sc.nextInt();
                    inventory.put(name, qty);
                    System.out.println("Quantity updated.");
                } else {
                    System.out.println("Product not found.");
                }
            } else if (choice == 3) {
                System.out.print("Product name to remove: ");
                String name = sc.nextLine();
                inventory.remove(name);
                System.out.println("Product removed.");
            } else if (choice == 4) {
                System.out.print("Product to check: ");
                String name = sc.nextLine();
                if (inventory.containsKey(name)) {
                    System.out.println("In stock: " + inventory.get(name));
                } else {
                    System.out.println("Not in stock.");
                }
            } else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}
