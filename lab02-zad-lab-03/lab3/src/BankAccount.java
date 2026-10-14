public class BankAccount {
    private double balance;

    public BankAccount(double startBalance) {
        this.balance = startBalance;
    }

    // Użytkownik nie musi wiedzieć, jak wewnętrznie działa wpłata
    public void deposit(double kwota) {
        if (kwota > 0) {
            balance += kwota;
            System.out.println("Wpłacono: " + kwota + " zł. Saldo: " + balance + " zł.");
        } else {
            System.out.println("Kwota musi być dodatnia!");
        }
    }

    public void withdraw(double kwota) {
        if (kwota > 0 && kwota <= balance) {
            balance -= kwota;
            System.out.println("Wypłacono: " + kwota + " zł. Saldo: " + balance + " zł.");
        } else {
            System.out.println("Nieprawidłowa kwota lub brak środków!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount konto = new BankAccount(1000.0);
        konto.deposit(500);
        konto.withdraw(200);
        System.out.println("Aktualne saldo: " + konto.getBalance() + " zł");
    }
}
