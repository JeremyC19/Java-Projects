import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class OrderQueue {
    private final Queue<Order> queue;

    public OrderQueue() {
        queue = new LinkedList<>();
    }

    public void addOrder(Order order) {
        queue.add(order);
    }

    public Queue<Order> getQueue() {
        return queue;
    }

    public boolean removeOrderByLastName(String lastName) {
        Iterator<Order> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getLastName().equals(lastName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeOrderByOrderNumber(int orderNumber) {
        Iterator<Order> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderNumber() == orderNumber) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}