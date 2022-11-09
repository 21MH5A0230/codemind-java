import java.util.*;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,num1;
        num=sc.nextInt();
        num1=sc.nextInt();
        if(num%2==0 && (num>0 || num1%2==0)){
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
}