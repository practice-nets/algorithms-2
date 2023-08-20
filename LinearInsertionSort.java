import java.util.Arrays;

public class LinearInsertionSort {
    public static void main(String[] args) {
        
        int[] nums = {3, -2, -5, 7, -5, 4, 2, 4, 6, -3};

        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {
            
            int number = nums[i];

            if(nums[i] > nums[i-1]) continue;

            int insertionIndex = -1;

            for (int j = 0; j < i; j++) {
                if(nums[j] > number) {
                    insertionIndex = j;
                    break;
                }
            }
            if (insertionIndex == -1) insertionIndex = i;

            for (int j = i; j > insertionIndex; j--) {
                nums[j] = nums[j-1];
            }

            nums[insertionIndex] = number;
            

        }
        System.out.println(Arrays.toString(nums));
        

    }
}
