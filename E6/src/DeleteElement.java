public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;
        int[] modifiedArray = deleteElement(array, indexToDelete);
        if (modifiedArray != array) {
            System.out.println("Modified array is: ");
            for (int i : modifiedArray) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static int[] deleteElement(int[] array, int indexToDelete) {
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            return array;
        }
        int[] modifiedArray = new int[array.length - 1];
        System.arraycopy(array, 0, modifiedArray, 0, indexToDelete);
        System.arraycopy(array, indexToDelete + 1, modifiedArray, indexToDelete, array.length - indexToDelete - 1);
        return modifiedArray;
    }
}