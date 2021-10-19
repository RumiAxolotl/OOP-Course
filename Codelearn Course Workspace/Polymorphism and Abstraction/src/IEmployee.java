public class IEmployee {
    public static void main(String[] args) {
        IEmployeeInterface employee_Parttime = new PartTimeEmployee("Trung", 45000, 7);
        System.out.println("Name: " + employee_Parttime.getName());
        System.out.println("Salary per day: " + employee_Parttime.calculateSalary());

        IEmployeeInterface employee_Fulltime = new FullTimeEmployee("Linh", 65000);
        System.out.println("Name: " + employee_Fulltime.getName());
        System.out.println("Salary per day: " + employee_Fulltime.calculateSalary());
    }
}
