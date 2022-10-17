class Bank {
    int interest;
    Bank(){
        interest=10;
    }
    void getrateofinterest(){
        System.out.println(interest+"%");
    }
}
class SBI extends Bank{
    int interest;
    SBI(){
        interest=8;
    }
    void getrateofinterest(){
        System.out.println(interest+"%");
    }
}
class ICICI extends Bank{
    int interest;
    ICICI(){
        interest=7;
    }
    void getrateofinterest(){
        System.out.println(interest+"%");
    }
}
class Axis extends Bank{
    int interest;
    Axis(){
        interest=9;
    }
    void getrateofinterest(){
        System.out.println(interest+"%");
    }
}

class Lab6{
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        ICICI c = new ICICI();
        Axis a = new Axis();
        b.getrateofinterest();
        b=s;
        b.getrateofinterest();
        b=c;
        b.getrateofinterest();
        b=a;
        b.getrateofinterest();
    }
}