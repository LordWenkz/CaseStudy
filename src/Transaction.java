
public class Transaction {

    private int money;
    private double balance = 0;






    //setter methods
    public void setDeposit(int money){this.money = money;}
    public void setWithdraw(int money){this.money = money;}
    public void setTransferMoney(int money){this.money = money;}
    //end of setter method


    public void withdraw_Transaction(){
        if(balance == 0 || balance < money){
            System.out.println("not enough balance");
        } else{
            balance -= money;
            System.out.println("your current balance now is: "+ balance);
        }
    }

    public void deposit_Transaction(){
        balance += money;
        System.out.println("your current balance now is: "+ balance);
    }

    public void checkBalance_Transaction(){
        System.out.println("Good Day Ma'am/Sir your current balance is: "+ balance);
    }

    public void transfer_Money(){
        if(balance == 0 || balance < money){
            System.out.println("You dont have enough balance to transfer");
        }
        else{
            balance -= money;
            System.out.println("Your successfully transferred: "+ money);
            System.out.println("your current balance now is: "+ balance);
        }
    }
}
