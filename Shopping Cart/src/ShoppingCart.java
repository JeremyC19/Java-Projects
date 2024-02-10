import java.util.Arrays;

public class ShoppingCart<MyType> {
    private MyType[] myBag;
    private int numberOfProducts;
    private static final int DEFAULT_CAPACITY = 10;

    public ShoppingCart() {
        myBag = (MyType[]) new Object[DEFAULT_CAPACITY];
        numberOfProducts = 0;
    }

    public void add(MyType newEntry) {
        checkCapacity();
        myBag[numberOfProducts] = newEntry;
        numberOfProducts++;
    }

    private void checkCapacity() {
        if (isFull()) {
            int newCapacity = myBag.length * 2;
            myBag = Arrays.copyOf(myBag, newCapacity);
        }
    }

    public MyType[] toArray() {
        return Arrays.copyOf(myBag, numberOfProducts);
    }

    public boolean isFull() {
        return numberOfProducts >= myBag.length;
    }

    public void displayBag() {
        System.out.println("Contents of the Bag:");
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(myBag[i]);
        }
    }

    public static void main(String[] args) {
        BagDemo.testAdd();
    }
}
