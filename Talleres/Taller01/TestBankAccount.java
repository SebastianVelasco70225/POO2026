package Talleres.Taller01;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.setAccountHolder("Sebastián");
        bankAccount.setAccountNumber(70225);
        bankAccount.setAccountNumber(2);
        bankAccount.deposits(5000);
        bankAccount.withdrawals(2000);
        bankAccount.withdrawals(-3000);
        bankAccount.deposits(-100);
        bankAccount.withdrawals(9000);
        System.out.println("El saldo de la cuenta es: "+bankAccount.getBalance());
    }
}
