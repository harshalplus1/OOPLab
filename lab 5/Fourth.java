class Complex{
    int[] a=new int[2];
    Complex(int i1, int[] a0){
        a[0]=i1+a0[0];
        a[1]=a0[1];
    }
    Complex(int[]a1, int[] a2){
        a[0]=a2[0]+a1[0];
        a[1]=a2[1]+a1[1];
    }
    void printer(){
        System.out.println(a[0]+"+i"+a[1]);
    }
}

class Fourth{
    public static void main(String args[]){
        int[] a={22,22};
        Complex c1=new Complex(12,a);
        c1.printer();
        int[] a1={34,55};
        Complex c2=new Complex(a1,a);
        c2.printer();
    }
}