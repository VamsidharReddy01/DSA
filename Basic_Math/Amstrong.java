public class Amstrong {
    public static void main(String[] args){
        int n=153, org=n,temp=n,res=0,count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        if(count==1){} //System.out.println(""+false);
        else{
            while(org>0){
                res+= Math.pow((org%10),count);
                org/=10;
            }
            System.out.println(" "+(res==temp));
        }
    }
}

  
