package sort;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import java.util.Random;

public class HeapSort {

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

    public void heapify(int n, int i) {
        int largest = i; // Khởi tạo largest như root
        int left = 2 * i; // left = 2*i
        int right= 2 * i + 1; // right = 2*i + 1

        // Nếu nút con bên trái lớn hơn nút con của gốc
        if (left < n && integerArray[left] > integerArray[largest]) {
            largest = left;
        }

        // Nếu nút con bên phải lớn hơn largest
        if (right < n && integerArray[right] > integerArray[largest]) {
            largest = right;
        }

        // Nếu largest không phải là root
        if (largest != i) {
            int swap = integerArray[i];
            integerArray[i] = integerArray[largest];
            integerArray[largest] = swap;

            // Vun đống lại các cây con bị ảnh hưởng
            heapify(n, largest);
        }
    }

    /*
     * Sort the array by heap sort
     */
    /* Giải thuật: Ta lưu mảng vào CTDL Heap.
       Ở mỗi bước, ta lấy ra phần tử nhỏ nhất trong heap, cho vào mảng đã sắp xếp
       Ưu điểm: cài đặt đơn giản nếu đã có sẵn thư viện Heap, chạy nhanh
       Nhược điểm: không ổn định
       Time Complexities: Best: Ω(n log(n)),  Worst: O(n log(n))
     */
    public void sort() {
        // Xây dựng Heap (sắp xếp lại mảng)
        for (int i = integerArray.length / 2 - 1; i >= 0; i--) {
            heapify(integerArray.length, i);
        }
        // Trích xuất từng phần tử từ Heap
        for (int i = integerArray.length - 1; i > 0; i--) {
            // Di chuyển root hiện tại đến end
            int temp = integerArray[0];
            integerArray[0] = integerArray[i];
            integerArray[i] = temp;

            // gọi max - heapify trên Heap đã sắp xếp
            heapify(i, 0);
        }
    }
}
