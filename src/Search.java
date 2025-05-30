public class Search {
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearchRecursive(nums, target, mid + 1, right);
            else if (nums[mid] > target)
                return binarySearchRecursive(nums, target, left, mid - 1);
        }

        return -1;
    }
}
