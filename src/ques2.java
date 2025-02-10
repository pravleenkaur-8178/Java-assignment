abstract class Bank {
    abstract void getDetails();
}

class SBI extends Bank {
    void getDetails() {
        System.out.println("SBI: Rate of interest is 6.5%.");
    }
}

class BOI extends Bank {
    void getDetails() {
        System.out.println("BOI: Rate of interest is 7.0%.");
    }
}

class ICICI extends Bank {
    void getDetails() {
        System.out.println("ICICI: Rate of interest is 8.5%.");
    }
}

public class ques2 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}
