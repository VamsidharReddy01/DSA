public class Prime {
    public static void main(String[] args){
        int n=10;
        boolean res=true;
        for(int i=2;i<n/2; i++) {
            if(n%i==0) res=false; break;
        }
        System.out.println(res);
    }
}
