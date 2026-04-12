class Sum{
    static void sumOfdigits(int[] arr){
        int[] res = new int[arr.length];
        int m = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int n = -(arr[i]);
                int sum =0;
                while(n>0){
                    sum = sum +(n%10);
                    n = n/10;
                }
                res[m++] = sum;
            }
            else{
                res[m++] = arr[i]*i;
            }
        }

        for(int i=0;i<res.length;i++){
            System.err.print(" "+res[i]);
        }
    }
    public static void main(String[] args){
        int [] nums = {-345,987,0,-894};
        sumOfdigits(nums);
    }
}

