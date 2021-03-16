//paul geronimo
public class Transfer_Money extends Employee {

    private int commission;

    public void department(){
        System.out.println("Transfer Money Department");
    }
    public Transfer_Money(String name, int age, String id){
        super(name, age, id);
    }
    public int getCommission(){
        return commission;
    }

    public void setCommission(int commission){
        this.commission = commission;
    }
}
