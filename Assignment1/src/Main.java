import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[3];
        Scanner scanner = new Scanner(System.in);
        for (int i =0 ; i < 3 ; i ++){
            System.out.println("Enter the name of student "+ (i+1));
            String name = scanner.next();
            System.out.println("Enter the ID of student "+ (i+1));
            int id = scanner.nextInt();
            double grades[] = new double[3];
            for (int j = 0; j < 3; j ++){
                System.out.println("Enter grade for subject "+ (j + 1));
                grades[j]= scanner.nextDouble();

            }
            students[i] = new Student(name,id,grades);
        }
        for (int i = 0; i< 3; i++){
            students[i].displayInfo();
        }
    }
}