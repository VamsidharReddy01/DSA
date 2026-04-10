public class GCD {
    public static void main(String[] args){
        int n1=15 , n2=11 ;

        while(n1>0 && n2>0){
            if(n1>n2)  n1%=n2;
            else n2%=n1;
        }
        System.out.println(""+((n1==0)?n2:n1));
    }
}
