import java.util.Scanner;
class Student_Detail{
    String name;
    int id;
    static String college_name="MIT";
    Student_Detail(String s,int idd){
        id=idd;
        name=s;
    }
    void display_details(){
        System.out.println("College: "+college_name);
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

class First{
    public static void main(String[] args){
        String n1;
        int id1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name and id:");
        n1=sc.nextLine();
        id1=sc.nextInt();
        Student_Detail s1=new Student_Detail(n1, id1);
        s1.display_details();
        System.out.println("Enter the name and id:");
        n1=sc.nextLine();
        id1=sc.nextInt();
        Student_Detail s2=new Student_Detail(n1, id1);
        s2.display_details();
    }
}