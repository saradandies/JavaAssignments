public class Manager extends Employee{
    public double bonus;

    public Manager(int id, String name, double baseSalary, double bonus){
        super(id,name,baseSalary);
        this.bonus= bonus;

    }
    @Override
    public double calculateSalary() {

        return getBaseSalary() + bonus;
    }
}
