package sort;

import java.util.Random;

public class SelectionSort {

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
     * Sort the array by selection sort
     */
    /* Giải thuật: đưa index nhỏ nhất về vị trí đầu tiên của mảng
       Ưu điểm: đơn giản, dễ hiện thực. Có số lần hoán đổi các vị trí ít.
       Nhược điểm: Không nhận biết được mảng đã được sắp xếp.
       Chỉ được áp dụng trong các trường hợp có số lượng phần tử cần so sánh ít.
       Time Complexities: Best: Ω(n^2),  Worst: O(n^2)
    */
    public void sort() {
        for (int i = 0; i < integerArray.length - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < integerArray.length; j++) {
                if (integerArray[j] < integerArray[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = integerArray[min_idx];
            integerArray[min_idx] = integerArray[i];
            integerArray[i] = temp;
        }
    }
}
