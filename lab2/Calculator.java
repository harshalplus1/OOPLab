import java.util.Scanner;
class Calculator{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 char in='y';
do{
 System.out.println("Enter a number, operator, second number");
 float res; 
 int num = sc.nextInt(); 
 char op = sc.next().charAt(0);
 int num2 = sc.nextInt();
    switch (op){
            case '+':
            
                  res = (float)num+num2;
                  System.out.println(res);
                  break;
            
            case '-':
                  res = (float)num-num2;
                  System.out.println(res);
                  break;
            
            case '*':
                  res = (float)num*num2;
                  System.out.println(res);
                  break;
            
            case '/':
                  res = (float)num/num2;
                  System.out.println(res);
                  break;
            
            default:
                  System.out.println("Invalid");      
            }
 System.out.print("Do another y/n:");
 in = sc.next().charAt(0);
 }while(in=='y');

 }
}