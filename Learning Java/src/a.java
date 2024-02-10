import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        // Example array of customer records to be sorted
        CustomerRecord[] records = {
                new CustomerRecord(123, "John Doe"),
                new CustomerRecord(456, "Jane Smith"),
                new CustomerRecord(789, "Alice Johnson"),
                new CustomerRecord(234, "Bob Williams"),
                // Add more records as needed
        };

        // Sorting the array of customer records using Merge sort
        mergeSort(records, 0, records.length - 1);

        // Displaying the sorted records
        for (CustomerRecord record : records) {
            System.out.println(record);
        }
    }

    public static void mergeSort(CustomerRecord[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(CustomerRecord[] arr, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        CustomerRecord[] leftArr = new CustomerRecord[leftSize];
        CustomerRecord[] rightArr = new CustomerRecord[rightSize];

        System.arraycopy(arr, left, leftArr, 0, leftSize);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightSize);

        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i].getCustomerId() <= rightArr[j].getCustomerId()) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

class CustomerRecord {
    private int customerId;
    private String name;

    public CustomerRecord(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}
