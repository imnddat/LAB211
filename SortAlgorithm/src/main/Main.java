package main;

import sort.BubbleSort;
import sort.HeapSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.SelectionSort;
import utils.Validation;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        HeapSort heapSort = new HeapSort();
        int size = Validation.getInteger(
                1,
                Integer.MAX_VALUE,
                "Enter number of array: ",
                "Enter a number in range",
                "Enter a number in correct format"
        );
        heapSort.generate(size);
        System.out.print("\nUnsorted array: ");
        heapSort.display();
        heapSort.sort();
        System.out.print("\nSorted array:   ");
        heapSort.display();
    }
}
