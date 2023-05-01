public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;

    public Employee(String fname, String lname, int id) {
        employeeId = id;
        firstName = fname;
        lastName = lname;
        this.setFullName(fname, lname);
    }

    public void setFullName(String fname, String lname) {
        this.fullName = fname + " " + lname;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return this.employeeId;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "Jones", 1);
        System.out.println("Fullname: " + emp1.fullName + "\n" + "ID: " + emp1.employeeId);
    }
}