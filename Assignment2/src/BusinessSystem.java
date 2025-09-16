import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BusinessSystem {
    public static void main(String[] args) {
        List< Employee> employees= new ArrayList<Employee>();
        employees.add(new Manager(1, "sara", 50000, 500));
        employees.add(new SalesPerson(2, "Ali", 40000,5000));
        employees.add(new Intern(3, "sara", 6000));
        for(Employee employee: employees){
            employee.displayInfo();
            System.out.println(employee.calculateSalary());

        }
    }
}