package Talleres.Taller01;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String accountHolder;
    private int count;

    public void setAccountNumber (int accountNumber){
        if(count<1){
            this.accountNumber=accountNumber;
            System.out.println("Número de cuenta registrado correctamente");
            count+=1;
        }
        else{
            System.out.println("Error. Una vez registrado un número de cuenta no puede cambiarse");
        }
    }

    public void setAccountHolder (String accountHolder){
        if (accountHolder!=""||accountHolder!=null){
            this.accountHolder=accountHolder;
        }
        else{
            System.out.println("Nombre de cuenta inválido");
        }
    }
    
    public int getBalance (){
        return balance;
    }

    public void deposits(int deposit){
        if (deposit>0){
            balance+=deposit;
            System.out.println("El deposito fue realizado correctamente");
        }
        else{
            System.out.println("No se pudo realizar el depósito por: "+deposit);
        }
    }

    public void withdrawals (int withdrawal){
        if (withdrawal>0&&((balance-withdrawal)==0||(balance-withdrawal)>0)){
            balance-=withdrawal;
            System.out.println("El retiro se ha realizado correctamente");
        }
        else{
            System.out.println("No se ha podido realizar el retiro por: "+withdrawal);
        }
    }

}
