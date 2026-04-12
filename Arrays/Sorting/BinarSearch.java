package Arrays.Sorting;
class BinarySearh{
    public static void main(String[] args) {
       int[] nums= new int[]{2,5,8,10,13,15,19};
       int target=82,res=-1;
       int start=0,end=nums.length-1;
       while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]==target) {
            res=mid+1;
            break;
        }
        else if(target>nums[mid]) start=mid+1;
        else end=mid-1;
       }
       System.out.println(res);
    }
}