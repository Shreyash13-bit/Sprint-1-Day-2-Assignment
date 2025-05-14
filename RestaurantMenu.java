import java.util.*;
class MenuItem {
    String name;
    String description;
    double price;
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return name + " - " + description + " ($" + price + ")";
    }
}

public class RestaurantMenu {
    public static void main(String[] args) {
        LinkedHashMap<String, HashMap<String, MenuItem>> menu = new LinkedHashMap<>();
        menu.put("Appetizer", new HashMap<>());
        menu.put("Main Course", new HashMap<>());
        menu.put("Dessert", new HashMap<>());
        addMenuItem(menu, "Appetizer", new MenuItem("Spring Rolls", "Crispy veggie rolls", 5.99));
        addMenuItem(menu, "Main Course", new MenuItem("Grilled Chicken", "Served with rice", 12.99));
        addMenuItem(menu, "Dessert", new MenuItem("Ice Cream", "Vanilla flavor", 3.99));
        updateMenuItem(menu, "Dessert", new MenuItem("Ice Cream", "Chocolate flavor", 4.50));
        removeMenuItem(menu, "Appetizer", "Spring Rolls");
        displayMenu(menu);
    }
    public static void addMenuItem(LinkedHashMap<String, HashMap<String, MenuItem>> menu,
                                   String category, MenuItem item) {
        if (menu.containsKey(category)) {
            menu.get(category).put(item.name, item);
        }
    }
    public static void removeMenuItem(LinkedHashMap<String, HashMap<String, MenuItem>> menu,
                                      String category, String itemName) {
        if (menu.containsKey(category)) {
            menu.get(category).remove(itemName);
        }
    }
    public static void updateMenuItem(LinkedHashMap<String, HashMap<String, MenuItem>> menu,
                                      String category, MenuItem newItem) {
        if (menu.containsKey(category)) {
            menu.get(category).put(newItem.name, newItem);
        }
    }
    public static void displayMenu(LinkedHashMap<String, HashMap<String, MenuItem>> menu) {
        System.out.println("----- Restaurant Menu -----");
        for (Map.Entry<String, HashMap<String, MenuItem>> categoryEntry : menu.entrySet()) {
            System.out.println("\n" + categoryEntry.getKey() + ":");
            for (MenuItem item : categoryEntry.getValue().values()) {
                System.out.println("  " + item);
            }
        }
    }
}
