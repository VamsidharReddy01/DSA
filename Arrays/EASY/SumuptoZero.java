public class SumuptoZero {
    public static void main(String[] args) {
        int n=5;
        for(int i=(-n/2);i<=n/2;i++){
            if(n%2!=0||i!=0) System.out.println(i);
        }
    }
}
