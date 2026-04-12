public class Main {
    public static int[] plusOne(int[] digits) {
        int sum =0;
        int n = digits.length-1;
        for(int i=0;i<n;i++){
            sum=sum*10+digits[i];
        }
        sum++;
        if(digits[n] == 9){
            int m = n+1;
            int[] ndigits = new int[m];
            while(sum != 0){
            int num = sum%10;
            ndigits[--m] = num;
            sum/=10;
            }
            return ndigits;
        }
        else{
            while(sum != 0){
            int num = sum%10;
            digits[--n] = num;
              sum/=10;
           }
           return digits;
        }    
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int x: plusOne(arr)) System.out.println(x);
    }
}
