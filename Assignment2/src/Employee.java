public abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;


    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double basicSalary) {
        this.baseSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

}
