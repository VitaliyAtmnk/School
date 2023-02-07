package sorter;

public class sorter {

    static void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        //selection sort
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) min_idx = j;
            }

            swap(i, min_idx, arr);
        }
    }

//    static void insertionSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            int movingN = arr[i];
//            while();
//        }
//    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 82, 11};
//        selectionSort(arr);

        for (int y : arr) {
            System.out.print(y + " ");
        }
    }
}
