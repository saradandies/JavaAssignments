public class Student {
    private  String name ;
    private int id;
    private double grades[] = new double[3];

    public Student(String name, int id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverage(double grades[]){
        double sumGrade = 0;
        for (int i = 0; i < 3; i ++){
            sumGrade+= grades[i];
        }
        return (sumGrade / 3);
    }

    boolean IsPassed(double grades[]){
        double AvgGrade = calculateAverage(grades);
        if (AvgGrade>=50){
            return true;
        }
        return false;
    }
    public void displayInfo(){
        System.out.println(" name: "+ name);
        System.out.println(" id : "+ id);
        System.out.println(" Avergae : " + calculateAverage(this.grades));
        if (IsPassed(this.grades) ){
            System.out.println(" passed");
        }
        else
            System.out.println(" faild");
        System.out.println("###############");

    }

}
