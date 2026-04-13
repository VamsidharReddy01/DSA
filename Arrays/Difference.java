package Arrays;

public class Difference {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10};
        int k=2;
        int i=0,j=1;
        while( i<arr.length && j<arr.length ){
            int diff =arr[j]-arr[i];
            if(diff==k) System.out.print("("+(arr[i++])+","+(arr[j++])+")");
            else if(diff < k) j++;
            else i++;
        }
    }
}     
