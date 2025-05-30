public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 11, 13};
        int target = 7;

        int result = Search.binarySearch(nums, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
