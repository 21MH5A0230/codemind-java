import java.util.Scanner;
class large
{
    public static int LargeDigit(int n)
    {
        int r,max=0;
        while(n>0)
        {
            r=n%10;
            if(r>max)
               max=r;
            n/=10;
        }
        return max;
    }
        
        
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n,result;
            n=sc.nextInt();
            result=LargeDigit(n);
            System.out.println(result);
            
        }
}
