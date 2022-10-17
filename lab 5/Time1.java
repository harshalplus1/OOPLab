import java.util.Scanner;
class Time{
    int hours;
    int mins;
    int secs;
    Time(){
        hours=0;
        mins=0;
        secs=0;
    }
    void getData(){
        Scanner sc= new Scanner(System.in);
        hours=sc.nextInt();
        mins=sc.nextInt();
        secs=sc.nextInt();
    }
    void display(){
        System.out.println(hours+":"+mins+":"+secs);
    }

    void add(Time t1){
        secs=secs+t1.secs;
        mins=mins+t1.mins;
        hours=hours+t1.hours;
    }
}

public class Time1{
    public static void main(String args[]){
        Time t1=new Time();
        Time t2=new Time();
        System.out.print("Enter time 1:");
        t1.getData();
        System.out.print("Enter time 2:");
        t2.getData();
        t2.add(t1);
        t2.display();
    }
}