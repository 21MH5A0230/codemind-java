import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
    {
        int cou=0,i;
        if(n<2)
        return false;
        for(i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],sum=0,cou=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++){
        if(isPrime(x[i])){
            cou++;
            sum=sum+x[i];
        }
    }
    float k=(float)sum/cou;
    System.out.format("%.2f",k);
    }
}

        