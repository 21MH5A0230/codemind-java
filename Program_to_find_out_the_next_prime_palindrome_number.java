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
    public static boolean IsPali(int num)
    {
        int cou=0;
        int k=num;
        while(num>0){
            cou=cou*10+num%10;
            num/=10;
            }
            if(k==cou){
                return true;
                }
                else
                return false;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int num,cou=0;
            num=sc.nextInt();
            for(int i=num+1;;i++){
                if(IsPali(i)==true && IsPrime(i)==true){
                    System.out.println(i);
                    break;
                    }
                }
            }
        }