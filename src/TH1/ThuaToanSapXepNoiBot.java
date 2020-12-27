package TH1;

import java.util.Scanner;

public class ThuaToanSapXepNoiBot {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhap Do dai cua mang");
        int Size = input.nextInt();
        int[] array = getNumber(Size, input);
        System.out.println("Mảng ban đầu trưa được sắp xếp ");
        showArray(array);
        System.out.println("Sau khi sap xep");
        bubbleSortByStep(array);
        showArray(array);
    }

    private static void bubbleSortByStep(int[] array) {
        int length = array.length-1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    System.out.println("Swap " + array[j] + " with " + array[j + 1]);
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void showArray(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    private static int[] getNumber(int size, Scanner input) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap Phan Tu " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }
}
