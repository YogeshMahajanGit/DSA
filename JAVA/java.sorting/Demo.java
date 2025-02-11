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

        System.out.println();
        System.out.println("Sorted Array : ");

        for (int n : nums2) {

            System.out.print(n + " ");
        }

    }
}
