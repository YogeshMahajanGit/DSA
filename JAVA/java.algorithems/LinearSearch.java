public class LinearSearch {
    public static void main(String[] args) {

        int nums[] = { 4, 8, 10, 22, 39, 55 };
        int target = 13;

        int result = linearsearch(nums, target);

        if (result != -1)
            System.out.println("Target Found At :- " + result + " index");
        else
            System.out.println("Target Not Found");
    }

    public static int linearsearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }

        return -1;
    }

}