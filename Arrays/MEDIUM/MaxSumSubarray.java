package Arrays.MEDIUM;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] nums= new int[]{-1,-5};
        int sum=0;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(sum<0) sum=0;
            sum+=nums[i];
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println(maxsum);
    }
}
