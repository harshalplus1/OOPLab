import java.util.Scanner;
class Bit {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number: ");
                int num=sc.nextInt();
        System.out.print("Number multiplied by 2: ");
        System.out.print(num<<1);
        System.out.println("Number divided by 2: ");
        System.out.print(num>>1);
        }
}