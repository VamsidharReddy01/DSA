package Arrays.Sorting;
class LinearSearch {
    public static void main(String[] args) {
        int[] nums=new int[]{3,22,6,4,77,3,31};
        int target=22;
        int found=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                found=i;
                break;
            }
        }
        System.out.println(""+(found+1));
    }
}
