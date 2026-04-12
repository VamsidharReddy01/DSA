public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,0,1,1,1,1,0,0,1};
        int max=0,count=0;
        for(int n:nums){
            if(n==1) count++;
            else count=0;
            if(count>max) max=count;
        }
        System.out.println(max);
    }
}
