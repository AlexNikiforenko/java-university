package p6;

public class Professor extends Person{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void teachStudents() {
        System.out.println("Students taught.");
    }
}
