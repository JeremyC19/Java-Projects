import java.util.Scanner;

class KnapsackItem {
    int size;
    int value;

    KnapsackItem(int size, int value) {
        this.size = size;
        this.value = value;
    }
}

class Knapsack {
    int capacity;
    int value;
}

public class KnapsackProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        KnapsackItem[] itemList = new KnapsackItem[n];

        System.out.println("Enter the size and value of each item:");

        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " - Size: ");
            int size = scanner.nextInt();
            System.out.print("Item " + (i + 1) + " - Value: ");
            int value = scanner.nextInt();
            itemList[i] = new KnapsackItem(size, value);
        }

        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        Knapsack knapsack = new Knapsack();
        knapsack.capacity = capacity;

        Knapsack result = maxKnapsack(itemList, knapsack, itemList.length - 1);
        System.out.println("Maximum value: " + result.value);

        scanner.close();
    }

    public static Knapsack maxKnapsack(KnapsackItem[] itemList, Knapsack ks, int index) {
        // Base condition
        if (index == -1 || ks.capacity <= 0)
            return ks;

        // If size of item exceeds capacity of Knapsack, move to the next item
        if (itemList[index].size > ks.capacity)
            return maxKnapsack(itemList, ks, index - 1);

        // Value having ignored the item (wk_1)
        Knapsack wk_1 = maxKnapsack(itemList, ks, index - 1);

        // Value after adding item to knapsack (wk_2)
        Knapsack updatedKnapsack = additem(ks, itemList[index]);
        Knapsack wk_2 = maxKnapsack(itemList, updatedKnapsack, index - 1);

        // Compare value of both knapsacks and return the one with greater value
        if (Value(wk_1) >= Value(wk_2))
            return wk_1;
        else
            return wk_2;
    }

    public static Knapsack additem(Knapsack ks, KnapsackItem item) {
        Knapsack updatedKnapsack = new Knapsack();
        updatedKnapsack.capacity = ks.capacity - item.size;
        updatedKnapsack.value = ks.value + item.value;
        return updatedKnapsack;
    }

    public static int Value(Knapsack knapsack) {
        return knapsack.value;
    }
}

