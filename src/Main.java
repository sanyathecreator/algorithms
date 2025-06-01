public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 11, 9, 7, 13, 5, 22, -2, 13, 8, 6, 2, 3};
        int[] sorted = Sort.selectionSort(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}
