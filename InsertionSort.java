public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { 
            int key = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; 
        }
    }
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 6, 2, 7, 1, 4};
        System.out.println("Original Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSort(data);
        System.out.println("Sorted Array (Insertion Sort):");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}