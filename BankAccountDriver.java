public class BankAccountDriver {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Raju", "ICICI", 9897384848383L, 1234, "ICIC4E567");

        System.out.println("Initial Balance: " + b1.getBalance(9897384848383L, 1234));

        b1.credit(9897384848383L, 1234, 10000);
        b1.debit(9897384848383L, 1234, 1000);

        System.out.println("Updated Balance: " + b1.getBalance(9897384848383L, 1234));

        b1.setPin(9897384848383L, 1234, 9876);
        b1.debit(9897384848383L, 9876, 500);
    }
}
