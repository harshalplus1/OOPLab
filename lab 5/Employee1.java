import java.util.Scanner;
class Employee{
    String employee_name;
    String employee_city;
    double employee_basicsal;
    double da;
    double hra;
    double total;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        employee_name=sc.nextLine();
        System.out.println("Enter City");
        employee_city=sc.nextLine();
        System.out.println("Enter Salary");
        employee_basicsal=sc.nextDouble();
        System.out.println("Enter Daily Allowance");
        da =sc.nextDouble();
        System.out.println("Enter Rent Allowance");
        hra =sc.nextDouble();
    }
    void calculate(){
       total= employee_basicsal+(employee_basicsal*da/100.0)+(employee_basicsal*hra/100.0);
    }
    void display(){
        System.out.println(total);
    }
}
class Employee1{
    public static void main(String[] args){
        Employee man1=new Employee();
        man1.getdata();
        man1.calculate();
        System.out.println("Salary of Employee 1");
        man1.display();

    }
}