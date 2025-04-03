class Bank {
    public double getInterestRate() {
        return 0.0;
    }
}
class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 5.5;
    }
}
class HDFC extends Bank {
    @Override
    public double getInterestRate() {
        return 6.0;
    }
}
class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}
public class BankInterest {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();
 
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}
