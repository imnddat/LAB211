package sort;

import java.util.Random;

public class InsertionSort {

    private int integerArray[];

    /**
     * Display an array
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < integerArray.length; i++) {
            if (i != integerArray.length - 1) {
                System.out.print(integerArray[i] + ", ");
            } else {
                System.out.print(integerArray[i] + "]");
            }
        }
    }

    /**
     * Generate an integer randomly number
     *
     * @param size array size
     */
    public void generate(int size) {
        Random random = new Random();
        integerArray = new int[size];
        for (int i = 0; i < size; i++) {
            integerArray[i] = random.nextInt(size);
        }
    }

    /*
     * Sort the array by insertion sort
     */
    /* Giải thuật: sắp xếp lần lượt từng đoạn gồm 1 phần tử đầu tiên, 2,.. n phần tử.
       Ưu điểm: nếu danh sách đã gần đúng thứ tự, Insertion Sort sẽ chạy rất nhanh.
       Nhược điểm: chạy chậm với dữ liệu có kích thước lớn
       Time Complexities: Best: Ω(n),  Worst: O(n^2)
     */
    public void sort() {
        for (int i = 1; i < integerArray.length; ++i) {
            int key = integerArray[i];
            int j = i - 1;
            while (j >= 0 && integerArray[j] > key) {
                integerArray[j + 1] = integerArray[j];
                j = j - 1;
            }
            integerArray[j + 1] = key;
        }
    }
}
