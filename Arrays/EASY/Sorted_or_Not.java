public class Sorted_or_Not {
    public static void main(String[] args ){
        int[] arr=new int[]{3,2,5,4};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.println(((i + 1) % n));
        }
    }
}
