public class Main {
    public static void main(String[] args) {
        int[] nums = {11, 9, 7, 13, 5};
        int[] sorted = Sort.bubbleSort(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}
