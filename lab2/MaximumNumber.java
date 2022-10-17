import java.util.Scanner;
class Check1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter 2 numbers: ");
                int num=sc.nextInt();
                int num2=sc.nextInt();
        int k=(num<<2)+(num2>>2);
        System.out.println("(a<<2)+(b>>2): "+k);
        System.out.println(num2>0);
        System.out.print(num*num2*100/10);
        int r=num&num2;
        System.out.println(r);
    }
}