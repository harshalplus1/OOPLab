import java.util.Scanner;
class Type{
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        byte b;
        b = (byte)num;
        System.out.println("Int to Byte");
        System.out.println(b);
        double num1;
        num1=sc.nextDouble();
        byte c;
        c = (byte) num1;
        System.out.println("Double to Byte");
        System.out.println(c);
        char a;
        a=sc.next().charAt(0);
        int d= (int)a;
        System.out.println("Char to Int");
        System.out.println(d);
        double f;
        f=sc.nextDouble();
        int e =(int)f;
        System.out.println("Double to Int");
        System.out.println(e);
        
        
        
        
    }
}