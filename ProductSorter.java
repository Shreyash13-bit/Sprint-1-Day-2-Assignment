import java.util.*;
class Product {
    String name;
    String category;
    double price;
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String toString() {
        return String.format("%-15s %-15s $%.2f", name, category, price);
    }
}
public class ProductSorter {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 800));
        products.add(new Product("TV", "Electronics", 600));
        products.add(new Product("Banana", "Grocery", 1.2));
        products.add(new Product("Apple", "Grocery", 0.8));
        products.add(new Product("Shampoo", "Personal Care", 4.5));
        products.add(new Product("Toothpaste", "Personal Care", 2.5));
        products.sort(Comparator.comparing((Product p) -> p.category)
                                .thenComparing(p -> p.price));
        System.out.println("Sorted Product List:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
 
