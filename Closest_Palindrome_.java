import java.util.Scanner;
class closest{
    public static boolean Ispali(int num)
    {
        int res=num;
        int res1=0;
        while(num>0){
            res1=res1*10+num%10;
            num/=10;
        }
        if(res1==res){
            return true;
        }
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,d1=0,d2=0;
        num=sc.nextInt();
        for(int i=num+1;;i++){
            if(Ispali(i)==true){
                d1=i;
                break;
            }
        }
        for(int i=num-1;;i--){
            if(Ispali(i)==true){
                d2=i;
                break;
            }
        }
        if((num-d2)<(d1-num)){
            System.out.println(d2);
        }
        else{
            System.out.println(d2+" "+d1);
        }
    }
}
            
