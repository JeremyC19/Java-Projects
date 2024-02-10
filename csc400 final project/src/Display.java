import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

class Display {
    private final OrderQueue orderQueue;
    private final List<Order> ordersByName;
    private final List<Order> ordersByNumber;

    public Display(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
        ordersByName = new ArrayList<>();
        ordersByNumber = new ArrayList<>();
    }

    public void update() {
        Queue<Order> queue = orderQueue.getQueue();
        ordersByName.clear();
        ordersByNumber.clear();
        for (Order order : queue) {
            ordersByName.add(order);
            ordersByNumber.add(order);
        }
        ordersByName.sort(Comparator.comparing(Order::getLastName));
        ordersByNumber.sort(Comparator.comparing(Order::getOrderNumber));
    }

    public void display() {
        System.out.println("Orders by name:");
        System.out.printf("%-20s %-20s %-20s%n", "Last Name", "Order Number", "Total Cost");
        for (Order order : ordersByName) {
            System.out.printf("%-20s %-20d %-20.2f%n", order.getLastName(), order.getOrderNumber(), order.getTotalCost());
        }

        System.out.println("\nOrders by number:");
        System.out.printf("%-20s %-20s %-20s%n", "Order Number", "Last Name", "Total Cost");
        for (Order order : ordersByNumber) {
            System.out.printf("%-20d %-20s %-20.2f%n", order.getOrderNumber(), order.getLastName(), order.getTotalCost());
        }
    }
}