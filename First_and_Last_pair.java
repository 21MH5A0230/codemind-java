import java.util.Scanner;
class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],m=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int j=0;j<n/2;j++)
        System.out.print(x[j]+" "+x[n-1-j]+" ");
        if(n%2!=0)System.out.println(x[n/2]+" 0");
    }
}