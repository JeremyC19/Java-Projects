class Order {
    private final String lastName;
    private final int orderNumber;
    private final double totalCost;

    public Order(String lastName, int orderNumber, double totalCost) {
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.totalCost = totalCost;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getTotalCost() {
        return totalCost;
    }
}