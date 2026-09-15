package Talleres.Taller01;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        boolean valid=bankAccount.setAccountHolder("Sebastián");
        comprobation(valid);
        valid=bankAccount.setAccountNumber(70225);
        comprobation(valid);
        valid=bankAccount.setAccountNumber(2);
        comprobation(valid);
        valid=bankAccount.deposits(5000);
        comprobation(valid);
        valid=bankAccount.withdrawals(2000);
        comprobation(valid);
        valid=bankAccount.withdrawals(-3000);
        comprobation(valid);
        valid=bankAccount.deposits(-100);
        comprobation(valid);
        valid=bankAccount.withdrawals(9000);
        comprobation(valid);
        System.out.println("El saldo de la cuenta es: "+bankAccount.getBalance());
    }
    public static void comprobation(boolean valid){
                if(valid){
                        System.out.println("Información actualizada con éxito");
                }
                else{
                        System.out.println("Valor inválido ingresado");
                }
        }
}
