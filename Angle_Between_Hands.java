import java.util.Scanner;
class navya{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h,m;
        String s=sc.nextLine();
        String[]v=s.split(":");
        h=Integer.parseInt(v[0]);
        m=Integer.parseInt(v[1]);
        float ang=Math.abs(30*h-(5.5f*m));
        ang=Math.min(360-ang,ang);
        System.out.println(ang);
    }
}
