import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number: ");
                int num=sc.nextInt();
                for(int i=num-1; i>0; i--)
                {
                    num=num*i;
                }
                System.out.print(num);
            }
        }