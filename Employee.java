public class Employee{
    public void empName(){
        System.out.println("Employ Name is : Ram");
        System.out.println("Employee Was Updated");
    }

    public void empId(){
        System.out.println("Employee Id is : 209");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.empId();
        e.empName();
    }
}