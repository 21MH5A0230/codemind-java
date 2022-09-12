import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,count=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]%k!=0)
              count++;
        }
        System.out.println(count);
    }
}