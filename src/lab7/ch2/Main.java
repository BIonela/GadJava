package lab7.ch2;

public class Main {

    public static void main(String[] args) throws Exception {
        BankAccount from = new BankAccount("Source",1000);
        BankAccount to = new BankAccount("Destination",800);

        System.out.println(from);
        System.out.println(to);

        TransactionThread t1 = new TransactionThread("Transaction 1",from,to,400);
        TransactionThread t2 = new TransactionThread("Transaction 2",from,to,400);
        t2.start();
        t1.start();

        t1.join();
        t2.join();

    }
}
