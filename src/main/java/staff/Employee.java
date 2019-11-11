package staff;

public class Employee {

    private String name;
    private String nINumber;
    private Double salary;

    public Employee(String name, String nINumber, Double salary){
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

    public Double getSalary(){
        return this.salary;
    }

    public void raiseSalary(Double raise){
        if (raise > 0){
            this.salary += raise;
        }
    }

    public Double payBonus(){
        Double bonus = getSalary() / 100;
        return bonus;
    }

    public void changeName(String name){
        if (name != null){
            this.name = name;
        }
    }


}
