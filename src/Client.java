public class Client extends Person {

    private String bankAccount;

    public Client(String name, int age, String bankAccount){
        super(name, age);
        this.bankAccount = bankAccount;
    }
    public String getBank_Account(){
        return bankAccount;
    }

    public void setBank_Account(String bankAccount){
        this.bankAccount = bankAccount;
    }
}
