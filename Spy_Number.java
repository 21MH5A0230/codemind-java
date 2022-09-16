import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k,cou=0,couI=1,r;
        k=sc.nextInt();
        while(k>0){
            r=k%10;
            cou=cou+r;
            couI=couI*r;
            k/=10;
        }
        if(couI==cou){
            System.out.println("Spy Number");
        }
        else
        System.out.println("Not Spy Number");
    }
}