import java.util.Arrays;

public class BinaryInsertionSort {
    public static void main(String[] args) {
        
        int[] nums = {3, -2, -5, 7, -5, 4, 2, 4, 6, -3};

        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {
            int number = nums[i];

            if(number > nums[i-1]) continue;

            int insertionIndex = -1;
            int start = 0;
            int end = i;
            while (true) {
                if(start >= end) {
                    insertionIndex = start;
                    break;
                }
                int middle = (start + end) / 2;
                if (number  == nums[middle]) {
                    insertionIndex = middle;
                    break;
                } else if (number > nums[middle]) {
                    start = middle +1;
                } else end = middle;
            }

            for (int j = i; j > insertionIndex; j--) {
                nums[j] = nums[j-1];
            }

            nums[insertionIndex] = number;

        }
        System.out.println(Arrays.toString(nums));

    }
}
