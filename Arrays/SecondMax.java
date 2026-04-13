package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] nums = {23,12,54,21,56,75,33};
        int max1= Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            }
            if(nums[i] > max2  && nums[i] != max1) max2=nums[i];
        }
        System.out.println("SecondMaximum Number = "+max2);
    }
}
