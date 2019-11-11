package Staff;

public class Employee {

    private String name;
    private String nINumber;
    private Integer salary;

    public Employee(String name, String nINumber, Integer salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNINumber(){
        return this.nINumber;
    }

    public int getSalary(){
        return this.salary;
    }

}
