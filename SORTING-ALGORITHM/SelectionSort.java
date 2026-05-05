
//Selection Sort: Finds the minimum element from the unsorted part and puts it at the beginning [3, 12].

class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22};

        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}