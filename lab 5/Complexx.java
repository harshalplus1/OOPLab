import java.util.Scanner;
class Complex{
    double[] sum=new double[2];

    Complex(int i1, double[] d){
        sum[0]=i1+d[0];
        sum[1]=d[1];
    }
    Complex(double[]d1, double[] d2){
        sum[0]=d1[0]+d1[0];
        sum[1]=d2[1]+d1[1];
    }
    void print(){
        System.out.println(sum[0]+"+i"+sum[1]);
    }
}
class Complexx{
    public static void main(String args[]){
        double[] d1={22,22};
        Complex c1=new Complex(12,d1);
        c1.print();
        double[] d2={34,55};
        Complex c2=new Complex(d2,d1);
        c2.print();
    }
}