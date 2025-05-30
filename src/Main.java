public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 11, 13};
        int target = 13;

        int result = Search.binarySearchRecursive(nums, target, 0, nums.length - 1);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
