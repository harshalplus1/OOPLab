import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number: ");
            int n,rem,num=0;
            n=sc.nextInt();
            int num1=n;
            while(num1>0){
                rem=num1%10;
                num=num+rem*rem*rem;
                num1=num1/10;
            }
            if(num==n){
                System.out.println("Number is an armstrong number");
            }
            if(num!=n){
                System.out.println("Not an armstrong number");
     }
    }

}