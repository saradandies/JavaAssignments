public class SalesPerson extends Employee{

    public double comission;
    public SalesPerson(int id, String name, double baseSalary, double comission){
        super(id,name,baseSalary);
        this.comission=comission;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + comission;
    }
}
