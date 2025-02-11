public class Demo {
    public static void main(String[] args) {

        int nums[] = { 6, 5, 2, 8, 16, 22, 1 };
        int nums2[] = { 6, 5, 2, 8, 16, 22, 1 };

        int size = nums.length;
        int temp = 0;

        // Bubble Sort [ O(n2) ]

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Selection Sort [ O(n2) ] Betten than Bubble sort
        int minIndex = -1;

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (nums2[minIndex] > nums2[j])
                    minIndex = j;
            }
            temp = nums2[minIndex];
            nums2[minIndex] = nums2[i];
            nums2[i] = temp;
        }

        // Insertion Sort

        int arr[] = { 5, 88, 9, 3, 22, 1, 4 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println();
        System.out.println("Sorted Array : ");

        for (int n : arr) {

            System.out.print(n + " ");
        }

    }
}
