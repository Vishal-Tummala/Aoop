package sorting.main;

import java.util.Scanner;

import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SortingAlgorithm;

public class SortingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sorting algorithm:");
        System.out.println("1. QuickSort");
        System.out.println("2. MergeSort");
        int choice = scanner.nextInt();

        SortingAlgorithm algorithm = null;

        switch (choice) {
            case 1:
                algorithm = new QuickSort();
                break;
            case 2:
                algorithm = new MergeSort();
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        int[] array = { 5, 3, 8, 4, 2 };
        System.out.println("Original array:");
        printArray(array);

        algorithm.sort(array);

        System.out.println("Sorted array:");
        printArray(array);

        scanner.close();
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

