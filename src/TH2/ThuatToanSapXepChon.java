package TH2;

public class ThuatToanSapXepChon {

    static int[] array = {1, 9, 4, 6, 10, 16};

    private static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i]= temp;
            }
        }
    }


    private static void show(int[] array) {
        for (int index : array) {
            System.out.print(index + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Mang Chuoc Khi Sap Xep");
        show(array);
        System.out.println("Mang Sau Khi Duoc Sap Xep");
        selectionSort(array);
        show(array);

    }
}
