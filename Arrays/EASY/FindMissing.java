public class FindMissing {
    public static void main(String[] args) {
        int[] nums={1,0,2,3};
        int n=nums.length;
        int total=n/2*(n-1);
        int total1=Math.abs(n*((n+1)/2));
        int sum=0;
        int i=0;
        while(i<n){
            sum+=nums[i++];
        }
        System.out.println(total);
        System.out.println(total1);
        System.out.println(sum);
    }
}
