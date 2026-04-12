package Arrays.MEDIUM;
class Arrange {

    public static  void arrangeArray(int[] nums){
            int[] res=new int[nums.length];
            int pos=0,neg=1;
            for(int n: nums){
                if(n>=0){
                    res[pos]=n;
                    pos+=2;
                }
                else{
                    res[neg]=n;
                    neg+=2;
                }
            }
           for(int m: res){
            System.out.print(m+" ");
           }
        }
    public static void main(String[] args) {
        int[] arr=new int[]{2,-2,1,-4,8,-3};
        arrangeArray(arr);
        
        
    }


    
}
