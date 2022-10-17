class Counter{
    static int count;
    Counter(){
        count+=1;
    }
}

class Second{
    public static void main(String args[]){
        Counter c1, c2, c3;
        c1=new Counter();
        c2=new Counter();
        c3=new Counter();
        System.out.println(+Counter.count);
    }
}