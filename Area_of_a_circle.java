import java.util.Scanner;
class areaofthecircle
{
    public static void main(String args[])
    {
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        float Area,pi=3.14f;
        Area=(float)pi*r*r;
        System.out.format("%.2f",Area);
        sc.close();
    }
}