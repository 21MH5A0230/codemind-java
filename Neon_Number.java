import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,cou=0;
        num=sc.nextInt();
        int k=num*num;
        while(k>0){
            cou=cou+k%10;
            k/=10;
        }
        if(num==cou){
            System.out.println("Neon Number");
        }
        else
        System.out.println("Not Neon Number");
    }
}