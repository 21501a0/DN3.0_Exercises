package order;

public class SortingAlgorithms {

    public static void bubbleSort(Order[] orders) {
        int length = orders.length;
        boolean isSorted;
        for (int i = 0; i < length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < length - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    swap(orders, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivotValue = orders[high].getTotalPrice();
        int partitionIndex = low - 1;
        for (int i = low; i < high; i++) {
            if (orders[i].getTotalPrice() <= pivotValue) {
                partitionIndex++;
                swap(orders, partitionIndex, i);
            }
        }
        swap(orders, partitionIndex + 1, high);
        return partitionIndex + 1;
    }

    private static void swap(Order[] array, int index1, int index2) {
        Order temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
