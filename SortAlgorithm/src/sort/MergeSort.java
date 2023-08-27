package sort;

import java.util.Random;

public class MergeSort {

    private int integerArray[];
    private int[] tempArray;
    private int length;

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

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        // hợp nhất các mảng
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = integerArray[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                integerArray[k] = tempArray[i];
                i++;
            } else {
                integerArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        // sao chép các phần tử còn lại của mảng tempArray nếu có
        while (i <= middle) {
            integerArray[k] = tempArray[i];
            k++;
            i++;
        }
    }

    // đệ quy 
    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    /*
     * Sort the array by merge sort
     */
    /* Giải thuật:  mergeSort(arr[], l,  r)
       if r > l
       1. Tìm chỉ số nằm giữa mảng để chia mảng thành 2 nửa:
              middle m = (l+r)/2
       2. Gọi đệ quy hàm mergeSort cho nửa đầu tiên:  
              mergeSort(arr, l, m)
       3. Gọi đệ quy hàm mergeSort cho nửa thứ hai:
              mergeSort(arr, m+1, r)
       4. Gộp 2 nửa mảng đã sắp xếp ở (2) và (3):
              merge(arr, 1, m, r)
       Ưu điểm: chạy nhanh, ổn định
       Nhược điểm: tốn thêm bộ nhớ để lưu mảng phụ
       Time Complexities: Best: Ω(n log(n)),  Worst: O(n log(n))
     */
    public void sort() {
        this.length = integerArray.length;
        this.tempArray = new int[length];
        doMergeSort(0, length - 1);
    }
}
