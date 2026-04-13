package Arrays;

public class SumofElements {
    static int sum(int[] arr){
        int sum =0;
        for(int x: arr){
            sum+=x;
        }
        return sum;
    } 
    public static void main(String[] args) {
        int arr[] = {33,44,55,66};
        System.out.println(sum(arr));
    }
}
