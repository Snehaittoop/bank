class rbi{
    void rateofinterest(){
        System.out.println("7%");
    }
}
class sbi extends rbi{
    void rateofinterest(){
        System.out.println("7.1%");
    }
}
class icici extends rbi{
    void rateofinterest(){
        System.out.println("7.5%");
    }
}
class hdfc extends rbi{
    void rateofinterest(){
        System.out.println("7.45%");
    }
}
class axis extends rbi{
    void rateofinterest(){
        System.out.println("7.5%");
    }
}
class pnb extends rbi{
    void rateofinterest(){
        System.out.println("7.1%");
    }
}


public class banking {
    public static void main(String[] args) {
        rbi rate1=new rbi();
        rate1.rateofinterest();
        rbi rate2=new sbi();
        rate2.rateofinterest();
        rbi rate3=new icici();
        rate3.rateofinterest();
        rbi rate4=new hdfc();
        rate4.rateofinterest();
        rbi rate5=new axis();
        rate5.rateofinterest();
        rbi rate6=new pnb();
        rate6.rateofinterest();
    }
}