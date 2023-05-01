public class Employee {
    int employeeId;
    String firstName;
    String lastName;
    String fullName;

    public Employee(String fname, String lname, int id) {
        firstName = fname;
        lastName = lname;
        fullName = this.getFullName(fname, lname);
        employeeId = id;
    }

    public String getFullName(String fname, String lname) {
        return fname + " " + lname;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "Jones", 1);
        System.out.println("Fullname: " + emp1.fullName + "\n" + "id: " + emp1.employeeId);
    }
}