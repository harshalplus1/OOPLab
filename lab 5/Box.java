import java.util.Scanner;
class Box{
    double height;
    double width;
    double length;
    Box(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height, Width and Length");
        height=sc.nextInt();
        width=sc.nextInt();
        length=sc.nextInt();
    
    }
    double volume(){
        double vol=width*height*length;
        return vol;
    }
}
class Main{
    public static void main(String[] args){
        Box box1=new Box();
        double vol1;
        vol1= box1.volume();
        System.out.println("Volume of Box 1");
        System.out.println(vol1);

    }
}