public class BagDemo {
    public static void testAdd() {
        ShoppingCart<String> cart = new ShoppingCart<>();

        cart.add("Beef");
        cart.add("Milk");
        cart.add("Bread");
        cart.add("Soup");

        cart.displayBag();
    }

    public static void main(String[] args) {
        testAdd();
    }
}
