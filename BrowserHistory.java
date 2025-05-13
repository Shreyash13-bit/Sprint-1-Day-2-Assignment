import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Visit Site 2. Back 3. Current Page 4. Show History 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter URL: ");
                String url = sc.nextLine();
                history.push(url);
                System.out.println("Visited: " + url);
            } else if (choice == 2) {
                if (!history.isEmpty()) {
                    System.out.println("Going back from: " + history.pop());
                } else {
                    System.out.println("No history to go back.");
                }
            } else if (choice == 3) {
                if (!history.isEmpty()) {
                    System.out.println("Current page: " + history.peek());
                } else {
                    System.out.println("No page visited yet.");
                }
            } else if (choice == 4) {
                System.out.println("Browser History:");
                for (String url : history) {
                    System.out.println(url);
                }
            } else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}
