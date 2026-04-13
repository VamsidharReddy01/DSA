package Arrays;

public class Soted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
         int flag = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) {
                flag = 0;
                break;
            }
        }    
        if(flag ==1) System.out.print("Sorted");
        else System.out.print("Not Sorted");
    }
}
