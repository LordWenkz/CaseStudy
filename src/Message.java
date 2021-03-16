import java.util.Scanner;


public class Message {


    private int money;


    display display = new display();

    //bank teller
    Bankt_Teller Rafael = new Bankt_Teller("Rafael Custodio", 21, "NA-3C-12345");
    public void Rafael(){
        Rafael.setName("Rafael Custodio");
        Rafael.setId("NA-3D-12345");
        Rafael.setAge(20);
        Rafael.setSalary(20000);
        Rafael.setReferral_Fee(10000);
        display.display_BankTeller(Rafael);
    }

    //loan officer
    Transfer_Money Serge = new Transfer_Money("Serge Valencia", 21, "NA-3C-54321");
    public void Serge(){
        Serge.setName("Serge Valencia");
        Serge.setId("NA-3C-54321");
        Serge.setAge(20);
        Serge.setSalary(20000);
        Serge.setCommission(10000);
        display.display_TransferMoney(Serge);
    }

    //transaction
    Transaction client = new Transaction();

    //client
    Client Angela = new Client("Angela Galang", 21, "09876-NA-3C");
    public void Angela(){
        Angela.setName("Angela Galang");
        Angela.setBank_Account("09876-NA-3C");
        Angela.setAge(20);
        display.display_Client(Angela);
    }

    Scanner scan = new Scanner(System.in);


    // messages methods
    public void start(){
        System.out.println("Good Day Ma'am/Sir this is Group 1 Banking System. \n how can I help you?");
        System.out.print("choose operation [1]. deposit [2]. withdraw [3].checkBalance [4].Transfer Money or [Q/q] to quit: ");
    }

    boolean loop = false;
    public void talk(){
        while(!loop) {
            String input = scan.nextLine();
            switch (input) {

                case "1":
                    depositMessage();
                    money = scan.nextInt();
                    client.setDeposit(money);
                    client.deposit_Transaction();
                    System.out.println("=========================================================");
                    System.out.println("do you still want to perform another operation?");
                    System.out.print("choose operation [1]. deposit [2]. withdraw [3].checkBalance [4].Transfer Money or [Q/q] to quit: ");
                    break;
                case "2":
                    withdrawMessage();
                    money = scan.nextInt();
                    client.setWithdraw(money);
                    client.withdraw_Transaction();
                    System.out.println("=========================================================");
                    System.out.println("do you still want to perform another operation?");
                    System.out.print("choose operation [1]. deposit [2]. withdraw [3].checkBalance [4].Transfer Money or [Q/q] to quit: ");
                    break;
                case "3":
                    client.checkBalance_Transaction();
                    System.out.println("=========================================================");
                    System.out.println("do you still want to perform another operation?");
                    System.out.print("choose operation [1]. deposit [2]. withdraw [3].checkBalance [4].Transfer Money or [Q/q] to quit: ");
                    break;
                case "4":
                    transferMoney();
                    money = scan.nextInt();
                    client.setTransferMoney(money);
                    client.transfer_Money();
                    System.out.println("=========================================================");
                    System.out.println("do you still want to perform another operation?");
                    System.out.print("choose operation [1]. deposit [2]. withdraw [3].checkBalance [4].Transfer Money or [Q/q] to quit: ");
                    break;
                case "Q":case "q":
                    loop = true;
                    break;
            }

        }
    }

    void depositMessage(){
        System.out.println("Good Day Ma'am/Sir I'm your Bank Teller "+ Rafael.getName());
        System.out.println("how much do you want to deposit ma'am/sir? "+ Angela.getName());
        System.out.print("Enter the amount you want to deposit: ");
    }

    void withdrawMessage(){
        System.out.println("Good Day Ma'am/Sir I'm your Bank Teller "+ Rafael.getName());
        System.out.println("how much do you want to withdraw ma'am/sir? "+ Angela.getName());
        System.out.print("Enter the amount you want to withdraw: ");
    }

    void transferMoney(){
        System.out.println("Good Day Ma'am/Sir I'm: "+ Serge.getName());
        System.out.println("how much do you want to Transfer ma'am/sir? "+ Angela.getName());
        System.out.print("Enter the amount: ");
    }
}
