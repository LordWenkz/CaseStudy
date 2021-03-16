
public class display {

    public void display_BankTeller(Bankt_Teller bankTeller){
        System.out.println("=========================================================");
        bankTeller.department();
        System.out.println("Name: "+ bankTeller.getName());
        System.out.println("Age : "+ bankTeller.getAge());
        System.out.println("ID: "+ bankTeller.getId());
        System.out.println("Salary : "+ bankTeller.getSalary());
        System.out.println("Referral Fee : "+ bankTeller.getReferral_Fee());

    }

    public void display_TransferMoney(Transfer_Money Transfer_Money){
        System.out.println("=========================================================");
        Transfer_Money.department();
        System.out.println("Name: "+ Transfer_Money.getName());
        System.out.println("Age : "+ Transfer_Money.getAge());
        System.out.println("ID: "+ Transfer_Money.getId());
        System.out.println("Salary : "+ Transfer_Money.getSalary());
        System.out.println("Commission : "+ Transfer_Money.getCommission());
    }

    public void display_Client(Client client){
        System.out.println("=========================================================");
        System.out.println("Client");
        System.out.println("Name: "+ client.getName());
        System.out.println("Age : "+ client.getAge());
        System.out.println("Bank Account: "+ client.getBank_Account());

    }
}
