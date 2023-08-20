import java.util.Scanner;

public class TwoSum {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] nums = {1, 3, -2, -1, 4, 5, 7};
        System.out.print("Enter the target number: ");
        int target = SCANNER.nextInt();
        SCANNER.nextLine();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target) System.out.println(nums[i]+"["+i+"] and "+nums[j]+"["+j+"] will add up to"+target);
            }
        }

    }
}