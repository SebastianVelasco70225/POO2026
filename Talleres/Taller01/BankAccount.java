package Talleres.Taller01;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String accountHolder;
    private int count;

    public boolean setAccountNumber (int accountNumber){
        if(count<1){
            this.accountNumber=accountNumber;
            count+=1;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setAccountHolder (String accountHolder){
        if (accountHolder!=""||accountHolder!=null){
            this.accountHolder=accountHolder;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getBalance (){
        return balance;
    }

    public boolean deposits(int deposit){
        if (deposit>0){
            balance+=deposit;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdrawals (int withdrawal){
        if (withdrawal>0&&((balance-withdrawal)==0||(balance-withdrawal)>0)){
            balance-=withdrawal;
            return true;
        }
        else{
            return false;
        }
    }

}
