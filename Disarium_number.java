import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,I=0,n,r1,r2,res=0;
        a=sc.nextInt();
        int t=a;
        int b=a;
        while(a>0){
            I+=1;
            a/=10;
        }
        while(t>0){
            r2=t%10;
            res=res+(int)Math.pow(r2,I);
            t/=10;
            I--;
        }
        if(b==res){
          System.out.println("True");
        }
        else
         System.out.println("False");
        }
    }
    