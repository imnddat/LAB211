
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Duc Dat
 */
public class BinarySearch {

    public int binarySearch(int[] a, int value, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        if (a[middle] == value) {
            return middle;
        } else if (a[middle] > value) {
            return binarySearch(a, value, left, middle - 1);
        } else {
            return binarySearch(a, value, middle + 1, right);
        }
    }
    
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of array:");
        int length = Integer.parseInt(sc.nextLine());

        System.out.println("Enter search value: ");
        int search = Integer.parseInt(sc.nextLine());

        Random rd = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rd.nextInt(100);
        }
        
        BinarySearch bs = new BinarySearch();
        System.out.print("Sorted array: ");
        bs.bubbleSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        
        System.out.println("\nFound " + search + " at index: " + bs.binarySearch(arr, search, 0, length - 1));
    }
}
