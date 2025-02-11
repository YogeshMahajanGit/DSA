public class Demo {
    public static void main(String[] args) {

        int nums[] = { 6, 5, 2, 8, 16, 22, 1 };
        int size = nums.length;
        int temp = 0;

        // Bubble Sort

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted Array : ");

        for (int n : nums) {

            System.out.print(n + " ");
        }

    }
}
