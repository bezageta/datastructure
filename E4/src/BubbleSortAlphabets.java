
public class BubbleSortAlphabets {
    public static void main(String[] args) {
        String[] arr = {"GeeksforGeeks", "Quiz", "Practice", "Gblogs", "Coding"};
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
