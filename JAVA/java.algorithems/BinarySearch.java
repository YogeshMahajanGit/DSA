public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 4, 8, 10, 18, 29, 55 };
        int target = 55;
        int start = 0;
        int end = nums.length - 1;

        int result = binarysearch(nums, target);
        int result2 = recursivebinarysearch(nums, target, start, end);

        System.err.println("Target at :- " + result2);
        System.err.println("Target at :- " + result);

    }

    public static int recursivebinarysearch(int nums[], int target, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return recursivebinarysearch(nums, target, mid + 1, end);
            } else
                return recursivebinarysearch(nums, target, start, mid - 1);
        }
        return -1;
    }

    public static int binarysearch(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
