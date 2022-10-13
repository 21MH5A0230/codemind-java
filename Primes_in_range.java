import java.util.Scanner;
class navya{
    public static boolean IsPrime(int num){
        int cou=0;
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                cou+=1;
            }
        }
        if(cou==0){
            return true;
        }
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,num2,cou=0;
        num=sc.nextInt();
        num2=sc.nextInt();
        if(num==1){
            num=2;
        }
        for(int i=num;i<=num2;i++){
            if(IsPrime(i)==true){
                cou+=1;
            }
        }
        System.out.println(cou);
    }
}