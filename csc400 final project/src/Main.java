import java.util.*;

public class Main {
    private final OrderQueue orderQueue;
    private final Display display;

    public Main() {
        orderQueue = new OrderQueue();
        display = new Display(orderQueue);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("1. Add order");
            System.out.println("2. Remove order by last name");
            System.out.println("3. Remove order by order number");
            System.out.println("4. Display orders");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": {
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter order number: ");
                    int orderNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter total cost: ");
                    double totalCost = Double.parseDouble(scanner.nextLine());
                    Order order = new Order(lastName, orderNumber, totalCost);
                    orderQueue.addOrder(order);
                    display.update();
                    break;
                }
                case "2": {
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    boolean removed = orderQueue.removeOrderByLastName(lastName);
                    if (removed) {
                        System.out.println("Removed an order with last name: " + lastName);
                        display.update();
                    } else {
                        System.out.println("No such last name found.");
                    }
                    break;
                }
                case "3": {
                    System.out.print("Enter the Order Number: ");
                    int orderNumber = Integer.parseInt(scanner.nextLine());
                    boolean removed = orderQueue.removeOrderByOrderNumber(orderNumber);
                    if (removed) {
                        System.out.println("Removed an order with Order Number: " + orderNumber);
                        display.update();
                    } else {
                        System.out.println("No such Order Number found.");
                    }
                    break;
                }
                case "4":
                    display.display();
                    break;
                case "5":
                    break label;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
