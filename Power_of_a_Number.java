import java.util.*;
class ganesh{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num,num1,num2,r,cou=0;
		num=sc.nextInt();
		num1=sc.nextInt();
		num2=sc.nextInt();
		cou=(int)Math.pow(num,num1);
		r=cou%num2;
		System.out.println(r);
    }
}