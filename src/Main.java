public class Main {
    public static void main(String[] args){
        System.out.println("laamaaarrrr");

        Account ac = new Account();
        ac.accountNo = 2;
        ac.amount = 1000; //euro
        ac.nationalId = "143021";

        System.out.println(ac.amount);
        ac.deposit(2000);
        System.out.println("after added deposit: " + ac.amount);

        ac.withdraw(1000);
        System.out.println("after withdrawing: " + ac.amount);

        ac.linkToNationalId("123323");


        A obj = new A();

    }
}
