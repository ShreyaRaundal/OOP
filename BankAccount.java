public class BankAccount {

    private String username;
    private String bankName;
    private long accno;
    private int pin;
    private String ifsc;
    private double balance;

    // ✅ Constructor
    public BankAccount(String username, String bankName, long accno, int pin, String ifsc) {
        this.username = username;
        this.bankName = bankName;
        this.accno = accno;
        this.pin = pin;
        this.ifsc = ifsc;
        this.balance = 0.0; // default balance
    }

    // ✅ Getter methods
    public String getUserName() {
        return username;
    }

    public String getBankName() {
        return bankName;
    }

    public long getAccno() {
        return accno;
    }

    public String getIFSC() {
        return ifsc;
    }

    public double getBalance(long accno, int pin) {
        if (this.accno == accno && this.pin == pin) {
            return balance;
        } else {
            System.out.println("Invalid credentials");
            return 0;
        }
    }

    // ✅ Set new PIN
    public void setPin(long accno, int oldPin, int newPin) {
        if (this.accno == accno && this.pin == oldPin) {
            this.pin = newPin;
            System.out.println(" PIN updated successfully.");
        } else {
            System.out.println(" Invalid credentials for PIN update.");
        }
    }

    // ✅ Credit method
    public void credit(long accno, int pin, double amt) {
        if (this.accno == accno && this.pin == pin) {
            if (amt > 0) {
                balance += amt;
                System.out.println("₹" + amt + " credited successfully.");
            } else {
                System.out.println(" Invalid credit amount.");
            }
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    // ✅ Debit method
    public void debit(long accno, int pin, double amt) {
        if (this.accno == accno && this.pin == pin) {
            if (amt > 0) {
                if (balance - amt >= 1000) { // maintain min balance
                    balance -= amt;
                    System.out.println(" ₹" + amt + " debited successfully.");
                } else {
                    System.out.println(" Insufficient balance. Maintain ₹1000 minimum.");
                }
            } else {
                System.out.println("Invalid debit amount.");
            }
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
