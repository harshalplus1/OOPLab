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
        System.out.println("Enter Name, City, Basic Pay, Daily Allowance and HRA");
        employee_name=sc.nextLine();
        employee_city=sc.nextLine();
        employee_basicsal=sc.nextDouble();
        da =sc.nextDouble();
        hra =sc.nextDouble();
    }
    void calculate(){
       double sal=employee_basicsal;
       double dai =da;
       double hou=hra;
        double total=sal*sal*dai/100+sal*hou/100;
    }
    void display(){
        System.out.println(total);
    }
}
class Main2{
    public static void main(String[] args){
        Employee man1=new Employee();
        man1.getdata();
        man1.calculate();
        System.out.println("Salary of Employee 1");
        man1.display();

    }
}