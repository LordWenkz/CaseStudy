public class Employee extends Person{

    private String id;
    private int salary;
    private int contactNumber;

    public Employee(String name, int age, String id){
        super(name, age);
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public int getContact_Number(){
        return contactNumber;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setContact_Number(){
        this.contactNumber = contactNumber;
    }
}
